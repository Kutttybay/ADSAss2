public class MyArrayListQueue<T> {
    MyArrayList myArrayList = new MyArrayList<T>();

    /*
    * @return true if queue is empty, false otherwise
    */
    public boolean isEmpty(){
        return this.size() == 0;
    }

    /*
    * @return number of elements in queue
    */
    public int size(){
        return myArrayList.size();
    }

    /*
    * Check throw Exception in the list
    */
    public void isEmptyThrowException() throws NoSuchFieldError {
        if (isEmpty()){
            throw new NoSuchFieldError();
        }
    }
    /*
    * Add element to the back of queue
    * @param element the element added to the back of queue
    */
    public void enqueue(T element){
        myArrayList.add(element);
    }

    /*
    * Remove element from the front of queue
    */
    public T dequeue(){
        return (T) myArrayList.remove(0);
    }

    /*
    * @throw NoSuchFieldError if the queue is empty
    * @return the element at the front of queue
    * Return element at the front of queue without removing it
    */
    public T peek() throws NoSuchFieldError{
        isEmptyThrowException();
        return (T) myArrayList.get(0);
    }
}
