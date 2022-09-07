import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int wordsCount;

    public PersonComparator(int wordsCount) {
        this.wordsCount = wordsCount;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] surname1 = o1.getSurname().split("[\s-]+");
        String[] surname2 = o2.getSurname().split("[\s-]+");
        int last = 0;
        if (surname1.length >= wordsCount && surname2.length >= wordsCount) {
            last = Integer.compare(surname1.length, surname2.length);
        }
        return last == 0 ? Integer.compare(o1.getAge(), o2.getAge()) : last;
    }
}
