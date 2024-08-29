import java.util.Scanner;

 public class IT24100555Lab6Q3 {
   public static void main (String[] args) {
       Scanner input= new Scanner(System.in);
	   int count=0;
	   double sum_ofsqure=0;
	   
	   System.out.println("Enter the positive integers (Terminate input with -99):");
	   
	   while(true) {
	     System.out.print("Enter a number: ");
		 int num=input.nextInt();
		 
		 if (num==-99) {
		   break;
		   }
		 if  (num<0)  {
		   System.out.println("Invalid input.Please enter the posive integer or -99 to terminate");
		   continue;
		   }
		 sum_ofsqure += Math.pow(num,2);
		 count++;
		 }
		if (count>0) {
		  double rms = Math.sqrt( sum_ofsqure/ count);
		  System.out.println();
		  System.out.println("The Root Mean Squre (RMS) is: "+ rms);
		  }
		  input.close();
   }
		
 }
		  
		   