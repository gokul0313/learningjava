package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.google.gson.Gson;
import java.util.Map;


public class Fileserialize{

    

    public static void Getfile() throws IOException{
 
     students s1 =new students("gokul", 25);
     
     FileOutputStream file =new FileOutputStream("student.txt");


     ObjectOutputStream out =new ObjectOutputStream(file);

     out.writeObject(s1);
     file.close();

    }


    public static void Readfile() throws IOException,ClassNotFoundException{
       FileInputStream file =new FileInputStream("student.txt");

        ObjectInputStream inpt=new ObjectInputStream(file);

         students s1=(students) inpt.readObject();
         System.out.println(s1.name);
         System.out.println(s1.age);

         inpt.close();
         file.close();
    }


    public static String Converjson(){
        students s1=new students("gokul", 25); 

        Gson gson=new Gson();
        String ljson=  gson.toJson(s1);

        return ljson;

    }

    public static void Unmarshal(){

String ljsoninpt="{'name':'Yuvaraj','age':23}";
 Gson gson=new Gson();

students s2= gson.fromJson(ljsoninpt, students.class);


 System.out.println(s2.name);
 System.out.println(s2);


 Map<students>
}

