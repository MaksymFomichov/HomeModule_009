package collections.collections;

public class MyLinkedList<T> {
    private Node<T> first; // первый
    private Node<T> last; // последний
    private int size; // размер коллекции

    public MyLinkedList() {
        last = new Node<>(null, null, null);
    }

    // добавляет элемент в конец
    public void add(T value) {
        Node<T> node = new Node<>(value, null, last);
        if (first == null) {
            first = node;
        }
        last.next = node;
        last = node;
        size++;
    }

    // удаляет элемент под индексом
    public void remove(int index) {
        // получаем ноду, которую нам нужно удалить
        int count = 0;
        Node<T> iterator = first;
        if (iterator == null) {
            return;
        }
        do {
            count++;
            iterator = iterator.next;
        } while (count != index - 1);
        // перезаписываем связи и уменьшаем размер коллекции
        iterator.prev.next = iterator.next;
        iterator.next.prev = iterator.prev;
        iterator.next = iterator.prev = null;
        iterator.element = null;
        size--;
    }

    // очищает коллекцию
    public void clear() {
        for (Node<T> x = first; x != null; ) {
            Node<T> next = x.next;
            x.element = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;
    }

    // возвращает размер коллекции
    public int size() {
        return size;
    }

    // возвращает элемент под индексом
    public Node get(int index) {
        int count = 0;
        Node<T> iterator = first;
        if (iterator == null) {
            return null;
        }
        do {
            count++;
            iterator = iterator.next;
        } while (count != index - 1);
        return iterator;
    }

    // выводим коллекцию в консоль
    public void show() {
        Node<T> iterator = first;
        if (iterator == null) {
            return;
        }
        do {
            System.out.print(iterator.element + " ");
            iterator = iterator.next;
        } while (iterator != null);
        System.out.println();
    }

    private static class Node<E> {
        E element;
        Node<E> next; // следующая
        Node<E> prev; // предыдущая

        Node(E element, Node<E> next, Node<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

}
