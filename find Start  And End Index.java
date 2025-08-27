//This is one approch 
public int[] searchRange(int[] nums, int target) {
        int []res={-1,-1};
        res[0]=findIndex(nums,target,true);
        if(res[0]!=-1) res[1]=findIndex(nums,target,false);
        return res;
        
    }
    static int findIndex(int []arr,int target,boolean startIndex){
        int ans=-1;
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]>target) e=mid-1;
            else if(arr[mid]<target)s=mid+1;
            else{
                ans=mid;
                if(startIndex) e=mid-1;
                else s=mid+1;
            }
        }
        return ans;
    }
//This is Another approch
public int[] searchRange(int[] nums, int target) {
        int []ans={-1,-1};
        ans[0]=findFirstIndex(nums,target);
        ans[1]=findLastIndex(nums,target);
        return ans;
    }
    static int findFirstIndex(int[]nums,int target){
        int ans=-1;
        int s=0;int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                ans=mid;
                e=mid-1;
            }
            else if(nums[mid]>target) e=mid-1;
            else s=mid+1;
        }
        return ans;
    }
    static int findLastIndex(int []nums,int target){
        int ans=-1;
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                ans=mid;
                s=mid+1;
            }
            else if(nums[mid]>target)e=mid-1;
            else s=mid+1;
        }
        return ans;
    }

