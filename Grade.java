import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		if (num >50)
		{
			if(num>60 && num <=74)
			{
				System.out.println("First Class");
				
			}
			else if(num>=75)
			{
				System.out.println("Distinction");
				
			}
			else
			{
				System.out.println("Just Passed");
		
			}
			
		}
		else 
			System.out.println("Fail");
	}

}
