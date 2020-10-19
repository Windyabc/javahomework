public class CountNumber {

    int[] numbers;
    int[] counts;

    public CountNumber(){
        numbers = new int[100];
        counts = new int[10];
    } 

    public void generateNumber(){
        for(int i=0;i<100;i++)
            numbers[i]=(int)(Math.random()*10);
    }

    public void countNumber(){
        for(int i=0;i<100;i++)
            counts[numbers[i]]++;
    }
    
    public void outputResult(){
        for(int i=0;i<10;i++)
            System.out.println(i+":"+counts[i]);
    }
    

    public static void main(String[] args){

        CountNumber countNumber = new CountNumber();
        countNumber.generateNumber();
        countNumber.countNumber();
        countNumber.outputResult();
        
    }
}
