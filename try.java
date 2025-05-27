public class try {
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,3};
        int temp=new int[arr.length];
        while(i!=arr.length)
        {   int max=arr[i];
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                {
                    max=arr[j];
                    break;
                }
            }
            temp[i]=max;
        }
        for(int i=0;i<temp.length;i++)
        {
            System.out.println(temp[i]);
        }
    }
    
}
