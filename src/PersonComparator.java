import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int wordsCount;

    public PersonComparator(int wordsCount) {
        this.wordsCount = wordsCount;
    }

    @Override
    public int compare(Person p1, Person p2) {
        int len1 = p1.getSurname().split("[\s-]+").length;
        int len2 = p2.getSurname().split("[\s-]+").length;
        int last = 0;
        if (Math.min(len1,wordsCount) != Math.min(len2, wordsCount)) {
            last = Integer.compare(len1, len2);
        }
        return last == 0 ? Integer.compare(p1.getAge(), p2.getAge()) : last;
    }
}
