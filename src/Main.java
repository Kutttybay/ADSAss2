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

        System.out.println();
        // MyArrayListStack
        System.out.println("MyArrayListStack");
        myArrayListStack.push(1);
        myArrayListStack.push(2);
        myArrayListStack.push(3);
        System.out.println(myArrayListStack.pop());
        System.out.println(myArrayListStack.pop());
        System.out.println(myArrayListStack.peek());

        System.out.println();
        // MyLinkedListQueue
        System.out.println("MyLinkedListQueue");
        myLinkedListQueue.enqueue(8);
        myLinkedListQueue.enqueue(10);
        myLinkedListQueue.enqueue(12);
        System.out.println(myLinkedListQueue.dequeue());
        System.out.println(myLinkedListQueue.dequeue());
        System.out.println(myLinkedListQueue.peek());

        System.out.println();
        // MyLinkedListStack
        System.out.println("MyLinkedListStack");
        myLinkedListStack.push(4);
        myLinkedListStack.push(5);
        myLinkedListStack.push(6);
        System.out.println(myLinkedListStack.pop());
        System.out.println(myLinkedListStack.pop());
        System.out.println(myLinkedListStack.peek());
    }
}