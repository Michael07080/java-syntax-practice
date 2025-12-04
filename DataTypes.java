// Java is a strongly typed language; you hvae to define/declare a variable
// you have to decalare its data type

class DataTypeExamples {

    int myInt = 42;
    double myDouble = 189.75;
    char  myCharacter = 'Q';
    boolean myBoolean = false;
    

}


public class DataTypes {
    public static void main(String[] args) {

        DataTypeExamples dt = new DataTypeExamples();

        System.out.println("myDouble: " + dt.myDouble);
        System.out.println("myInt: " + dt.myInt);
        System.out.println("myChar: " + dt.myCharacter);
        System.out.println("myBoolean: " + dt.myBoolean);
    }
}