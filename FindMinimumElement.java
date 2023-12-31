public class FindMinimumElement {
    public static int findMinimum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
        public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 7};
        int minimum = findMinimum(array);
        System.out.println("Minimum Element: " + minimum);
    }
}

