//Name: Xander Thompson
//CWU ID: 42046934
//Date: Sept 28, 2022
import java.util.*;

public class IntReverser {

    //Scanner to get String that is an Int
    public static String getStr(){
        Scanner keyboard = new Scanner (System.in);
        return keyboard.nextLine();
    }
    //Main method
    public static void main(String[] args){
        System.out.print("Please enter a number: ");
        StringBuilder str = new StringBuilder(getStr());
        //Checks if input is only numbers or if there is characters in it.
        try{
            int num = Integer.parseInt(str.toString());
            System.out.print("The reverse of "+ str.toString());
            StringBuilder reverseStr = str.reverse();
            System.out.print(" is " + reverseStr.toString());
        }
        //Else catch exception and throw an error
        catch (NumberFormatException a){
            System.out.print("Try again with only numbers next time");
        }
    }
}
