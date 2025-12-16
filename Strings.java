public class Strings {
    
    public static void main(String[] args) {

        String nameObj = new String("Pinaple");

        // 0 1 2 3 4 5 6
        // P i n a p l e
        
        String name1 = "Pinaple";
        String name2 = "Apple";
        String name3 = "Aplle";

        System.out.println("name1 and nameObj: " + name1.equals(nameObj));
        System.out.println("name1 and namm2: " + name1.equals(name2));
        System.out.println("name2 and name3: " + name2.equals(name3));

        //compareTo
        System.out.println("Compare: " + name1.compareTo(name2));

        // helpful built in methods
        System.out.println(" # of characters in string: " + name1.length());

        System.out.println("Index select: " + name2.indexOf("o"));
        System.out.println("Character select: " + name2.charAt(2));

        String quote = "Talk is cheap, show me the code.";
        String reusult1 = quote.substring(15);
        System.out.println("Full quote: " + quote);

    }

}
