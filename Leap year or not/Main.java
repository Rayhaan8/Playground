import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int y=in.nextInt();
      int a=y%4;
      int b=y%100;
      int c=y%400;
      if(a==0 && b==0)
      	if(c==0)
        	System.out.println("Leap year");
      	else
        	System.out.println("Non Leap year");
      else
        System.out.println("Non Leap year");
    }
}