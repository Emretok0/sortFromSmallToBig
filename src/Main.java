import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int i1, i2, i3;

        System.out.print("1. Sayı: ");
        i1 = inp.nextInt();
        System.out.print("2. Sayı: ");
        i2 = inp.nextInt();
        System.out.print("3. Sayı: ");
        i3 = inp.nextInt();

        if (i1 < i2) {
            if (i2 < i3) {
                System.out.println(i1 + " < " + i2 + " < " + i3);
            } else {
                if (i3 < i1) {
                    System.out.println(i3 + " < " + i1 + " < " + i2);
                } else {
                    System.out.println(i1 + " < " + i3 + " < " + i2);
                }
            }
        } else {
            if (i1 < i3) {
                System.out.println(i2 + " < " + i1 + " < " + i3);
            } else {
                if (i3 < i2) {
                    System.out.println(i3 + " < " + i2 + " < " + i1);
                } else {
                    System.out.println(i2 + " < " + i3 + " < " + i1);
                }
            }
        }

    }
}