import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1-ci reqemi daxil edin: ");
        int reqem1 = scan.nextInt();

        System.out.print("2-ci reqemi daxil edin: ");
        int reqem2 = scan.nextInt();

        System.out.println("\nSeçiminizi edin:");
        System.out.println("1 - Toplama");
        System.out.println("2 - Çixma");
        System.out.println("3 - Vurma");
        System.out.println("4 - Bölmə");

        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Toplama: " + (reqem1 + reqem2));
                break;
            case 2:
                System.out.println("Çıxma: " + (reqem1 - reqem2));
                break;
            case 3:
                System.out.println("Vurma: " + (reqem1 * reqem2));
                break;
            case 4:
                if (reqem2 == 0) {
                    System.out.println("Sıfıra bölmək mümkün deyil!");
                } else {
                    System.out.println("Bölmə: " + (reqem1 / reqem2));
                }
                break;
            default:
                System.out.println("Etibarsiz əməliyyat daxil etdiniz!");
        }

        scan.close();
    }
}
