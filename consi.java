public class consi {
    public static void main(String [] args)
    {
        int [] arr={0,0,1,1,1,2,2,3,3,4};
        int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                arr[i]=arr[j];  
            }

        }
        System.out.println(i+1);
        for(int j=0;j<arr.length;j++)
        {
            System.out.println(arr[j]);
        }
    
    }
    
}
