package InnerClass.LocalInnerClass;

public class Door {
    
    public boolean isLocked(String Key){
        class Lock{
            public boolean isLocked(String key){
                if(key.equals("qwerty")){
                    return false;
                }else{
                    return true;
                }

            }
        }
        return new Lock().isLocked(Key);
    }
}
