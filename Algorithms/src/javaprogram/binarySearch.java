package javaprogram;

public class binarySearch {

    public static void main(String[] args){

    }

    public static int binarySearch(int[] a,int k, int l,int r)
    {
        while(l<=r){
            int m = (l+r)/2;
            if(a[m]==k)
            {
                return m;
            }
            else
            if(a[m]<k)
                l=m+1;
            else
                r=m-1;
        }
        return -1;
    }

    public int[] find(int[] a, int l, int r, int target)
    {
        int[] res = {-1,-1};
        int t = binarySearch(a,target,l,r);
        if(t==-1)
            return res;
        int ll=t,rr=t;
        int[] left = find(a,l,t-1,target);
        if (left[0]!=-1) ll=left[0];
        else
        if (left[1]!=-1) ll=left[1];


        int[] right = find(a,t+1,r,target);
        if (right[1]!=-1) rr=right[1];
        else
        if (right[0]!=-1) rr=right[0];

        res[0]=ll;
        res[1]=rr;
        return res;
    }

    public int[] searchRange(int[] nums, int target) {
        return find(nums,0,nums.length-1,target);
    }

    public int[] searchRange1(int[] nums, int target) {
        if (nums.length == 1 && nums[0]==target) {
            return new int[]{0,0};
        }
        int first = binarySearch(nums, target, 0, nums.length-1, true);
        int last = binarySearch(nums, target, 0, nums.length-1, false);
        return new int[]{first, last};
    }

    private int binarySearch(int[] nums, int target, int lower, int upper, boolean isFirst) {
        if (lower > upper) {
            return -1;
        }
        int mid = (lower + upper)/2;
        if(nums[mid]==target) {
            if (isFirst) {
                if (mid-1 < 0 || nums[mid-1]!= target) {
                    return mid;
                } else {
                    return binarySearch(nums, target, lower, mid-1, isFirst);
                }
            } else {
                if (mid+1 > nums.length-1 || nums[mid+1] != target) {
                    return mid;
                } else {
                    return binarySearch(nums, target, mid+1, upper, isFirst);
                }
            }
        } else if (nums[mid] > target) {
            return binarySearch(nums, target, lower, mid-1, isFirst);
        } else {
            return binarySearch(nums, target, mid+1, upper, isFirst);
        }
    }
}
