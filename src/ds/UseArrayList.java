package ds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(90);
        list.add(80);
        list.add(172);
        list.add(412);
        list.add(12);
        list.add(804);
        list.add(172);
        list.add(802);
        list.add(512);
        list.add(80);
        list.add(567);
        list.add(678);
        list.add(345);
        System.out.println("Fetching numbers using for loop");
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("Using Iterator to traverse through the ArrayList");
        Iterator it = list.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Fetching numbers using for each loop");
        for(Integer num:list){
            System.out.println(num);
        }

    }
}
