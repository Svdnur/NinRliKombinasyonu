import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n, r;
        int nfak = 1, rfak = 1, nrfak = 1;
        double kom;

        System.out.println(" Kümenin eleman sayısını giriniz :");
        n = scan.nextInt();

        System.out.println("Kaç elemanlı gruplar oluşturmak istediğinizi belirtiniz :");
        r = scan.nextInt();

        for (int i = 1; i <= n; i++) {

            nfak *= i;
        }

        for (int x = 1; x <= r; x++) {

            rfak *= x;
        }
        for (int y = 1; y <= (n - r); y++) {

            nrfak *= y;
        }

        kom = nfak / (rfak * nrfak);

        System.out.println(n + "'in " + r + "'li kombinasyonu :" + kom);
    }
}
