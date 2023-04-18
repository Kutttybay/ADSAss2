public class Main {
    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();
        MyLinkedList linkedList = new MyLinkedList();

        // ArrayList

        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(12);
        arrayList.add(25);
        arrayList.add(1);
        arrayList.add(166);
        arrayList.add(2515);
        arrayList.add(32);

        System.out.println(arrayList.get(4));
        System.out.println(arrayList.size());

        arrayList.remove((Object) 25);

        System.out.println(arrayList.size());
        System.out.println(arrayList.get(3));

        arrayList.clear();
        System.out.println(arrayList.size());
        // LinkedList
    }
}