package HwJava04.Task02;

import java.util.LinkedList;

/*
2. Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
*/
public class Task02 {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        q.display();
        q.enQueue(6);
        q.deQueue(4);
    }
}
