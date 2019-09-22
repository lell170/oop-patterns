package patterns.decorator.implementations;

import patterns.decorator.basic.StringHandler;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileHandler implements StringHandler {

    private static final String ERROR_STRING = "some error occurred";
    private String fileName;


    public FileHandler(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void input(String string) {
        File file = new File(fileName);
        try (OutputStream fileOutputStream = new FileOutputStream(file)) {
            fileOutputStream.write(string.getBytes(), 0, string.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String output() {
        //read file into stream, try with auto closable resource
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            return stream.reduce(String::concat).get();
        } catch (IOException e) {
            e.printStackTrace();
            return ERROR_STRING;
        }
    }
}
