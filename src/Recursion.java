public class Recursion {

    public static void main(String[] args){
        System.out.println("Recursion");
    }
}

/*
Print Number 5 to 1 in Recursion

public static void printNum(int n){
        if(n == 0){
           return;
        }
        System.out.println(n);
        printNum(n-1);
    }

    public static void main(String[] args){
        int n = 5;
        printNum(n);
    }

 */


/*
Print Number 1 to 5 in Recursion

public static void printNum(int n){
        if(n == 6){
           return;
        }
        System.out.println(n);
        printNum(n+1);
    }

    public static void main(String[] args){
        int n = 1;
        printNum(n);
    }

 */


/*
Print the sum of n Natural Numbers

public static void sumOfNaturalNum(int i, int num, int sum ){
        if (i == num) {
            sum += i;
            System.out.println(sum);
            return;
        }
            sum += i;
            sumOfNaturalNum(i+1, num, sum);
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Natural Number: ");
    int num = sc.nextInt();
    sumOfNaturalNum(1, num, 0);
    }
*/


/*
Print the sum of n Factorial

 public static int sumOfNum(int n){
        if (n == 1 || n == 0){
            return 1;
        }
        int fact = sumOfNum(n-1);
        int fact_n = n * fact;
        return fact_n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Factorial: ");
        int n = sc.nextInt();
        int factorial = sumOfNum(n);
        System.out.println("The factorial of " + n + " is " + factorial);
    }
*/


/*
Print the Fibonacci Series

 public static void printFib(int a, int b, int n){
        if (n == 0){
            return;
        }
        int c = a + b;
        System.out.print(c);
        printFib(b, c,n-1);
    }
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to print Fibonacci: ");
        int n = sc.nextInt();
        printFib(a, b, n-2);
    }
*/


/*
Print the n^x value (stack height = n)

    public static int powerFunc(int x, int pow){
        if(x == 0){
            return 0;
        }
        if(pow == 0){
            return 1;
        }
        int pow_n = powerFunc(x, pow - 1);
        int powV = pow_n * x;
        return powV;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Num: ");
        int x = sc.nextInt();
        System.out.print("Enter the Power: ");
        int pow = sc.nextInt();
        int ans = powerFunc(x, pow);
        System.out.println("The " + x + " ^ " + pow + " is " + ans);
    }
*/


/*
Print the n^x value (stack height = logn)

    public static int powerFunc(int x, int pow){
        if(x == 0){
            return 0;
        }
        if(pow == 0){
            return 1;
        }
        if(pow % 2 == 0){
            return powerFunc(x , pow / 2) * powerFunc(x, pow / 2);
        }else {
            return powerFunc(x , pow / 2) * powerFunc(x, pow / 2) * x;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Num: ");
        int x = sc.nextInt();
        System.out.print("Enter the Power: ");
        int pow = sc.nextInt();
        int ans = powerFunc(x, pow);
        System.out.println("The " + x + " ^ " + pow + " is " + ans);
    }
*/