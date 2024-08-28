import java.util.Scanner;

public class IT24100555Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10]; 
        int sum = 0;

        System.out.println("Please enter 10 numbers");

        int num = 0; 
        while (num < 10) {
            System.out.print("Enter number " + (num + 1) + ": ");
            numbers[num] = input.nextInt();
            sum += numbers[num]; 
            num++;
        }

        double average = (double) sum / 10;

        System.out.println("The numbers you entered are : ");
        num = 0;
        while (num < 10) {
            System.out.print(numbers[num] + " ");
            num++;
        }

        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}
