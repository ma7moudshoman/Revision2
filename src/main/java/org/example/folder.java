package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class folder {



    // __define-ocg__ This function checks if the binary tree represented by the array is symmetric.
    static String ArrayChallenge(String[] strArr) {
        // Convert the array to a list for easier manipulation
        List<String> tree = new ArrayList<>(Arrays.asList(strArr));
        return isSymmetric(tree) ? "true" : "false";
    }

    // Helper function to check if the binary tree is symmetric
    static boolean isSymmetric(List<String> tree) {
        return isMirror(tree, 0, 1);
    }

    // Helper function to recursively check if the binary tree is symmetric
    static boolean isMirror(List<String> tree, int left, int right) {
        if (left >= tree.size() && right >= tree.size()) {
            return true; // Both left and right indices exceed the tree size, reached the end of the tree
        }
        if (left >= tree.size() || right >= tree.size()) {
            return false; // One index exceeds the tree size while the other doesn't, tree is not symmetric
        }
        // Check if the nodes at left and right positions are symmetric
        if (!tree.get(left).equals(tree.get(right))) {
            return false;
        }
        // Recursively check the subtrees
        return isMirror(tree, left * 2 + 1, right * 2 + 2) && isMirror(tree, left * 2 + 2, right * 2 + 1);
    }
    public static void main(String[] args) {

























/*
        File file = new File("folder");
        File file1=new File(file,"sss");
        FileOutputStream fos=new FileOutputStream(file1);
        fos.write("mahmoud".getBytes());
        FileInputStream fin=new FileInputStream(file1);
        int input;
        while ((input = fin.read()) !=-1 ){
            System.out.println((char) input);*/
        }

       /*// file.list();
        String[]arr=file.list();
        for (String s: arr){
            System.out.println(s);
        }*/




    }

