package JAVAPROGRAMS;

public class SecondLargestNumber {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return Integer.MIN_VALUE; 
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }

        return second;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8};
        int result = findSecondLargest(arr);

        if (result == Integer.MIN_VALUE) {
            System.out.println("The second largest number does not exist.");
        } else {
            System.out.println("The second largest number is: " + result);
        }
    }
}
