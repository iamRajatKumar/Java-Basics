package JavaAssignment;

// What will be printed by following lambda usage?
import java.util.Arrays;
import java.util.List;

public class Fifth {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","bb","ccc");
        list.forEach(s ->{
            if(s.length() == 2) return;
            System.out.println(s);
        });
    }
}

//outout of the code: a, ccc