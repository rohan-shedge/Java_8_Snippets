package interview.epam;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestElement {
    public static void main(String[] args) {
        SecondLargestElement secondLargestElement = new SecondLargestElement();
        int[] intArray = {1, 2, 3, 7, 7, 6};
        System.out.println(secondLargestElement.findSecondLargestElement(intArray));

    }

    private int findSecondLargestElement(int[] arr) {

/*        Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(1)
                .forEach(System.out::println);*/

        int largest = arr[0];
        int slargest = -1;
        for (int num : arr) {
            if (num > largest) {
                slargest = largest;
                largest = num;
            } else if (num < largest && slargest < num) {
                slargest =num;
            }

        }
        return slargest;
    }
}
