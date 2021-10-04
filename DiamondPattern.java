import java.util.Scanner;  
public class DiamondPattern  
{  
	static void printDiamond(int n)  
		{  
		int space = n-1;  
 
		for (int i = 0; i< n; i++)  
			{  
			for (int j = 0; j< space; j++)  
				{  
				System.out.print(" ");  
				}  
				 
				for (int j = 0; j <= i; j++)  
				{  
				System.out.print("*");  
				}  
				System.out.println("\n");  
				space--; 
			}  
		space = 0;  
		for (int i = n; i>0; i--)  
			{  
			for (int j = 0; j< space; j++)  
				{  
				System.out.print(" ");  
				}  
				 
				for (int j=0; j<i; j++)  
				{  
				System.out.print("*");  
				}  
				System.out.println("\n"); 
				space++; 
			}  
	}
	public static void main(String[] args) {
		printDiamond(5);
		
	}
}  