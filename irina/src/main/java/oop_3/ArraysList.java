package oop_3;

import java.util.ArrayList;



public class ArraysList {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(21);
        arrayList.add(123);
        arrayList.add(210);
        arrayList.add(132);
        arrayList.add(236);
        arrayList.add(87);

        ArrayList <String> arrayList1 = new ArrayList<>();
        arrayList1.add("Irina");
        arrayList1.add("Yulia");
        arrayList1.add("Eugene");

        System.out.println(arrayList.toString());
        System.out.println(arrayList1);

        arrayList.add(5, 890);
        arrayList.add(4, 88);
        arrayList1.add(2, "Olga");
        arrayList1.add(0,"Petr");
        System.out.println(arrayList.toString());
        System.out.println(arrayList1);

        arrayList.addAll(6, arrayList);
        arrayList1.add(2, arrayList1.toString());
        System.out.println(arrayList.toString());
        System.out.println(arrayList1);

        arrayList.remove(3);
        arrayList1.remove(4);
        System.out.println(arrayList);
        System.out.println(arrayList1);

    }

}

