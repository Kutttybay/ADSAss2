public class MyArrayList implements MyList{

    private int size = 0;
    private int capasity = 5;
    private Object[] arr = new Object[capasity];
    /*
    * Method size
    * when it will call return size of ArrayList
    */
    @Override
    public int size() {
        return size;
    }

    /*
    * This method checks all objects of list
    * if code find object it returns true
    * if not return false
    */
    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++){
            if (arr[i].equals(0)){
                return true;
            }
        }
        return  false;
    }
    /*
    * This method add objects to List
    * First check if there is enough space in the list to add the object
    * if not , list makes bigger , then put in the end of list
    */
    @Override
    public void add(Object item) {
        if (size == arr.length){
            resize();
        }
        arr[size++] = item;
    }
    /*
    * method resize make the list bigger by creating new list
    * copying all the elements of old list to new
    * and then using the new list as like main
    */
    public void resize(){
        Object[] newArr = new Object[arr.length * 2];
        for (int i = 0; i < size; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
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