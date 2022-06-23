//package okamoto_java;

public class calc00 {
    public  int[] calc(int result1, int result2, int[] result3,int B1,int B2){
    //戻り値の設定
      int[] result4 = new int[2];
    //プレイヤー1が勝った場合
     if(result3[0]==1){
      if(result1==0){
         result4[0]=1*B1;
      }else if(result1==1){
        result4[0]=2*B1;
      }else{
        result4[0]=5*B1;
      }
    //プレイヤー2が勝った場合
     }else if(result3[1]==1){
      if(result2==0){
         result4[1]=1*B2;
      }else if(result2==1){
         result4[1]=2*B2;
      }else{
         result4[1]=5*B2;
      }
    //あいこだった場合
     }else{}

    return result4;
    }

    
    
}
