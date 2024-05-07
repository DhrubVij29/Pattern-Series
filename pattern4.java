import java.util.*;
public class pattern4 {
    public static void main(String args[]) {
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        int space=0;
        int star=n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("\t");

            }for(int k=1; k<=star; k++){
                System.out.print("*\t");
            }
            space++;
            star--;
            System.out.println();
        }
    
}
}
