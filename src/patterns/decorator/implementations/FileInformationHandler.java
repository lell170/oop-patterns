package patterns.decorator.implementations;

import patterns.decorator.basic.StringHandler;

import java.io.*;

public class FileInformationHandler implements StringHandler {

    private String fileName;

    public FileInformationHandler(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void input(String information) {
        File file = new File(fileName);
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(information.getBytes(), 0, information.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String output() {
        char[] buffer = null;
        File file = new File(fileName);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(buffer);
    }
}
