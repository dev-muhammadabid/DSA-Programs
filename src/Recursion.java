import java.util.*;
public class Recursion {
    public static void main(String[] args){

        System.out.println("Recursion Program");
    }
}

/*
1. Print Number 5 to 1 in Recursion

public static void printNum(int n){
        if(n == 0){
           return;
        } // Base Case
        System.out.println(n);
        printNum(n-1);
    }

    public static void main(String[] args){
        int n = 5;
        printNum(n);
    }

 */


/*
2. Print Number 1 to 5 in Recursion

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
3. Print the sum of n Natural Numbers

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
4. Print the sum of n Factorial

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
5. Print the Fibonacci Series

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
6. Print the n^x value (stack height = n)

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
7. Print the n^x value (stack height = logn)

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


/*
8. Tower Of Hanoi
    Time Complexity = O(2^n)

    public static void towerOfHanoi(int n, String src, String help, String dest ){
        if (n == 1){
            System.out.println("Transfer Disk" + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, help);
        System.out.println("Transfer Disk" + n + " from " + src + " to " + dest);
        towerOfHanoi(n-1, help, src, dest);
    }
    public static void main(String[] args){
        System.out.println("Recursion Program");
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
    }
*/


/*
9. Reverse String

     if ( index == 0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.println(str.charAt(index));
        revString(str,index-1);
    }
    public static void main(String[] args){
        String str = "abcd";
        revString(str, str.length()-1);

    }
*/


/*
10. Find the 1st & last occurance of an element in string
Time Complexity = O(n)

     public static int first = -1;
    public static int last = -1;
    public static void findOccurance(String str, int index, char element){
        if (index == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == element){
            if (first == -1){
                first = index;
            }else{
                last = index;
            }
        }
        findOccurance(str, index+1, element);
    }
    public static void main(String[] args){
        String str = "abaacdaefaah";
        findOccurance(str, 0, 'a' );
    }
*/


/*
11. Check if an array is sorted(Strictly Increasing)
Time Complexity = O(n)

 public static boolean sortArray(int arr[], int index){
        if (index == arr.length-1){
            return true;
        }
        if (arr[index] < arr[index + 1]){
            return sortArray(arr, index+1);
        }else {
            return false;
        }
    }
    public static void main(String[] args){
        int arr[] = {1,3,2,8};
        System.out.println(sortArray(arr, 0));
    }
*/


/*
12. Move all 'x' to the end of the string
Time Complexity = O(n)

 public static void moveAllx(String str, int index, int count, String newStr){
        if(index == str.length()){
            for (int i = 0; i < count ; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(index);
        if (currChar == 'x'){
            count++;
            moveAllx(str, index+1, count, newStr);
        }else{
            newStr += currChar;
            moveAllx(str, index+1, count, newStr);
        }
    }
    public static void main(String[] args){
        String str = "axbcxxd";
        moveAllx(str, 0, 0, "");
    }
*/


/*
13. Remove duplicates in a string
Time Complexity = O(n)

 public static boolean[] map = new boolean[26];

    public static void removeDupli(String str, int index, String newStr){
        if (index == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(index);
        if (map[currChar - 'a']){
            removeDupli(str, index + 1, newStr);
        }else{
            newStr +=currChar;
            map[currChar - 'a'] = true;
            removeDupli(str, index + 1, newStr);
        }
    }
    public static void main(String[] args){
        String str = "abbccda";
        removeDupli(str, 0, "");

    }
*/


/*
13. Print all the subsequences of a string   //IMPORTANT
Time Complexity = O(2^n)

public static void sunSeq(String str, int index, String newStr){
        if (index == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(index);
        sunSeq(str, index + 1, newStr+currChar);
        sunSeq(str, index + 1, newStr);
    }
    public static void main(String[] args){
        String str = "abc";
        sunSeq(str, 0, "");

    }
*/


/*
14. Print all the unique subsequences of a string   //IMPORTANT
Time Complexity = O(2^n)

public static void sunSeq(String str, int index, String newStr, HashSet<String> set){
        if (index == str.length()){
            if (set.contains(newStr)){
                return;
            }else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }

        char currChar = str.charAt(index);
        sunSeq(str, index + 1, newStr+currChar, set);
        sunSeq(str, index + 1, newStr, set);
    }
    public static void main(String[] args){
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        sunSeq(str, 0, "", set);

    }
*/


/*
15. Print keypad combinations   //Keypad Mobile
Time Complexity = O(4^n)

public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printComb(String str, int index, String comb){
        if (index == str.length()){
            System.out.println(comb);
            return;
        }

        char currChar = str.charAt(index);
        String mapping = keypad[currChar - '0'];

        for (int i = 0; i < mapping.length(); i++){
            printComb(str, index + 1, comb + mapping.charAt(i));
        }

    }
    public static void main(String[] args){
        String str = "23";
        printComb(str, 0, "");

    }
*/


/*
16. Print all permutations of a string   //IMPORTANT
Time Complexity = O(n!)

public static void printPerm(String str, String permutation){
        if (str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++ ){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPerm(newStr, permutation+currChar);
        }
    }
    public static void main(String[] args){
        String str = "abc";
        printPerm(str, "");
    }
*/


/*
17. Count total paths in a maze to move from (0,0) to (n,m) // IMPORTANT

public static int countPaths(int i, int j, int n, int m){
        if (i == n || j == m){
            return 0;
        }
        if (i == n-1 && j == m-1){
            return 1;
        }
        int downPaths = countPaths(i+1, j, n, m);
        int rightPaths = countPaths(i, j+1, n, m);

        return downPaths + rightPaths;
    }
    public static void main(String[] args){
        int n = 3, m =3;
        int totalPaths = countPaths(0, 0, n, m);
        System.out.println(totalPaths);
    }
*/


/*
18. Place Tiles of size 1xm in a floor of size nxm // IMPORTANT

public static int placeTiles(int n, int m){
        if (n == m){
            return 2;
        }
        if (n < m){
            return 1;
        }
        int vertPlacements = placeTiles(n-m, m);
        int horzPlacements = placeTiles(n-1, m);

        return vertPlacements + horzPlacements;
    }
    public static void main(String[] args){
        int n = 4, m =2;
        System.out.println(placeTiles(n, m));
    }
*/


/*
19. Find the number of ways in which you can invite n people to your party, single or in pairs // IMPORTANT

    public static int callGuests(int n){
        if (n <= 1){
            return 1;
        }
        int way1 = callGuests(n-1);
        int way2 = (n-1) * callGuests(n-2);

        return way1 + way2;
    }
    public static void main(String[] args){
        int n = 4;
        System.out.println(callGuests(n));
    }
*/


/*
20. Print all the subsets of a set of first n natural numbers // IMPORTANT
Time Complexity = O(2^n)

        public static void  printSubset(ArrayList<Integer> subset){
        for (int i = 0; i< subset.size(); i++){
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset){
        if (n == 0){
            printSubset(subset);
            return;
        }

        subset.add(n);
        findSubsets(n-1, subset);

        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }
    public static void main(String[] args){
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
*/