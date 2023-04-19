public class MyLinkedList<T> implements MyList {
    private MyArrayList ArrList = new MyArrayList();
    private class Node<T>{
        T data;
        Node previous;
        Node next;
        public Node(T data){
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }
    private Node<T> head;
    private Node<T> tail;
    private int size;
    MyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }



    @Override
    public int size() {
        return size;
    }



    /*
    * Этот метод проверяет присуствует ли указанный элемент в списке или нет
    * Сначала он инициализирует узел с названием curr, чтобы он указывал на начало списка
    * Используем цикл фор пока curr не станем равным нулю
    * Внутри цыкла с if ом проверяется условие если она верна то возрощается true , если нет то false
    */
    @Override
    public boolean contains(Object o) {
        Node curr = head;
        while (curr != null){
            if (curr.data.equals(o)){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }



    /*
    * Данный метод добавляет новый элемент в конец списка
    * Если список пустой, то новый элемент становиться головой списка
    * Или же в последний элемент списка , с ссылкой на предедущий и следующий элменты
    * Затем указатель на последний элемент списка обновляется на добавленный элемент , а размер списка увеличевается на 1
    */
    @Override
    public void add(Object item) {
        Node newNode = new Node(item);
        if (tail == null){
            head = newNode;
        }
        else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        size++;
    }



    /*
    * Этот метод добавляет новый элемент в заданную позицию в двусвязном списке
    * Если индекс меньше 0 или больше размера списка, метод выкинет исключение
    * Если индекс равен 0, новый элемент будет добавлен в начало списка,
    * а если индекс равен размеру списка, новый элемент будет добавлен в конец
    * или же метод найдет узел в позиции index-1, установит новый узел следующим для этого узла,
    * а следующий узел станет следующим для нового узла
    * Размер списка будет увеличен на 1 после добавления элемента.
    */
    @Override
    public void add(Object item, int index) {
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException(index + size);
        }
        Node newNode = new Node(item);
        if (index == 0){
            newNode.next = head;
            if (head != null){
                head.previous = newNode;
            }
            head = newNode;
            if (tail == null){
                tail = newNode;
            }
        } else if (index == size) {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        } else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++){
                curr = curr.next;
            }
            newNode.next = curr.next;
            newNode.previous = curr;
            curr.next.previous = newNode;
            curr.next = newNode;
        }
        size++;
    }


    /*
    * Этот ментод отвечает за удаленния обьекта из связного списка
    * После того как метод найдет с узла нужные данные , метод удаляет его и возвращает true
    * Если элеменет не найдет false
    */
    @Override
    public boolean remove(Object item) {
        Node curr = head;
        while (curr != null){
            if (curr.data.equals(item)){
                if (curr == head){
                    head = head.next;
                    if (head != null){
                        head.previous = null;
                    }
                } else if (curr == tail) {
                    tail = tail.previous;
                    if (tail != null){
                        tail.next = null;
                    }
                }
                else {
                    curr.previous.next = curr.next;
                    curr.next.previous = curr.previous;
                }
                size--;
                return true;
            }
            curr = curr.next;
        }
        return false;
    }



    @Override
    public Object remove(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException(index + size);
        }
        Node curr = head;
        for (int i = 0; i < index; i++){
            curr = curr.next;
        }
        if (curr.previous != null){
            curr.previous.next = curr.next;
        }
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort() {

    }
}
