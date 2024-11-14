
import java.util.ArrayList;
import java.util.List;

public class TestNames {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        for (long i = 0; i < 10; i++) {
            persons.add(new Person());
        }

        long startTime = System.currentTimeMillis();
        QuickSortNames.quickSort(persons);
        long finishTime = System.currentTimeMillis();

        System.out.println(persons);
        System.out.println("time that taken: " + (finishTime - startTime) + " ms");
    }
}
