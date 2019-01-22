import java.util.Scanner;
public class Fact {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		sc.close();
		long f=1L,i;
		for(i=1;i<=num;i++)
		{
			f=f*i;
		}
		System.out.println(f);
		}
}
