class PrimeNumber{
	public static void main(String args[]){
		if(args.length!=1)
			System.out.println("enter number of prime numbers you wish to display");
		int n=Integer.parseInt(args[0]);
		int p=3,flag;
		int[] prime;
		prime=new int[n];
		prime[0]=2;
		System.out.println(prime[0]);
		int k=1;
		while(k<=n)
		{
			flag=0;
			for(int j=2;j<p;j++)
			{
				if(p%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag!=1)
			{
					prime[k]=p;
					System.out.println(prime[k]);
					k++;
			}
			p++;
		}
		
			
	}
}