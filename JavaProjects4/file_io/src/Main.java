import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

//        try {
//            fileIO();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        readFileWithScanner();


//        try {
//            readFileWithBufferedReader();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try {
//            readFileWithFileReader();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        try {
//            readFileWithScannerWithDelimeter();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }


//        readFileIntoList();

//        try {
//            readFileAsString();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        writeFile();

//        try {
//            tryWithResources();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        

    }

    public static void fileIO() throws IOException {

        String pathName = "C:\\Users\\erdem\\Desktop\\eğitim\\kodlar\\file_io\\text.txt";

        File file = new File(pathName);

        Boolean exists = file.exists();
        System.out.println("file exists : " + exists);

        Boolean isFileCreated = file.createNewFile();
        System.out.println("file created : " + isFileCreated);

        String fileName = file.getName();
        System.out.println("file's name : " + fileName);

        String path = file.getAbsolutePath();
        System.out.println("file's path : " + path);

        Long length = file.length();
        System.out.println("length of file : " + length);

        Boolean canWrite = file.canWrite();
        System.out.println("can we write in it : " + canWrite);

        Boolean canRead = file.canRead();
        System.out.println("can we read it : " + canRead);

    }

    public static void writeFile()  {

//        String pathName = "C:\\Users\\erdem\\Desktop\\eğitim\\kodlar\\file_io\\text.txt";
//        File file = new File(pathName);
//        FileWriter writer = new FileWriter(pathName);
//        BufferedWriter bufWriter = new BufferedWriter(writer);

//        String pathName = "C:\\Users\\erdem\\Desktop\\eğitim\\kodlar\\file_io\\text.txt";
//        FileWriter writer = new FileWriter(pathName);
//        BufferedWriter bufWriter = new BufferedWriter(writer);

        try {
            String pathName = "C:\\Users\\erdem\\Desktop\\eğitim\\kodlar\\file_io\\text.txt";
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter(pathName, true));

            bufWriter.newLine();
            bufWriter.write("erdem");
            bufWriter.newLine();
            bufWriter.write("erdem");

            bufWriter.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void readFileWithScanner()  {

        String pathName = "C:\\Users\\erdem\\Desktop\\eğitim\\kodlar\\file_io\\text.txt";

        File file = new File(pathName);

        Scanner reader = null;

        try {
            reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            reader.close();
        }

    }

    public static void readFileWithBufferedReader() throws IOException {

        String pathName = "C:\\Users\\erdem\\Desktop\\eğitim\\kodlar\\file_io\\text.txt";

        File file = new File(pathName);

        BufferedReader reader = new BufferedReader(new FileReader(file));

        String line;

        while((line = reader.readLine()) != null){
            System.out.println(line);
        }

    }

    public static void readFileWithFileReader() throws IOException {

        String pathName = "C:\\Users\\erdem\\Desktop\\eğitim\\kodlar\\file_io\\text.txt";

        File file = new File(pathName);

//        FileReader reader = new FileReader(pathName);

        FileReader reader = new FileReader(file);

        int i;

        while((i = reader.read()) != -1)
            System.out.print((char)i);

    }

    public static void readFileWithScannerWithDelimeter() throws FileNotFoundException {

        String pathName = "C:\\Users\\erdem\\Desktop\\eğitim\\kodlar\\file_io\\text.txt";

        File file = new File(pathName);

        Scanner reader = new Scanner(file);

        reader.useDelimiter("\\Z");

        System.out.println(reader.next());

    }

    public static void readFileIntoList(){

        String pathName = "C:\\Users\\erdem\\Desktop\\eğitim\\kodlar\\file_io\\text.txt";

        File file = new File(pathName);

        List<String> lines = Collections.emptyList();

        try{
            lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        }catch (IOException e){
            e.printStackTrace();
        }

        Iterator<String> iterator = lines.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    public static void readFileAsString() throws IOException {

        String pathName = "C:\\Users\\erdem\\Desktop\\eğitim\\kodlar\\file_io\\text.txt";

        File file = new File(pathName);

        String wholeText = new String(Files.readAllBytes(file.toPath()));

        System.out.println(wholeText);
    }

    public static void tryWithResources() throws IOException {

        String pathName = "C:\\Users\\erdem\\Desktop\\eğitim\\kodlar\\file_io\\text.txt";

        File file = new File(pathName);

        try(FileWriter writer = new FileWriter("output.txt");
            FileReader reader = new FileReader(pathName)){

            int i;

            while((i = reader.read()) != -1)
                System.out.print((char)i);

            for (i = 0 ; i < 10 ; i++ ){
                writer.write(i + "\n");

            }

        }


    }
}
