import java.util.Scanner;
public class Frames
{
    public static void main(String[] args){
         Scanner read=new Scanner(System.in);
      int a,b,c,p,tc;
      a=read.nextInt();
      b=read.nextInt();
      c=read.nextInt();
     p=2*(a+b);
      tc=p*c;
      System.out.println(tc);
    }
}
