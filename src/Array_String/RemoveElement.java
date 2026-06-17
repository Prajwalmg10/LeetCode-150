package Array_String;

public class RemoveElement {
    static int[] nums = new int[]{3,2,1,4,5,2,3};
    static int val = 3;

    public static int removeElement(int[] var0, int var1) {
        int var2 = 0;

        for(int var3 = 0; var3 < var0.length; ++var3) {
            if (var0[var3] != var1) {
                var0[var2] = var0[var3];
                ++var2;
            }
        }

        return var2;
    }

    public static void main(String[] var0) {
        int var1 = removeElement(nums, val);
        System.out.print("Array after removing " + val + ": ");

        for(int var2 = 0; var2 < var1; ++var2) {
            int var10001 = nums[var2];
            System.out.print(var10001 + ", ");
        }

    }
}
