public class Car implements Comparable {
    int price;
    int year;

    public Car (int price, int year) {
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Price: "+this.price + " - Year: " + this.year +"\n";
    }

    public int compareTo(Object o) {
        Car car2 =  (Car) o;


        return car2.price - this.price;
    }
}
