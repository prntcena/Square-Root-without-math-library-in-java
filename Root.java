class Root{
	public static void main(String args[]){
		int n=Integer.parseInt(args[0]);
		
		int i=0; int arr[]=new int[4];
		for(int a=2;a<=n/2;a++){
			if(n==1)
				break;
			while(n%a==0){
				
				n=n/a;
				arr[i]=a;
				i++;
			}
		}
		int s=0;
		
			s=arr.length;
			
		
		int root=1;
		for(int j=0;j<=s-1;j=j+2){
			
				root*=arr[j];
				
			
			
		}
		System.out.println("Square root of the given number " + " "+args[0]+" is "+root);
	}
}