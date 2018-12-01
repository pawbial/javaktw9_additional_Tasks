package printing;

public class PrintingIsFun {


    public void printRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printTrianagle(int height) {
        for (int i = height; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printTree(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height * 2; j++) {
                if (j < (height - i) || j > (height + i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public void printBox(int width, int heigth) {


        for (int i = 0; i <= heigth-1; i++) {
            for (int j = 0; j <= width-1; j++) {
                if (i == 0 || i == heigth-1) {
                    System.out.print("* ");
                } else if (j == 0 || j == width-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }



}
