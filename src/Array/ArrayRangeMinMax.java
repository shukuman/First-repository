package Array;

public class ArrayRangeMinMax {
    public static int[] rangeMinMax(int[] array, int min, int max) {
        int count = 0;
        for (int num : array) {
            if (num >= min && num <= max) {
                count++;
            }
        }
        int[] arr = new int[count];
        int n = 0;
        for (int num : array) {
            if (num >= min && num <= max) {
                arr[n] = num;
                n++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {7, 5, 9, 1, 4};
        int[] new_array = rangeMinMax(array, 3, 5);

        for (int i = 0; i < new_array.length; i++) {
            System.out.print(new_array[i] + " ");
        }
    }
}
