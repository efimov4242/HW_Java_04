package HwJava04.Task02;

public class MyQueue {
    int SIZE = 5;
    int items[] = new int[SIZE];
    int front, rear;

    void Queue() {
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Очередь заполнена");
        } else {
            if (front == -1)
                front = 0;
            rear++;
            items[rear] = element;
            System.out.println("Добавлен элемент " + element);
        }
    }

    int deQueue(int i) {
        int element;
        if (isEmpty()) {
            System.out.println("Очередь пуста");
            return (-1);
        } else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("Удален элемент -> " + element);
            return (element);
        }
    }

    void display() {
        /* Функция выводит элементы очереди в консоль */
        int i;
        if (isEmpty()) {
            System.out.println("Пустая очередь");
        } else {
            System.out.println("\nИндекс FRONT-> " + front);
            System.out.println("Элементы -> ");
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + "  ");

            System.out.println("\nИндекс REAR-> " + rear);
        }
    }
}
