package by.epam.anonymous;


public class Runner implements Runnable {
    private static final String TIME = " time is:";
    private double speed = 12;
    private double distance;

    Runner(double distance) {
        this.distance = distance;
    }

    public void time(String name) {
        System.out.println(name + TIME + distance / speed);
    }


    @Override
    public void run() {
        time("Ordinary");
    }


    public static Runner sprinter(double distance) {
        return new Runner(distance) {

            @Override
            public void run() {
                time("Sprinter");
            }
        };
    }


    public static Runner marathon(double distance) {
        return new Runner(distance) {
            private double speed = 8;

            @Override
            public void run() {
                time("Marathon");
            }

            @Override
            public void time(String name) {
                System.out.println(name + TIME + distance * 10 / speed);
            }
        };
    }
}


class Competition {
    public static void main(String[] args) {
        new Thread(new Runner(72)).start();
        new Thread(Runner.sprinter(72)).start();
        new Thread(Runner.marathon(72)).start();

        //with lambda in one line
        //new Thread(()-> System.out.println("Lambda runner")).start();
    }
}