public class HashMapTest {
    public static void main(String[] args) {
        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();
        System.out.println("myHashMap  " + myHashMap.size());
        myHashMap.put(1, "First");
        myHashMap.put(2, "Second");
        myHashMap.put(3, "Third");
        myHashMap.put(4, "Fourth");
        System.out.println("myHashMap  " + myHashMap.size());
        System.out.println("myHashMap  " + myHashMap.get(3));
        myHashMap.remove(3);
        System.out.println("myHashMap  " + myHashMap.size());
        myHashMap.put(3, "Third");
        System.out.println("myHashMap  " + myHashMap.size());
        myHashMap.clear();
        System.out.println("myHashMap  " + myHashMap.size());
    }
}
