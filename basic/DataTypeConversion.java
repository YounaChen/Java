public class DataTypeConversion{
    public static void main(String[] args){
        // 數字型態間的轉換
        // 數字型態範圍大小的排序 : double > float > long > int > short > byte
        // 小範圍轉到大範圍 : 自動轉換
        /*
        byte x=3;
        int y=x; // byte轉換成int
        System.out.println(y);
        long z=y; // int 轉換成 long
        System.out.println(z);
        double d=z; // long 轉換成 double
        System.out.println(d);
        */

        
        // 大範圍轉到小範圍 : 需要使用(資料型態)做強制轉換
        /*
        int x=1024;
        // byte y=x; // 錯誤:試圖把int轉換成byte
        byte y=(byte)x;
        System.out.println(y);
        long z=102400;
        // int m=z;// 錯誤:試圖把long轉換成int
        int m=(int)z;
        System.out.println(m);
        
        // float f=3.141562989; // 錯誤:試圖把double轉換成float型態
        float f=(float)3.141562689;
        System.out.println(f); // 失去精準度
        */

        // 字串轉換成數字
        /*
        String text="34";
        int x=Integer.parseInt(text);
        System.out.println(x);
        text="3.14159";
        double d=Double.parseDouble(text);
        System.out.println(d);
        */

        // 數字轉換成字串
        int x=34;
        String s=String.valueOf(x);  // 把int型態的34轉換成String型態的"34"
        System.out.println(s);

        long y=99999;
        s=String.valueOf(y);
        System.out.println(s);

        s=String.valueOf(3.14159F);
        System.out.println(s);


    }
}