import java.util.Comparator;

public class CarComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Car c1  = (Car)o1;
        Car c2  = (Car)o2;


        return c1.year - c2.year;
    }
}
