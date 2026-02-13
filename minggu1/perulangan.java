
import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long nim;

        System.out.println("Input NIM: ");
        nim = sc.nextLong();

        int n = (int)nim % 100;

        if (n<10) {
            n+= 10;
        }

        System.out.println("n " +n);
        System.out.println("Output: ");

        for (int i = 1; i<=n; i++) {
            if (i == 10 || i == 15) {
                continue; 
            } if (i%3 == 0) {
                System.out.println("# ");
            } else if (i%2 == 0) {
                System.out.println(i+" ");
            } else {
                System.out.println("* ");
            }
        }

        sc.close();
        
    }
}
