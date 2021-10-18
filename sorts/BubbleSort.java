package sorts;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] m = new int[] { 3, 2, 5, 7, 1, 0, 4 };
        m = new int[] { 4, 5, 6, 3, 2, 1 };
        int len = m.length;

        System.out.println("数组初始状态：" + Arrays.toString(m));
        sort(m, len);

        System.out.println("冒泡排序算法：" + Arrays.toString(m));

        System.out.println(System.currentTimeMillis());
        bubbleSort(m);
        System.out.println("冒泡排序算法：" + Arrays.toString(m));

    }

    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        int tmp = 0;

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void sort(int[] m, int len) {
        int tmp = 0;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (m[i] > m[j]) {
                    tmp = m[i];
                    m[i] = m[j];
                    m[j] = tmp;
                }
            }
            System.out.println(String.format("第 %d 次：%s", i + 1, Arrays.toString(m)));
        }
    }

}
