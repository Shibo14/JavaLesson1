import java.util.Scanner;

public class TestJava {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Massiv elementlari sonini kiriting = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.print(n + " ta massiv elementini kiriting = ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.print("Siz kiritgan " + n + " ta massiv elementlari: ");
        for (int j : a) {
            System.out.print(j + " ");
        }
        int[] b = new int[n];
        int t = 0;
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                b[t++] = a[i];
                s += a[i];
            }
        }
        System.out.print("\nJuft o'rindagi massiv elementlari: ");
        for (int i = 0; i < t; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.print("\nUlarning yig'indisi = " + s);
    }
}