import java.util.Scanner;
public class LoopStatement{
    public static void main(String[] args){
        // 應用案例 : 連續輸入直到正確為止

        Scanner s=new Scanner(System.in);
        int number;
        
        while(true){
            System.out.println("請輸入一個正整數:");
            number=s.nextInt();
            if(number>0){ //如果使用者輸入正確，強制結束迴圈
                System.out.println("輸入正確");
                break;
            }
            else{   // 如果使用者輸入錯誤，繼續執行迴圈
                System.out.println("輸入錯誤，再來一次");
                continue;
            }
        }
        // 取得正確的輸入，做想要做的工作
        System.out.println("輸入正確 : "+number);




        // continue; 基本測試
        // for(int i=0;i<=6;i++){
        //     if(i%3==0){ // 如果i被3整除
        //         continue; // 強制返回迴圈的上方，進入下一個
        //     }
            
        //     System.out.println(i);
        // }

        // break; 基本測試
        // int i=0;
        // while(i<=6){
        //     if(i==4){
        //         break; // 強制結束迴圈
        //     }
            
        //     System.out.println(i);
        //     i++;
        // }

    }
}