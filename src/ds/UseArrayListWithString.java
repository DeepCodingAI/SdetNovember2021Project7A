package ds;

import java.util.ArrayList;
import java.util.List;

public class UseArrayListWithString {
    public static void main(String[] args) {
        List<String> city= new ArrayList<String>();
        city.add("NY");
        city.add("FL");
        city.add("CA");
        for(String cityName:city){
            System.out.println(cityName);
        }
    }
}
