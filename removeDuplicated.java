class removeDuplicated {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        int uniquitecount = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[uniquitecount] = nums[i];
                uniquitecount++;
            }
        }
        return uniquitecount;
    }
}