package exercise7;


public class Random {
    public static void main(String[] args) {
       int count = 1;
      for (int i=1; i<=5; i++){

       

          if (count == i){
          System.out.println();
          i=0;
          count++;
        } else { 
          System.out.print(i+" ");
        }
        

      

    }
}
}
