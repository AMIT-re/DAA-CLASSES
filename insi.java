public class insi
{
    public static void main(String[] args)
    {   int[] arr={2,4,1,6,7,3,0};
        for(int i=0;i<arr.length;i++)
        {
            int j=i;
            while(j>0 && arr[j-1]>arr[j])
            {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }


}