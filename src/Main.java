import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Владимир", "Бонч-Бруевич", 60);
        Person p2 = new Person("Михаил", "Голенищев-Кутузов-Смоленский", 54);
        Person p3 = new Person("Андрей", "Кончаловский", 85);
        Person p4 = new Person("Антуан", "де Сент-Экзюпери", 60);
        Person p5 = new Person("Никита", "Михалков", 76);

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        Collections.sort(list, new PersonComparator(2));

        for (Person person : list) {
            System.out.println(person);
        }
    }
}
