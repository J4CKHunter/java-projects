public class Main {
    public static void main(String[] args) {

        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        func1(array);
        System.out.println("Main methodu bitiyor.");
    }

    public static void func1(int[] array){
        System.out.println("func1 basladi");
        func2(array);
        System.out.println("func1 bitiyor.");
    }
    public static void func2(int[] array){
        System.out.println("func2 basladi");
        try{
            for(int i = 0 ; i < 4 ; i++){
                System.out.println("dizi " + (i+1) + ". eleman => " + array[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println(e.toString());
        }
        System.out.println("func2 bitiyor.");
    }
}
