import java.util.EmptyStackException;

public class MyLinkedListStack<T> {
    MyLinkedList myLinkedList = new MyLinkedList<T>();


    /*
    * check throw exception in the list
    */
    public void isEmptyThrowException(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
    }

    /*
    * return size of the stack
    */
    public int size(){
        return myLinkedList.size();
    }


    public boolean isEmpty(){
        return this.size() == 0;
    }

    /*
    * add element to the top of stack
    * @param element will add
    */
    public void push(T element){
        myLinkedList.add(element, 0);
    }

    /*
    * @throws EmptyStackExceptino if the stack is empty
    * @return element at the top of the stack
    * removes and return the element at the top of the stack
    */
    public T pop(){
        isEmptyThrowException();
        return (T) myLinkedList.remove(0);
    }

    /*
    * @throws EmptyStackExceptino if the stack is empty
    * @return element at the top of the stack
    * returns the element at the top of the stack without removing it
    */
    public T peek(){
        isEmptyThrowException();
        return (T) myLinkedList.get(0);
    }
}
