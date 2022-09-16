import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Generated value
        int[] arr = generateRandomArray();
        System.out.println("Исходный массив: " + Arrays.toString(arr));

        // task №1
        int sum = arrSum(arr);
        System.out.println(String.format("Сумма трат за месяц составила %s рублей", sum));
        // task №2
        findMinAndMax(arr);
        // task №3
        double arithmeticMean = getArithmeticMean(sum, arr.length);
        System.out.println(String.format("Средняя сумма трат за месяц составила %s рублей", arithmeticMean));
        // task №4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }

    /**
     * Getting the sum of array elements
     *
     * @param arr
     * @return
     */
    private static int arrSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    /**
     * Find the minimum and maximum element of the array
     *
     * @param arr
     */
    private static void findMinAndMax(int[] arr) {
        int minPay = arr[0];
        int maxPay = arr[0];
        for (int i : arr) {
            if (minPay > i) {
                minPay = i;
            }
            if (maxPay < i) {
                maxPay = i;
            }
        }
        System.out.println(String.format("Минимальная сумма трат за день составила %s рублей. Максимальная сумма трат за день составила %s рублей", minPay, maxPay));
    }

    /**
     * Find the arithmetic mean
     *
     * @param sum
     * @param numberOfDays
     * @return
     */
    private static double getArithmeticMean(int sum, int numberOfDays) {
        double result = (double) sum / numberOfDays;
        return result;
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}