public class Armstrong {

	public static void main(String[] args) {
		
		int d,i,sum=0,n;
		for(i=1;i<1000;i++){
			n=i;
			while (n>0){
			d = n % 10;
			sum = sum + (d*d*d);
			n = n / 10;
		}
		if(sum == i){
			System.out.println(i+" ");
		}
		sum=0;
		}

	}

}