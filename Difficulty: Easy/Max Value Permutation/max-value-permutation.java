//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            String line = in.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            // int key = Integer.parseInt(in.readLine().trim());

            out.println(new Solution().maxValue(arr));

            out.println("~");
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    int maxValue(int arr[]) {
        // Complete the function
    Arrays.sort(arr);
    int n = arr.length;
    long maxVal = 0;
    int mod = 1000000007;
    
    for(int i=0;i<n;i++){
       maxVal += ((long)arr[i]*i) % mod;
       maxVal %= mod;
        
    }
    return (int) maxVal;
    }
}
