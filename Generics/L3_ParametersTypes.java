package Generics;

/* Types of generics
 * T- type
 * E- Element
 * K - Key
 * N - Number
 * V - value */

public class L3_ParametersTypes {
    public static void main(String[] args) {
        MyData<Integer, String> MyData = new MyData<>(10, "Rajat");
        System.out.println("Key : " + MyData.getKey() + "Value : " + MyData.getValue());
        MyData.display("Test", 50);
    }
}

class MyData<K, V> {
    private K key;
    private V value;

    public MyData(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "MyData{" + "key=" + key +
                ", value" + value + 
                "}";
    }
    public <E, N> void display(E element, N number){
    System.out.println("Element : "+element+ "Number : "+number);
    }
}