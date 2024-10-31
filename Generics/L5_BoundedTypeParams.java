package Generics;

public class L5_BoundedTypeParams {
   public static void main(String[] args) {
    Datum<Integer, Name> data = new Datum<>(1, new Name(null));
    System.out.println(data);
    data.display(27.5432, "Rajat");
   } 
}

class Datum<K ,V extends Name>{
    
    private K key;
    private V value;

    public Datum(K key, V value) {
        this.key = key;
        this.value = value;
    }
   
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }

    // When using N extends Number we are bounding N to use a number using Number Class, 
    // here we can't use any other data type instead of Number
    public <N extends Number,E > void display(N number, E element){
        System.out.println("Number : "+number+" Element : " +element);
    }

    @Override
    public String toString() {
        return "Datum [key=" + key + ", value=" + value + "]";
    }
    
}

class Name{
    private String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name [name=" + name + "]";
    }
    
}
