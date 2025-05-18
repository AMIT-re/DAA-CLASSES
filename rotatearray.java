public class rotatearray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int d=3;
        int temp[]=new int[d];
        for(int i=0;i<d;i++)
        {
            temp[i]=arr[i];
        }
        int c=0;
        for(int i=d;i<arr.length;i++)
        {
            arr[c]=arr[i];
            c++;
        }
        int j=0;
        for(int i=d;i<arr.length;i++)
        {
            arr[i]=temp[j];
        }
        for(int  i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
    
}
