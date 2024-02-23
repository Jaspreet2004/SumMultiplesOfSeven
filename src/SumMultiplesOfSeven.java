public class SumMultiplesOfSeven {
    static int sumMultiplesOfSeven(int n1, int n2) {
        // Base case: if n1 is greater than n2, return 0
        if (n1 > n2) {
            return 0;
        }
        // If n1 is a multiple of 7, add it to the sum and move to the next number
        else if (n1 % 7 == 0) {
            return n1 + sumMultiplesOfSeven(n1 + 7, n2);
        }
        // If n1 is not a multiple of 7, move to the next number
        else {
            return sumMultiplesOfSeven(n1 + 1, n2);
        }
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 35;
        System.out.println("Sum of multiples of 7 between " + n1 + " and " + n2 + " is: " + sumMultiplesOfSeven(n1, n2));
    }
}
