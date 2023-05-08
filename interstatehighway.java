import java.util.Scanner; 

     public class InterstateHighWay {
        
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int highwayNumber;
      int primaryNumber;
      int num;
      
      highwayNumber = scnr.nextInt();
      if (highwayNumber <= 0 || highwayNumber >= 1000 || highwayNumber % 100 == 0 )
      {
      System.out.print( highwayNumber + " is not a valid interstate highway number.");
      System.out.println("");
      }
      
      else 
      {
         if (highwayNumber > 0 && highwayNumber <= 99)
      {
      System.out.print("I-"+ highwayNumber + " is primary");
      //System.out.print(" ");
      }
      
     else if (highwayNumber >= 100 && highwayNumber < 1000 )
      { 
         num = highwayNumber % 100;
      System.out.print("I-" + highwayNumber + " is auxiliary, serving I-"+num);
      //System.out.print(" ") ;
      }
      
     if (highwayNumber% 2 == 0 && highwayNumber != 0 && highwayNumber != 1000)
     
     { System.out.print(", going east/west."); 
       System.out.println("");
     }
   
     else if (highwayNumber% 2 != 0)
     
    { System.out.print(", going north/south.");
      System.out.println("");
    }
      }
   
   }
}
