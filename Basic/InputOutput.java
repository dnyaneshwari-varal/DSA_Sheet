/*
 Complete the function printNumber which takes an integer input from the user and prints it on the screen.



Use:-

for C++ : cout << variable_name;
for Java : System.out.print();
for Python : print()
for Javascript : console.log()

Examples:
Input(user gives value): 7

Output: 7
 */

import java.util.Scanner;

public class InputOutput {
     public static void printNumber(int x) {
        System.out.println(x);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        printNumber(x);
    }
}
