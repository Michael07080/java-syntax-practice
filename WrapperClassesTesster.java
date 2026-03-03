public class WrapperClassesTesster {
    

    public static void main(String[] args){

        Wrapper.demoInteger();
        Wrapper.demoBooleans();

    }

}

class Wrapper {

public static void demoInteger(){
    int primativeInt = 10;
    Integer myInt = 5;
    System.out.println("Primative int: " + primativeInt);
    System.out.println("Wrapper Integer: " + myInt);

    System.out.println("Max int value: " + Integer.MAX_VALUE);
    System.out.println("Min int value: " + Integer.MIN_VALUE);

    int parsed = Integer.parseInt("25");
    System.out.println("Parsed from String: " + parsed);



}

    public static void demoBooleans() {

        boolean primativeBoolean = true;
        Boolean wrapperBool = Boolean.valueOf(true);

        System.out.println("Primative boolean: " + primativeBoolean);
        System.out.println("Wrapper boolean: " + wrapperBool);

        boolean parsed = Boolean.parseBoolean("false");
        System.out.println("Parsed bool: " + parsed);



    }

    public static void autoBoxingDemo(){

        Integer num = 5;

        int value = num;
    }

}
