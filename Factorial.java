//4! = 4 * 3 * 2 * 1 = 24

public class Factorial {
    public int factorial(int n, String type) { //calls iterative or recursive implementations of factorial
        if (type.equals("iterative")) {
            return factorial_iterative(n);
        } else {
            return factorial_recursive(n);
        }
    }


    public int factorial_iterative(int n){
        if (n <= 1){ //returns the number itself if value n is less than or equal to 1
            return n;

        } else {
            int first = 1; //keeps track of the product after each iteration
            for (int i = n; i > 0; i--){
                first = first * i; //product of an integer n and all the integers below it
            }
            return first;
        }

    }

    public int factorial_recursive(int n){
        if (n == 0 || n == 1){ //base case
            return n; //returns the number itself
        }

        return n * factorial_recursive(n-1); //function calls itself

    }

}