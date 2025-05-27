import java.util.HashMap;

public class nonrepeatingstring {
    public static void main(String[] args) {
        String str="geeks for geeks";
        HashMap<Character,Integer> hm =new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
            
            
        }
        
    }
    
}
    

