package collections.collections;

public class MyHashMap<K, V> {
    private Node<K, V> kvNode;
    private int size = 0;

    //добавляет пару ключ + значение
    public void put(K key, V value) {
        if (kvNode == null) {
            kvNode = new Node<>(key, value, null);
            size++;
        } else {
            Node<K, V> node = new Node<>(key, value, kvNode);
            kvNode = node;
            size++;
        }
    }

    // удаляет пару по ключу
    public void remove(K key) {
        int count = 0;
        Node<K, V> iterator = kvNode;
        do {
            if (iterator.key.equals(key)) {
                //System.out.println("test " + iterator.key + ":" + iterator.value);
                iterator.key = iterator.prev.key;
                iterator.value = iterator.prev.value;
                break;
            }
            iterator = iterator.prev;
            count++;

        } while (size != count);
//        iterator.key = null;
//        iterator.value = null;
        size--;
        //System.out.println("закончли");

    }

    // очищает коллекцию
    public void clear() {
        for (Node<K, V> x = kvNode; x != null; ) {
            Node<K, V> next = x.prev;
            x.key = null;
            x.value = null;
            x = next;
        }
        kvNode = null;
        size = 0;
    }

    // возвращает размер коллекции
    public int size() {
        return size;
    }

    // возвращает значение(K value) по ключу
    public V get(K key) {
        Node<K, V> valueNode = kvNode;
        do {
            valueNode = valueNode.prev;
        } while (!valueNode.key.equals(key));
        return valueNode.value;
    }

    // выводим коллекцию в консоль
    public void show() {
        Node<K, V> valueNode = kvNode;
        if (valueNode == null) {
            System.out.println("вылетаем");
            return;
        }
        do {
            System.out.println(valueNode.key + ":" + valueNode.value);
            valueNode = valueNode.prev;
        } while (valueNode != null);
    }

    private class Node<K, V> {
        K key;
        V value;
        Node<K, V> prev;

        public Node(K key, V value, Node<K, V> prev) {
            this.value = value;
            this.key = key;
            this.prev = prev;
        }
    }

}
