import java.util.Scanner;
import java.util.LinkedList;
import java.util.Deque;

public class Palindrom {

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int j;
      String line;
      char Let;
      boolean mytext;
      Character FirstChar;
      Character LastChar;
      
      Deque<Character> characters = new LinkedList<Character>();
      
   

      line = scnr.nextLine();
      //int j = line.length();
      
      for (j  = 0; j < line.length(); j++ ) { 
       Let = line.charAt(j);
       if (Character.isLetter(Let))
       {
          characters.addLast(Let);
          
          }
          
      }
        
        mytext = true;  
        
        while (characters.size()>1) {
           
           if (characters.removeFirst() != characters.removeLast()) {
              
              mytext = false;
              //System.out.println("No, " +'\u0022' + line + '\u0022'+ " is not a palindrome." );
              break;
              
              //break;
              
              }
           
        }
        //System.out
        if(!mytext){
        System.out.println("No, " +'\u0022' + line + '\u0022'+ " is not a palindrome." );
        }
        else
        {
        System.out.println("Yes, " +'\u0022' + line + '\u0022'+ " is a palindrome." );
        }
   } 

   
        
}