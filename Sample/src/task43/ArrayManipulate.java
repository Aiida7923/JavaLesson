package task43;

public class ArrayManipulate {

    /**
     * 配列の全要素を2倍にするメソッド
     * 
     * @param arr 数値配列
     */
    public static void doublAllElement(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }

    /**
     * 配列の全要素を係数倍にするメソッド
     * 
     * @param arr    数値配列
     * @param factor 係数
     */
    public static void multiplyAllElement(double[] arr, double factor) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= factor;
        }
    }
}
