package org.example;

import java.io.File;

public class folder {

    public static void main(String[] args) {

        File file = new File("Folder/1");
        file.mkdir();            // to creat a folder
        file.mkdirs();           // to creat a folder inside folder
file.delete();




    }
}