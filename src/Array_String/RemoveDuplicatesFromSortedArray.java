package Array_String;

public class RemoveDuplicatesFromSortedArray {
    static int[] nums = new int[]{1, 1, 2, 2, 3, 4, 4, 5};

    public static int removeDuplicates(int[] nums) {
        int indexnumber=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                nums[indexnumber]=nums[i];
                indexnumber++;
            }
        }
        return   indexnumber;
    }

    public static void main(String[] var0) {
        int var1 = removeDuplicates(nums);
        System.out.print("Array after removing duplicates: ");

        for(int var2 = 0; var2 < var1; ++var2) {
            int var10001 = nums[var2];
            System.out.print(var10001 + ", ");
        }

    }
}
