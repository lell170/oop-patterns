package patterns.decorator;

import patterns.decorator.basic.BasicStringHandler;
import patterns.decorator.basic.StringHandler;
import patterns.decorator.implementations.CompressionStringHandler;
import patterns.decorator.implementations.EncryptionStringHandler;
import patterns.decorator.implementations.FileHandler;

public class Main {

    public static void main(String[] args) {
        final String salaryEntries = "Name,Salary\nMarkus Weber,100000\nMarc van Mark,912000";
        final String fileName = "out/OutputDemo.txt";

        // object handler wrapping (Decorator pattern)
        final BasicStringHandler stringHandler = new CompressionStringHandler(new EncryptionStringHandler(new FileHandler(fileName)));

        final StringHandler plain = new FileHandler(fileName);

        stringHandler.input(salaryEntries);

        System.out.println("- Input ----------------");
        System.out.println(salaryEntries);
        System.out.println("- Encoded --------------");
        System.out.println(plain.output());
        System.out.println("- Decoded --------------");
        System.out.println(stringHandler.output());
    }

}
