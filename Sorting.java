import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        int[]  swapNumbers = {9, 3};

        SortingAlgorithms swar = new SortingAlgorithms(swapNumbers);


        System.out.println("Before Swap" + Arrays.toString(swapNumbers));
        swap.swapNumbers();
        System.out.println("Before Swap" + Arrays.toString(swapNumbers));
        

        int [] selectionNumbers = {9, 3, 1, 5, 10, 2, 4, 8, 7, 6};

        SortingAlgorithms selection = new SortingAlgorithms(selectionNumbers);
        selection.selectionSort();
        System.out.println(Arrays.toString(selection));

    }



}

class SortingAlgorithms {

    private int[] list;

    public SortingAlgorithms(int[] newlist) {
    this.list = newlist;
    }



    public void swapNumbers() {
        int temp = list[0]; //9
        list[0] = list[1];
        list[1] = temp;

    }

    public void selectionSort(){

        int n = list.length;
            System.out.println();


            for (int i = 0; i < n; i++) {

                int minIndex = i;




            for(int j = i + 1; j < n; j++){

            if(list[j] < minIndex){
                minIndex = j;
            }
            }

        int temp = list[i]; //9
        list[i] = list[minIndex];
        list[minIndex] = temp;


            }

    }

}