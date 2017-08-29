package collections.collections;

import java.util.Arrays;

public class MyStack<T> {
    private T[] array;
    private int capacity;
    private int size;

    public MyStack() {
        this.capacity = 10;
        array = (T[]) new Object[capacity];
    }

    // добавляет элемент в конец
    public void push(T value) {
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
            push(value);
        }
        System.out.println("-" + Arrays.toString(array));
    }

    // удаляет элемент под индексом
    public void remove(int index) {
        makeGoodArray();
        T[] tempArray = (T[]) new Object[array.length - 1];
        System.arraycopy(array, 0, tempArray, 0, index - 1);
        System.arraycopy(array, index, tempArray, index - 1, array.length - index);
        array = tempArray;
        System.out.println("r" + Arrays.toString(array));
    }

    // удаляем первый элемент
    public void removePop() {
        makeGoodArray();
        T[] tempArray = (T[]) new Object[array.length - 1];
        System.arraycopy(array, 0, tempArray, 0, array.length - 1);
        array = tempArray;
        System.out.println("p" + Arrays.toString(array));
    }

    // очищает коллекцию
    public void clear() {
        array = (T[]) new Object[1];
    }

    // возвращает размер коллекции
    public int size() {
        makeGoodArray();
        return array.length;
    }

    // возвращает первый элемент в стеке (LIFO)
    public T peek() {
        return array[array.length - 1];
    }

    // возвращает первый элемент в стеке и удаляет его из коллекции
    public T pop() {
        T t = array[array.length - 1];
        removePop();
        return t;
    }

    public void show() {
        makeGoodArray();
        System.out.println("s" + Arrays.toString(array));
    }

    private void resizeArray() {
        int size = (array.length * 3) / 2 + 1;
        T[] tempArray = (T[]) new Object[size];
        System.arraycopy(array, 0, tempArray, 0, array.length);
        array = tempArray;
        System.out.println("+" + Arrays.toString(array));
    }

    // делаем массив без null элементов
    private void makeGoodArray() {
        // получаем количестов null
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                count++;
            }
        }
        if (count != 0) {
            T[] tempArray = (T[]) new Object[array.length - count];
            System.arraycopy(array, 0, tempArray, 0, array.length - count);
            array = tempArray;
        }
    }

}
