public class reverseanumber {
    public static void main(String[] args) {
        int n=143;
        int rev=1;
        while(n>0)
        {
            int d=n%10;
            System.out.println(d);
            rev=rev*10+d;
            System.out.println(rev);
            n=n/10;
            System.out.println(n);
            break;
            
        }
    }
    
}
