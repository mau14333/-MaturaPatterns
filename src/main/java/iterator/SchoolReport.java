package iterator;

/**
 * Created by Felix on 10.05.2015.
 */
public class SchoolReport implements Iterable {
    private int[] grades;

    public SchoolReport(int[] grades) {
        this.grades = grades;
    }

    @Override
    public Iterator<Integer> createIterator() {
        return new SchoolReportIterator(grades);
    }
}
