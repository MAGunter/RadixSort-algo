import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Random {
    private final List<String> names = new ArrayList<>();
    private final List<String> surnames = new ArrayList<>();

    public Random() {
        fillNames();
        fillSurnames();
    }

    private void fillNames() {
        names.add("Liam");
        names.add("Noah");
        names.add("Oliver");
        names.add("Elijah");
        names.add("James");
        names.add("William");
        names.add("Benjamin");
        names.add("Lucas");
        names.add("Henry");
        names.add("Alexander");
        names.add("Mason");
        names.add("Michael");
        names.add("Ethan");
        names.add("Daniel");
        names.add("Jacob");
        names.add("Logan");
        names.add("Jackson");
        names.add("Levi");
        names.add("Sebastian");
        names.add("Mateo");
        names.add("Jack");
        names.add("Owen");
        names.add("Theodore");
        names.add("Aiden");
        names.add("Samuel");
        names.add("Joseph");
        names.add("John");
        names.add("David");
        names.add("Wyatt");
        names.add("Matthew");
        names.add("Luke");
        names.add("Asher");
        names.add("Carter");
        names.add("Julian");
        names.add("Grayson");
        names.add("Leo");
        names.add("Jayden");
        names.add("Gabriel");
        names.add("Isaac");
        names.add("Lincoln");
        names.add("Anthony");
        names.add("Hudson");
        names.add("Dylan");
        names.add("Ezra");
        names.add("Thomas");
        names.add("Charles");
        names.add("Christopher");
        names.add("Jaxon");
        names.add("Maverick");
        names.add("Josiah");
        names.add("Isaiah");
        names.add("Andrew");
        names.add("Elias");
        names.add("Joshua");
        names.add("Nathan");
        names.add("Caleb");
        names.add("Ryan");
        names.add("Adrian");
        names.add("Miles");
        names.add("Eli");
        names.add("Nolan");
        names.add("Christian");
        names.add("Aaron");
        names.add("Cameron");
        names.add("Ezekiel");
        names.add("Colton");
        names.add("Luca");
        names.add("Landon");
        names.add("Hunter");
        names.add("Jonathan");
        names.add("Santiago");
        names.add("Axel");
        names.add("Easton");
        names.add("Cooper");
        names.add("Jeremiah");
        names.add("Angel");
        names.add("Roman");
        names.add("Connor");
        names.add("Jameson");
        names.add("Robert");
        names.add("Greyson");
        names.add("Jordan");
        names.add("Ian");
        names.add("Carson");
        names.add("Jaxson");
        names.add("Leonardo");
        names.add("Nicholas");
        names.add("Dominic");
        names.add("Austin");
        names.add("Everett");
        names.add("Brooks");
        names.add("Xavier");
        names.add("Kai");
        names.add("Jose");
        names.add("Parker");
    }

    private void fillSurnames() {
        surnames.add("Smith");
        surnames.add("Johnson");
        surnames.add("Williams");
        surnames.add("Brown");
        surnames.add("Jones");
        surnames.add("Garcia");
        surnames.add("Miller");
        surnames.add("Davis");
        surnames.add("Rodriguez");
        surnames.add("Martinez");
        surnames.add("Hernandez");
        surnames.add("Lopez");
        surnames.add("Gonzalez");
        surnames.add("Wilson");
        surnames.add("Anderson");
        surnames.add("Thomas");
        surnames.add("Taylor");
        surnames.add("Moore");
        surnames.add("Jackson");
        surnames.add("Martin");
        surnames.add("Lee");
        surnames.add("Perez");
        surnames.add("Thompson");
        surnames.add("White");
        surnames.add("Harris");
        surnames.add("Sanchez");
        surnames.add("Clark");
        surnames.add("Ramirez");
        surnames.add("Lewis");
        surnames.add("Robinson");
        surnames.add("Walker");
        surnames.add("Young");
        surnames.add("Allen");
        surnames.add("King");
        surnames.add("Wright");
        surnames.add("Scott");
        surnames.add("Torres");
        surnames.add("Nguyen");
        surnames.add("Hill");
        surnames.add("Flores");
        surnames.add("Green");
        surnames.add("Adams");
        surnames.add("Nelson");
        surnames.add("Baker");
        surnames.add("Hall");
        surnames.add("Rivera");
        surnames.add("Campbell");
        surnames.add("Mitchell");
        surnames.add("Carter");
        surnames.add("Roberts");
        surnames.add("Gomez");
        surnames.add("Phillips");
        surnames.add("Evans");
        surnames.add("Turner");
        surnames.add("Diaz");
        surnames.add("Parker");
        surnames.add("Cruz");
        surnames.add("Edwards");
        surnames.add("Collins");
        surnames.add("Reyes");
        surnames.add("Stewart");
        surnames.add("Morris");
        surnames.add("Morales");
        surnames.add("Murphy");
        surnames.add("Cook");
        surnames.add("Rogers");
        surnames.add("Gutierrez");
        surnames.add("Ortiz");
        surnames.add("Morgan");
        surnames.add("Cooper");
        surnames.add("Peterson");
        surnames.add("Bailey");
        surnames.add("Reed");
        surnames.add("Kelly");
        surnames.add("Howard");
        surnames.add("Ramos");
        surnames.add("Kim");
        surnames.add("Cox");
        surnames.add("Ward");
        surnames.add("Richardson");
        surnames.add("Watson");
        surnames.add("Brooks");
        surnames.add("Chavez");
        surnames.add("Wood");
        surnames.add("James");
        surnames.add("Bennett");
        surnames.add("Gray");
        surnames.add("Mendoza");
        surnames.add("Ruiz");
        surnames.add("Hughes");
        surnames.add("Price");
        surnames.add("Alvarez");
        surnames.add("Castillo");
        surnames.add("Sanders");
        surnames.add("Patel");
        surnames.add("Myers");
        surnames.add("Long");
        surnames.add("Ross");
        surnames.add("Foster");
        surnames.add("Jimenez");
    }

    public String getRandomName() {
        return names.get(ThreadLocalRandom.current().nextInt(names.size()));
    }

    public String getRandomSurname() {
        return surnames.get(ThreadLocalRandom.current().nextInt(surnames.size()));
    }
}