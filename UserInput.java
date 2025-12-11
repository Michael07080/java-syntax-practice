import java.util.Scanner;


public class UserInput {


    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
 
    System.out.print("Enter your name ");
    String name = input.nextLine();
    System.out.println(name);

    System.out.print("Enter your age ");
    String age = input.nextLine();

    int ageConverted =  Integer.parseInt(age);
    System.out.println("Next year " + name + " will be: " + (ageConverted + 1));


    System.out.println("What is your height in meters?");
    double height = Double.parseDouble(input.nextLine());
    System.out.println("You are " + height + " meters tall.");


    System.out.print("Enter your first word: ");
    String firstWord = input.nextLine();
    
    System.out.print("Enter your second word: ");
    String secondWord = input.nextLine();

    System.out.print("Enter your first number: ");
    String firstNumber = input.nextLine();

    System.out.print("Enter your second number: ");
    String secondNumber = input.nextLine();

    int number1plus = Integer.parseInt(firstNumber);
    int number2plus = Integer.parseInt(secondNumber);

    System.out.println(firstWord + secondWord + (number1plus + number2plus) + "@gmail.com");
    


    System.out.print("Enter your first number: ");
    String firstDivideNumber = input.nextLine();

    System.out.print("Enter your second number: ");
    String secondDivideNumber = input.nextLine();

    Double number1divide = Double.parseDouble(firstDivideNumber);
    Double number2divide = Double.parseDouble(secondDivideNumber);
    System.out.println(number1divide/number2divide);

    System.out.print("What is the diameter of your circle: ");
    String circleNumber = input.nextLine();
    Double circleArea = Double.parseDouble(circleNumber);
    
    System.out.println("The area of your circle is: " + (circleArea / 2) * (circleArea / 2) * Math.PI);



    }
    
}


