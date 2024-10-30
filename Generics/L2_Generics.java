package Generics;
import java.util.List;
import java.util.LinkedList;

//datam is name of class i.e. data because we were getting problems in the prject
class Datam<T>{
    private T object;

    public Datam(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return object.toString();
    }
    
}
    

public class L2_Generics {
    public static void main(String[] args) {
        //for multiple Datatype we can use object type as in generics
        // List<Datam<Object>> elements = new LinkedList<>();
        // elements.add(new Datam<Object>("Rajat"));
        // elements.add(new Datam<Object>(27));
        // elements.add(new Datam<Object>(9.5));
        // elements.add(new Datam<Object>('D'));

        // for(Object Datam : elements){
        //     System.out.println(Datam);
        // }

        //For single Data like String will use
        List<Datam<String>> elem = new LinkedList<>();
        elem.add(new Datam<>("Rajat"));
        elem.add(new Datam<>("Sharma"));
        
        for(Datam<String> Datam : elem){
            System.out.println(Datam);
        }
    }
}

