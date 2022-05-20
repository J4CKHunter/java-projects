public class Main {
    public static void main(String[] args) {

        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        func1(array);
        System.out.println("main sonu");
    }

    private static void func1(int[] array) {
        System.out.println("func1 basladi");
        try{
            func2(array);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
            System.out.println("Exception func1'deki trycatch blogunda yakalandi.");
        }
        System.out.println("func1 sonu");
    }

    private static void func2(int[] array) {
        System.out.println("func2 basladi");
        for(int i = 0 ; i < 4 ; i++){
            System.out.println("Dizi " + (i+1) + ". eleman => " + array[i]);
        }
        System.out.println("func2 sonu");  // => bir üst fonksiyonun trycatchinde exception yakalandiği icin
                                           // artık buraya dönülmez.trycatchden sonrasından devam edilir programa
    }
}
