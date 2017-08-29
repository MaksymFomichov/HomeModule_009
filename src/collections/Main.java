package collections;

import collections.collections.MyArrayList;
import collections.collections.MyLinkedList;
import collections.collections.MyQueue;
import collections.collections.MyStack;

public class Main {

    public static void main(String[] args) {
        // проверяем MyArrayList
//        testArrayList();
        // проверяем MyLinkedList
//        testLinkedList();
        // проверяем MyQueue
//        testQueue();
        // проверяем MyStack
        testStack();


    }

    private static void testStack() {
        System.out.println("\nMyStack");
        // создаем
        MyStack<Integer> myStack = new MyStack<>();
        // наполнем
        for (int i = 0; i < 20; i++) {
            myStack.push(i);
        }
        // удаляем элемент
        myStack.remove(5);
        // возвращаем первый элемент
        System.out.println("peek 1 элемент: " + myStack.peek());
        // возвращаем первый и удаляем его (проверка чере цикл)
        for (int i = 0; i < 5; i++) {
            System.out.println("pool 1 элемент: " + myStack.pop());
        }
        // показываем размер
        System.out.println("размер коллекции: " + myStack.size());
        // показывем колекцию
        myStack.show();
        // чистим и показываем
        myStack.clear();
        myStack.show();
    }

    private static void testQueue() {
        System.out.println("\nMyQueue");
        // создаем
        MyQueue<Integer> myQueue = new MyQueue<>();
        // наполнем
        for (int i = 0; i < 20; i++) {
            myQueue.add(i);
        }
        // удаляем элемент
        myQueue.remove(5);
        // возвращаем первый элемент
        System.out.println("peek 1 элемент: " + myQueue.peek());
        // возвращаем первый и удаляем его (проверка чере цикл)
        for (int i = 0; i < 5; i++) {
            System.out.println("pool 1 элемент: " + myQueue.poll());
        }
        // показываем размер
        System.out.println("размер коллекции: " + myQueue.size());
        // показывем колекцию
        myQueue.show();
        // чистим и показываем
        myQueue.clear();
        myQueue.show();

    }

    private static void testLinkedList() {
        System.out.println("\nMyLinkedList");
        // создаем
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        // наполнем
        for (int i = 0; i < 20; i++) {
            myLinkedList.add(i);
        }
        // показываем коллекцию
        myLinkedList.show();
        // показываем размер
        System.out.println("размер " + myLinkedList.size());
        // удаляем по индексу
        myLinkedList.remove(5);
        myLinkedList.show(); // показываем после уаления для проверки
        // ищем по индекусу
        myLinkedList.get(5);
        // чистим и показываем
        myLinkedList.clear();
        myLinkedList.show();
        System.out.println("размер после чистки " + myLinkedList.size());
    }

    private static void testArrayList() {
        System.out.println("MyArrayList");
        // создаем
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        // наполнем
        for (int i = 0; i < 20; i++) {
            myArrayList.add(i);
        }
        // выводим 5 элемент массива
        System.out.println(myArrayList.get(5));
        // удаляем элемент под индексом
        myArrayList.remove(5);
        // показываем размер
        System.out.println("размер " + myArrayList.size());
        // чистим
        myArrayList.clear();
    }
}
