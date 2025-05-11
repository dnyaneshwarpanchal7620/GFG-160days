//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(s));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String s) {
        // code here
        
        int ans =0;
        int val =0;
        
        for(int i=s.length()-1;i>=0;i--){
            switch(s.charAt(i)){
                case 'I':
                   val = 1;
                   break;
                
                case  'V':
                   val = 5;
                   break;
                
                case 'X':
                   val = 10;
                   break;
                
                case 'L':
                   val = 50;
                   break;
                
                case 'C':
                   val = 100;
                   break;
                
                case  'D':
                  val = 500;
                  break;
                
                case 'M':
                  val = 1000;
                   break;
            }
            if(4*val < ans){
                     ans -=val;
                }else{
                     ans +=val;
            }
          }
        return ans;
        
    }
}