
public class arraymatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{2,4,6,},{8,9,5},{6,7,10}};
		int min=a[0][0];
		int mincoloumn=0;
	
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{ 
					min=a[i][j];
					mincoloumn=j;
				}	
				}//2
			}
		int max=a[0][mincoloumn];
		int k=0;
			while(k<3)
			{
			 if( a[k][mincoloumn]>max)
			 {
				max=a[k][mincoloumn];
				
			 }k++;
			 
			}System.out.println(max);
	}}