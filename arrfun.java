// import java.util.*;

// public class arrfun {
//     public static void main(String[] args) {
//         // Initial array
//         String[] stringArray = {"Red", "Green", "Blue", "Yellow"};
        
//         // Convert array to List
//         List<String> stringList = new ArrayList<>(Arrays.asList(stringArray));

//         // Remove an element (e.g., "Green")
//         stringList.remove("Green");

//         // Convert List back to Array
//         String[] newArray = stringList.toArray(new String[0]);

//         // Print the new array
//         for(int i=0;i<newArray.length;i++)
//         {
//             System.out.print(newArray[i]+" ");
//         }
//     }
// }




// question 2

// import java.util.*;
// public class arrfun
// {
//     public static void main(String[] args)
//     {
//         int[] arr={1,2,3,3,3,4,5,5,6,6,6};
//         int[] temp=new int[arr.length];
//         int j=0;
//         for(int i=0;i<arr.length-1;i++)
//         {
//             if(arr[i]!=arr[i+1])
//             {
//                 temp[j++]=arr[i];

//             }
//         }
//         temp[j++]=arr[arr.length-1];
//         for(int i=0;i<j;i++)
//         {
//             System.out.println(temp[i]);
//         }

//     }
// }




// import java.util.*;
// public class arrfun
// {
//     public static void main(String[] args)
//     {
//         int[] arr={1,0,2,0,3,4,5,0,6};
//         int[] newar=new int[arr.length];
//         int n=arr.length;
//         int j=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]!=0)
//             {
//                 newar[j]=arr[i];
//                 j++;

//             }
//         }
//         for (int i=0;i<arr.length;i++)
//         {
//             System.out.println(newar[i]);

//         }

//     }
// }

import java.util.*;
class arrfun{
    public static void main(String[] args)
    {
        int arr[]={1,2,2,2,3,4};
        int temp[]=new int[arr.length-1];
        int j=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]!=arr[j])
            {
                temp[j]=arr[i+1] ;
                j++;
            }
        

        }        
        for(int i=0;i<temp.length;i++)
        {
            System.out.println(temp[i]);
        }    
        
        
    }
}