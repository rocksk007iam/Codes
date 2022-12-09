import java.io.*;
// Java program to print largest contiguous array sum
import java.util.*;
//O(n)
 
class Kadane
{
    public static void main (String args[])
    {
        int  a[] = {-2, -3, -4, -1, -2, -1, 5, -3};
        System.out.println("Maximum contiguous sum is "+maxSubArraySum(a));
    }
 
    static int maxSubArraySum(int a[])
    {
        int maxsum = 0, currentsum = 0;
 
        for (int i = 0; i <a.length; i++)
        {
            currentsum = currentsum + a[i];
            if (maxsum < currentsum)
            maxsum = currentsum;
            if (currentsum < 0)
            currentsum = 0;
        }
        return maxsum;
    }
}