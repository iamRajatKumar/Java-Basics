package ExceptionHandling;

public class TryCatch {
    
    public static void main(String[] args) {
        TryCatch main = new TryCatch();
        main.case1(10,0);
        main.case2(10, 0);
        
    }

    //Manual type handling
    public void case1(int x, int y){
        if(y!=0){
           System.out.println("X/Y = "+x/y);
        }else{
            System.out.println("The Value of Y is 0 Possible exception ");
        }
    }

    //Exception Handling
    public void case2(int x, int y){
        try{
            System.out.println("X/Y = "+x/y);
        }catch(Exception e){
            System.out.println("The Value of Y is 0 Possible exception "+e);
        }
    }
}
