# $\S1.$ MyArrayListQueue
## isEmpty()
```java
public boolean isEmpty(){
        return this.size() == 0;
    }
```
This method check queue empty or not
If empty return true, else false
<br/>
## size()
``` java
public int size(){
        return myArrayList.size();
    }
```
Return size of queue
<br/>
## isEmptyThrowException() throws NoSuchFieldError
``` java
public void isEmptyThrowException() throws NoSuchFieldError {
        if (isEmpty()){
            throw new NoSuchFieldError();
        }
    }
```
throws NoSuchFieldError if the queue is empty 
<br/>
## enqueue(T element)
``` java
public void enqueue(T element){
        myArrayList.add(element);
    }
```
Add elements to the back of equeue
<br/>
## T dequeue()
``` java
public T dequeue(){
        return (T) myArrayList.remove(0);
    }
```
Remove elenet from front of queue
<br/>
## T peek() 
``` java
public T peek() throws NoSuchFieldError{
        isEmptyThrowException();
        return (T) myArrayList.get(0);
    }
```
Return element at the front of queue without removing it
<br/>
# $\S2.$ MyArrayListStack
## isEmpty()
``` java
public boolean isEmpty(){
        return this.size() == 0;
    }
```
This method check queue empty or not
If empty return true, else false
<br/>
## Size()
```java
public int size(){
        return myArrayList.size();
    }
```
Return size of stack
<br/>
## isEmptyThrowException()
``` java
public void isEmptyThrowException(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
    }
```
Throws EmptyStackException if Stack is empty 
<br/>
## pust(T element)
``` java
public void push(T element){
        myArrayList.add(element, 0);
    }
```
Add element to the top of stack
<br/>
## T pop()
``` java
public T pop(){
        isEmptyThrowException();
        return (T) myArrayList.remove(0);
    }
```
Return and remove element in top of the stack
<br/>
## T peek()
``` java
public T peek(){
        isEmptyThrowException();
        return (T) myArrayList.get(0);
    }
```
Return element in top of the stack without removing it 
<br/>

# $\S3.$ MyLinkedListQueue
## size()
``` java
public int size() {
        return myLinkedList.size();
    }
```
return size of queue
<br/>
## isEmpty()
``` java
public boolean isEmpty(){
        return this.size() == 0;
    }
```
This method check queue empty or not
If empty return true, else false
<br/>
## isEmptyThrowException()
``` java
public void isEmptyThrowsException(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
    }
``` 
Throws NoSuchElementException if the queue is empty
<br/>
## enqueue(T element)
``` java
public void enqueue(T element){
        myLinkedList.add(element);
    }
```
Add element to the back of queue
<br/>
## T dequeue()
``` java
    public T dequeue(){
        return (T) myLinkedList.remove(0);
    }
```
Remove element from the front of queue
<br/>
## T peek()
``` java
    public T peek(){
        isEmptyThrowsException();
        return (T) myLinkedList.get(0);
    }
```
Return element from the front of queue without removing it 
<br/>
# $\S4.$ MyLinkedListStack
## size()
``` java
    public int size(){
        return myLinkedList.size();
    }
```
return size of stack 
<br/>
## isEmpty()
``` java
    public boolean isEmpty(){
        return this.size() == 0;
    }
```
This method check queue empty or not
If empty return true, else false
<br/>
## isEmptyThrowException()
``` java
    public void isEmptyThrowException(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
    }
```
Throws EmptyStackException if the Stack is empty
<br/>
## pust(T element)
``` java
public void push(T element){
        myLinkedList.add(element, 0);
    }
```
add element to the top of stack
<br/>
## T pop()
``` java
    public T pop(){
        isEmptyThrowException();
        return (T) myLinkedList.remove(0);
    }
```
Return element at the top of stack and remove it
<br/>
## T peek()
``` java
    public T peek(){
        isEmptyThrowException();
        return (T) myLinkedList.get(0);
    }
```
Return element at the top of stack without removing it
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
# $\S1.$ Method size()
## ArrayList
```java
public int size(){
        return sizeOfArrayList;
    }
```
This method returns the number of elements in the array.
## LinkedList
```java
public int size(){
        return size;
    }
```
The same definition like in ArrayList

# $\S2.$ Method contains(Object o)
## ArrayList
```java
    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++){
            if (arr[i].equals(0)){
                return true;
            }
        }
        return  false;
    }
```
This method checks if the array contains the specified object. It returns true if the array contains the object and false otherwise.
## LinkedList
```java
        @Override
        public boolean contains(Object o) {
            Node curr = head;
            while (curr != null){
                if (curr.data.equals(o)){
                    return true;
                }
                curr = curr.next;
            }
            return false;
        }
```
This function returns true if the given object is present in the linked list, otherwise false.

# $\S3.$ Method add(T item)
## ArrayList
```java
    @Override
    public void add(Object item) {
        if (size == arr.length){
            resize();
        }
        arr[size++] = item;
    }
```    
This method adds an element to the end of the array. If the array is full, it calls the increaseBufferIfNeeded() method to increase the size of the array.

## Linked List
```java
    @Override
    public void add(Object item) {
        Node newNode = new Node(item);
        if (tail == null){
            head = newNode;
        }
        else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        size++;
    }
```
This function is similar to add(Object item) but also allows the option to not save the item in a separate ArrayList.

