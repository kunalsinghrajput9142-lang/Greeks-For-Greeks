public class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        if (n < 2) return -1;
        int largest = -1;
        int secondLargest = -1;
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        for (int num : arr) {
            if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}
