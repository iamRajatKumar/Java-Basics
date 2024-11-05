package CollectionFramework.Set;

import java.util.EnumSet;
import java.util.Set;

enum elements {Code, Learn, Contribute, quiz, mcq};

public class EnumSetClass {

    public static void main(String[] args) {
        Set<elements> set1;
        set1 = EnumSet.of(elements.quiz, elements.Code, elements.Learn, elements.Contribute);
        System.out.println("Set 1 : "+set1);
    }
    
}
