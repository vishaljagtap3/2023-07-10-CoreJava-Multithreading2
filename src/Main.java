
public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("Swift", 430, 4545);
        Thread t1 = new Thread(c1);
        t1.start();

        Car c2 = new Car("Honda", 380, 4545);
        Thread t2 = new Thread(c2);
        t2.start();

        Car c3 = new Car("Tata", 480, 4545);
        Thread t3 = new Thread(c3);
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("----- Race Over -----");
    }
}
