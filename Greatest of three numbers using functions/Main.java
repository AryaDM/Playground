import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{

            int a=0,b=0,c=0;
            int largest=0;
            //Scanner class to take user input.
            Scanner X = new Scanner(System.in);
             
                        a = X.nextInt(); //read integer number
             
            
            b = X.nextInt(); //read integer number
             
            
            c = X.nextInt(); //read integer number
             
            if( a>b && a> c)
                largest = a;
            else if(b>a && b>c)
                largest = b;
            else
                largest = c;
             
            System.out.println(largest);
     }
}
