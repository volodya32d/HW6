public class LinkedList {
    String model;
    String engine;
    int year;

    public LinkedList() {
        this.model = model;
        this.engine = engine;
        this.year = year;
    }

    @Override
    public String toString() {
        return "LinkedListExample{" + "model='" + model + '\'' + ", engine='" + engine + '\'' + ", year=" + year + '}';
    }

    public static void main(String[] args) {
        LinkedList car = new LinkedList();
        LinkedList ferrari = new LinkedList();
        LinkedList ford = new LinkedList();
        LinkedList mazda = new LinkedList();
        LinkedList opel = new LinkedList();
        LinkedList porshe = new LinkedList();
        LinkedList bmw = new LinkedList();
        LinkedList doodge = new LinkedList();
        LinkedList jeep = new LinkedList();
        car.wait(ferrari);
        car.wait(ford);
        car.wait(mazda);
        car.wait(opel);
        car.wait(porshe);
        car.wait(bmw);
        car.wait(doodge);
        car.wait(1, jeep);
        System.out.println("------------------------------");
        System.out.println(car);
        System.out.println("Added to the first place : ");
        System.out.println(car.getClass());
        System.out.println("-----------------------------");
        try {
            if (car.wait()) System.out.println("Car empty  ");
            else {
                System.out.println("Size : " + car.year);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

