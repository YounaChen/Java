import java.util.Scanner;

public class Loop{
    public static void main(String[] args){
        // while迴圈

        // 無窮迴圈
        while(true){
            System.out.println("Loop");
        }

        //  可以控制運作的迴圈
        int x=2;
        while(x<=6){
            System.out.println(x);
            x=x+2;
        }

        // 計算 1+2+3+4+5的總和
        int n=1;
        int total=0;
        while(n<=5){
        
            total+=n;
            n++;
        }
        System.out.println(total);

        // for迴圈

        控制for迴圈的操作
        for(int x=2 ;x<=6;x+=2){
            System.out.println(x);
        }

        //計算1+2+3+4+5的總和
        int total=0;
        for(int n=1;n<=100;n++){
            total=total+n;
        }
        
        System.out.println(total);
    }
}