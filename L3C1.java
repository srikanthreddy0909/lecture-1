import java.util.Scanner;
public class L3C1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any number !");
      int num = sc.nextInt();
      if(num>0) {
         System.out.println("+ve");
      }
      else if (num==0) {
         System.out.println("neutral");
      }  
      else {
         System.out.println("-ve");
      } 
   }
}