package org.example;

import java.util.*;

public class Lambda  {

    static void display(){
        System.out.println();
        System.out.println(
                        "1: added element \n" +
                        "2: remove element\n " +
                        "3: print element\n" +
                        "4: Exit "
        );
        System.out.println();
    }
    public static void main(String[]args) {
        /*
      create a menu program with the following options :
          1 . add element
          2 . remove element
          3 . print element
          4 . exit
        the program will remain running as long as the user does not choose the fourth option 4

         */


        ArrayList<Integer> list = new ArrayList();
        Scanner input = new Scanner(System.in);
while (true){
          display();
                int choice = input.nextInt();
                switch (choice) {
                    case 1:  // add
                        System.out.println("Enter an integer : ");
                        list.add(input.nextInt());
                        System.out.println("Element added");
                        break;
                    case 2:
                        // remove
                        System.out.println("Enter your integer remove");
                        int element = input.nextInt();
                        if (list.contains(element)) {
                            list.remove((Integer) element);
                            System.out.println("Element removed");
                        } else
                            System.out.println("Element not found");
                        break;
                    case 3:
                        //print
                        System.out.println(list);
                        break;
                    case 4:
                        // exit
                        return;

        }
    }









/*

ArrayList <Integer> arr=new ArrayList();
Scanner input=new Scanner(System.in);

for (int i=0;i<5;i++){

            int temp = input.nextInt(); // 1
            if (!arr.contains(temp))
                arr.add(temp);

        }
        System.out.println(arr);
*/















        /*  ArrayList list =new ArrayList(Arrays.asList(1,2,3,'d',true ,14.3));
         *//* list.removeIf(nem-> nem%2==0);
        System.out.println(list );
*//*



        ArrayList list1=new ArrayList(Arrays.asList(1,1,1,2,2,2,2,3,4));
        list.retainAll(Collections.singleton(2));
        System.out.println(list);

*/

      /*  ArrayList list1=new ArrayList(Arrays.asList(10,20,30,40,50,60,70,80));
list1.ensureCapacity(150); //تستخدم لتحديد عدد الامكن المتاحه والمحجوزه داخل الذاكره
        list1.trimToSize(); //تستخدم لازاله الاماكن الزائده عن الحاجه بعد  ملئ كل الاماكن ف الذاكره
*/
      /*  ArrayList list1=new ArrayList(Arrays.asList(10,20,30,40,50,60,70,80));
list1.forEach(el-> System.out.print(el+ " - "));// تستخدم للمرورعلي كل عناصر ال  arraylist وتقوم بطباعتهم ايضا

*/

      /*  ArrayList list1 = new ArrayList(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80));
  Collections.sort(list1);// تستخدم لترتيب العناصر من الصغير الي الكبير
     Collections.sort(list1,Collections.reverseOrder());// تستخدم لترتيب العناصر من الصغير للكبي
        Collections.reverse(list1);// تستخدم لعكس العناصر بالعكس الاول ف الاخر والاخر ف الاول

        System.out.println(Collections.min(list1)); // تستخدم لاخراج اصغر قيمه موجوده داخل ال array
        System.out.println(Collections.max( list1));//تستخدم لاستخراج اكبر قيمه من دخل ال array
*/








           /*   ArrayList list1=new ArrayList(Arrays.asList(10,20,30,40,50,60,70,80));
 list1.isEmpty();
        System.out.println(list1);
 list1.clear();
        System.out.println(list1);
*/


                                             //     0  1  2  3  4  5  6  7
       /* ArrayList list1=new ArrayList(Arrays.asList(10,20,30,40,50,60,70,80));
        ArrayList list=new ArrayList(list1.subList(0,85));

        System.out.println(list);
       */ //  System.out.println(arr);
       /* Lambda lambda=new Lambda();
        lambda.add(10);
        lambda.add(11);
        lambda.add(12);
        lambda.add(13);
        lambda.removeRange(0,2 );
        System.out.println(lambda);
*/
        // list.remove("10");

        //list.remove(( Integer.valueOf(10)));
//list.remove(( Integer)(10));
   // System.out.println(list);





      /*  System.out.println("=========== Addition ========");

        Calculator addition=((first, second) -> first+second);

        System.out.println(addition.calc(10,15));




        System.out.println("=========== Subtraction  ========");

        Calculator Subtraction=((first, second) -> first-second);

        System.out.println(Subtraction.calc(20 ,15));
*/
        /*
       // ArrayList <Integer> list=new ArrayList();
        ArrayList <Integer> list=new ArrayList(); // 10
list.add(10);
list.add(20);
list.add(40);
list.add(list.size(), 16  );
        ArrayList <Integer> list2=new ArrayList(); // 10
        list2.add(13);
         list2.addAll(Arrays.asList(33,44,12,75));
        System.out.println(list2 );
        for ( int i=0 ; i< list.size();i++){
            System.out.println(list.get(i));

        }*/
      //  System.out.println(list.get(i));

       /* for (Integer num : list){
            System.out.println(num);
        }*/



    }
}
