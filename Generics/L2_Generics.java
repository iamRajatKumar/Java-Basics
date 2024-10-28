package Generics;
import java.util.List;
import java.util.LinkedList;

class Data<T>{
    private T object;

    public Data(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return object.toString();
    }
    
}
    

public class L2_Generics {
    public static void main(String[] args) {
        //for multiple datatype we can use object type as in generics
        // List<Data<Object>> elements = new LinkedList<>();
        // elements.add(new Data<Object>("Rajat"));
        // elements.add(new Data<Object>(27));
        // elements.add(new Data<Object>(9.5));
        // elements.add(new Data<Object>('D'));

        // for(Object data : elements){
        //     System.out.println(data);
        // }

        //For single data like String will use
        List<Data<String>> elem = new LinkedList<>();
        elem.add(new Data<>("Rajat"));
        elem.add(new Data<>("Sharma"));
        
        for(Data<String> data : elem){
            System.out.println(data);
        }
    }
}

