class Solution {
    public String reverseVowels(String s) {
        char[] nums = s.toCharArray();

        int l = 0;
        int r = nums.length-1;

        while (l<r) {
            if (nums[l] == 'a' || nums[l] == 'e' || nums[l] == 'i' || nums[l] == 'o' || nums[l] == 'u' || nums[l] == 'A' || nums[l] == 'E' || nums[l] == 'I' || nums[l] == 'O' || nums[l] == 'U') {
                if (nums[r] == 'a' || nums[r] == 'e' || nums[r] == 'i' || nums[r] == 'o' || nums[r] == 'u' || nums[r] == 'A' || nums[r] == 'E' || nums[r] == 'I' || nums[r] == 'O' || nums[r] == 'U') {
                    char temp = nums[l];
                    nums[l] = nums[r];
                    nums[r] = temp;
                    l++;
                    r--;
                }else{
                    r--;
                }
            }else{
                l++;
            }
        }
        s = new String(nums);
        return s;
    }
}