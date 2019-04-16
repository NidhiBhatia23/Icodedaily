// Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
// For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
// Bonus: Can you do this in one pass?

// To compile : javac easyProb5.java
// To run     : java easyProb1 
// Go for it! 
// Time complexity : O(n)
// Space complexity : O(n)
// Output : Pair is :7 10
 
import java.io.*;
import java.util.*;

public class easyProb1 {

    private static int arr[] = new int[]{10, 15, 3, 7}; 
    private static int k = 17; 
    private static HashMap<Integer, Integer> numTracker = new HashMap<Integer, Integer>();

    public int[] sum2k() {
        int temp = 0;
        int foundInd = 0;
        int ret[] = new int[]{-1, -1};
        for (int i = 0; i < arr.length; i++) {
            temp = k - arr[i];
            if (numTracker.containsKey(temp)) {
                foundInd = numTracker.get(temp);
                ret[0] = arr[i];
                ret[1] = arr[foundInd];
                return ret;
            }   
            numTracker.put(arr[i], i); 
        }   
        return ret; 
    }   

    public static void main(String args[]) {
        easyProb1 obj = new easyProb1();
        int retArr[] = obj.sum2k();
        System.out.println("Pair is :" + retArr[0] + " " + retArr[1]);
    }   
}

