package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] arr = {-2, 9, 11, 12, 13, 14, 15, 22, 142};
        int lo = 0, hi = arr.length - 1;
        boolean found = false;
        int key = 15, loops = 0;

        while (!found && lo <= hi)
        {
            int mid = (lo + hi) / 2;
            int val = arr[mid];
            if (val == key)
            {
                System.out.println(val);
                loops++;
                found = true;
            }
            else if (val > key)
            {
                System.out.println(val);
                loops++;
                hi = mid - 1;
            }
            else
            {
                System.out.println(val);
                loops++;
                lo = mid + 1;
            }
        }
        System.out.println("Number of times the loop was executed: " + loops);
    }
}
