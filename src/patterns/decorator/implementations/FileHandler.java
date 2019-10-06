package patterns.decorator.implementations;

import patterns.decorator.basic.StringHandler;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileHandler implements StringHandler {

    private static final String ERROR_STRING = "some error occurred";
    private final String fileName;


    public FileHandler(final String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void input(final String string) {
        final File file = new File(fileName);
        try (final OutputStream fileOutputStream = new FileOutputStream(file)) {
            fileOutputStream.write(string.getBytes(), 0, string.length());
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String output() {
        //read file into stream, try with auto closable resource
        try (final Stream<String> stream = Files.lines(Paths.get(fileName))) {
            return stream.reduce(String::concat).get();
        } catch (final IOException e) {
            e.printStackTrace();
            return ERROR_STRING;
        }
    }
}
