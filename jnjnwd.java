public class jnjnwd {
    public static void main(String[] args)
    {
        int arr[]={9,5,2,3,5};
        int temp[]=new int[arr.length];
        int i=0;
        while(i<arr.length)
        {   int max=arr[i];
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                {
                    max=arr[j];
                    break;
                }
            } 
            if(max==arr[i])
            {
                temp[i]=-1;
            }
            else{
                temp[i]=max;
                
            }
            i++;
        }
        for(int x=0;x<temp.length;x++)
        {
            System.out.println(temp[x]);
        }
    }
    
}
