import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {


        for (int i = 5; i < 0; i--) {
            for (int j = 0; j < 5; j += 0) 
            System.out.println(j);
        }

        //breal
        //continue
        //return

        for  (int i = 0; i < 5; i += 1) {
            if (i ==2) {
                break;
            }
            System.out.println(i);
        }
        
        
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
       
       
       
       
        }
        boolean isContinuing = true;

        int z = 0;
         while (isContinuing) {
            z++;
            if (z == 20) {
                isContinuing = false;
            }
            System.out.print(z);
         }

            




         // Foobar
         // 1 to 100
         // i % 3  foo,
         // if i is divisible by 5 bar
         // if both disivisable by 3 and 5 print foobar

         for (int f = 0; f <= 100; f += 1) {
            if (f % 3 == 0 ){
                System.out.print("foo");
            }
            if (f % 5== 0 ){
                System.out.print("bar");
         }
            System.out.println();

    }

    for (int h = 0; h <= 12; h++) {
        for (int k = 0; k <= 12; k ++) {
            System.out.print(h * k + "\t");
        }
    }
    System.out.print("\n");
    


}
}


