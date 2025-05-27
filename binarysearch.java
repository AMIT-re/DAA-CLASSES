public class binarysearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8,9};
        int s=8;
        int low=0;
        int high =arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==s)
            {
                System.out.println(mid);
                break;
            }
            else if(arr[mid]<s)
            {
                low=mid+1;
                

            }
            else
            {
                high=mid-1;
            }
            
        }
    }
    
}
