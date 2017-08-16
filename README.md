# HomeModule_009
# Нельзя использовать Java коллекции при выполнении заданий!
Примеры с урока тут
## Задание 1 - ArrayList
Написать свой класс MyArrayList как аналог классу ArrayList.
Можно использовать 1 массив для хранения данных.
Методы
add(T value) добавляет элемент в конец
remove(int index) удаляет элемент под индексом
clear() очищает коллекцию
size() возвращает размер коллекции
get(int index) возвращает элемент под индексом
## Задание 2 - LinkedList
Написать свой класс MyLinkedList как аналог классу LinkedList.
Нельзя использовать массив. Каждый элемент должен быть отдельным объектом-посредником(Node - нода) который хранит ссылку на прошлый и следующий элемент коллекции(двусвязный список).
Методы
add(T value) добавляет элемент в конец
remove(int index) удаляет элемент под индексом
clear() очищает коллекцию
size() возвращает размер коллекции
get(int index) возвращает элемент под индексом
## Задание 3 - Queue
Написать свой класс MyQueue как аналог классу Queue и LinkedList.
FIFO (first-in-first-out)
Можно делать либо с помощью Node либо с помощью массива. 
Методы
add(T value) добавляет элемент в конец
remove(int index) удаляет элемент под индексом
clear() очищает коллекцию
size() возвращает размер коллекции
peek() возвращает первый элемент в очереди (FIFO)
poll() возвращает первый элемент в очереди и удаляет его из коллекции
## Задание 4 - Stack
Написать свой класс MyStack как аналог классу Stack.
LIFO (last-in-first-out)
Можно делать либо с помощью Node либо с помощью массива. 
Методы
push(T value) добавляет элемент в конец
remove(int index) удаляет элемент под индексом
clear() очищает коллекцию
size() возвращает размер коллекции
peek() возвращает первый элемент в стеке (LIFO)
pop() возвращает первый элемент в стеке и удаляет его из коллекции
## Задание 5 - HashMap
Написать свой класс MyHashMap как аналог классу HashMap.
Нужно делать с помощью односвязной Node.
Не может хранить две ноды с одинаковых ключами одновременно.
Методы
put(T key, K value) добавляет пару ключ + значение 
remove(T key) удаляет пару по ключу
clear() очищает коллекцию
size() возвращает размер коллекции
get(T key) возвращает значение(K value) по ключу
