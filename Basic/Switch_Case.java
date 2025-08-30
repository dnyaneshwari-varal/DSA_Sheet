/*Given the integer day denoting the day number, print on the screen which day of the week it is. Week starts from Monday and for values greater than 1 or less than 7, print Invalid.

Ensure only the 1st letter of the answer is capitalised.

Examples:
Input: day = 3
Output: Wednesday

*/
import java.util.*;
public class Switch_Case {
    static void whichWeekDay(int day){
      
        switch(day){
         case 1:
           System.out.println("Monday");
           break;
        case 2:
           System.out.println("Tuesday");
           break;
        case 3:
           System.out.println("Wednesday");
           break;
        case 4:
           System.out.println("Thrusday");
           break;
        case 5:
           System.out.println("Friday");
           break;
        case 6:
           System.out.println("Saturday");
           break;
        case 7:
           System.out.println("Sunday");
           break;
        default:
            System.out.println("Invalid value");
        }
     
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("day: ");
        int day=sc.nextInt();
        whichWeekDay(day);
    }
}
