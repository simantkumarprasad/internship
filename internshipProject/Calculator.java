package internshipProject;

import java.util.Scanner;

public class Calculator 
{
	public void calc() {
	   }

	   public static void main(String[] args) {
	      System.out.println("Please select an option from  below");
	      System.out.println("1 for Addition (+)");
	      System.out.println("2 for Subtraction (-)");
	      System.out.println("3 for Multiplication (*)");
	      System.out.println("4 for Division (+)");
	      Scanner scanner = new Scanner(System.in);
	      int op = scanner.nextInt();
	      System.out.println("Enter the first number for operation");
	      double a = scanner.nextDouble();
	      System.out.println("Enter the second number for operation");
	      double b = scanner.nextDouble();
	      double result;
	      switch (op) {
	         case 1:
	            result = a + b;
	            System.out.println("result is:" + result);
	            break;
	         case 2:
	            result = a - b;
	            System.out.println("result is:" + result);
	            break;
	         case 3:
	            result = a * b;
	            System.out.println("result is:" + result);
	            break;
	         case 4:
	            if (a == 0.0) {
	               System.out.println("0 as dividend is not possible");
	            } else {
	               result = a / b;
	               System.out.println("result is:" + result);
	            }
	            break;
	         default:
	            System.out.println("entered values are non operational");
	      }

	   }
}
