class Solution {
    public int findNumbers(int[] nums){
        int evenCount = 0;

        for(int num : nums){
            if((num >= 10 && num <= 99) || (num>=1000 && num<= 9999) || (num == 100000))
            evenCount++;
        }
        return evenCount;

    }



    // public int findNumbers(int[] nums) {
    //     int evenCount = 0;
    //     for (int num : nums) {
    //         int digitCount = (int) Math.floor(Math.log10(num)) + 1;

    //         if (digitCount % 2 == 0) {
    //             evenCount++;
    //         }
    //     }
    //     return evenCount;
    // }




    // public boolean numberHasEvenDigits(int num){
    //     int digitCount = 0;
    //     while(num != 0){
    //         num /= 10;
    //         digitCount++;
    //     }
    //     return digitCount % 2 == 0;
    // }
    // public int findNumbers(int[] nums) {
    //     int evenCount = 0;
    //     for(int i = 0;i<nums.length;i++){
    //         if(numberHasEvenDigits(nums[i])){
    //             evenCount++;
    //         }
    //     }

    //     return evenCount;
    // }
}