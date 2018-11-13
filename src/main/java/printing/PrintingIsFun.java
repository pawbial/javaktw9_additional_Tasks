package printing;

public class PrintingIsFun {


    void printRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void printTrianagle(int height) {
        for (int i = height; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void printTree(int height) {
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

    void printBox(int width, int heigth) {

        for (int i = 0; i < width; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < heigth; i++) {
            for (int j = 0; j <= width; j++) {
                if (j == 0 || j == width) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < width; i++) {
            System.out.print("* ");
        }
    }



    public static void main(String[] args) {

        PrintingIsFun printingIsFun = new PrintingIsFun();

        printingIsFun.printRectangle(8, 3);

        System.out.println();

        printingIsFun.printTrianagle(13);

        System.out.println();

        printingIsFun.printTree(8);

        System.out.println();

        printingIsFun.printBox(6, 3);

    }


}
