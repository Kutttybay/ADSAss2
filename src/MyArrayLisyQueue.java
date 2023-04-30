public class MyArrayLisyQueue<T> {
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



}
