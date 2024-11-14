
import java.util.Comparator;
import java.util.List;

public class QuickSortNames {

    public static void quickSort(List<Person> persons) {
        quickSort(persons, 0, persons.size() - 1, new LastNameComparator().thenComparing(new FirstNameComparator()));
    }

    private static void quickSort(List<Person> persons, int low, int high, Comparator<Person> comparator) {
        if (low < high) {
            int pivotIndex = partition(persons, low, high, comparator);
            quickSort(persons, low, pivotIndex - 1, comparator);
            quickSort(persons, pivotIndex + 1, high, comparator);
        }
    }

    private static int partition(List<Person> persons, int low, int high, Comparator<Person> comparator) {
        Person pivot = persons.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (comparator.compare(persons.get(j), pivot) <= 0) {
                i++;
                swap(persons, i, j);
            }
        }
        swap(persons, i + 1, high);
        return i + 1;
    }

    private static void swap(List<Person> persons, int i, int j) {
        Person temp = persons.get(i);
        persons.set(i, persons.get(j));
        persons.set(j, temp);
    }

    private static class LastNameComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.getLastName().compareTo(p2.getLastName());
        }
    }

    private static class FirstNameComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.getFirstName().compareTo(p2.getFirstName());
        }
    }
}