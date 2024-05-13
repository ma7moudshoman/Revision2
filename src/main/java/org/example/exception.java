package org.example;

import java.io.*;

public class exception {

    static void readFile(String filePath) throws FileNotFoundException ,IOException {

        //try
        FileInputStream reader = new FileInputStream(filePath);
        {

            System.out.println("file Content : ");
            int r = 0;
            while ((r = reader.read()) != -1) {
                System.out.println((char) r);

            }
        }/* catch (FileNotFoundException e) {
        System.out.println(e);

    } catch (IOException e) {
        System.out.println(e);
    } finally {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }*/
    }

    //       try with resources   >> هنا مش هنحتاج اننا نعمل  finally

   /*  try (FileInputStream reader = new FileInputStream(filePath); ){

        System.out.println("file Content : ");
        int r = 0;
        while ((r = reader.read()) != -1) {
            System.out.println((char) r);

        }
    } catch (FileNotFoundException e) {
        System.out.println(e);

    } catch (IOException e) {
        System.out.println(e);
    } finally {
        if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
        }
    }
}*/

/*
    try( FileInputStream reader  = new FileInputStream(filePath);) {

        System.out.println("file Content : ");
        int r = 0;
        while ((r = reader.read()) != -1) {
            System.out.println((char) r);

        }
    } catch (FileNotFoundException e) {
        System.out.println(e);

    } catch (IOException e) {
        System.out.println(e);
    }
*/

    public static void main(String []args){
try {
    readFile("D:\\Mahmoud");
    }catch (FileNotFoundException e){
        System.out.println();
}
    catch (IOException w){
}
    }
      /* try {
           int[]arr=new int[12];

        arr[13]=67;
        System.out.println(arr[13]);
       }catch (ArrayIndexOutOfBoundsException E) {
           System.out.println(E);
           // System.exit(0);

          // System.out.println("Finally");
       }catch (Exception e){
           System.out.println("rest of the code");

       }*/






     /*  try {
           int u=8/0;

        System.out.println(u);
           System.out.println(" Rest of the code");
           System.out.println("Rest of the code");
           System.out.println("Rest of the code");

       }
       catch (java.lang.Exception e){
           System.out.println(e);
       }
        System.out.println("Rest of the code");

*/
        /*
try {
    int val=Integer.parseInt("jlhfudtytk");
    System.out.println(val);

}catch (java.lang.Exception e){
    System.out.println("my name is mahmoud");
}*/



/*
try {


    int[] arr = null;

    System.out.println(arr[5]);

for (int d:arr)

    System.out.println(d);
        System.out.println("1");
        System.out.println("5");}
    catch (NullPointerException e) {
        System.out.println(e);
    }*/
        }
    /*
for (int i = 0;i<arr.length;i++){
            System.out.println(i);
        }*/


