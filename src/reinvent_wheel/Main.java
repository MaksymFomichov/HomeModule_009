package reinvent_wheel;

import reinvent_wheel.collections.MyArrayList;
import reinvent_wheel.collections.MyLinkedList;

public class Main {

    public static void main(String[] args) {
        // проверяем MyArrayList
//        testArrayList();
        // проверяем MyLinkedList
        testLinkedList();


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
