package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int i = 1; i <= height; i++) {
            if (i != 1 && i != height) {
                for (int j = 1; j <= length; j++) {
                    if (j != 1 && j != length) {
                        System.out.print(" ");
                    } else {
                        System.out.print("8");
                    }
                }
                System.out.println();
            } else {
                for (int j = 1; j <= length; j++) {
                    System.out.print("8");
                }
                System.out.println();
            }
        }
    }
}
