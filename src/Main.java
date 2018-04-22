import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String args[]) {

        ArrayList<Car> carss = new ArrayList<>();

        carss.add(new Car(5500,2002));
        carss.add(new Car(100,1999));
        carss.add(new Car(7520,1998));
        carss.add(new Car(2333,1882));
        carss.add(new Car(8385,1788));
        carss.add(new Car(110393,1700));

        System.out.print("Not sorted:\n ");
        System.out.println(carss);

        //Comparing using the car as a comparable class
        Collections.sort(carss);

        System.out.print("\nSorted with comparable:\n ");
        System.out.println(carss);


        //Comparing using the CarComparator class
        carss.sort(new CarComparator());

        System.out.print("\nSorted with comparator:\n ");
        System.out.println(carss);

    }
}
