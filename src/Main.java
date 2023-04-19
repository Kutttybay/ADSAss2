import java.util.Scanner;

public class Main {
    MyArrayList arrayList = new MyArrayList();
    MyLinkedList linkedList = new MyLinkedList();
    public static void main(String[] args) {
        boolean tf = true;
        int v;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Hello ! This is assignment 2 \n" +
                    "Please choice 1 or 2 (0 exit) \n" +
                    "1. My Array List\n" +
                    "2. My Linked List\n" +
                    "0. Exit");
            v = sc.nextInt();
            switch (v){
                case 1:
                    showArrayList();
                    break;
                case 2:
                    showLinkedList();
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Wrong answer!");
            }
        }while (v != 0);
    }

    public static void showArrayList(){
        MyArrayList arrayList = new MyArrayList();
        MyLinkedList linkedList = new MyLinkedList();
        System.out.println("Size: " + arrayList.size());
        System.out.println("Enter the int variables , for stop enter -1");
        int nextInt;
        Scanner sc = new Scanner(System.in);
        while (true){
            nextInt = sc.nextInt();
            if (nextInt == -1){
                break;
            }
            arrayList.add(nextInt);
        }

    }

    public static void showLinkedList(){

    }
}