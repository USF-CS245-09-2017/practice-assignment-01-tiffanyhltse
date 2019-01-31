//0, 1, 1, 2, 3, 5, 8, 13, 21, 34...

public class Fibonacci {
    public int fibonacci(int n, String type){ //calls iterative or recursive implementations of fibonacci
        if (type.equals("iterative")){
            return fibonacci_iterative(n);
        }
        return fibonacci_recursive(n);

    }

    public int fibonacci_iterative(int n){
        if (n <= 1){ //returns the number itself if value n is less than or equal to 1
            return n;
        }

        int fib = 1; //marker for current number
        int previousFib = 1; //marker for previous number
        for (int i = 2; i < n; i ++){
            int temp = fib;
            fib = fib + previousFib; //add current number with number before it
            previousFib = temp; //move marker to next number
        }
        return fib;

    }

    public int fibonacci_recursive(int n){
        if (n <= 1){ //base case
            return n; //returns the number itself
        }
        return fibonacci_recursive(n-1) +fibonacci_recursive(n-2); //the sum of n's previous two numbers

    }

}
