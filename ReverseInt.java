import java.util.Scanner;

public class ReverseInt {
    
    public ReverseInt(){
    }

    public static void reverse(int number){

        while(number!=0){
            int temp = number % 10;
            System.out.print(temp); 
            number = number / 10;
        }
    }

    public static void main(String[] args){
        System.out.println("Enter a number:"); 
    
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        scanner.close();

        ReverseInt reverseInt = new ReverseInt();
        reverseInt.reverse(number);
    }
}