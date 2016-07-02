package oop_07;

import java.util.ArrayList;

/**
 * Created by Student on 7/2/2016.
 */
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10000);
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(12);

        arrayList.add(0, 30);

        ArrayList<Integer> arrayList2 = new ArrayList<>();

        arrayList2.add(7);
        arrayList2.add(7);
        arrayList2.add(7);

        arrayList.addAll(arrayList2);
        arrayList.addAll(0, arrayList2);

        System.out.println(arrayList);

        System.out.println(arrayList.get(10));

        System.out.println(arrayList.contains(17));
        System.out.println(arrayList.contains(7));

        System.out.println(arrayList.size());

        System.out.println(arrayList.isEmpty());

        //arrayList.remove(0);
        //arrayList.removeAll(arrayList);

        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i = i + 2) {
            arrayList.remove(i);
        }

        System.out.println(arrayList);

        arrayList.set(0, 777);

        System.out.println(arrayList);
    }
}
