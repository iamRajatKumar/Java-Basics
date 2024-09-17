package InnerClass.LocalInnerClass;

public class Main {
    public static void main(String[] args) {
        Door door = new Door();
        // if(door.isLocked(args[0])){ //for command line arguments
        
            if(door.isLocked("qwerty")){
            System.out.println("Door is Locked");
        }else{
            System.out.println("Door is unlocked");
        }
    }
}
