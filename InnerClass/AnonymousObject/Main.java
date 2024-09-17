package InnerClass.AnonymousObject;

public class Main {
   public static void main(String[] args) {
    
    // Lock lock = new Lock();

    // if(lock.getCode() == "123456"){
    //     System.out.println("Door is open");
    // }else{
    //     System.out.println("Door is closed");
    // }

    //when we have to use a object only once then we will use anonymous object.
    //anonymous means an obj without name
    //used for garbage collection and free up the memory
    if(new Lock().getCode() == "123456"){
            System.out.println("Door is open");
        }else{
            System.out.println("Door is closed");
        }


   } 
}
