package edu.upc.eetac.dsa.riverola;

import java.io.File;
import java.io.IOException;

/**
 * Created by Guillermo on 02/10/2015.
 */
public class AppIoBinary {
    public static void main(String[] args) throws IOException {
        BinaryIOClass testWrite = new BinaryIOClass(3, 7.5, 'a');
        testWrite.saveToFile("test-io-binary");

        BinaryIOClass testRead = BinaryIOClass.readFromFile("test-io-binary");
        System.out.println("integer = " + testRead.getInteger());
        System.out.println("decimal = " + testRead.getDecimal());
        System.out.println("char = " + testRead.getCharacter());

        File file = new File("test-io-binary");
        file.delete();
    }
}