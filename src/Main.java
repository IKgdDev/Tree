import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("Владимир", "Бонч-Бруевич", 56));
        list.add(new Person("Михаил", "Голенищев-Кутузов-Смоленский", 54));
        list.add(new Person("Андрей", "Кончаловский", 85));
        list.add(new Person("Антуан", "де Сент-Экзюпери", 60));
        list.add(new Person("Никита", "Михалков", 76));
        list.add(new Person("Петр", "Сизов", 16));
        list.add(new Person("Аркадий", "Петров", 18));

        Predicate<Person> predicate = person -> person.getAge() <= 18;
        list.removeIf(predicate);

        Collections.sort(list, new PersonComparator(2));


        for (Person person : list) {
            System.out.println(person);
        }
    }
}
