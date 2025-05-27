public class longestcommonprefix {
    public static void main(String[] args) {
        String[] arr={"flower","flow","flight"};
        String str=arr[0];
        int stlen=str.length();
        for(int i=1;i<arr.length;i++)
        {   String fi=arr[i];
            while(stlen>fi.length() || !str.equals(fi.substring(0,stlen)))
            {
                stlen--;
                if(stlen==0)
                {
                    System.out.println("");
                }
                str=str.substring(0, stlen);
            }
        }
        System.out.println(str);
    }
    
}
