// public class Java
// {
//     public static void main(String[] args)
//     {
//         System.out.println("Hey, it's me");
//     }
// }


import java.io.*;
import java.util.Scanner;
// class Java1
// {
//     void sum(int a,int b)
//     {
//         int c=a+b;
//         System.out.println(c);
//     }
// }
// public class Java
// {
//     public static void main(String[] args)
//     {
//         Java1 j=new Java1();
//         int e=2,f=3;
//         j.sum(e,f);
//         Scanner s = new Scanner(System.in);
//         System.out.println("enter a: ");
//         int a = s.nextInt();
//         System.out.println(a);
//     }
// }


// array
// class Java
// {
//      static int b;
//     public static void main(String[] args)
//     {
//         float[] a=new float[3];
//         System.out.println(a[1]); 
//         System.out.println(b); 
//     }
// }
class disp
{
    int a=0,b=0;
    void Disp()
    {
        System.out.println(a+","+b);
    }
    void sum(int c, int d)
    {
        this.a=c;
        this.b=d;
        System.out.println(a+","+b);
    }
    
}
class Java
{
    
    public static void main(String[] args)
    {
       disp d=new disp();
       d.Disp();
       disp s=new disp();
       s.sum(2,3);

    }
}




