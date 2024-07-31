import java.util.Scanner;
public class WaterTaps
{
    public static void main(String[] args){
        int ans,a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        ans=(a*b)/(a+b);
        System.out.println(ans);
    }
}