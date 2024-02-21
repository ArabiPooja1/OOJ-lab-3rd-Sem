class DisplayBMS implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000); // Sleep for 10 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

class DisplayCSE implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("CSE");
                Thread.sleep(2000); // Sleep for 2 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class LAB_pro_8_Threads{
    public static void main(String[] args) {
        // Create threads
        Thread bmsThread = new Thread(new DisplayBMS());
        Thread cseThread = new Thread(new DisplayCSE());

        // Start threads
        bmsThread.start();
        cseThread.start();
    }
}
