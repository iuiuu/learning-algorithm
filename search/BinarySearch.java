package search;

/**
 * 二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 4, 23, 82, 91, 100 };
        int val = 91;
        int result = bsearch(arr, arr.length, val);

        System.out.println(result);

        result = bsearchV2(arr, arr.length, val);
        System.out.println(result);

    }

    /**
     * 二分查找
     * 
     * @param arr 有序数组
     * @param n   数组长度
     * @param val 待查找值
     * @return 数组下标
     */
    public static int bsearch(int[] arr, int n, int val) {
        int low = 0;
        int high = n - 1;
        int mid = 0;

        while (low < high) {
            mid = (low + high) / 2;
            if (arr[mid] == val) {
                return mid;
            } else if (arr[mid] > val) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static int bsearchV2(int[] arr, int n, int val) {
        int low = 0;
        int high = n - 1;
        return bsearchRecruce(arr, low, high, val);
    }

    public static int bsearchRecruce(int[] arr, int low, int high, int val) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == val) {
            return mid;
        } else if (arr[mid] > val) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
        return bsearchRecruce(arr, low, high, val);
    }

}
