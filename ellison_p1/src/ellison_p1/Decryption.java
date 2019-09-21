package ellison_p1;
import java.util.Scanner; 
public class Decryption {

	public static void main(String[] args) {
		int userInput;
	    int f1;
	    int f2;
	    int f3;
	    int f4;
	    int swapHolder1;
	    int swapHolder2;
	     
	     
	    Scanner scnr = new Scanner(System.in); 
	    System.out.print("Enter four digit code:");
	    userInput = scnr.nextInt();
	    scnr.close();

	     
	    //first get each digit
	    f4 = userInput % 10;
	    f3 = (userInput % 100) / 10;
	    f2 = (userInput % 1000) / 100;
	    f1 = (userInput % 10000) / 1000;
     	    
	    //Swapping the first digit with third digit.

	    swapHolder1 = f3;
	    f3 = f1;
	    f1 = swapHolder1;
	    
	    //Swapping the second digit with fourth digit.
	    swapHolder2 = f4;
	    f4 = f2;
	    f2 = swapHolder2;
	      
	    //Then add 7 and get the remainder when divided by 10.
	    f1 = (f1 + 3) % 10;
	    f2 = (f2 + 3) % 10;
	    f3 = (f3 + 3) % 10;
	    f4 = (f4 + 3) % 10;
	         
	    System.out.println("Decryped Number:" + f1 + "" + f2 + "" + f3 + "" + f4);
	}

}
