import java.util.EmptyStackException;

public class MyArrayListStack<T> {
    MyArrayList myArrayList = new MyArrayList<T>();

    public boolean isEmpty(){
        return this.size() == 0;
    }

    /*
    * @return thw number of elements in stack
    */
    public int size(){
        return myArrayList.size();
    }

    /*
    * Check throw exceptions in the list
    */
    public void isEmptyThrowException(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
    }

    /*
    * @param element The element will be add
    */
    public void push(T element){
        myArrayList.add(element, 0);
    }

    /*
    * @throws EmptyStackException if the stack empty
    * @return The element at the top of stack
    * remove and return the element at the top of stack
    */
    public T pop(){
        isEmptyThrowException();
        return (T) myArrayList.remove(0);
    }

    /*
    * @throws EmptyStackException if the stack empty
    * @return element at the top of the stack
    * return the element at the top of stack without removing it
    */
    public T peek(){
        isEmptyThrowException();
        return (T) myArrayList.get(0);
    }
}
