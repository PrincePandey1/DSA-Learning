package ComparatorUnderstanding;

import java.util.ArrayList;
import java.util.Comparator;

class ComparatorImplementation implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
     //   return s2.charAt(0) - s1.charAt(0); // descending by first chararcter
  
     return s2.length() - s1.length();  // descending by length;

    }
}

public class ComparatorMain {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Daju");
        list.add("Ajuu");
        list.add("Noppp");
        list.add("P");

        list.sort(null); // natural (ascending alphabetical) order
        System.out.println("Sort in Ascending order: " + list);

        // Traditional Approach
       // list.sort(new ComparatorImplementation()); // custom: descending by length

       // Using lambda to define abstract method
       list.sort((a , b) -> b.charAt(0) - a.charAt(0));

        System.out.println("Sort by length descending: " + list);
    }
}