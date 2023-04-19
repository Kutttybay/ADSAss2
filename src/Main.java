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
        System.out.println(arrayList.get(5));
        arrayList.remove((Object) 2515);
        arrayList.remove(6);
        System.out.println(arrayList.get(2));
        arrayList.indexOf(32);
        arrayList.lastIndexOf(1);
        System.out.println(arrayList.contains(25));
        System.out.println(arrayList.size());
        arrayList.sort();
        System.out.println(arrayList.get(0));
        arrayList.clear();


        System.out.println();
        System.out.println();
        // LinkedList

        linkedList.add(12);
        linkedList.add(32);
        linkedList.add(51);
        linkedList.add(24);
        linkedList.add(19);
        linkedList.add(42);

        System.out.println(linkedList.size());
        System.out.println(linkedList.contains((Object) 3));
        System.out.println(linkedList.indexOf(3));
        linkedList.remove(2);
        linkedList.remove((Object) 24);
        System.out.println(linkedList.size());
        linkedList.clear();
    }
}