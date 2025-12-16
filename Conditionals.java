import java.util.Scanner;

public class Conditionals {
    public static void main (String[] args) {

        //Basic Booleans
        System.out.println(" Double equals: " + (3 == 2));
        System.out.println("String equivalent: " + "Hello".equals("Helloz"));
        System.out.println("Not equals: " + (7 != 4));
        System.out.println("Greater than: " + (4 > 5));
        
        System.out.println();

        int num = 11;
        // if - then statement
        System.out.println(num <= 12);
        if (num <= 12) {
            System.out.println("num is less than or equals to 12");
        }


        // if else statement
        if (num <= 5) {
            System.out.println("num is less than or equals to 5");
        } else {
            System.out.println("yay num is greater that 5");
        }

        // if ...else-if... else
            int temperature = 93;
            if (temperature >= 85) {
                System.out.println("It's hot!");
                } else if (temperature >= 60){
                    System.out.println("Its nice");
                } else {
                    System.out.println("error");
                }


            // logical 'and operator: &&'
        int age = 17;
        boolean hasPermit = true;

        if (age >= 17 && hasPermit){
            System.out.println("You can drive");
        } else {
            System.out.println("Can't drive yet");
        }


        // Using 'or' ||

        String day = "Saturday";

        if (day.equals("Saturday") || day.equals("Sunday")){
            System.out.println("its the weekend");
        } else if (day.equals("Monday") || 
                    day.equals("Tuesday") ||
                    day.equals("Wendsay") || 
                    day.equals("Thursday")) {
            System.out.println("Its the weekday");
        } else {
            System.out.println("Its not the weekday");
        }

            
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your password");
        String userpass = input.nextLine();

        String password = "Cookies";

        if (userpass.equals("Cookies")) {
            System.out.println("Access granted");
        } else {
            System.out.println("Acess denied");
        }

        System.out.print("Enter your number ");
        int usernum = input.nextLine();

        

        if (usernum % 2 != 1) {
            System.out.println("Even ");
        } else {
            System.out.println(" Odd ");
        }

        



                
            




    }

    
}
