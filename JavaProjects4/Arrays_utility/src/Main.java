import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

//        copyOf();

//        copyOfRange();

//        fill();

//        sort();

        binarySearch();
    }


    public static void copyOf(){
        int[] array = new int[10];
        array = initializeArray(array);
        printArray(array);

        int[] newArray1 = Arrays.copyOf(array,10);
        printArray(newArray1);

        int[] newArray2 = Arrays.copyOf(array,5);
        printArray(newArray2);

        int[] newArray3 = Arrays.copyOf(array,15);
        printArray(newArray3);
    }

    public static void copyOfRange(){
        int[] array = new int[10];
        array = initializeArray(array);
        printArray(array);

        int[] newArray1 = Arrays.copyOfRange(array,3,6);
        printArray(newArray1);

        int[] newArray2 = Arrays.copyOfRange(array,5,15);
        printArray(newArray2);

        int[] newArray3 = Arrays.copyOfRange(array,0,5);
        printArray(newArray3);
    }

    public static void fill(){

        int[] array = new int[10];
        Arrays.fill(array, 33);
        printArray(array);

        int[] array2 = new int[10];
        array2 = initializeArray(array2);
        printArray(array2);

        Arrays.fill(array2, 5);
        printArray(array2);

    }

    public static void sort(){
        int[] array = new int[10];
        initializeRandomArray(array,100);
        printArray(array);

        Arrays.sort(array);
        printArray(array);
    }

    public static void binarySearch(){
        int[] array = new int[10];
        initializeRandomArray(array, 10);
        printArray(array);

        Arrays.sort(array);
        printArray(array);

        int key = 5;
        int search = Arrays.binarySearch(array, key);
        System.out.println(key + " -> " + search);
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] initializeArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    public static int[] initializeRandomArray(int[] array, int bound){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound);
        }
        return array;
    }
}
