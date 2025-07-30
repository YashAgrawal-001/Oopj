public class SwapWithoutTemp {
    public static void main(String[] args) {
        // Initialize two variables
        int a = 5;
        int b = 10;
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a + b; 
        b = a - b;
        a = a - b; 
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
