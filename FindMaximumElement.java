public class FindMaximumElement {
    public static int findMaximum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 7};
        int maximum = findMaximum(array);
        System.out.println("Maximum Element: " + maximum);
    }
}

