import java.util.*;

public class binarytointeger {
    public static void main(String[] args) {
        // int num = 10; 
        // int sum = 0;
        // int i = 0;

        // while (num != 0) {
        //     int d = num % 10;
        //     sum = sum + ((int)Math.pow(2, i) * d);
        //     i++;
        //     num = num / 10;
        // }

        // System.out.println(sum);  
        String str="10";
        int sum=0;int j=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            int num=ch-'0';
            sum=sum+((int)(Math.pow(2,j))*num);
            j++;

        }
        System.out.println(sum);
    }
}
