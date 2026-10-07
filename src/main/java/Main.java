public class Main {

    public static void main(String[] args) {
        System.out.println("100 pages -> " + calculateReadingTime(100) + " min");
        System.out.println("500 pages -> " + calculateReadingTime(500) + " min");
        System.out.println("800 pages -> " + calculateReadingTime(800) + " min");
    }

    static int calculateReadingTime(int pages) {
        int baseTime = pages * 2;

        if (pages > 500) {
            return baseTime + (baseTime / 10);
        }

        return baseTime;
    }
}