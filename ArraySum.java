import java.util.Scanner;

public class ArraySum {
    
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for(int i=0;i<4;i++)
            sum += m[i][i];
        return sum;
    }

    public static void main(String[] args){
        System.out.println("Enter a 4-by-4 matrix row by row:"); 
    
        double [][] m=new double[4][4];

        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                Double n = scanner.nextDouble();
                m[i][j] = n;
            }
        }
        scanner.close();

        ArraySum arraySum = new ArraySum();
        System.out.println("Sum of the elements in the major diagonal is "+arraySum.sumMajorDiagonal(m)); 
    }

}
