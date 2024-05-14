import java.util.*;

public class pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x >= 1 || x <= 50)
            for (int i = 1; i <= 10; i++) {
                int mul = x * i;
                System.out.println(x + "*" + i + "=" + mul);

            }

    }
}
