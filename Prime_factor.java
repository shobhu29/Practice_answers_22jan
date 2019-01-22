import java.util.Scanner;
public class Prime_factor {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int i,j,isPrime;
		if(num==1 || num <0)
			System.out.println("Empty i.e No Factors");
		else
		{
			for(i=2;i<=num;i++)
			{
				if(num%i==0)
				{
					isPrime=1;
					for(j=2;j<=i/2;j++)
					{
						if(i%j==0)
						{
							isPrime=0;
							break;
						}
					}
				if(isPrime==1)
				{
					System.out.println("Prime factor of " + num + " is " + i);
				}
				
				}
			}
		}
	}
}
