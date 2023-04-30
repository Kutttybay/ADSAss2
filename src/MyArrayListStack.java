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

}
