//package okamoto_java;
import java.util.Random;

public class Engine00 {
    
    public int bout(){
    
     int result1 =0;
     //乱数の設定
     Random random = new Random();
     
      int rand =random.nextInt(3); //0.1.2
      result1 = rand;  

     return result1;
    }
}
