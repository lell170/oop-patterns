package patterns.decorator;

import patterns.decorator.basic.BasicStringHandler;
import patterns.decorator.basic.StringHandler;
import patterns.decorator.implementations.CompressionStringHandler;
import patterns.decorator.implementations.EncryptionStringHandler;
import patterns.decorator.implementations.FileInformationHandler;

public class Main {

    public static void main(String[] args) {
        String salaryEntries = "Name,Salary\nMarkus Weber,100000\nMarc van Mark,912000";

        BasicStringHandler encoded = new CompressionStringHandler(new EncryptionStringHandler(new FileInformationHandler("out/OutputDemo.txt")));
        encoded.input(salaryEntries);
        StringHandler plain = new FileInformationHandler("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryEntries);
        System.out.println("- Encoded --------------");
        System.out.println(plain.output());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.output());
    }

}
