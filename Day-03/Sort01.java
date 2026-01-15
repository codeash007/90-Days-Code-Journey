package AdvanceQustOnArrays; 
// Package ka naam – code ko organize karne ke liye

public class Sort01 {
    // Class start ho rahi hai

    public static void main(String[] args) {
        // Program execution yahin se start hota hai

        int arr[] = {0,1,1,0,1,0,0,1,1,0};
        // Array jisme sirf 0 aur 1 hain

        int n = arr.length;
        // Array ki total length store kar li

        int left = 0;
        // Left pointer – start se chalega
        // Iska kaam: 0 ko left side mein rakhna

        int right = n - 1;
        // Right pointer – end se chalega
        // Iska kaam: 1 ko right side mein rakhna

        // For loop with manual control (while loop jaisa kaam kar raha hai)
        for (; left < right; ) {

            // Agar left side pe 0 hai
            if (arr[left] == 0) {
                // To ye already sahi jagah hai
                // Isliye left pointer aage badha do
                left++;
            }

            // Agar right side pe 1 hai
            else if (arr[right] == 1) {
                // To ye bhi sahi jagah hai
                // Isliye right pointer peeche le jao
                right--;
            }

            // Agar left pe 1 aur right pe 0 hai (galat jagah)
            else {
                // Swap karna padega

                int temp = arr[left];
                // Left ki value temp mein save kar li

                arr[left] = arr[right];
                // Right wali value left mein daal di

                arr[right] = temp;
                // Temp wali value right mein daal di

                // Swap ho gaya, ab dono pointer move karenge
                left++;
                right--;
            }
        }

        // Final sorted array print kar rahe hain
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
