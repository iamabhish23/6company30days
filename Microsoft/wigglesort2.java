class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] temp = Arrays.copyOf(nums, n);
        int left = (n - 1) / 2;
        int right = n - 1;

        for (int i = 0; i < n; i++) {
            nums[i] = (i % 2 == 0) ? temp[left--] : temp[right--];
        }
    }
}
