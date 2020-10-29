import java.util.Date;

class UsingDate{

    public static void main(String[] args){

        Date date = new Date();

        date.setTime(10000);
        System.out.println("The elapsed time: 10000");
        System.out.println("Date: "+ date.toString());

        date.setTime(100000);
        System.out.println("The elapsed time: 100000");
        System.out.println("Date: "+ date.toString());

        date.setTime(1000000);
        System.out.println("The elapsed time: 1000000");
        System.out.println("Date: "+ date.toString());

        date.setTime(10000000);
        System.out.println("The elapsed time: 10000000");
        System.out.println("Date: "+ date.toString());

        date.setTime(100000000);
        System.out.println("The elapsed time: 100000000");
        System.out.println("Date: "+ date.toString());

        date.setTime(1000000000);
        System.out.println("The elapsed time: 1000000000");
        System.out.println("Date: "+ date.toString());

        date.setTime(10000000000L);
        System.out.println("The elapsed time: 10000000000");
        System.out.println("Date: "+ date.toString());

        date.setTime(100000000000L);
        System.out.println("The elapsed time: 100000000000");
        System.out.println("Date: "+ date.toString());

    }
}