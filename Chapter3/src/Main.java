public class Main {
    enum Season {WINTER, SPRING, SUMMER, FALL}
    public static void main(String[] args) {
        int fish = 5;
        int length = 12;
        var name = switch (fish) {
            case 1 -> "Goldfish";
            case 2 -> {yield "Trout";}
            case 3 -> {
                if (length > 10) yield "Blobfish";
                else yield "Green";
            }
            default -> "Swordfish";
        };
    }

    void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data))
            return;
        System.out.print(data.intValue());
    }

    final int getCookies() { return 4; }
    void feedAnimals() {
        final int bananas = 1;
        int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();
        switch (numberOfAnimals) {
            case bananas:
//            case apples:         // DOES NOT COMPILE
//            case getCookies():   // DOES NOT COMPILE
//            case cookies:        // DOES NOT COMPILE
            case 3 * 5:
        }
    }

    public void printDayOfWeek(int day) {
        var result = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid value";
        };
        System.out.print(result);
    }

    public void printSeason(int month) {
        switch (month) {
            case 1, 2, 3 -> System.out.print("Winter");
            case 4, 5, 6 -> System.out.print("Spring");
            case 7, 8, 9 -> System.out.print("Summer");
            case 10, 11, 12 -> System.out.print("Fall");
        }
    }

    String getWeather(Season value) {
        return switch (value) {
            case WINTER -> "Cold";
            case SPRING -> "Rainy";
            case SUMMER -> "Hot";
            case FALL -> "Warm";
        };
    }
}
