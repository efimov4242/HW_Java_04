package HwJava04;
/*
Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор.
 */
import java.util.LinkedList;

public class Task03 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        int sum = 0;
        for (int item : linkedList) {
            sum += item;
        }
        System.out.println(linkedList);
        System.out.println("Сумма всех элементов = " + sum);
    }
}
