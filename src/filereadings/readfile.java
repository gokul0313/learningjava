package filereadings;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class readfile {
    

    public static void readfilebypath() throws IOException{
        
        Path lpath=Path.of("stock_data.csv");
       
       System.err.println( lpath.toAbsolutePath());
        
        BufferedReader reader = Files.newBufferedReader(lpath.toAbsolutePath());

        String line;
        int count=0;
       while((line = reader.readLine())!=null){
count++;

if (count<10){

    System.err.println("line : "+line);
}



        
       }

       reader.close();


    }


    public static void readbylist()  throws IOException{
        
        Path lpath=Path.of("stock_data.csv");

        try {
            
            List<String> ldetails = Files.readAllLines(lpath);

            int count =0;
            for(String line :ldetails){
count++;

if (count<10){

    System.err.println(line);
}
            }
        } catch (Exception e) {
            throw e;
        }
    }



    public static void Writeinexistingfile(){
 

        try {
    Path lpath = Path.of("stock_data.csv");
    
    List<String> ldetails = Files.readAllLines(lpath.toAbsolutePath());
    FileWriter lwrite =new FileWriter("stock_data.csv");

    int count=0;
    List<String> ldemodetail =new ArrayList<>();
    for(String ldetail:ldetails){

        count++;
        if (count<5){
ldemodetail.add(ldetail);
        }
    }
ldemodetail.add("gokul,indhu,03,10");
ldemodetail.add("mithu,indhu,03");
ldemodetail.add("indhu,03,08,2002");


for(String lInput:ldemodetail){
    
    lwrite.write(lInput);
    lwrite.write(System.lineSeparator());

}
lwrite.close();



} catch (Exception e) {
    System.out.println("error : "+ e);
}

    }
}
