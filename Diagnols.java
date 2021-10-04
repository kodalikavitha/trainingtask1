
public class Diagnols {
	static int MAX = 100;
	 
    // Function to print the Principal Diagonal
    static void printLeftlDiagonal(int mat[][], int n)
    {
        System.out.print("Principal Diagonal: ");
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
 
                // Condition for principal diagonal
            	//row-column = row = column
                if (i == j) {
                    System.out.print(mat[i][j] + ", ");
                }
            }
        }
        System.out.println("");
    }
    // Function to print the Secondary Diagonal
    static void printRightDiagonal(int mat[][], int n)
    {
        System.out.print("Secondary Diagonal: ");
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
 
                // Condition for secondary diagonal
            	//row-column = row-column-1
                if ((i + j) == (n - 1)) {
                    System.out.print(mat[i][j] + ", ");
                }
            }
        }
        System.out.println("");
    }
    //main code
    public static void main(String[] args) {
    	int n=3;
    	int a[][]= {{1,3,2},
    				{6,4,5},
    				{7,4,8}};
    	printLeftlDiagonal(a,n);
    	printRightDiagonal(a,n);
		
	}
 

}

//i=0;i<3;i++
//0,1,2
//0,1,2
//
//3-0
//3-1
//3-2
//
//3-0-1
//3-1-1
//3-2-1
