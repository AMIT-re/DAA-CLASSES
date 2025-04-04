public class second_largest {
    public static void main(String[]  args)
    {
        int[] arr={1,2,3,4,5,6,90};
        int max=0;
        int smax=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                smax=max;
                max=arr[i];
            }
            else if(max!=smax &&arr[i]>smax){
                smax=arr[i];

            }
        }
        if(smax==max)
        {
            System.out.println("-1");
        }
        else{
            System.out.println(smax);
        }
    }
    
}
