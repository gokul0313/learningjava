




public class main {

    public static void main(String[] args)  {

        System.out.println("Hello Gokul!");
    
        // exceptions.trycatch.Demo();

        try {

          // filereadings.readfile.readfilebypath();
          // filereadings.readfile.readbylist();
          // filereadings.readfile.Writeinexistingfile();
          serialization.Fileserialize.Unmarshal();
      
          
        } catch(Exception e){

          System.out.println("error :"+e);
        }


    }


    public static void Loopping(int[] myarr ,String[] mystringarr){
  

  for (int num:myarr){
    System.out.println(num);
  }

  for (String lName:mystringarr){
    System.err.println(lName);
  }

    }

}



