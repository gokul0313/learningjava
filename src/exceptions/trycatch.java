package exceptions;

public class trycatch {
    

   public static void Demo(){
    try {
        int num1=10;

        System.out.println(num1/0);
        
    } catch (Exception e) {
        System.out.println("Cannot divided by zero "+e);
    }
   }
}
