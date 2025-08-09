package Math;
public class PrintAllDivisorGFG {

   public static void printDivisor(int n){
    int i=0;
    for(i=1; i*i<n; i++){
      if(n%i==0) 
        System.out.println(i);
    }
    for( ; i>=1; i--){
      if(n%i==0) 
        System.out.println(n/i);
    }
  }
  
  public static void main(String[] args) {
    int n = 15;
    printDivisor(n);
  }
 
}