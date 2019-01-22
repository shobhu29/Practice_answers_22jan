import java.util.Scanner;
public class Fibonnaci {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int a=0,b=1;
		int i,c;
		for(i=1;i<=num;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
}
