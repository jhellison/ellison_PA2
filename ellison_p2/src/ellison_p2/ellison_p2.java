package ellison_p2;

import java.util.Scanner;

public class ellison_p2 {

	public static void main(String[] args) {
		int MeasurmentChoice;
	     double weightInPounds;
	     double heightInInches;
	     double weightInKilograms;
	     double heightInMeters;
	     double BMI_CS;
	     double BMI_MS;
	     
	     Scanner scnr = new Scanner(System.in); 

	     System.out.println("Do you want your BMI measurement in U.S. Customary(type 0) or Meteric System(type 1)?");
	     System.out.print("Type your response here:");
	     MeasurmentChoice = scnr.nextInt();

	     //Customary
	     if(MeasurmentChoice == 0)
	     {
	        System.out.print("\nWhat is your weight in pounds: ");
	        weightInPounds = scnr.nextDouble();

	        System.out.print("What is your height in inches: ");
	        heightInInches = scnr.nextDouble();
	        scnr.close();

	        BMI_CS = (703 * weightInPounds)/(heightInInches * heightInInches);

	        System.out.printf("Your BMI: %.1f\n\n",BMI_CS);

	        System.out.println("BMI Categories:" +"\n" + "Underweight = <18.5");
	        System.out.println("Normal weight = 18.5–24.9" + "\n" + "Overweight = 25–29.9");
	        System.out.println("Obesity = BMI of 30 or greater");
	     }

	     //Metric
	    else
	    {
	      System.out.printf("\nWhat is your weight in kilograms:");
	      weightInKilograms = scnr.nextDouble();
	      

	      System.out.print("What is your height in meters:");
	      heightInMeters = scnr.nextDouble();
	      
	      scnr.close();
	      
	      BMI_MS = (weightInKilograms/(heightInMeters * heightInMeters));

	      System.out.printf("Your BMI: %.1f\n\n",BMI_MS);
	     
	      System.out.println("BMI Categories:" +"\n" + "Underweight = <18.5");
	      System.out.println("Normal weight = 18.5–24.9" + "\n" + "Overweight = 25–29.9");
	      System.out.println("Obesity = BMI of 30 or greater");
	    }

	}

}
