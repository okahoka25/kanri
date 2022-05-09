import java.util.Arrays;

public class judge {

    public static void main(String[] args){

        Engine_01 id01 = new Engine_01();
        Engine_02 id02 = new Engine_02();

        int[] hand1 = {0,0,0,0,0,0,0,0,0,0};
        int[] hand2 = {0,0,0,0,0,0,0,0,0,0};
    
        for(int i=0; i< hand1.length; i++){
         //メソッドを参照 メソッド名を統一する
            int result1 =  id01.bout();
            int result2 =  id02.bout();

         //ジャッジ
            //勝ち
            if(( result1==0 && result2==1 ) || (result1==1 && result2==2 ) || (result1==2 && result2==0)){
             System.out.println("プレイヤー1の勝ち");
        
            }//負け
            else if((result1==0 && result2==2 ) || (result1==1 && result2==0 ) || (result1==2 && result2==1)){
             System.out.println("プレイヤー1の負け");

            }//あいこ
            else{
             System.out.println("あいこ");
            }
         //配列への書き込み　出した手の記憶
         hand1[i] = result1; 
         hand2[i] = result2;
        
        } //for end
     
     System.out.println("終わり");
     System.out.println(Arrays.toString(hand1));     
          
    }
}
