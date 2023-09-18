package task43;

public class Main {
    public static void main(String[] args) {
        // 1
        double[] numbers = { 78.27, -100.8, 5.4, 0.57, 240.99, 96.0 };
        // 2
        printArrayAsCSV(numbers);
        // 3
        ArrayManipulate.doublAllElement(numbers);
        // 4
        printArrayAsCSV(numbers);
        // 5
        ArrayManipulate.multiplyAllElement(numbers, 8);
        // 6
        printArrayAsCSV(numbers);
    }

    private static void printArrayAsCSV(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

}
