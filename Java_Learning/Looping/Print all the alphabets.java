/* Print all the alphabets for given n times.

Input Format

Integer

Constraints

Nill

Output Format

Display the alphabets N times

Sample Input 0

2
Sample Output 0

a b c d e f g h i j k l m n o p q r s t u v w x y z 
a b c d e f g h i j k l m n o p q r s t u v w x y z 
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            System.out.println("a b c d e f g h i j k l m n o p q r s t u v w x y z");
        }
    }
}