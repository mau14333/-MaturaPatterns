package iterator;

/**
 * Created by Felix on 10.05.2015.
 */
public class SchoolReportIterator implements Iterator<Integer> {

    private final int[] grades;
    private int currentIndex = 0;

    public SchoolReportIterator(int[] grades) {
        this.grades = grades;
    }

    @Override
    public void gotoNext() {
        currentIndex++;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < (grades.length);
    }

    @Override
    public Integer getCurrent() {
        return grades[currentIndex];
    }
}
