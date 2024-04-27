package org.example;

import java.util.*;

public class Lambda  {
    public static void main(String[]args) {

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

        ArrayList list1 = new ArrayList(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80));
 //   Collections.sort(list1);// تستخدم لترتيب العناصر من الصغير الي الكبير
   //     Collections.sort(list1,Collections.reverseOrder());// تستخدم لترتيب العناصر من الصغير للكبير
      //Collections.reverse(list1);// تستخدم لعكس العناصر بالعكس الاول ف الاخر والاخر ف الاول

        System.out.println(Collections.min(list1));

        System.out.println(Collections.max( list1));









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
