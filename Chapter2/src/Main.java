import java.io.File;

public class Main {
    public static void main(String[] args) {
//        int cookies = 4;
//        double reward = 3 + 2 * --cookies;
//        System.out.print("Zoo animal receives: " + reward + " reward points");

//        bitwise complement operator (~)
//        int value = 3; // Stored as 0011
//        int complement = ~value; // Stored as 1100
//        System.out.println(value);
//        System.out.println(complement);
//        System.out.println(-1*value - 1);
//        System.out.println(-1*complement - 1);

//        int parkAttendance = 0;
//        System.out.println(parkAttendance);
//        System.out.println(++parkAttendance);
//        System.out.println(parkAttendance);
//        System.out.println(parkAttendance--);
//        System.out.println(parkAttendance);

//        short x = 10;
//        short y = 3;
//        short z = (short) (x * y); // var z = x * y;

//        short w = 14;
//        float x = 13;
//        double y = 30;
//        var z = w * x / y;

//        long goat = 10;
//        int sheep = 5;
//        sheep *= goat;

//        long wolf = 5;
//        long coyote = (wolf=3);
//        System.out.println(wolf);
//        System.out.println(coyote);

//        var monday = new File("schedule.txt");
//        var tuesday = new File("schedule.txt");
//        var wednesday = tuesday;
//        System.out.println(monday == wednesday);
//        System.out.println(tuesday == wednesday);

//        System.out.print(null == null);

//        Integer zooTime = Integer.valueOf(9);
//        Number num = zooTime;
//        Object obj = zooTime;

//        System.out.print(null instanceof Object);
//
//        Object noObjectHere = null;
//        System.out.print(noObjectHere instanceof String);

//        int rabbit = 6;
//        boolean bunny = (rabbit >= 6) || (++rabbit <= 7);
//        System.out.println(rabbit);

        int sheep = 1;
        int zzz = 1;
        int sleep = sheep>=10 ? sheep++ : zzz++;
        System.out.println(sheep + "," + zzz);
        System.out.println(sleep);
    }

    public void openZoo(Number time) {
        if (time instanceof Integer)
            System.out.print((Integer)time + " O'clock");
        else
            System.out.print(time);
    }
}
