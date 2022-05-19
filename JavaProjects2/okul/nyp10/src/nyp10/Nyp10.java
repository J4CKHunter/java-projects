/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyp10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author erdem
 */
public class Nyp10 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
        
        Ogrenci ogr=new Ogrenci("Erdem","Nayin","180202050");
        
        String data = new String();
        
        try
        {
            data=readFileAsString("C:\\Users\\erdem\\Desktop\\text.txt"); 
        }
        catch(IOException e)
        {
            System.out.println("dosya bulunamadı");
        }
               
        System.out.println(data); 
        
        String[] array = data.split("#");
        for (String ss : array) {
            System.out.println(ss);
        }
        
        ogr.setAd(array[0]);
        ogr.setSoyad(array[1]);
        ogr.setOgrenciNo(array[2]);
        
        int x=3;
        for(int i=0;i<6;i++){
            ogr.dersEkle(i);
            ogr.dersler[i].setAd(array[x]);x++;
            ogr.dersler[i].setDonem(array[x]);x++;
            ogr.dersler[i].setNot(Integer.parseInt(array[x]));x++;
        }
        
        
   
        ogr.ortalamaGoster();
        ogr.dersListele();
        
        
        /*String replaceAll=ogr.ogr_no_degistir(data);
        System.out.println(replaceAll);*/
        
        String replaceAll=ogr.ogr_no_degistir(data,"180202050");
        System.out.println(replaceAll);
        
        //090202064
        
        Writer writer = null;
        try {
        writer = new BufferedWriter(new OutputStreamWriter(
          new FileOutputStream("C:\\Users\\erdem\\Desktop\\text.txt"), "utf-8"));
          writer.write(replaceAll);
        }catch (Exception ex) {
            System.out.println("dosya bulunamadı");
            } finally {
                try {writer.close();} catch (IOException ex) {}
            }
        
        
        
        /*String firstNo=ogr.getOgrenciNo();
        ogr.setOgrenciNo("180202050");
        System.out.println(ogr.getAd()+" "+ogr.getSoyad()+" "
                +"adli ogrencinin yeni numarasi: "+ogr.getOgrenciNo());
        
        modifyFile("C:\\Users\\erdem\\Desktop\\text.txt",firstNo,ogr.getOgrenciNo());*/
       
        

    }

    public static String readFileAsString(String fileName)throws Exception { 
        String data = ""; 
        data = new String(Files.readAllBytes(Paths.get(fileName))); 
        return data; 
    }
    
      
    static void modifyFile(String filePath, String oldString, String newString)
    {
        File fileToBeModified = new File(filePath);
         
        String oldContent = "";
         
        BufferedReader reader = null;
         
        FileWriter writer = null;
         
        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));
             
            //Reading all the lines of input text file into oldContent
             
            String line = reader.readLine();
             
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                 
                line = reader.readLine();
            }
             
            //Replacing oldString with newString in the oldContent
             
            String newContent = oldContent.replaceAll(oldString, newString);
             
            //Rewriting the input text file with newContent
             
            writer = new FileWriter(fileToBeModified);
             
            writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                //Closing the resources
                 
                reader.close();
                 
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
        /*ogr.setOgrenciNo("180202050");
        System.out.println(ogr.getAd()+" "+ogr.getSoyad()+" "
                +"adli ogrencinin yeni numarasi: "+ogr.getOgrenciNo());
        
        modifyFile("C:\\Users\\erdem\\Desktop\\text.txt",firstNo,ogr.getOgrenciNo());
       */
    }
    
}


