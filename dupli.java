public class dupli {
    public static void main(String[] args)
    {
        int[] arr={1,1,2,2,2,2,3,4,4,4};
        int j=2;
        for(int i=2;i<arr.length;i++)
        {
            if(arr[i]!=arr[j-2])
            {
                arr[j]=arr[i];
                j++;
            }
        }
    }
    
}
