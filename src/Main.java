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

        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(14);
        arrayList.add(20, 5);
        arrayList.remove((Object) 6);
        arrayList.remove(2);
        arrayList.get(5);
        arrayList.indexOf(8);
        arrayList.lastIndexOf(12);
        System.out.println(arrayList.contains(2));
        System.out.println(arrayList.size());
        arrayList.sort();
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.get(4));
        System.out.println(arrayList.get(5));
        arrayList.clear();
    }

    public static void showLinkedList(){
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(10);
        linkedList.add(4);
        linkedList.add(2);
        System.out.println(linkedList.size());
        System.out.println(linkedList.get(0));
        linkedList.add(15, 3);
        linkedList.remove((Object) 3);
        linkedList.remove(1);
        System.out.println(linkedList.indexOf(10));
        System.out.println(linkedList.indexOf(4));
        System.out.println(linkedList.contains(2));
        linkedList.sort();
        System.out.println("size : " + linkedList.size());
        linkedList.sort();
        linkedList.clear();
    }
}