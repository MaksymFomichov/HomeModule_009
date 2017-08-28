package reinvent_wheel.collections;

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

    }

    // очищает коллекцию
    public void clear() {
        size = 0;
    }

    // возвращает размер коллекции
    public int size() {
        return size;
    }

    // возвращает элемент под индексом
    public void get(int index) {

    }

    public void show() {
        Node<T> iterator = first;
        if (iterator == null) {
            System.out.println("first null");
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
