import java.util.Arrays;
public class Median {

	public static void main(String[] args) {
		
		int a1[] = {2,3,6,7,9,11}; 
		int a2[] = {-1,4,8,10,12};
		int l1 =a1.length;
		int l2 =a2.length;
		int a3[] = new int[l1 + l2];
		int l3 =a3.length;
		int i,j,c=0;
		for(i=0;i<l1;i++)
		{
			a3[i]=a1[i];
			c++;		
		}
		
		for(j=0;j<l2;j++)
		{
			a3[c++]=a2[j];		
		}
		Arrays.sort(a3);
		int med =(int)Math.ceil(l3/2);
		System.out.println(a3[med]);
	}

}
