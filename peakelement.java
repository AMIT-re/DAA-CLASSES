class peakelement {
    public static int findPeakElement(int[] nums) {
        int st=0;int end=nums.length-1;
        while(st<end)
        {
            int mid=(st+end)/2;
            if(nums[mid]>nums[mid+1])
            {
                end=mid;
            }
            else
            {
                st=mid+1;
            }
        }
        return st;
        
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,1,3,5,6,4};
        int a=findPeakElement(arr);
        System.out.println(a);

    }
}