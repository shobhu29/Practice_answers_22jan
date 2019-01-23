import java.util.Scanner;

public class Perfect_no {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		sc.close();
		int i,j,sum=0,temp;
		for(j=num1;j<num2;j++)
		{	sum=0;
			temp=j;
		for(i=1;i<j;i++)
		{
			if(j%i==0)
			{
				sum= sum + i;
			}
			
		}
		
		if(temp==sum)
			System.out.println("Perfect number " + sum);
		
		}
	}
	

}
