import java.util.Scanner;

public class Array{
    public static void main(String[] args){
        // 輸入學生的數量，以及每位學生的成績，計算平均數
        Scanner s=new Scanner(System.in);
        int num=0;
        int total=0;

        System.out.println("輸入學生的數量:");
        num=s.nextInt();
        int[] score = new int[num];
        for(int i=0;i<score.length;i++){
            System.out.println("請輸入第"+(i+1)+"位學生的成績");
            score[i]=s.nextInt();
            total+=score[i];
        }

        System.out.println("成績平均數 = "+ total/score.length );






        // // 陣列的基本操作練習
        // // int[] grades=new int[3];
        // int[] grades=new int[]{70,80,90,100};
        // System.out.println("陣列長度"+grades.length);
        // // grades[0]=70;
        // // grades[1]=80;
        // // grades[2]=90;
        // // System.out.println(grades[0]);
        // // System.out.println(grades[1]);
        // // System.out.println(grades[2]);
        // for(int i=0;i<grades.length;i++){
        //     System.out.println(grades[i]);
        // }


        

    }
}