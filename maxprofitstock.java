public class maxprofitstock {
    public static void main(String[] args) {
        int [] prices={2,4,1};
        int min=prices[0];
        int j=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
                j=i;
            }
        }
        System.out.println(min);
        if(j==prices.length-1)
        {
            System.out.println("0");
        }
        int max=0;
        while(j<prices.length)
        {
            if(prices[j]>max)
            {
                max=prices[j];
            }
            j++;   
        }
        System.out.println(max);
        System.out.println(max-min);
    }
    
}
