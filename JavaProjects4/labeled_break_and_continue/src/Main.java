public class Main {
    public static void main(String[] args) {
//        breakExampleOne();
//        continueExampleOne();
//        labeledBreakExampleOne();
        labeledContinueExampleOne();
    }

    public static void breakExampleOne(){

        int[] array = initializeArray();
        int searchFor = 156;
        boolean flag = false;

        for (int i = 0 ; i < 100 ; i++){
            if(array[i] == searchFor){
                flag = true;
                break;
            }
        }

        if (flag == true)
            System.out.println(" i found it");
        else
            System.out.println("i couldnt find it");

    }

    public static void continueExampleOne(){

        String sentence = "peter parker piper picked a peck of pickled peppers";
        Character searchFor = 'p';
        int numOfPs = 0;
        int sentenceLength = sentence.length();

        for (int i = 0; i < sentenceLength; i++ ){
            if (sentence.charAt(i) != searchFor)
                continue;

            numOfPs++;
        }

        System.out.println("There is " + numOfPs + " P's in the sentence : " + sentence);

    }

    public static void labeledBreakExampleOne(){
        int[][] array2D = initialize2DArray();
        int searchFor = 33;
        boolean flag = false;

        search:
        for (int i = 0; i < array2D.length; i++){
            for (int j = 0; j < array2D[i].length; j++){
                if(array2D[i][j] == searchFor){
                    flag = true;
                    break search;
                }
            }
        }

        if(flag)
            System.out.println("i found it");
        else
            System.out.println("i couldnt find it");
    }

    public static void labeledContinueExampleOne(){

        // which rows has the number 3?

        int[][] array2D = {
                {14,30,1,3,5},
                {5,75,43,23,254,23,53},
                {34,64,3,64},
                {34433,56,766},
                {3}};

        int searchFor = 3;



        search:
        for (int i = 0; i < array2D.length; i++){
            for (int j = 0; j < array2D[i].length; j++){
                if(array2D[i][j] == searchFor){
                    System.out.println("row : " + i + " has number " + searchFor);
                    continue search;
                }
            }
        }


    }

    public static int[] initializeArray(){
        int[] array = new int[100];
        for(int i = 0 ; i < 100 ; i++)
            array[i] = i+1;
        return array;
    }

    public static int[][] initialize2DArray(){

        int[][] array2D = new int[10][10];
        int count = 1;

        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 10; j++){
                array2D[i][j] = count++;
            }

        }

        return array2D;

    }

}

