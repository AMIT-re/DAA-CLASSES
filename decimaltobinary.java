import java.util.*;
public class decimaltobinary {
    public static void main(String[] args) {
        int number=11;
        StringBuilder sb=new StringBuilder();
        while(number!=0)
        {   int temp=number%2;
            sb.append(temp);
            number=number/2;
            
        }
        System.out.println(sb.toString());
        
    }
    
}
