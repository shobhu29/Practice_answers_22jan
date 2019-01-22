import java.util.Scanner;

public class Power2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2 !=0)
			System.out.println("not apower of 2");
		else
		{
			for(int i=0;i<num;i++)
			{
				if(Math.pow(2,i)==num)
					{
					System.out.println("the number is a power of 2");
					break;}
			}
				else
					System.out.println("the number is not a power of 2");
				
			}
			
			
			
		}
	
	}

