package OOPs.L7_Encapsulation;

//Encapsulation allow to restrict the useage 
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jhon", 25,"Male");
        person.setName("sharma");
        person.setAge(2);
        System.out.println(person);
    }
}
