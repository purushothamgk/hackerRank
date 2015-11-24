//Alternating Characters

import java.io.*;
import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for(int arr_i=0; arr_i < n; arr_i++){
            String s = in.nextLine();
            char[] charArray = s.toCharArray();
            int count = 0; 
            for(int i=0; i<charArray.length-1;i++ ){
                if(charArray[i+1] == charArray[i]){
                    count++;
                }  
            }
            System.out.println(count);
        }
    }
    
   
}