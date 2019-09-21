package ellison_p3;

import java.util.Scanner; 

public class ellison_p3 {

	public static void main(String[] args) {
		     Scanner scnr = new Scanner(System.in);
		     int i,j;
		     
		     int flag=0;    
		     int numTopics = 5;
		     
		     int numRows = 5;
		     int numColumns = 10;
		     

		     //My five topics
		     String [] topics = new String [numTopics];
		     topics[0] = "videogames";
		     topics[1] = "tv shows";
		     topics[2] = "movies";
		     topics[3] = "food";
		     topics[4] = "memes";

		     //The 2D-array
		     int [][] responses = new int [numRows][numColumns];
		     
		     // Intialization of the 2D-array to 0.     
		     for(i=0;i<5;i++)
		     {
		       for(j=0;j<10;j++)
		       {
		         responses[i][j] = 0;
		       }
		     }
		   
		    
		    int userNum=0;
		    int userInput;
		    while (flag == 0) 
		    {
		      System.out.print("videogames:");
		      i = scnr.nextInt();
		      responses[0][i - 1] = responses[0][i - 1] + 1;

		      System.out.print("tv shows:");
		      i = scnr.nextInt();
		      responses[1][i - 1] = responses[1][i - 1] + 1;

		      System.out.print("movies:");
		      i = scnr.nextInt();
		      responses[2][i - 1] = responses[2][i - 1] + 1;


		      System.out.print("food:");
		      i = scnr.nextInt();
		      responses[3][i - 1] = responses[3][i - 1] + 1;

		      System.out.print("memes:");
		      i = scnr.nextInt();
		      responses[4][i - 1] = responses[4][i - 1] + 1;

		      userNum++;
		      System.out.print("Want to have another user? 0 = yes 1 = no:");
		      userInput = scnr.nextInt();
		      flag = userInput;

		    }



		     double avg0=0.0;
		     double avg1=0.0;
		     double avg2=0.0;
		     double avg3=0.0;
		     double avg4=0.0;

		     double sum0=0;
		     double sum1=0;
		     double sum2=0;
		     double sum3=0;
		     double sum4=0;

		     double total0=0;
		     double total1=0;
		     double total2=0;
		     double total3=0;
		     double total4=0;

		    i = 0;
		    while(i < 10)
		    {
		      sum0 = sum0  + (responses[0][i]) * (i+1);
		      i+=1;
		    }
		    total0 = sum0;
		    avg0 = sum0/userNum;

		    i = 0;
		    while(i < 10)
		    {
		      sum1 = sum1  + (responses[1][i]) * (i+1);
		      i+=1;
		    }
		    total1 = sum1;
		    avg1 = sum1/userNum;

		    i = 0;
		    while(i < 10)
		    {
		      sum2 = sum2  + (responses[2][i]) * (i+1);
		      i+=1;
		    }
		    total2 = sum2;
		    avg2 = sum2/userNum;

		    i = 0;
		    while(i < 10)
		    {
		      sum3 = sum3  + (responses[3][i]) * (i+1);
		      i+=1;
		    }
		    total3 = sum3;
		    avg3 = sum3/userNum;

		    i = 0;
		    while(i < 10)
		    {
		      sum4 = sum4  + (responses[4][i]) * (i+1);
		      i+=1;
		    }
		    total4 = sum4;
		    avg4 = sum4/userNum;

		System.out.println("Responses"); 
		      System.out.print( "\t" + "\t"+ "    " + "1" + " \t");
		      System.out.print("2" + "\t" + "3");
		      System.out.print("\t" + "4" + "\t" + "5");
		      System.out.print("\t" + "6" + "\t" + "7");
		      System.out.print("\t" + "8" + "\t" +  "9");
		      System.out.println("\t" + "10" + "\t" + "Average");

		      System.out.print("videogames:\t" + responses[0][0] + "\t" + responses[0][1] + "\t" + responses[0][2] + "\t" + responses[0][3] + "\t" + responses[0][4] + "\t" + responses[0][5] + "\t" + responses[0][6] + "\t" + responses[0][7] + "\t" + responses[0][8] + "\t" + responses[0][9] + "\t");
		      System.out.println("\t" + avg0);

		      System.out.print("tv shows:\t" +  responses[1][0] + "\t" + responses[1][1] + "\t" + responses[1][2] + "\t" + responses[1][3] + "\t" + responses[1][4] + "\t" + responses[1][5] + "\t" + responses[1][6] + "\t" + responses[1][7] + "\t" + responses[1][8] + "\t" + responses[1][9] + "\t");
		      System.out.println("\t" + avg1);

		      System.out.print("movies:\t\t" +  responses[2][0] + "\t" + responses[2][1] + "\t" + responses[2][2] + "\t" + responses[2][3] + "\t" + responses[2][4] + "\t" + responses[2][5] + "\t" + responses[2][6] + "\t" + responses[2][7] + "\t" + responses[2][8] + "\t" + responses[2][9] + "\t");
		      System.out.println("\t" + avg2);

		      System.out.print("food:\t\t" +  responses[3][0] + "\t" + responses[3][1] + "\t" + responses[3][2] + "\t" + responses[3][3] + "\t" + responses[3][4] + "\t" + responses[3][5] + "\t" + responses[3][6] + "\t" + responses[3][7] + "\t" + responses[3][8] + "\t" + responses[3][9] + "\t");
		      System.out.println("\t" + avg3);

		      System.out.print("memes:\t\t" +  responses[4][0] + "\t" + responses[4][1] + "\t" + responses[4][2] + "\t" + responses[4][3] + "\t" + responses[4][4] + "\t" + responses[4][5] + "\t" + responses[4][6] + "\t" + responses[4][7] + "\t" + responses[4][8] + "\t" + responses[4][9] + "\t");
		      System.out.println("\t" + avg4);
		  
		    scnr.close();
		    
		     double maxVal = 0.0;
		     double minVal = 1000.0;
		     int maxIndex =0;
		     int minIndex =0;

		     
		//For Max
		     if(total0>maxVal)
		     {
		      maxVal = total0;
		      maxIndex = 0;
		      }

		      if(total1>maxVal)
		     {
		      maxVal = total1;
		      maxIndex = 1;
		      }

		      if(total2>maxVal)
		     {
		      maxVal = total2;
		      maxIndex = 2;
		      }
		      if(total3>maxVal)
		     {
		      maxVal = total3;
		      maxIndex = 3;
		      }
		      if(total4>maxVal)
		     {
		      maxVal = total4;
		      maxIndex = 4;
		      }

		//For Min
		      if(total0 < minVal)
		      {
		        minVal = total0;
		        minIndex = 0;
		      }

		       if(total1<minVal)
		      {
		        minVal = total1;
		        minIndex = 1;
		      }

		       if(total2<minVal)
		      {
		        minVal = total2;
		        minIndex = 2;
		      }

		       if(total3<minVal)
		      {
		        minVal = total3;
		        minIndex = 3;
		      }

		      if(total4<minVal)
		      {
		        minVal = total4;
		        minIndex = 4;
		      }
		     

		     System.out.println("\n" + "Maximum Rated Issue:" + topics[maxIndex]+ "\tRatings:"+ maxVal);
		     System.out.println("Minimum Rated Issue:" + topics[minIndex]+ "\tRatings:" + minVal);
		  }
		}
