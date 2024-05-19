package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main6 {
    public static void main(String[] args) throws FileNotFoundException,IOException {

        FileOutputStream fos=new FileOutputStream("Text.text");
fos.write("mahmoud".getBytes());
fos.flush();
/*
FileInputStream fis=new FileInputStream("Text.text");
        System.out.println(fis.read());
        /*
        String filePath = "D:\\Data Stracture"; // تأكد من استخدام المسار الصحيح

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filePath);
            int data = fis.read();
            System.out.println(data);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }*/
    }
}
