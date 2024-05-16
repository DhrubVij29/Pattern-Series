import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n / 2;
        int star = 1;
        int value = 1;
      
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            int cval=value;
            for (int k = 1; k <= star; k++) {
                System.out.print(cval + "\t");
              
                if(k<=star/2){
                    cval++;
                }else{
                    cval--;
                }
              
              
            }
            
        
            

            if (i <= n / 2) {
                space--;
                star += 2;
                value ++;
           
              
             
              
            } else {
                space++;
                star -= 2;
                value --;
              
             
                
            }
            System.out.println();

        }

    }
}
