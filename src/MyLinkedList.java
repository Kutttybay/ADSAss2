import org.w3c.dom.Node;

public class MyLinkedList<T> implements MyList<T> {

    private Node<T> head;
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


    /*
    * This method adds a new element to the end of a linked list
    * If the linked list is empty, it creates a new node with the given item as data and assigns it as the head of the linked list
    * If isn't it traverses the list until it reaches the last node, and adds a new node with the given item as data as the next node
    * Size of the linked list is incremented after adding the new element
    */
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
        size++;
    }


    @Override
    public void add(T item, int index) {
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        if (index == size){
            add(item);
        } else if (index == 0) {
            head = new Node<T>(item, head);
            size++;
        }
        else {
            Node<T> prev = getNode(index - 1);
            prev.next = new Node<T>(item, prev.next);
            size ++;
        }
    }

    public Node<T> getNode(int index){
        Node<T> curr = head;
        for (int i = 0; i < index; i++){
            curr = curr.next;
        }
        return curr;
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
