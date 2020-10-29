import java.util.ArrayList;

public class SortArrayList {
    public static void sort(ArrayList<Number> list){
        for(int i=0; i<list.size()-1;i++){
            boolean flag = true;
            for(int j=0;j<list.size()-i-1;j++){
                if(list.get(j).doubleValue()>list.get(j+1).doubleValue()){
                    Number temp;
                    temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                    flag = false;
                }
            }
            if(flag)
                break;
        }
    }

    public static void main(String[] args){
        ArrayList<Number> list = new ArrayList<>();
        list.add(2.8);
        list.add(1);
        list.add(10);
        list.add(14.3);
        list.add(0);
        list.add(3.2);
        list.add(3.2);
        SortArrayList.sort(list);
        System.out.println(list.toString());
    }
}
