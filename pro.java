package clock;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;



public class pro {
    static int interval;
    static Timer timer;

    public static void main(String[] args) {
        char time = 't';
        char stop = 's';

        Scanner s = new Scanner(System.in);
        long start, end;
        double tim;
        System.out.println("Type any character to start the stopwatch");
        char g = s.next().charAt(0);
        start = System.currentTimeMillis();
        System.out.println("Type any character to stop the stopwatch");
        char m = s.next().charAt(0);
        end = System.currentTimeMillis();
        tim = (end - start) / 1000.0;
        System.out.println(tim);







       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Press enter to start the stopwatch");
        scanner.nextLine();


        long startTime = System.currentTimeMillis();
        System.out.println("Stopwatch started. Press Ctrl-C to stop");

        while (true) {
            long elapsedTime = System.currentTimeMillis() - startTime;
            long hours = elapsedTime / 3600000;
            long minutes = (elapsedTime / 60000) % 60;
            long seconds = (elapsedTime / 1000) % 60;
            long milliseconds = elapsedTime % 1000;
            System.out.printf("%02d:%02d:%02d.%03d\n", hours, minutes, seconds, milliseconds);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Stopwatch interrupted");
                break;
            }
        }
    }
}*/


        //timer
        System.out.println("Timer is going to start.....");


        Scanner sc = new Scanner(System.in);
        System.out.print("Input seconds => : ");
        String secs = sc.nextLine();
        int delay = 1000;
        int period = 1000;
        timer = new Timer();
        interval = Integer.parseInt(secs);
        System.out.println(secs);
        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                System.out.println(setInterval());

            }
        }, delay, period);
    }

    private static final int setInterval() {
        if (interval == 1)
            timer.cancel();
        return --interval;
    }
}





