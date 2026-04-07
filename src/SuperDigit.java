import java.util.*;

public class SuperDigit {
    
    // Function to compute super digit
    static int superDigit(long num) {
        if (num < 10) return (int) num;
        
        long sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        
        return superDigit(sum);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String n = sc.next(); // take as string
        int k = sc.nextInt();
        
        long initialSum = 0;
        
        // Sum digits of n
        for (int i = 0; i < n.length(); i++) {
            initialSum += n.charAt(i) - '0';
        }
        
        // Multiply by k
        initialSum *= k;
        
        // Find super digit
        int result = superDigit(initialSum);
        
        System.out.println(result);
    }
}
