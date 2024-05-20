package org.example;

import java.io.File;
import java.io.IOException;

public class file {


    public static void main(String[] args) throws IOException {


        File f = new File("text.g");
        System.out.println(f.exists());
        f.createNewFile();
        if (f.exists()) {

            System.out.println("filename : " + f.getName());
            System.out.println("Absolute path : " + f.getAbsolutePath());
            System.out.println("file path : " + f.getPath());
            System.out.println("writeable : " + f.canWrite());
            System.out.println("Readable : " + f.canRead());
            System.out.println("file size : " + f.length());
            System.out.println("Is directory : " + f.isDirectory());
            System.out.println("Is file : " + f.isFile());
            System.out.println("Is hidden : " + f.isHidden());
            System.out.println("last modified : " + f.lastModified());
            System.out.println("can execute : " + f.canExecute());
            System.out.println("can read : " + f.canRead());
            System.out.println("can Write  : " + f.canWrite());

        }
        }
    }