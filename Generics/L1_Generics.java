package Generics;

class Data{
    private Object object;
    public Data(Object object){
        this.object = object;
    }

    public Object getObject(){
        return object;
    }
}

class GenericData<T>{
    private T data;

    public GenericData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
    
}
public class L1_Generics {
    public static void main(String[] args) {
        //object type declaration in java
        // Data data = new Data("some Data");
        // String x = (String) data.getObject();
        // System.out.println(x);

        //generic type declaraction in java
        GenericData<String> genericData = new GenericData<>("Some Generic Data!");
        String y = genericData.getData();
        System.out.println(y);
    }
}
