import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        fileCreate("Lyrics.txt");
        fileInfo("Lyrics.txt");
        fileWriteTryWithResources("Lyrics.txt");
        System.out.println();
        fileInfo("Lyrics.txt");

        makeNewDir("New Directory");
        listDirectories();

        System.out.println();

        fileReadWithBufferedReader("Lyrics.txt");

        //fileReadWithFileReader("Lyrics.txt");

        //fileReadWithScanner("Lyrics.txt");

        //fileReadWithScannerWithoutLoops("Lyrics.txt");


    }

    public static void fileInfo(String fileName){
        File file = new File(fileName);

        System.out.println("is file exist : " + file.exists());
        System.out.println("file name : " + file.getName());
        System.out.println("file path : " + file.getAbsolutePath());
        System.out.println("can we read to the file : " + file.canRead());
        System.out.println("can we write to the file : " + file.canWrite());
        System.out.println("file size : " + file.length() + " byte");
    }
    public static void fileCreate(String fileName){

        File file = new File(fileName);
        try {
            if(file.createNewFile()){
                System.out.println("file successfully added.");
            }
            else{
                System.out.println("file already exist");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void fileReadWithBufferedReader(String fileName){

        File file = new File(fileName);
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String temp ;

        try{
            while( (temp = reader.readLine()) != null){

                System.out.println(temp);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public static void fileReadWithFileReader(String fileName){

        File file = new File(fileName);
        FileReader reader = null;

        try {
            reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int i;

        try{
            while ( (i = reader.read()) != -1){
                System.out.print((char) i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    public static void fileReadWithScanner(String fileName){
        File file = new File(fileName);
        Scanner s = null;
        try{
            s = new Scanner(file);
        }catch (IOException e){
            e.printStackTrace();
        }

        while(s.hasNextLine()){
            System.out.println(s.nextLine());
        }

    }
    public static void fileReadWithScannerWithoutLoops(String fileName){

        File file = new File(fileName);
        Scanner s = null;

        try{
            s = new Scanner(file);
        }catch (IOException e){
            e.printStackTrace();
        }

        s.useDelimiter("\n");

        System.out.println(s.next());


    }
    public static void listDirectories(){
        File file = null;
        String[] paths;

        try {
            // create new file object
            file = new File("C:\\Users\\erdem\\Desktop\\JavaRecovery\\IOExamples");

            // array of files and directory
            paths = file.list();

            // for each name in the path array
            for(String path:paths) {
                // prints filename and directory name
                System.out.println(path);
            }
        } catch (Exception e) {
            // if any error occurs
            e.printStackTrace();
        }

    }
    public static void makeNewDir(String dirName){

        File d = new File(dirName);

        // Create directory now.
        d.mkdirs();
    }
    public static void fileWrite(String fileName){

        String[] lyrics = {
                        "Bana bi baktı\n" +
                        "Beni bi gördü\n" +
                        "Beni bi süzdü\n" +
                        "Bana sokuldu\n\n" +
                        "Bu da demek ki\n" +
                        "Bu da demek ki\n" +
                        "Ne demekti ki\n" +
                        "Ne demekti ki\n\n" +
                        "Soruyu sordum\n" +
                        "Ona ne sordum\n" +
                        "Soruyu sordum\n\n" +
                        "Sen bana mı baktın\n" +
                        "Beni mi gördün\n" +
                        "Beni mi süzdün\n" +
                        "Elimi tuttun\n" +
                        "Yanıma geldin\n" +
                        "Belimi kırdın\n" +
                        "Sesimi duydun\n\n" +
                        "Bak, bak haline\n" +
                        "Kül oldun di mi eridin\n" +
                        "Bana mı baktı\n" +
                        "Beni mi gördü\n" +
                        "Bunu mu gördü\n" +
                        "Beni mi sevdi\n" +
                        "Beni mi öptü\n" +
                        "Bana mı sordu\n" +
                        "Elimi kaptı\n\n" +
                        "Vah, vah halime\n" +
                        "Emin olursam iyi\n" +
                        "Biri mi vardı\n" +
                        "Biri mi gördü\n" +
                        "Soruyu sordu\n" +
                        "Soru mu sordu\n" +
                        "Soru mu sordu\n" +
                        "Bana mı sordu\n\n" +
                        "Vah, vah halime\n" +
                        "Sensin sözüm sana\n" +
                        "Kulun oldum, köpek oldum\n" +
                        "Biri mi gördü halimi\n" +
                        "Biri mi vurdu\n" +
                        "Biri mi bozdu\n" +
                        "Bu dengemi\n" +
                        "Bak halime\n" +
                        "Bir an olsun gülmedim\n\n" +
                        "Beni bi durdur\n" +
                        "Beni bi durdur\n" +
                        "Dilimi durdur\n" +
                        "Sesimi durdur\n" +
                        "Bana bi doktor\n" +
                        "Gör halimi bak beynime\n" +
                        "Yaşlandığımı bilemedim"};

        File file = new File(fileName);
        BufferedWriter writer = null;


        try {
            writer = new BufferedWriter(new FileWriter(file));
            for (String temp:lyrics
                 ) {
                writer.write(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public static void fileWriteTryWithResources(String fileName){

        String[] lyrics = {
                "Bana bi baktı\n" +
                        "Beni bi gördü\n" +
                        "Beni bi süzdü\n" +
                        "Bana sokuldu\n\n" +
                        "Bu da demek ki\n" +
                        "Bu da demek ki\n" +
                        "Ne demekti ki\n" +
                        "Ne demekti ki\n\n" +
                        "Soruyu sordum\n" +
                        "Ona ne sordum\n" +
                        "Soruyu sordum\n\n" +
                        "Sen bana mı baktın\n" +
                        "Beni mi gördün\n" +
                        "Beni mi süzdün\n" +
                        "Elimi tuttun\n" +
                        "Yanıma geldin\n" +
                        "Belimi kırdın\n" +
                        "Sesimi duydun\n\n" +
                        "Bak, bak haline\n" +
                        "Kül oldun di mi eridin\n" +
                        "Bana mı baktı\n" +
                        "Beni mi gördü\n" +
                        "Bunu mu gördü\n" +
                        "Beni mi sevdi\n" +
                        "Beni mi öptü\n" +
                        "Bana mı sordu\n" +
                        "Elimi kaptı\n\n" +
                        "Vah, vah halime\n" +
                        "Emin olursam iyi\n" +
                        "Biri mi vardı\n" +
                        "Biri mi gördü\n" +
                        "Soruyu sordu\n" +
                        "Soru mu sordu\n" +
                        "Soru mu sordu\n" +
                        "Bana mı sordu\n\n" +
                        "Vah, vah halime\n" +
                        "Sensin sözüm sana\n" +
                        "Kulun oldum, köpek oldum\n" +
                        "Biri mi gördü halimi\n" +
                        "Biri mi vurdu\n" +
                        "Biri mi bozdu\n" +
                        "Bu dengemi\n" +
                        "Bak halime\n" +
                        "Bir an olsun gülmedim\n\n" +
                        "Beni bi durdur\n" +
                        "Beni bi durdur\n" +
                        "Dilimi durdur\n" +
                        "Sesimi durdur\n" +
                        "Bana bi doktor\n" +
                        "Gör halimi bak beynime\n" +
                        "Yaşlandığımı bilemedim"};

        File file = new File(fileName);
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file,true))) {
            for (String temp:lyrics
                 ) {
                writer.write(temp);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
