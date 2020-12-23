import java.util.Scanner;

public class Main {

    static boolean func1() {
        for(int i = 0; i < 100000000; i++) {
            try {
                Thread.sleep(10000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    static boolean func2(int a) {
        for(int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i > a)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println("\n Inside main()\n");
        String typeOfShape;
        typeOfShape = new Scanner(System.in).nextLine();

        int i = 0;

        for(; i<10;i++); {
            for(int j=1000000; j > 0; j--) {
                if(func1() || func2(i)) {
                    System.out.println("\n Inside if()\n");
                }
            }
        }
        long end = System.nanoTime();
        System.out.println("Program execution time - " + (double) (end - start) / Math.pow(10, 9) +
                " (before optimization)");
    }
}
