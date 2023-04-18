import org.w3c.dom.Node;

public class MyLinkedList<T> implements MyList<T> {

    private Node head;
    private int size;

    private static class Node<T>{
        T data;
        Node<T> next;

        Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    public MyLinkedList(){
        head = null;
        size = 0;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public void add(T item) {
        if (head == null){
            head = new Node<T>(item);
        }
        else {
            Node<T> curr = head;
            while (curr.next != null){
                curr = curr.next;
            }
            curr.next = new Node<T>(item);
        }
        size++
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
