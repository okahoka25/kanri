//package okamoto_java;
//乱数を使うためにインポートする
import java.util.Random;

public class Engine01 {
    public int bout(){
        int result2 = 0;
         //乱数の設定
         Random rand = new Random();
         //乱数用の配列
       
         int num2 =rand.nextInt(3); //0.1.2
         result2 = num2;
           
         return result2;
       }
}
