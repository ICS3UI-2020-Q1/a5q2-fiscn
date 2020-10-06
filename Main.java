import java.util.Scanner; 

/**
 * program that will have the user enter in a positive integer. It will then print the numbers from 1 to that number on a single line with commas in between them. 
 * @author Neil Fischer 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create scanner for user import 
    Scanner input = new Scanner(System.in);  

    //prompt the user to enter a positive integer 
    System.out.println("Please enter a positive integer"); 

    //declare variable for user input 
    int userNM = input.nextInt(); 

    //create loop for number print out 
    for(int count = 1; count < userNM; count++) 
    //print out numbers to screen 
    System.out.print(count + " ,"); 
    System.out.print(" " + userNM); 
     
   


  
    
  }
}