# $\S4.$ Method add(int index, T item)
## ArrayList
```java
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
```
This method adds an element at a specified index in the array. If the array is full, it calls the recize() method to increase the size of the array. 
It shifts all the elements from the specified index to the end of the array one position to the right before inserting the new element.

## Linked List
```java
    @Override
    public void add(Object item, int index) {
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException(index + size);
        }
        Node newNode = new Node(item);
        if (index == 0){
            newNode.next = head;
            if (head != null){
                head.previous = newNode;
            }
            head = newNode;
            if (tail == null){
                tail = newNode;
            }
        } else if (index == size) {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        } else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++){
                curr = curr.next;
            }
            newNode.next = curr.next;
            newNode.previous = curr;
            curr.next.previous = newNode;
            curr.next = newNode;
        }
        size++;
    }
```
This function adds a new element at the specified index of the linked list.

# $\S5.$ Method remove(T item)
## ArrayList
```java
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

```
This method removes the element at the specified index from the array.
It shifts all the elements from the specified index to the end of the array one position to the left after removing the element.
## LinkedList
```java
    @Override
    public boolean remove(Object item) {
        Node curr = head;
        while (curr != null){
            if (curr.data.equals(item)){
                if (curr == head){
                    head = head.next;
                    if (head != null){
                        head.previous = null;
                    }
                } else if (curr == tail) {
                    tail = tail.previous;
                    if (tail != null){
                        tail.next = null;
                    }
                }
                else {
                    curr.previous.next = curr.next;
                    curr.next.previous = curr.previous;
                }
                size--;
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
```
This function removes the given object from the linked list, if it exists.

# $\S6.$ Method remove(int index)
## ArrayList
```java
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
```
This method removes the element at the specified index from the array. 
It shifts all the elements from the specified index to the end of the array one position to the left after removing the element.

## Linked List
```java
    @Override
    public Object remove(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException(index + size);
        }
        Node curr = head;
        for (int i = 0; i < index; i++){
            curr = curr.next;
        }
        if (curr.previous != null){
            curr.previous.next = curr.next;
        }
        else {
            head = curr.next;
        }
        if (curr.next != null){
            curr.next.previous = curr.previous;
        }
        else {
            tail = curr.previous;
        }
        size--;
        return curr.data;
    }
```
This function removes the element at the given index from the linked list.

# $\S7.$ Method clear()
## ArrayList
```java
        @Override
        public void clear() {
            for (int i = 0; i < size; i++){
                arr[i] = null;
            }
            size = 0;
        }
```
This method clear all in list and reduce size to 0

## Linked List
```java
    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
```
This methode do all thing equal to null and size to 0 . So cleare all

# $\S8.$ Method get(int index)
## ArrayList
```java
    @Override
    public Object get(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }
```
Return element in list by index

## Linked List
```java
    @Override
    public Object get(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException(index);
        }
        Node<T> curr;
        if (index < size / 2){
            curr = head;
            for (int i = 0; i < index; i++){
                curr = curr.next;
            }
        } else {
            curr = tail;
            for (int i = size - 1; i > index; i--){
                curr = curr.previous;
            }
        }
        return curr.data;
    }
```
This function returns the element at the given index in the linked list.

# $\S9.$ Method indexOf(Object o)
## ArrayList
```java
    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++){
            if (arr[i].equals(o)){
                return i;
            }
        }
        return -1;
    }
```
 This method returns the index of the first occurrence of the specified object in the array. If the object is not found, it returns -1.
 
## Linked List
```java
    @Override
    public int indexOf(Object o) {
        Node curr = head;
        int i = 0;
        while (curr != null){
            if (curr.data.equals(o)){
                return i;
            }
            i++;
            curr = curr.previous;
        }
        return -1;
    }
```
This function returns the index of the first occurrence of the given object in the linked list, or -1 if not found.

# $\S10.$ Method lastIndexOf(Object o)
## ArrayList
```java
    @Override
    public int lastIndexOf(Object o) {
        for (int i = size - 1; i >= 0; i--){
            if (arr[i].equals(o)){
                return i;
            }
        }
        return -1;
    }
```
This method returns the index of the last occurrence of the specified object in the array. If the object is not found, it returns -1.

## Linked List
```java
    @Override
    public int lastIndexOf(Object o) {
        int i = size - 1;
        Node<T> curr = tail;
        while (curr != null){
            if (curr.data.equals(o)){
                return i;
            }
            i--;
            curr = curr.previous;
        }
        return -1;
    }
```
### 1. This function returns the index of the first occurrence of the given object in the linked list, or -1 if not found.

# $\S11.$ Method sort()
## ArrayList
```java
    @Override
    public void sort() {
        Arrays.sort(arr, 0, size);
    }
```
This method sort by the util in java. 

## LinkedList
```java
    @Override
    public void sort() {
       if (size < 2){
           return;
       }
       Node<T> curr = head;
       Node<T> index;
       T temp;

       while (curr != null){
           index = curr.next;
           while (index != null){
               if (((Comparable<T>)curr.data).compareTo(index.data) > 0){
                   temp = curr.data;
                   curr.data = index.data;
                   index.data = temp;
               }
               index = index.next;
           }
           curr = curr.next;
       }
    }
```
This function sorts the elements of the linked list in ascending order using bubble sort (O(n^2)).
