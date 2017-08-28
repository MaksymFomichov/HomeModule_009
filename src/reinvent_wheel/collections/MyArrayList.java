package reinvent_wheel.collections;

import java.util.Arrays;

public class MyArrayList<T> {
    private T[] array;
    private int capacity;
    private int size;

    public MyArrayList() {
        this.capacity = 10;
        array = (T[]) new Object[capacity];
    }

    // добавляет элемент в конец
    public void add(T value) {
        if (size < array.length) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    array[i] = value;
                    size++;
                    break;
                }
            }
        } else {
            resizeArray();
            add(value);
        }
        System.out.println("-" + Arrays.toString(array));
    }

    private void resizeArray() {
        int size = (array.length * 3) / 2 + 1;
        T[] tempArray = (T[]) new Object[size];
        System.arraycopy(array, 0, tempArray, 0, array.length);
        array = tempArray;
        System.out.println("+" + Arrays.toString(array));
    }

    // удаляет элемент под индексом
    public void remove(int index) {
        T[] tempArray = (T[]) new Object[array.length - 1];
        System.arraycopy(array, 0, tempArray, 0, index - 1);
        System.arraycopy(array, index, tempArray, index - 1, array.length - index - 1);
        array = tempArray;
        System.out.println("r" + Arrays.toString(array));
    }

    //  очищает коллекцию
    public void clear() {
        T[] tempArray = (T[]) new Object[10];
        array = tempArray;
        System.out.println("c" + Arrays.toString(array));
    }

    // возвращает размер коллекции
    public int size() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                count++;
            }
        }
        return count;
    }

    // возвращает элемент под индексом
    public T get(int index) {
        return array[index];
    }
}
