import java.util.Scanner;
public class Strong_no {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int i,fact=1,sum=0,temp;
		temp=num;
		while(num!=0)
		{
			int rem=num%10;
			for(i=2;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
			fact=1;
		}
			if(temp==sum)
				System.out.println("yes");
			else
				System.out.println("no");
			
		}
	}


