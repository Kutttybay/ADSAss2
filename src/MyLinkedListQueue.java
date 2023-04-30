import java.util.NoSuchElementException;

public class MyLinkedListQueue<T> {
    MyLinkedList myLinkedList = new MyLinkedList<T>();

    /*
    * @Return size of elements in queue
    */
    public int size() {
        return myLinkedList.size();
    }

    /*
    * @throws exception check in list
    */
    public void isEmptyThrowsException(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
    }

    public boolean isEmpty(){
        return this.size() == 0;
    }

    /*
    * @param element will add
    */
    public void enqueue(T element){
        myLinkedList.add(element);
    }

    /*
    * Remove element from the front of queue
    */
    public T dequeue(){
        return (T) myLinkedList.remove(0);
    }

    public T peek(){
        isEmptyThrowsException();
        return (T) myLinkedList.get(0);
    }
}
