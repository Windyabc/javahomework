import java.util.Scanner;

public class SmallestIndex {
    
    public static int indexIfSmallElement(double[] array){
        double min = array[0];
        int index_min = 0;
        for(int i=0;i<10;i++){
            if(array[i]<min){
                min = array[i];
                index_min = i;
            }
        }
        return index_min;
    }

    public static void main(String[] args){
        System.out.println("Enter 10 numbers:"); 
    
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[10];
        for(int i=0;i<10;i++){
            Double n = scanner.nextDouble();
            array[i] = n;
        }  
        scanner.close();

        SmallestIndex smallestIndex = new SmallestIndex();
        System.out.println(smallestIndex.indexIfSmallElement(array));
    }
}
