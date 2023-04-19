import java.util.Arrays;

public class MyArrayList<T> implements MyList{

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

    /*
    * This method starts work like first add method
    * This code adds an object to a specific index in a list by first checking if the index is within the bounds of the list.
    * Then code check space for add objects to list
    * Then shifts all the elements after specified index one position to the right for the new object
    * And put the new Object by index
    * Finally it increase the size of the list by one
    */
    @Override
    public void add(Object item, int index) {
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        if (size == arr.length){
            resize();
        }
        for (int i = size; i > index; i--){
            arr[i] = arr[i - 1];
        }
        arr[index] = item;
        size++;
    }

    /*
    * This method tries to remove a specific item from a list
    * It loop every object and if given parameter equals to checks item
    * When he find given parameter he call another remove method
    * But if dont find method return false
    */
    @Override
    public boolean remove(Object item) {
        for (int i = 0 ; i < size; i++){
            if (arr[i].equals(item)){
                remove(i);
                return true;
            }
        }
        return false;
    }


    /*
    * First check index to the valid range , throwing an exception if not
    * After method get object to be removed and shifts all elements to the left
    * Final it sets the last elements of size null , and decrements the size of the list
    */
    @Override
    public Object remove(int index) {
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        Object removed = (Object) arr[index];
        for (int i = index; i < size - 1; i++){
            arr[i] = arr[i + 1];
        }
        arr[--size] = null;
        return removed;
    }


    /*
    * This method clear all in the list
    * First starts loop and all objects by index will be equals to null
    * After all size will be equals to zero
    */
    @Override
    public void clear() {
        for (int i = 0; i < size; i++){
            arr[i] = null;
        }
        size = 0;
    }


    /*
    * This method get return object of list by the index
    * First methods check if the index out of bounds
    * And if yes throws an IndexOutOfBoundsException
    * If the index valid method returns object by index in the list
    */
    @Override
    public Object get(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }



    /*
    * Method search for the index of an object in a array
    * Method search object 'o', check all by the for-loop and if object equal to 'o'
    * Return object by the index
    * If not method return -1 to indicate that the object wasn't founded
    */
    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++){
            if (arr[i].equals(o)){
                return i;
            }
        }
        return -1;
    }



    /*
    * This method finding last index of a given elements in array
    * Loop starts from the end of the array and iterates backwards until it finds first occurrence of 'o'
    * And return index
    * If not find method return -1 for indicate that 'o' isn't in the array
    */
    @Override
    public int lastIndexOf(Object o) {
        for (int i = size - 1; i >= 0; i--){
            if (arr[i].equals(o)){
                return i;
            }
        }
        return -1;
    }



    /*
    * This method sort all elements in the array
    * Start to 0 and end index-1
    */
    @Override
    public void sort() {
        Arrays.sort(arr, 0, size);
    }
}