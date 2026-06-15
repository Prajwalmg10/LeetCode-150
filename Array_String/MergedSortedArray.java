package Array_String;

public class MergedSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    static int[] nums1 = {1, 3, 5, 7, 0, 0, 0, 0};
    static int[] arr2 = {2, 4, 6, 8};
    public static void main(String[] args) {
        merge(nums1, 4, arr2, 4);

        System.out.print("Merged Sorted Array: ");
        for (int num : nums1) {
            System.out.print(num + ", ");
        }
    }
}