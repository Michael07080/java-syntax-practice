
class Calculator {

    // write fuctions for addition, multiplication, division, etc
    int add(int a, int b) {
        return a + b;

    }

    double add(double a, double b) {
        return a + b;

    }

    int subtract(int a, int b) {
        return a - b;
    }


    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    int divide(int a, int b) {
        return a / b;

    }
    // Method overriding -- polymorphism
    double divide(double a, double b) {
        return a /b;
    }


    int modulo(int a, int b) {
        return a % b;

    }



}


public class Math1 {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.subtract(10, 5));
        System.out.println(calc.add(10, 5));
        System.out.println(calc.add(3.2, 4.8));
        System.out.println(calc.divide(10, 5));
        System.out.println(calc.divide(10.6, 5.3));
        System.out.println(calc.multiply(10, 5));
        System.out.println(calc.multiply(2, 3, 4));
        System.out.println(calc.modulo(10, 5));


    }


}
