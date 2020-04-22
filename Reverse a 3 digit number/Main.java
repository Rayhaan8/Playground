import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner (System.in);
    int n=in.nextInt();
    int a=n/100;
    int z=n/10;
    int b=z%10;
    int c=n%10;
    int x= c*100;
    int y=b*10;
    int r=x+y+a;
    System.out.println(r);
  }
}