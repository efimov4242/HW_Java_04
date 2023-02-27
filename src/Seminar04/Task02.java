package Seminar04;/*
Реализовать консольное приложение, которое:
Принимает от пользователя строку вида
text~num
Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
*/

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
    programm();
    }
    public static void programm() {
        Scanner iScanner = new Scanner(System.in);
        LinkedList<String> myLinkedList = new LinkedList<>();
        while (true) {
            String data = iScanner.next();
            String[] stringArr = data.split("~");
            if(Objects.equals(stringArr[0], "print")) {
                System.out.println(myLinkedList.remove(Integer.parseInt(stringArr[1])));
            } else {
                myLinkedList.add(Integer.parseInt(stringArr[1]), stringArr[0]);
            }
        }
    }
}
