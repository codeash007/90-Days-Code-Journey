package AdvanceQustOnArrays;

public class DutchAdv {
    public static void main(String[] args) {

        // Ye array hai jisme sirf 0, 1 aur 2 hain
        int[] arr = {2, 0, 1, 2, 1, 0};

        // low pointer: yahan 0 aana chahiye
        int low = 0;

        // mid pointer: current element jo hum check kar rahe hain
        int mid = 0;

        // high pointer: yahan 2 aana chahiye
        int high = arr.length - 1;

        /*
         for loop ka matlab:
         - Initialization: already bahar ho chuka (low, mid, high)
         - Condition: jab tak mid <= high
         - Increment: hum manually andar control karenge
        */
        for (; mid <= high; ) {

            // Agar current element (mid) par 0 hai
            if (arr[mid] == 0) {

                // temp mein low position ki value save kar lo
                int temp = arr[low];

                // mid wali value (0) ko low position par daal do
                arr[low] = arr[mid];

                // temp wali value ko mid position par daal do
                arr[mid] = temp;

                // low aage badhao kyunki ek 0 sahi jagah aa gaya
                low++;

                // mid bhi aage badhao kyunki mid wali value process ho chuki
                mid++;
            }

            // Agar current element (mid) par 1 hai
            else if (arr[mid] == 1) {

                // 1 ko beech mein hi rehne do
                // sirf mid ko aage badhao
                mid++;
            }

            // Agar current element (mid) par 2 hai
            else {

                // temp mein mid wali value save kar lo
                int temp = arr[mid];

                // high wali value ko mid position par laa do
                arr[mid] = arr[high];

                // temp wali value (2) ko high position par daal do
                arr[high] = temp;

                // high ko peeche lao kyunki ek 2 sahi jagah chala gaya
                high--;

                // ⚠️ mid yahin rukta hai
                // kyunki high se jo value aayi hai
                // usko abhi check nahi kiya
            }
        }

        // Final sorted array print kar rahe hain
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

    

