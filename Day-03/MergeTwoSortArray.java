package AdvanceQustOnArrays;

class MergeTwoSortedArraysForLoop {
    public static void main(String[] args) {

        // First sorted array
        int[] arr1 = {1, 3, 5};

        // Second sorted array
        int[] arr2 = {2, 4, 6};

        // Third array ka size = arr1 + arr2
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0; // pointer for arr1
        int j = 0; // pointer for arr2
        int k = 0; // pointer for arr3

        // for loop jab tak dono arrays mein elements bache hain
        for (; i < arr1.length && j < arr2.length; ) {

            // arr1 aur arr2 ke current element compare karo
            if (arr1[i] < arr2[j]) {

                // arr1 ka chhota element arr3 mein daalo
                arr3[k] = arr1[i];

                i++; // arr1 ka pointer aage badhao
            } else {

                // arr2 ka chhota element arr3 mein daalo
                arr3[k] = arr2[j];

                j++; // arr2 ka pointer aage badhao
            }

            k++; // arr3 ka pointer hamesha aage badhega
        }

        // Agar arr1 mein elements bache hain
        for (; i < arr1.length; i++) {
            arr3[k] = arr1[i];
            k++;
        }

        // Agar arr2 mein elements bache hain
        for (; j < arr2.length; j++) {
            arr3[k] = arr2[j];
            k++;
        }

        // Final merged array print karo
        for (int x = 0; x < arr3.length; x++) {
            System.out.print(arr3[x] + " ");
        }
    }
}
