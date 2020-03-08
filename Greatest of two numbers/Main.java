import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		int a,b;
      Scanner scan = new Scanner(System.in);
      a = scan.nextInt();
      b = scan.nextInt();
      if(a>b)
      {
        System.out.println("num1 is the greatest number");
      }
      else
      {
        System.out.println("num2 is the greatest number");
      }
    }
}