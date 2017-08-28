package collections;

public class Main {

    public static void main(String[] args) {
        // проверяем ArrayList
        testArrayList();


    }

    private static void testArrayList() {
        // создаем
        MyArrayList<Integer> test = new MyArrayList<>();
        // наполнем
        for (int i = 0; i < 20; i++) {
            test.add(i);
        }
        // выводим 5 элемент массива
        System.out.println(test.get(5));
        // удаляем элемент под индексом
        test.remove(5);
        // показываем размер
        System.out.println("размер " + test.size());
        // чистим
        test.clear();
    }
}
