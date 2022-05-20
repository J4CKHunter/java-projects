import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        int[] array = new int[10];
        int[] dizi = new int[10];

        for (int i = 0 ; i < 10 ; i++ ){
            array[i] = i+1;
            dizi[i] = i*10;
        }

        try (FileWriter writer = new FileWriter("output.txt");
             FileWriter writer2 = new FileWriter("cikti.txt")){

            for (int i = 0 ; i < 10 ; i++ ){
                writer.write(array[i] + "\n");
                writer2.write(dizi[i] + "\n");
            }
        }


    }
}
