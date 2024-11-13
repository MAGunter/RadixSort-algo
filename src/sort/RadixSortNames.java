package sort;

import entity.Person;

import java.util.Comparator;
import java.util.List;

public class RadixSortNames {

    public static void radixSort(List<Person> persons) {
        persons.sort(new LastNameComparator().thenComparing(new FirstNameComparator()));
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
