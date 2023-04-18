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

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++){
            if (arr[i].equals(0)){
                return
            }
        }
    }

    @Override
    public void add(Object item) {
        if (size == arr.length){
            resize();
        }
    }

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