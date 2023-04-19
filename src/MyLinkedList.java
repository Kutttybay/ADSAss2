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

    @Override
    public void add(Object item, int index) {

    }

    @Override
    public boolean remove(Object item) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
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
