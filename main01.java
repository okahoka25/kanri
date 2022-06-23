import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class main01 {

    public static void main(String[] args){
    
    //各インスタンス化
    Engine00 id01 = new Engine00();
    Engine01 id02 = new Engine01();
    judge00 id03 = new judge00();
    calc00 id04 = new calc00();
    //scoreboard00 id05 = new scoreboard00();
    //Show00 id06 = new Show00();

    //試行回数の設定
    Scanner scanner = new Scanner(System.in);
    System.out.println("試行回数を入力してください。");
    int j = scanner.nextInt();
    scanner.close();

    //使用する変数
    int result1;//プレイヤー1の出すカード
    int result2;//プレイヤー2の出すカード
    
    int P1_card[]= new int[j];//プレイヤー1が出したカードを記録
    int P2_card[]= new int[j];//プレイヤー2が出したカードを記録
    int result3[];//勝敗保管※一時的
    int result4[];//得点保管※一時的


    int B1=1;//プレイヤー1の得点計算に使用する倍率
    int B2=1;//プレイヤー2の得点計算に使用する倍率
    int ma=1;//グーを出さなかった時に使用する倍率加算用の変数

    int P1_judge[] = new int[j];//プレイヤー1の勝ち負けの記録
    int P2_judge[] = new int[j];//プレイヤー2の勝ち負けの記録
    int P1_score[] = new int[j];//プレイヤー１のスコア記録
    int P2_score[] = new int[j];//プレイヤー２のスコア記録

    int P1=0;//プレイヤー１合計スコア
    int P2=0;//プレイヤー２合計スコア

   for(int i=0; i< j; i++){

    //エンジン1
     result1 =  id01.bout();

    //エンジン2
     result2 =  id02.bout();

    //判定 
     result3 = id03.judge(result1,result2);

    //得点計算
     //倍率計算1
     if(result1==0){
       B2=1;
      }else{
       B2=B2+ma;
      }

     //倍率計算2
     if(result2==0){
       B1=1;
      }else{
       B1=B1+ma;
      }

     result4 =id04.calc(result1,result2,result3,B1,B2);

    //配列に格納
    P1_card[i]=result1;
    P2_card[i]=result2;
    P1_judge[i]=result3[0];
    P2_judge[i]=result3[1];
    P1_score[i]=result4[0];
    P2_score[i]=result4[1];
    
   }//for end

    //結果表示　
    System.out.println("プレイヤー1の出したカード"+Arrays.toString(P1_card)); 
    System.out.println("プレイヤー1の対戦結果"+Arrays.toString(P1_judge)); 
    System.out.println("プレイヤー1のスコアボード"+Arrays.toString(P1_score)); 
    P2= IntStream.of(P1_score).sum();
    System.out.println("プレイヤー2の合計得点:"+P1);

    System.out.println("プレイヤー1の出したカード"+Arrays.toString(P2_card)); 
    System.out.println("プレイヤー1の対戦結果"+Arrays.toString(P2_judge)); 
    System.out.println("プレイヤー2のスコアボード"+Arrays.toString(P2_score)); 
    P2= IntStream.of(P2_score).sum();
    System.out.println("プレイヤー2の合計得点:"+P2);


    System.out.println("終わり");

    }
    
}
