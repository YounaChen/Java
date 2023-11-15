public class Operater{
    public static void main(String[] args){
        // 算術運算
        System.out.println("算術運算");
        int x=5+(3/4);
        System.out.println(x);

        double y=5/2.0;
        System.out.println(y);

        double z=5%3.5;
        System.out.println(z);
        z=5/3.5;
        System.out.println(z);

        // 指定運算
        System.out.println("指定運算");

        int m=5;
        m=m+2;
        System.out.println(m);
        int n=3 ;
        n+=2; // n=n+2
        n*=3;  // n=n*3
        System.out.println(n);

        // 比較運算
        System.out.println("比較運算");

        boolean a=3<5;
        System.out.println(a);
        boolean b=2!=2;
        System.out.println(b);

        boolean c="Hello"=="Hello";
        System.out.println(c);

        // 單元運算
        System.out.println("單元運算");

        int q=4;
        q++; // x+=1 // x=x+1
        q--; // q-=1 // q=q-1
        System.out.println(q);

        boolean w=!true;
        System.out.println(w);

        // 邏輯運算
        
        System.out.println("邏輯運算");

        boolean f=true&&false;
        System.out.println(f);

        boolean g=true||false;
        System.out.println(g);

    }
}