import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num1 ;
      int num2 ;
      int num3 ;
      int num4 ;
      //float product;
      //float average ;
      
      //product = (num1)*(num2)*(num3)*(num4);
     // average = (num1+num2+num3+num4)/4;
      
     //System.out.print("Enter num1: ");
     num1 = scnr.nextInt();
      
     //System.out.print("Enter num2: ");
     num2 = scnr.nextInt();
      
     //System.out.print("Enter num3: ");
     num3 = scnr.nextInt();
      
      //System.out.print("Enter num4: ");
      num4 = scnr.nextInt();
      
      System.out.print(num1 * num2 * num3 * num4);
      System.out.print(" ");
      System.out.println((num1+num2+num3+num4)/4);
      
      System.out.printf("%.3f", (double)num1 * num2 * num3 * num4);
      System.out.print(" ");
      System.out.printf("%.3f",(double)(num1+num2+num3+num4)/4);
      System.out.println("");
      
      
      /* Type your code here. */
   }
}
