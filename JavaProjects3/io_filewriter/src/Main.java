import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        int array[] = new int[10];
        for(int i = 0 ; i < 10 ; i++){
            array[i] = i+1;
        }


        FileWriter writer = null;   // writerı ilk başta böyle tanımlıyoruz ki finally bloğunda veya
                                    // kullanacağımız başka yerlerde tanımsız olmasın.


        try {
            writer = new FileWriter("output.txt");

            for (int temp:array
                 ) {
                writer.write(temp + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if(writer != null){
                    writer.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }





    }
}
