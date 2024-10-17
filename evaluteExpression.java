import java.util.Scanner;

public class evaluteExpression {
    public static void main(String[] args) {
        int T=2;
        for (int t = 0; t < T; t++) {
            int N=3;
            long sum = 0; 
            for (int i = 1; i <= N; i++) {
                sum += Math.pow(i, N) % N; 
            }
            System.out.println(sum % N);  // Output the sum mod N
        }
        
    }


    
}
