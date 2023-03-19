package Date;

public class Exercise4 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        for (int i = 0; i < 135000; i++) {
            int justAction = i+1;
        }
        double timeDifference;
        long finish = System.nanoTime();
        timeDifference = (finish - start);
        System.out.println(timeDifference / 1000000000 + "  секунд ");
    }
}
