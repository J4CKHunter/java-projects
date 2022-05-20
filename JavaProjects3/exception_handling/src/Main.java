public class Main {
    public static void main(String[] args) {

        int[] array = new int[3];

        try {
            array[0] = 1;
            array[1] = 2;
            array[2] = 3;
            array[3] = 4;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }

        System.out.println("Program sonlaniyor.");


    }
}
