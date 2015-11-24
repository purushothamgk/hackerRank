import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for(int arr_i=0; arr_i < n; arr_i++){
            String s = in.nextLine();
            char[] sArray = s.toCharArray();
            char[] rArray = new char[sArray.length];
            for(int i = sArray.length-1; i >=0; i--){
                rArray[sArray.length-1-i] = sArray[i];
            }      
            isFunny(sArray,rArray);
        }
    }
    
    public static void isFunny(char[] sArray, char[] rArray){
        boolean isFunny = true;
        for(int i = 0 ; i < sArray.length-1; i++){ 
            if(Math.abs(sArray[i+1] - sArray[i]) !=  Math.abs( rArray[i+1]  - rArray[i])){
                isFunny = false; 
                break;
            }       
        }
        
        if(isFunny){
           System.out.println("Funny");
        }else {
           System.out.println("Not Funny");
        }
        
    }
}