public class main {
    public static void main(String[] args) {


        Integer[] intDizi = {1,2,3};
        Double[] doDizi = {3.14,2.7};
        String[] sDizi = {"Er","dem"};
        Character[] chDizi = {'N','a','N'};

        yazdir(intDizi);
        yazdir(doDizi);
        yazdir(sDizi);
        yazdir(chDizi);

        System.out.println("//////////////////////////");

        print(intDizi);
        print(doDizi);
        print(sDizi);
        print(chDizi);

    }

    public static <T> void print (T[] array){
        for (T temp:array
             ) {
            System.out.println(temp);
        }
    }
    public static void yazdir(Integer[] array){
        for (Integer temp:array
             ) {
            System.out.println(temp);
        }
    }

    public static void yazdir(Double[] array){
        for (Double temp:array
        ) {
            System.out.println(temp);
        }
    }

    public static void yazdir(String[] array){
        for (String temp:array
        ) {
            System.out.println(temp);
        }
    }

    public static void yazdir(Character[] array){
        for (Character temp:array
        ) {
            System.out.println(temp);
        }
    }
}
