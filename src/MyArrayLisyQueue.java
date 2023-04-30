public class MyArrayLisyQueue<T> {
    MyArrayList myArrayList = new MyArrayList<T>();

    public boolean isEmpty(){
        return this.size() == 0;
    }

    public int size(){
        return myArrayList.size();
    }

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

    public T dequeue(){
    }

}
