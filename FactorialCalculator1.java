import java.util.Scanner;

public class FactorialCalculator1 {

    public static long calculateFactorial(int n) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");

        n = sc.nextInt();

        if(n==0){

            int j = n+1;
            System.out.println(j);

            return j;
            
    
        }
        else

        return n;

    }


    public static void main(String[] args) {

        calculateFactorial(2);
        
    }
    
}
