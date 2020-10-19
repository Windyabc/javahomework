import java.util.Scanner;

public class PrintArray {

    public PrintArray(){
    }

    public static void printMatrix(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                double temp = Math.random();
                if(temp < 0.5)
                    System.out.print("0 "); 
                else
                System.out.print("1 "); 
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){
        System.out.println("Enter n:"); 
    
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        scanner.close();

        PrintArray printArray = new PrintArray();
        printArray.printMatrix(n);
    }
}
