import java.util.Scanner;
public class IT24100555Lab6Q1 {
  public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
  
 
  System.out.println("Enter a number");
  double num=input.nextDouble();
  
  double Squre=num*num;
  double Squre_r= Math.sqrt(num);
  
  System.out.println("The squre of "+num+" is :"+ Squre);
  System.out.println("The squre root of "+num+" is: "+Squre_r);
  }
 }
  