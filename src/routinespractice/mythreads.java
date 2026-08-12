package routinespractice;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
public class mythreads  {
    

    public static void Printthread() throws Exception{
        BlockingQueue<String> ch=new LinkedBlockingQueue<>();
        for (int i = 0; i < 5; i++) {
        

            new Thread(()->{
              ch.put(computesomething(i));
            }).start();
            
           System.err.println("Resulr :",ch.get());  

        }

    }

    public static String computesomething(int pInput )  {
long lDuration;
        switch (pInput) {
            case 1:
                lDuration=2000;
                break;
             case 2:
                lDuration=3000;
                break;
             case 3:
                lDuration=5000;
                break;
                 case 4:
                lDuration=1000;
                break;
                 case 5:
                lDuration=6000;
                break;
            default:
                throw new AssertionError();
        }
        try {
            
            Thread.sleep(lDuration);
        } catch (Exception e) {
            System.err.println("Error in method: "+e);
        }
        return "hi "+pInput;
    }

    
}
