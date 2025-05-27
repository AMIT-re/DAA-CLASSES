public class conse {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1,0,0,1};
        int count =0;
        for(int i=0;i<arr.length;i++)
        {   
            if(arr[i]==arr[i+1])
            {
                count++;
            }
            else{
                count=0;
            }
        }
        System.out.println(count);
    }
    
}
