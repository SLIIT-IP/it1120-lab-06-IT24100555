import java.util.Scanner;

public class IT241005555Lab6Q2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Please enter 10 numbers ");

        int num = 0; 
        while (num < 10) {
            System.out.print("Enter number " + (num + 1) + ": ");
            numbers[num] = input.nextInt();
            num++; 
		}	
        
        System.out.println("The numbers you entered are : ");
        num = 0; 
        while (num < 10) {
            System.out.print(numbers[num] + " ");
            num++;
        }
    }
}
