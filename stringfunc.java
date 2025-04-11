// import java.util.*;
// public class stringfunc
// {
//     public static void main(String[] args)
//     {

//     }

// }
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class nn
// {
//     public static void main(String[] args)throws IOException
//     {
//         BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
//         String s=br.readLine();
//         String c[]=s.split("\\s+");
//         int a[] =new int[c.length];
//         for(int i=0;i<c.length;i++)
//         {
//             a[i]=Integer.parseInt(c[i]);
//             System.out.print(a[i]);
//         }

//     }
// }


//FIRST CODE OF STRING 
//ANAGRAM-- two string are called anagram if both stings have same number of letters and the character in first string should match the second string irrespective of order

import java.util.*;
public class stringfunc
{
    public  static Boolean isanagram(String s1,String s2)
    {
        int[] c =new int[256];
        for(int i=0;i<s1.length();i++)
        {
            c[s1.charAt(i)]++;
            c[s2.charAt(i)]--;

            
        }
        for(int i=0;i<c.length;i++)
        {
            if(c[i]!=0)
            {.0
                return false;

            }
        }
        return true;
        

    }
        public static void main(String[] args)
    {
        Boolean a=isanagram("listen","silent");
        System.out.println(a);


    }
}


//2
//BALANCED STRING : A STRING IN WHICH IF A PARANTHESIS IS OPEEND THEN IT MUST BE CLOSED


// import java.util.*;
// public class stringfunc
// {
//     public static  void bal(String s)
//     {
//         Stack<Character> str =new Stack<>();
//         for(int i=0;i<s.length();i++)
//         {   char ch= s.charAt(i);
//             if(str.isEmpty())
//             {
//                 str.push(ch);
//             }
//             else if(ch=="{" || ch=="["|| ch=="(")
//             {
//                 str.push(ch);
//             }
//             else if(ch=="}" && str.peek()=="{")
//             {
//                 str.pop();
//             }
//             else if(ch=="]" && str.peek()=="[")
//             {
//                 str.pop();
//             }
//             else if(ch==")" && str.peek()=="(")
//             {
//                 str.pop();
//             }

//         }
//         if(str.isEmpty())
//         {
//             System.out.println("well formed");

//         }
//         else{
            
//             System.out.println("not");
//         }
//     }
//     public static void main(String[] args)
//     {
//         bal("{[()]}");
//     }

// }



//3
//split string on basis of white spacees 


// import java.util.*;
// public class stringfunc
// {
//     public static void main(String[] args)
//     {
//         String str="hello my name is amit";
//         String[] c =str.split(" ");
//         for(int i=0;i<c.length;i++)
//         {
//             if(c[i].length()%2==0)
//             {
//                 System.out.println(c[i]+ "  even");
//             }
//             else{
//                 System.out.println(c[i]+"  odd");
//             }
//         }




//     }

// }
//





// import java.util.*;
// public class stringfunc
// {
//     public static void main(String[] args)
//     {
//         String a="111";
//         String b="222";
//         String a1[]=a.split("");
//         String b1[]=b.split("");
//         int n1[]=new int[a.length()];
//         int sum=0;

//         for(int i=0;i<a.length();i++)
//         {
//             sum=Integer.parseInt(a1[i])+Integer.parseInt(b1[i]);
//             n1[i]=sum;
            
//         }
//         for(int i=0;i<n1.length;i++)
//         {
//             System.out.print(n1[i]);
//         }

//     }

// }





// import java.util.*;
// public class stringfunc
// {
//     public static void main(String[] args)
//     {
//         String a="Hello my name is amit";
//         String a1[]=a.split(" ");
//         String nn[]=new String[a1.length];
//         for(int i=a1.length-1;i>=0;i--)
//         {
//             System.out.println(a1[i]);
//             nn[i]=a1[i];
//         }

//     }

// }







// import java.util.*;
// public class stringfunc
// {
//     public static void main(String[] args)
//     {String a="hello my name is amit";
//     String a1[]=a.split(" ");
//     for(int i=0;i<a1.length;i++)
//     {
//         System.out.println(a1[i]+"-->"+a1[i].length());
//     }

//     }

// }







// import java.util.*;
// public class stringfunc
// {
//     public static void main(String[] args)
//     {String a="hello my name is amit";
//     String a1[]=a.split(" ");
//     for(int i=0;i<a1.length;i++)
//     {
//         System.out.println(a1[i]+"-->"+a1[i].length());
//     }

//     }

// }




// import java.util.*;
// public class stringfunc
// {
//     public static void main(String[] args)
//     { 
//         int arr[]={0,-1,2,-3,1};
//         int t=-2;
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=i+1;j<arr.length;j++)
//             {
//                 if(arr[i]+arr[j]==t)
//                 {
//                     System.out.println("true");
//                 }
//             }
//         }
        
//         }

//     }

// }


// import java.util.*;
// public class stringfunc
// {
//     public static void main(String[] args)
//     {
//         int arr[]={7, 6, 4, 3, 1};
//         int min=arr[0];
//         int max=0;
//         int j=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]<min)
//             {
//                 min=arr[i];
//                 j=i;
                
//             }

//         }
//         for(int i=j;i<arr.length;i++)
//         {
//             if(arr[i]-min>max)
//             {
//                 max=arr[i]-arr[j];
//             }

//         }
//         System.out.println(max);
//     }

// }


// import java.util.*;
// public class stringfunc
// {
//     public static void main(String[] args)
//     {
//         int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};

//         findDuplicates(arr);
//     }

//     public static void findDuplicates(int[] arr) {
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for (int num : arr) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         System.out.println("Duplicate elements:");
//         for (int key : map.keySet()) {
//             if (map.get(key) > 1) {
//                 System.out.println(key);
//             }
//         }

        
//     }

    

// }
