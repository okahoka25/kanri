//package okamoto_java;

public class judge00 {
    public  int[] judge(int result1,int result2){
     int result3[]= {0,0}; //[o]=prayer1, [1]=player2

     //判定　
     if(( result1==0 && result2==1 ) || (result1==1 && result2==2 ) || (result1==2 && result2==0)){
      //System.out.println("プレイヤー1の勝ち");　
        result3[0] =1;

     }else if((result1==0 && result2==2 ) || (result1==1 && result2==0 ) || (result1==2 && result2==1)){
      //System.out.println("プレイヤー2の勝ちです。");
     result3[1] =1;

     }else{
     //System.out.println("あいこ。");
     }
     return result3;
    }

}
