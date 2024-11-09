import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RadixSortNames {

    public static void radixSort(List<String> names) {
        names.sort(new NameComparator());
        names.sort(new LastNameComparator());
    }

    private static class NameComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            String name1 = s1.split(" ")[1];
            String name2 = s2.split(" ")[1];
            return name1.compareTo(name2);
        }
    }

    private static class LastNameComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            String lastName1 = s1.split(" ")[0];
            String lastName2 = s2.split(" ")[0];
            return lastName1.compareTo(lastName2);
        }
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        List<String> names = new ArrayList<>(Arrays.asList(
                "Mikhailov Andrey", "Mikhailov Yuri", "Orlov Alexey", "Kuznetsov Dmitry", "Ivanov Vladimir",
                "Ivanov Maxim", "Kuznetsov Vladimir", "Petrov Dmitry", "Orlov Maxim", "Mikhailov Nikolay",
                "Petrov Alexey", "Orlov Maxim", "Kuznetsov Dmitry", "Smirnov Vladimir", "Romanov Boris",
                "Mikhailov Boris", "Mikhailov Andrey", "Romanov Andrey", "Petrov Maxim", "Kuznetsov Sergey",
                "Fedorov Dmitry", "Sidorov Sergey", "Smirnov Dmitry", "Petrov Andrey", "Smirnov Sergey",
                "Petrov Andrey", "Ivanov Andrey", "Petrov Andrey", "Mikhailov Ivan", "Petrov Nikolay",
                "Kuznetsov Alexey", "Romanov Ivan", "Romanov Vladimir", "Orlov Dmitry", "Smirnov Alexey",
                "Fedorov Yuri", "Petrov Vladimir", "Ivanov Yuri", "Petrov Andrey", "Ivanov Vladimir", "Petrov Sergey",
                "Kuznetsov Nikolay", "Alexeev Alexey", "Fedorov Maxim", "Orlov Boris", "Kuznetsov Andrey",
                "Romanov Vladimir", "Kuznetsov Sergey", "Petrov Nikolay", "Fedorov Alexey", "Orlov Vladimir",
                "Sidorov Andrey", "Smirnov Nikolay", "Kuznetsov Alexey", "Alexeev Andrey", "Smirnov Maxim",
                "Mikhailov Vladimir", "Mikhailov Maxim", "Orlov Vladimir", "Ivanov Nikolay", "Smirnov Boris",
                "Smirnov Yuri", "Alexeev Yuri", "Ivanov Dmitry", "Alexeev Sergey", "Sidorov Dmitry", "Smirnov Boris",
                "Smirnov Alexey", "Orlov Dmitry", "Fedorov Boris", "Alexeev Alexey", "Sidorov Andrey", "Fedorov Yuri",
                "Orlov Dmitry", "Romanov Boris", "Orlov Maxim", "Kuznetsov Andrey", "Smirnov Alexey", "Alexeev Andrey",
                "Romanov Alexey", "Ivanov Alexey", "Smirnov Ivan", "Alexeev Nikolay", "Petrov Nikolay",
                "Fedorov Andrey", "Orlov Maxim", "Kuznetsov Ivan", "Orlov Boris", "Fedorov Vladimir", "Ivanov Sergey",
                "Kuznetsov Maxim", "Mikhailov Boris", "Ivanov Yuri", "Romanov Boris", "Alexeev Ivan", "Fedorov Dmitry",
                "Romanov Sergey", "Mikhailov Vladimir", "Orlov Sergey", "Kuznetsov Ivan", "Orlov Alexey",
                "Smirnov Nikolay", "Orlov Ivan", "Sidorov Vladimir", "Romanov Alexey", "Orlov Ivan", "Orlov Boris",
                "Fedorov Sergey", "Fedorov Maxim", "Fedorov Yuri", "Romanov Boris", "Ivanov Alexey", "Smirnov Sergey",
                "Sidorov Andrey", "Mikhailov Andrey", "Mikhailov Andrey", "Romanov Alexey", "Smirnov Boris",
                "Smirnov Andrey", "Ivanov Maxim", "Mikhailov Yuri", "Petrov Vladimir", "Alexeev Andrey",
                "Smirnov Vladimir", "Sidorov Ivan", "Mikhailov Dmitry", "Smirnov Vladimir", "Smirnov Andrey",
                "Kuznetsov Ivan", "Romanov Dmitry", "Kuznetsov Vladimir", "Fedorov Vladimir", "Sidorov Boris",
                "Fedorov Maxim", "Kuznetsov Maxim", "Kuznetsov Andrey", "Sidorov Andrey", "Kuznetsov Andrey",
                "Romanov Yuri", "Petrov Maxim", "Alexeev Ivan", "Alexeev Andrey", "Mikhailov Andrey",
                "Alexeev Vladimir", "Romanov Boris", "Mikhailov Andrey", "Alexeev Ivan", "Sidorov Alexey",
                "Sidorov Nikolay", "Smirnov Alexey", "Smirnov Nikolay", "Orlov Nikolay", "Mikhailov Maxim",
                "Sidorov Dmitry", "Mikhailov Maxim", "Sidorov Vladimir", "Kuznetsov Boris", "Orlov Yuri",
                "Alexeev Yuri", "Mikhailov Alexey", "Ivanov Ivan", "Kuznetsov Sergey", "Mikhailov Andrey",
                "Kuznetsov Boris", "Sidorov Maxim", "Mikhailov Alexey", "Orlov Nikolay", "Orlov Boris", "Alexeev Yuri",
                "Alexeev Ivan", "Orlov Vladimir", "Smirnov Dmitry", "Orlov Alexey", "Romanov Maxim", "Fedorov Alexey",
                "Kuznetsov Sergey", "Orlov Ivan", "Mikhailov Maxim", "Mikhailov Vladimir", "Smirnov Yuri",
                "Smirnov Yuri", "Romanov Sergey", "Ivanov Vladimir", "Ivanov Ivan", "Ivanov Nikolay", "Smirnov Boris",
                "Smirnov Ivan", "Petrov Alexey", "Smirnov Alexey", "Alexeev Vladimir", "Fedorov Andrey", "Fedorov Ivan",
                "Romanov Andrey", "Alexeev Boris", "Alexeev Yuri", "Sidorov Boris", "Fedorov Sergey", "Kuznetsov Yuri",
                "Romanov Dmitry", "Orlov Boris", "Sidorov Sergey", "Petrov Andrey", "Fedorov Maxim",
                "Kuznetsov Nikolay", "Sidorov Andrey", "Fedorov Andrey", "Alexeev Alexey", "Mikhailov Dmitry",
                "Mikhailov Alexey", "Romanov Nikolay", "Mikhailov Alexey", "Alexeev Maxim", "Orlov Alexey",
                "Alexeev Yuri", "Orlov Yuri", "Ivanov Maxim", "Smirnov Sergey", "Romanov Dmitry", "Sidorov Maxim",
                "Mikhailov Maxim", "Mikhailov Nikolay", "Orlov Sergey", "Sidorov Boris", "Smirnov Maxim",
                "Mikhailov Boris", "Kuznetsov Alexey", "Ivanov Yuri", "Sidorov Alexey", "Alexeev Dmitry",
                "Orlov Andrey", "Orlov Sergey", "Alexeev Nikolay", "Romanov Alexey", "Ivanov Andrey", "Fedorov Yuri",
                "Petrov Maxim", "Sidorov Maxim", "Fedorov Nikolay", "Ivanov Maxim", "Alexeev Vladimir",
                "Smirnov Nikolay", "Fedorov Yuri", "Petrov Sergey", "Fedorov Ivan", "Romanov Dmitry",
                "Kuznetsov Dmitry", "Fedorov Nikolay", "Romanov Andrey", "Mikhailov Maxim", "Mikhailov Yuri",
                "Fedorov Yuri", "Fedorov Yuri", "Mikhailov Alexey", "Alexeev Nikolay", "Fedorov Alexey", "Sidorov Yuri",
                "Smirnov Maxim", "Romanov Ivan", "Smirnov Alexey", "Petrov Vladimir", "Ivanov Nikolay",
                "Mikhailov Dmitry", "Orlov Dmitry", "Fedorov Sergey", "Kuznetsov Ivan", "Ivanov Boris", "Ivanov Maxim",
                "Fedorov Sergey", "Ivanov Boris", "Alexeev Dmitry", "Smirnov Ivan", "Orlov Maxim", "Smirnov Andrey",
                "Mikhailov Andrey", "Romanov Andrey", "Romanov Boris", "Orlov Yuri", "Sidorov Vladimir",
                "Ivanov Nikolay", "Orlov Andrey", "Mikhailov Boris", "Smirnov Vladimir", "Sidorov Maxim",
                "Romanov Ivan", "Smirnov Sergey", "Ivanov Vladimir", "Mikhailov Sergey", "Romanov Dmitry",
                "Fedorov Alexey", "Kuznetsov Sergey", "Orlov Nikolay", "Romanov Dmitry", "Alexeev Yuri",
                "Mikhailov Dmitry", "Smirnov Dmitry", "Smirnov Nikolay", "Alexeev Dmitry", "Romanov Dmitry",
                "Sidorov Dmitry", "Petrov Boris", "Sidorov Dmitry", "Romanov Dmitry", "Orlov Dmitry", "Orlov Alexey",
                "Petrov Andrey", "Ivanov Boris", "Smirnov Vladimir", "Petrov Boris", "Fedorov Alexey",
                "Mikhailov Nikolay", "Fedorov Vladimir", "Orlov Sergey", "Ivanov Vladimir", "Ivanov Andrey",
                "Smirnov Nikolay", "Fedorov Sergey", "Smirnov Andrey", "Smirnov Alexey", "Mikhailov Andrey",
                "Alexeev Boris", "Sidorov Maxim", "Smirnov Nikolay", "Kuznetsov Ivan", "Petrov Andrey",
                "Sidorov Vladimir", "Mikhailov Alexey", "Ivanov Ivan", "Petrov Sergey", "Petrov Vladimir", "Orlov Ivan",
                "Alexeev Sergey", "Alexeev Ivan", "Orlov Alexey", "Kuznetsov Maxim", "Kuznetsov Vladimir",
                "Ivanov Maxim", "Romanov Ivan", "Ivanov Alexey", "Kuznetsov Nikolay", "Petrov Maxim", "Alexeev Maxim",
                "Orlov Yuri", "Ivanov Alexey", "Mikhailov Nikolay", "Mikhailov Ivan", "Orlov Ivan", "Smirnov Sergey",
                "Romanov Dmitry", "Fedorov Alexey", "Alexeev Andrey", "Alexeev Alexey", "Mikhailov Vladimir",
                "Romanov Boris", "Romanov Yuri", "Kuznetsov Yuri", "Mikhailov Boris", "Romanov Maxim",
                "Mikhailov Nikolay", "Orlov Maxim", "Smirnov Andrey", "Sidorov Nikolay", "Fedorov Alexey",
                "Kuznetsov Nikolay", "Fedorov Ivan", "Ivanov Nikolay", "Kuznetsov Andrey", "Ivanov Boris",
                "Kuznetsov Yuri", "Sidorov Vladimir", "Fedorov Nikolay", "Fedorov Boris", "Alexeev Maxim",
                "Orlov Andrey", "Petrov Nikolay", "Romanov Nikolay", "Orlov Sergey", "Ivanov Andrey", "Orlov Vladimir",
                "Sidorov Alexey", "Alexeev Ivan", "Smirnov Nikolay", "Fedorov Nikolay", "Orlov Nikolay", "Alexeev Ivan",
                "Mikhailov Nikolay", "Alexeev Boris", "Orlov Boris", "Ivanov Vladimir", "Smirnov Vladimir",
                "Romanov Alexey", "Alexeev Boris", "Romanov Andrey", "Sidorov Alexey", "Kuznetsov Vladimir",
                "Petrov Dmitry", "Smirnov Sergey", "Mikhailov Boris", "Romanov Vladimir", "Smirnov Boris",
                "Kuznetsov Andrey", "Fedorov Nikolay", "Alexeev Alexey", "Fedorov Sergey", "Smirnov Yuri",
                "Mikhailov Vladimir", "Ivanov Ivan", "Petrov Yuri", "Fedorov Maxim", "Alexeev Andrey",
                "Mikhailov Boris", "Mikhailov Andrey", "Romanov Maxim", "Romanov Andrey", "Sidorov Maxim",
                "Alexeev Ivan", "Petrov Vladimir", "Orlov Ivan", "Ivanov Nikolay", "Ivanov Yuri", "Kuznetsov Yuri",
                "Petrov Yuri", "Mikhailov Vladimir", "Alexeev Ivan", "Smirnov Alexey", "Mikhailov Ivan",
                "Alexeev Andrey", "Ivanov Dmitry", "Smirnov Andrey", "Romanov Ivan", "Orlov Boris", "Kuznetsov Sergey",
                "Orlov Andrey", "Kuznetsov Nikolay", "Sidorov Andrey", "Alexeev Andrey", "Smirnov Maxim",
                "Orlov Andrey", "Orlov Alexey", "Romanov Vladimir", "Fedorov Vladimir", "Sidorov Vladimir",
                "Petrov Ivan", "Sidorov Alexey", "Kuznetsov Maxim", "Orlov Yuri", "Ivanov Sergey", "Sidorov Boris",
                "Sidorov Yuri", "Kuznetsov Yuri", "Ivanov Boris", "Petrov Ivan", "Romanov Maxim", "Mikhailov Yuri",
                "Smirnov Dmitry", "Smirnov Dmitry", "Mikhailov Nikolay", "Fedorov Andrey", "Mikhailov Vladimir",
                "Petrov Andrey", "Romanov Dmitry", "Mikhailov Maxim", "Orlov Dmitry", "Fedorov Dmitry",
                "Fedorov Alexey", "Fedorov Alexey", "Romanov Alexey", "Romanov Yuri", "Petrov Andrey", "Romanov Maxim",
                "Petrov Ivan", "Romanov Yuri", "Sidorov Boris", "Romanov Vladimir", "Alexeev Sergey", "Fedorov Sergey",
                "Mikhailov Maxim", "Sidorov Vladimir", "Smirnov Boris", "Smirnov Ivan", "Sidorov Sergey", "Petrov Ivan",
                "Kuznetsov Andrey", "Alexeev Sergey", "Romanov Boris", "Orlov Sergey", "Orlov Maxim",
                "Kuznetsov Vladimir", "Alexeev Vladimir", "Romanov Nikolay", "Kuznetsov Sergey", "Orlov Alexey",
                "Ivanov Nikolay", "Mikhailov Maxim", "Romanov Vladimir", "Petrov Dmitry", "Mikhailov Maxim",
                "Petrov Nikolay", "Orlov Maxim", "Fedorov Dmitry", "Mikhailov Alexey", "Ivanov Sergey",
                "Mikhailov Andrey", "Fedorov Andrey", "Ivanov Boris", "Mikhailov Maxim", "Sidorov Boris",
                "Alexeev Ivan", "Romanov Sergey", "Romanov Ivan", "Smirnov Maxim", "Ivanov Nikolay", "Kuznetsov Andrey",
                "Fedorov Maxim", "Smirnov Vladimir", "Orlov Maxim", "Smirnov Dmitry", "Orlov Dmitry", "Alexeev Andrey",
                "Petrov Dmitry", "Orlov Ivan", "Fedorov Nikolay", "Kuznetsov Sergey", "Orlov Andrey", "Kuznetsov Ivan",
                "Kuznetsov Andrey", "Petrov Ivan", "Sidorov Yuri", "Smirnov Yuri", "Smirnov Alexey", "Fedorov Andrey",
                "Smirnov Yuri", "Sidorov Alexey", "Alexeev Vladimir", "Orlov Maxim", "Smirnov Boris", "Alexeev Ivan",
                "Fedorov Andrey", "Alexeev Boris", "Petrov Andrey", "Orlov Sergey", "Mikhailov Yuri", "Ivanov Sergey",
                "Petrov Yuri", "Romanov Yuri", "Petrov Sergey", "Petrov Sergey", "Mikhailov Boris", "Mikhailov Sergey",
                "Smirnov Dmitry", "Kuznetsov Vladimir", "Sidorov Sergey", "Kuznetsov Ivan", "Fedorov Dmitry",
                "Smirnov Vladimir", "Alexeev Nikolay", "Fedorov Alexey", "Romanov Vladimir", "Smirnov Dmitry",
                "Orlov Dmitry", "Fedorov Andrey", "Sidorov Yuri", "Fedorov Ivan", "Petrov Sergey", "Fedorov Dmitry",
                "Romanov Sergey", "Ivanov Andrey", "Ivanov Yuri", "Alexeev Boris", "Petrov Vladimir", "Mikhailov Yuri",
                "Petrov Boris", "Romanov Alexey", "Smirnov Dmitry", "Romanov Nikolay", "Smirnov Dmitry",
                "Ivanov Nikolay", "Alexeev Ivan", "Alexeev Maxim", "Kuznetsov Vladimir", "Ivanov Yuri",
                "Smirnov Nikolay", "Orlov Yuri", "Petrov Yuri", "Orlov Nikolay", "Ivanov Andrey", "Sidorov Maxim",
                "Romanov Ivan", "Ivanov Vladimir", "Fedorov Vladimir", "Petrov Nikolay", "Petrov Boris",
                "Fedorov Sergey", "Alexeev Andrey", "Orlov Maxim", "Kuznetsov Nikolay", "Ivanov Andrey",
                "Sidorov Vladimir", "Ivanov Yuri", "Alexeev Yuri", "Mikhailov Boris", "Ivanov Alexey", "Orlov Dmitry",
                "Mikhailov Boris", "Fedorov Dmitry", "Kuznetsov Ivan", "Petrov Boris", "Romanov Nikolay",
                "Fedorov Yuri", "Fedorov Boris", "Petrov Dmitry", "Mikhailov Sergey", "Fedorov Sergey",
                "Sidorov Andrey", "Mikhailov Alexey", "Smirnov Yuri", "Kuznetsov Nikolay", "Kuznetsov Dmitry",
                "Smirnov Alexey", "Fedorov Alexey", "Ivanov Nikolay", "Smirnov Vladimir", "Mikhailov Dmitry",
                "Ivanov Maxim", "Smirnov Alexey", "Fedorov Alexey", "Ivanov Nikolay", "Mikhailov Ivan",
                "Sidorov Vladimir", "Kuznetsov Vladimir", "Orlov Alexey", "Sidorov Nikolay", "Petrov Maxim",
                "Alexeev Ivan", "Fedorov Alexey", "Smirnov Yuri", "Kuznetsov Vladimir", "Romanov Ivan",
                "Ivanov Nikolay", "Alexeev Ivan", "Ivanov Dmitry", "Sidorov Ivan", "Smirnov Yuri", "Smirnov Ivan",
                "Romanov Andrey", "Sidorov Vladimir", "Fedorov Andrey", "Kuznetsov Nikolay", "Smirnov Ivan",
                "Petrov Boris", "Orlov Yuri", "Romanov Dmitry", "Mikhailov Nikolay", "Smirnov Boris", "Petrov Nikolay",
                "Kuznetsov Andrey", "Fedorov Vladimir", "Smirnov Vladimir", "Alexeev Sergey", "Smirnov Alexey",
                "Mikhailov Dmitry", "Alexeev Sergey", "Sidorov Yuri", "Mikhailov Ivan", "Fedorov Nikolay",
                "Smirnov Ivan", "Mikhailov Alexey", "Sidorov Maxim", "Romanov Andrey", "Orlov Ivan", "Petrov Ivan",
                "Romanov Nikolay", "Alexeev Vladimir", "Sidorov Ivan", "Romanov Yuri", "Petrov Ivan", "Ivanov Boris",
                "Orlov Nikolay", "Ivanov Boris", "Mikhailov Ivan", "Ivanov Andrey", "Mikhailov Yuri", "Smirnov Sergey",
                "Mikhailov Sergey", "Sidorov Sergey", "Alexeev Yuri", "Ivanov Nikolay", "Kuznetsov Ivan",
                "Romanov Yuri", "Petrov Alexey", "Romanov Boris", "Smirnov Alexey", "Smirnov Boris", "Kuznetsov Boris",
                "Mikhailov Maxim", "Orlov Sergey", "Mikhailov Maxim", "Petrov Alexey", "Smirnov Sergey",
                "Mikhailov Ivan", "Fedorov Andrey", "Orlov Nikolay", "Mikhailov Yuri", "Fedorov Vladimir",
                "Smirnov Sergey", "Fedorov Vladimir", "Orlov Ivan", "Mikhailov Nikolay", "Orlov Dmitry",
                "Mikhailov Alexey", "Petrov Ivan", "Mikhailov Nikolay", "Smirnov Yuri", "Alexeev Dmitry",
                "Smirnov Ivan", "Kuznetsov Sergey", "Orlov Alexey", "Mikhailov Vladimir", "Kuznetsov Alexey",
                "Kuznetsov Alexey", "Ivanov Yuri", "Ivanov Sergey", "Mikhailov Alexey", "Orlov Sergey", "Orlov Alexey",
                "Petrov Dmitry", "Mikhailov Alexey", "Romanov Andrey", "Orlov Dmitry", "Fedorov Yuri", "Petrov Andrey",
                "Kuznetsov Dmitry", "Kuznetsov Vladimir", "Smirnov Dmitry", "Smirnov Andrey", "Sidorov Yuri",
                "Sidorov Sergey", "Romanov Ivan", "Romanov Vladimir", "Smirnov Alexey", "Mikhailov Alexey",
                "Fedorov Maxim", "Fedorov Vladimir", "Smirnov Boris", "Petrov Alexey", "Mikhailov Maxim", "Petrov Yuri",
                "Sidorov Boris", "Kuznetsov Ivan", "Smirnov Andrey", "Orlov Ivan", "Romanov Dmitry", "Smirnov Vladimir",
                "Fedorov Ivan", "Alexeev Ivan", "Kuznetsov Nikolay", "Sidorov Nikolay", "Kuznetsov Ivan",
                "Ivanov Vladimir", "Orlov Yuri", "Sidorov Sergey", "Sidorov Vladimir", "Mikhailov Maxim",
                "Alexeev Alexey", "Orlov Vladimir", "Orlov Nikolay", "Smirnov Vladimir", "Petrov Dmitry",
                "Romanov Maxim", "Ivanov Andrey", "Orlov Dmitry", "Smirnov Yuri", "Petrov Yuri", "Mikhailov Nikolay",
                "Sidorov Boris", "Romanov Dmitry", "Fedorov Dmitry", "Alexeev Nikolay", "Ivanov Dmitry", "Orlov Andrey",
                "Kuznetsov Vladimir", "Romanov Vladimir", "Ivanov Yuri", "Petrov Boris", "Fedorov Sergey",
                "Petrov Sergey", "Fedorov Sergey", "Smirnov Yuri", "Kuznetsov Yuri", "Smirnov Dmitry", "Smirnov Boris",
                "Kuznetsov Nikolay", "Petrov Ivan", "Ivanov Maxim", "Fedorov Andrey", "Ivanov Vladimir",
                "Smirnov Maxim", "Fedorov Sergey", "Fedorov Vladimir", "Petrov Maxim", "Fedorov Vladimir",
                "Romanov Boris", "Alexeev Dmitry", "Sidorov Boris", "Fedorov Boris", "Romanov Ivan", "Smirnov Dmitry",
                "Ivanov Dmitry", "Kuznetsov Yuri", "Fedorov Dmitry", "Ivanov Boris", "Petrov Ivan", "Sidorov Yuri",
                "Kuznetsov Nikolay", "Petrov Yuri", "Alexeev Vladimir", "Mikhailov Yuri", "Smirnov Maxim",
                "Mikhailov Ivan", "Romanov Boris", "Smirnov Ivan", "Sidorov Nikolay", "Fedorov Maxim", "Fedorov Andrey",
                "Sidorov Yuri", "Ivanov Andrey", "Alexeev Maxim", "Fedorov Boris", "Orlov Boris", "Ivanov Sergey",
                "Sidorov Maxim", "Alexeev Alexey", "Fedorov Andrey", "Ivanov Andrey", "Sidorov Andrey", "Sidorov Yuri",
                "Petrov Yuri", "Orlov Boris", "Sidorov Maxim", "Romanov Alexey", "Romanov Maxim", "Mikhailov Alexey",
                "Petrov Ivan", "Smirnov Nikolay", "Ivanov Boris", "Romanov Sergey", "Mikhailov Andrey",
                "Mikhailov Sergey", "Fedorov Maxim", "Smirnov Alexey", "Sidorov Boris", "Mikhailov Sergey",
                "Kuznetsov Andrey", "Sidorov Andrey", "Ivanov Ivan", "Alexeev Boris", "Sidorov Andrey",
                "Ivanov Vladimir", "Mikhailov Maxim", "Sidorov Sergey", "Sidorov Andrey", "Petrov Ivan",
                "Ivanov Alexey", "Mikhailov Nikolay", "Fedorov Ivan", "Petrov Alexey", "Smirnov Maxim", "Ivanov Alexey",
                "Alexeev Vladimir", "Petrov Dmitry", "Ivanov Sergey", "Sidorov Maxim", "Orlov Vladimir",
                "Sidorov Dmitry", "Ivanov Ivan", "Kuznetsov Andrey", "Sidorov Nikolay", "Mikhailov Yuri",
                "Smirnov Dmitry", "Kuznetsov Maxim", "Fedorov Andrey", "Alexeev Vladimir", "Sidorov Ivan",
                "Orlov Boris", "Sidorov Sergey", "Orlov Boris", "Romanov Boris", "Ivanov Ivan", "Alexeev Vladimir",
                "Kuznetsov Yuri", "Mikhailov Ivan", "Ivanov Alexey", "Mikhailov Alexey", "Petrov Maxim",
                "Fedorov Maxim", "Ivanov Maxim", "Alexeev Nikolay", "Alexeev Alexey", "Fedorov Yuri", "Sidorov Boris",
                "Orlov Ivan", "Mikhailov Boris", "Ivanov Maxim", "Fedorov Dmitry", "Mikhailov Dmitry", "Smirnov Alexey",
                "Alexeev Nikolay", "Kuznetsov Alexey", "Orlov Nikolay", "Orlov Sergey", "Ivanov Andrey",
                "Alexeev Nikolay", "Petrov Yuri", "Sidorov Vladimir", "Mikhailov Ivan", "Sidorov Alexey",
                "Smirnov Boris", "Ivanov Dmitry", "Smirnov Andrey", "Alexeev Andrey", "Petrov Dmitry", "Sidorov Dmitry",
                "Fedorov Andrey", "Mikhailov Sergey", "Romanov Yuri", "Fedorov Ivan", "Romanov Maxim", "Fedorov Boris",
                "Petrov Andrey", "Kuznetsov Boris", "Romanov Andrey", "Sidorov Sergey", "Ivanov Andrey", "Alexeev Yuri",
                "Orlov Boris", "Mikhailov Maxim", "Smirnov Boris", "Alexeev Maxim", "Petrov Ivan", "Orlov Alexey",
                "Fedorov Ivan", "Orlov Boris", "Mikhailov Ivan", "Romanov Yuri", "Romanov Yuri", "Alexeev Dmitry",
                "Kuznetsov Sergey", "Sidorov Nikolay", "Mikhailov Yuri", "Alexeev Nikolay", "Orlov Yuri",
                "Smirnov Vladimir", "Smirnov Andrey", "Smirnov Sergey", "Fedorov Nikolay", "Romanov Sergey",
                "Alexeev Andrey", "Kuznetsov Yuri", "Petrov Alexey", "Orlov Andrey", "Romanov Boris", "Sidorov Alexey",
                "Romanov Andrey", "Mikhailov Andrey", "Fedorov Boris", "Romanov Alexey", "Romanov Ivan",
                "Sidorov Sergey", "Ivanov Alexey", "Orlov Sergey", "Sidorov Vladimir", "Kuznetsov Dmitry",
                "Fedorov Nikolay", "Fedorov Sergey", "Ivanov Alexey", "Smirnov Boris", "Fedorov Nikolay",
                "Sidorov Alexey",
                "Alexeev Yuri", "Sidorov Vladimir", "Kuznetsov Nikolay", "Kuznetsov Ivan", "Fedorov Alexey",
                "Romanov Nikolay", "Mikhailov Ivan", "Mikhailov Vladimir", "Orlov Vladimir", "Petrov Andrey",
                "Kuznetsov Ivan", "Fedorov Boris", "Mikhailov Andrey", "Sidorov Andrey", "Smirnov Vladimir",
                "Petrov Nikolay", "Petrov Sergey", "Petrov Vladimir", "Fedorov Maxim", "Orlov Alexey",
                "Fedorov Vladimir", "Orlov Andrey"));

        System.out.println("Before sorting:");
        System.out.println(names);

        radixSort(names);

        System.out.println("\nAfter sorting:");
        System.out.println(names);

        long endTime = System.nanoTime();
        long durationInMillis = (endTime - startTime) / 1_000_000;
        System.out.println("Время выполнения сортировки: " + durationInMillis + " миллисекунд");

    }
}