package HwJava04;

/*
1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
Постараться не обращаться к листу по индексам.
*/

import java.util.LinkedList;
import java.util.Stack;

public class Task01 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        System.out.println(linkedList);
        System.out.println(reverseList(linkedList));

    }

    static LinkedList<Integer> reverseList(LinkedList<Integer> listInt) {
        Stack<Integer> stackInt = new Stack<>();
        stackInt.addAll(listInt);
        listInt.clear();
        while (!stackInt.empty())
                listInt.add(stackInt.pop());
        return listInt;
        }

}
