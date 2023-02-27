/*
1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task01 {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        LinkedList<Integer> myLinkedArrayList = new LinkedList<>();

        long timeStart1 = System.currentTimeMillis();
        filllist(myArrayList);
        System.out.println(System.currentTimeMillis() - timeStart1);

        long timeStart2 = System.currentTimeMillis();
        addToFirst(myLinkedArrayList);
        System.out.println(System.currentTimeMillis() - timeStart2);
    }

    public static void filllist(List<Integer> arrList) {
        for (int i = 0; i < 100000; i++) {
            arrList.add(0, i);
        }
    }

    public static void addToFirst(LinkedList<Integer> arrList) {
        for (int i = 0; i < 100000; i++) {
            arrList.addFirst(i);
        }
    }
}