import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapClass {

    public static void main(String args[]) {

        HashMap<String,Integer> studentGrades = new HashMap<String,Integer>();

        studentGrades.put("John", 85);
        studentGrades.put("Amy", 91);
        studentGrades.put("Sarah", 67);
        studentGrades.put("Caitlyn", 100);
        studentGrades.put("Dave", 74);

        Iterator it = studentGrades.entrySet().iterator();
        Iterator it2 = studentGrades.entrySet().iterator();

        while(it.hasNext()) {
            // Map Entry has .getKey() and .getValue() for entries
            Map.Entry mapEntry = (Map.Entry)it.next();

            System.out.println("Student " + mapEntry.getKey() + " has a " + mapEntry.getValue() + " in class." );
        }

        System.out.println("Finished first iterator");

        // Iterators for hash maps start at a random entry but each iterator is the same
        while(it2.hasNext()) {
            // Map Entry has .getKey() and .getValue() for entries
            Map.Entry mapEntry = (Map.Entry)it2.next();

            System.out.println("Student " + mapEntry.getKey() + " has a " + mapEntry.getValue() + " in class." );
        }

        System.out.println("Finished second iterator");
    }
}
