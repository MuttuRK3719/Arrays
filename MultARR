class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []arr=new int[nums.length];
         arr[0]=1;
        for(int i=1;i<nums.length;i++){
            arr[i]=arr[i-1]*nums[i-1];
            }
            int suffix=1;
            for(int i=nums.length-1;i>=0;i--){
                arr[i]=arr[i]*suffix;
                suffix*=nums[i];
            }
            return arr;
        }
// rotate the array into right side
    public void rotate(int[] nums, int k) {
        int []arr=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            arr[(i+k)%nums.length]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
    }
       
    }
