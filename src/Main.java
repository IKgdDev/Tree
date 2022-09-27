import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int wordsCount = 2;

        Comparator<Person> comparator = (Person p1, Person p2) -> {
            int len1 = p1.getSurname().split("[\s-]+").length;
            int len2 = p2.getSurname().split("[\s-]+").length;
            if (Math.min(len1, wordsCount) != Math.min(len2, wordsCount)){
                return Integer.compare(len1,len2);
            }
            return Integer.compare(p1.getAge(), p2.getAge());
        };

        List<Person> list = new ArrayList<>();
        list.add(new Person("Владимир", "Бонч-Бруевич", 60));
        list.add(new Person("Михаил", "Голенищев-Кутузов-Смоленский", 54));
        list.add(new Person("Андрей", "Кончаловский", 85));
        list.add(new Person("Антуан", "де Сент-Экзюпери", 60));
        list.add(new Person("Никита", "Михалков", 76));
        Collections.sort(list, comparator);

        for (Person person : list) {
            System.out.println(person);
        }
    }
}
