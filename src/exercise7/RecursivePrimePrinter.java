package exercise7;

import java.util.Scanner;

public class RecursivePrimePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printPrimes(n);
    }

    public static void printPrimes(int n){
      for (int k=n; k>0; k--){
        if (isPrime(k)){
          System.out.println(k);
        }
      }
        // Implement recursive method
    }

    public static boolean isPrime(int n) {
        
        boolean prime =true;
        for(int d=2; d < n; d++){
          if(n%d == 0){
            prime= false;
            break;
            
          }
        }

        // Implement method
        return prime;
    }
}
