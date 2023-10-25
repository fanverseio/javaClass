import java.util.Scanner;

public class ExerExercise14Solution {

    public static void main(String[] args) {
        isPalindrome("abbba");


    }

    static boolean isPalindrome(String str){
        int startPtr = 0;
        int endPtr = str.length()-1;

        while(startPtr < endPtr){
            if (str.charAt(startPtr) !=str.charAt(endPtr)){
                return false;
            }
            startPtr +=1;
            endPtr -=1;

        
        }
        return true;
    }


}