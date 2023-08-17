public class Car implements Runnable {

    private String name;
    private int speed;
    private int color;

    public Car(String name, int speed, int color) {
        this.name = name;
        this.speed = speed;
        this.color = color;

        new Thread(this).start();
    }

    @Override
    public void run() {
        for(int i = 0; i <= 1000; i++) {
            System.out.println(name + " -> " + i);
            try {
                Thread.sleep(450 - speed);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
