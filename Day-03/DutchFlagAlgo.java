package AdvanceQustOnArrays;
// Package ka naam – project ko organize karne ke liye

public class DutchFlagAlgo {
    // Class start ho rahi hai

    public static void main(String[] args) {
        // Program execution yahin se start hota hai

        int arr[] = {0,1,2,0,1,2,1,0,2,1,0};
        // Array jisme sirf 0, 1 aur 2 values hain

        int n = arr.length;
        // Array ki total length n mein store kar li
        // (abhi n use nahi hua, but future logic ke liye useful hai)

        int count1 = 0;
        // count1 ka matlab: kitne 0 hain

        int count2 = 0;
        // count2 ka matlab: kitne 1 hain

        int count3 = 0;
        // count3 ka matlab: kitne 2 hain

        // For loop – poora array ek-ek element check karega
        for (int i = 0; i < arr.length; i++) {

            // Agar current element 0 hai
            if (arr[i] == 0) {
                count1++;  
                // 0 ka count badha do
            }

            // Agar current element 1 hai
            else if (arr[i] == 1) {
                count2++;  
                // 1 ka count badha do
            }

            // Agar current element 2 hai
            else {
                count3++;  
                // 2 ka count badha do
            }
        }

        // Yahan hum sirf count print kar rahe hain
        System.out.println(count1);
        // Total number of 0 print karega

        System.out.println(count2);
        // Total number of 1 print karega

        System.out.println(count3);
        // Total number of 2 print karega
    }
}
