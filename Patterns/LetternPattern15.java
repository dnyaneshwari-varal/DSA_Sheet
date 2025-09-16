package Patterns;
import java.util.*;
public class LetternPattern15 {
    static void LetterPattern(int N){
        for(int i=1;i<=N;i++){
            for(char ch='A';ch<='A'+(N-i);ch++){
                System.out.print(ch);
            }System.out.println();
        }
    }
    public static void main(String[] args){
        int N=5;
        LetterPattern(N);
    }
}
/*
ABCDE
ABCD
ABC
AB
A
 */