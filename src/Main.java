import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchFieldError {
        MyArrayListQueue myArrayListQueue = new MyArrayListQueue<Integer>();
        MyArrayListStack myArrayListStack = new MyArrayListStack<Integer>();
        MyLinkedListQueue myLinkedListQueue = new MyLinkedListQueue<Integer>();
        MyLinkedListStack myLinkedListStack = new MyLinkedListStack<Integer>();

        // MyArrayListQueue
        System.out.println("MyArrayListQueue");
        myArrayListQueue.enqueue(2);
        myArrayListQueue.enqueue(4);
        myArrayListQueue.enqueue(6);
        System.out.println(myArrayListQueue.dequeue());
        System.out.println(myArrayListQueue.dequeue());
        System.out.println(myArrayListQueue.peek());
    }
}