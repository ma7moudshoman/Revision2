package org.example;

import java.io.*;

public class Main6 {
    public static void main(String[] args) throws IOException {



        /*
        File file=new File("D:\\projects/pic1.jpa");
        FileInputStream fil=new FileInputStream(file);
        byte b[]=new byte[(int) file.length()];
        fil.read(b);
        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

        FileOutputStream so=new FileOutputStream("D:\\projects/pic2.jpa");
        so.write(b);
        so.flush();
        so.close();
        fil.close();*/



        /*
        FileOutputStream fos=new FileOutputStream("Text.text");
fos.write("mahmoud".getBytes());
fos.flush();*/
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
