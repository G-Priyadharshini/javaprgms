public class Prime{
public static void main(String args[]){
    printPrimeBetween(10, 20);
}

public static boolean isPrime(int n){
for(int i=2; i<=n/2;i++){
   if(n%i == 0)
         return false;

   }
return true;
}
public static void printPrimeBetween(int x, int y){
      for( int i = x ; i<=y; i++)
       { 
          if(isPrime(i))
             System.out.println(i);
         }
}
}

