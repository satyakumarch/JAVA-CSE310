public class halfTrianglepattern  {  
	public static void main(String[] args)   {  
	int i, j, rows_0=5;  
	for (i = rows_0; i >= 1; i--) 
	{  
		for (j = 1; j <= i; j++)  
		{  
			System.out.print(j+" "); 
		}  
		System.out.println();  
	}  
	for (i = 2; i <= rows_0; i++)   {  
		for (j = 1; j <= i; j++) {  
			System.out.print(j+" ");
		}  
		System.out.println(); 
		}
	}
}