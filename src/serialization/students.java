package serialization;

import java.io.Serializable;

public class students implements Serializable{
    int age;
    String name;
   
    public students(String pName,int pAge){


        this.age=pAge;
        this.name=pName;
    }


}


