//乱数を使うためにインポートする
import java.util.Random;

public class Engine_01 {
 //String name;
    public static int bout(){
     int result1 = 0;
      //乱数の設定
      Random rand = new Random();
      //乱数用の配列
      
      int num1 =rand.nextInt(3); //0.1.2
      result1 = num1;
        
      return result1;
    }
}    
    
