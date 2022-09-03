package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 1; i <= height; i++) {
            if (i <= height / 2) {
                for (int j = 1; j <= height; j++) {
                    if (j <= i - 1 || j > height - i + 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("8");
                    }
                }
                System.out.println();
            } else {
                for (int j = 1; j <= height; j++) {
                    if (j <= height - i || j > i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("8");
                    }
                }
                System.out.println();
            }
        }
    }
}
