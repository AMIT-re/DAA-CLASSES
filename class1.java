// import java.util.*;
// public class daa
// {
//     public static Boolean prime(int n)
//     {   int c=0;
//         if(n==2)
//         {
//             return true;

//         }
//         for(int i=n;i>=2;i++)
//         {
//             if(n%i==0)
//             {
//                 c++;
//             }
//         }
//         if(c>=2)
//         {
//             return false;
//         }
//         else 
//         return true;
//     }
//     public static void main(String[] arg)
//     {
//         System.out.println(prime(2));
        
//     }
// }




//// BUBBLE SORTING
/// 
/// 
// import java.util.*;
// public class class1
// {    
//     public static void main(String[] arg)
//     {
//         int[] arr={9,8,7,4,5,2,1};
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=0;j<arr.length-i-1;j++)
//             {
//                 if(arr[j]>arr[j+1])
//                 {
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.print(arr[i]);
//         }
        
//     }
// }


// import java.util.*;
// public class class1
// {    
//     public static void main(String[] args)
//     {   int[] arr={9,8,7,4,5,2,1};
//         for(int i=0;i<arr.length-1;i++)
//         {   int min=i;
//             for(int j=i+1;j<arr.length;j++)
//             { if(arr[min]>arr[j])
//                 { 
//                     min =j;

//                 }

                
//             }
//             int temp=arr[min];
//             arr[min]=arr[i];
//             arr[i]=temp;
        
//         }
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.println(arr[i]);
//         }
        
        
        
//     }
// }



//insertion sort
// public class class1
// {

//     void sort(int arr[])
//     {
//         int n = arr.length;
//         for (int i = 1; i < n; ++i) {
//             int key = arr[i];
//             int j = i - 1;

//             while (j >= 0 && arr[j] > key) {
//                 arr[j + 1] = arr[j];
//                 j = j - 1;
//             }
//             arr[j + 1] = key;
//         }
//     }

//     static void printArray(int arr[])
//     {
//         int n = arr.length;
//         for (int i = 0; i < n; ++i)
//             System.out.print(arr[i] + " ");

//         System.out.println();
//     }
//     public static void main(String args[])
//     {
//         int arr[] = { 17,65,51,23,21,20};

//         class1 ob = new class1();
//         ob.sort(arr);

//         printArray(arr);
//     }
// }

// import java.util.*;
// public class class1{
//     public static void main(String[] args)
//     {
    
//         int[] arr={1,0,3,4};
//         int[] temp= new int[arr.length];
//         for(int i=0;i<arr.length;i++)
//         {   int prod=1;
//             for(int j=0;j<arr.length;j++)
//             {
//                 if(i!=j)
//                 {
//                     prod=prod*arr[j];
//                 }
                
//             }
//             temp[i]=prod;
//         }
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.println(temp[i]);
//         }
        

        
//     }
// }
                                                    

// import java.util.*;
// public class class1{
//     public static void main(String[] args)
//     {
    
//         int[] arr={1,2,2,3,2,2};
//         Map<Integer, Integer> map = new HashMap<>();
//         int n = arr.length;
        
//         for (int num : arr) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//             if (map.get(num) > n / 2) {
//                 System.out.println(num);
//                 break;
//             }
//         }
        
//     }
// }


// import java.util.*;
// public class class1{
//     public static void main(String[] args)
//     {
    
//         int[] arr1={1,2,3};
//         int[] arr2={2,4,5};
//         int p1=0;
//         int p2=0;
//         int p3=arr1.length+arr2.length;
//         int[] temp=new int[p3];
//         while(p1<arr1.length && p2<arr2.length)
//         {
//             if(arr1[p1]<arr2[p2])
//             {
//                 temp[p3]=arr1[p1];
//                 p3++;
//                 p1++;
//             }
//             else
//             {
//                 temp[p3]=arr2[p2];
//                 p3++;
//                 p2++;
//             }
//         }
//         for(int i=0;i<temp.length;i++)
//         {
//             System.out.println(temp[i]);
//         }
        
        
//     }
// }

// import java.util.*;
// public class class1{
//     public static void main(String[] args)
//     {
//         int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,14};

//         for(int i=0;i<arr.length-1;i++)
//         {
//             if(arr[i+1]-arr[i]!=1)
//             {  
//                 System.out.println(arr[i]+1);
                
//                 break;
//             }
//         }
    
        
        
//     }
// }



// class class1 {
//     public void rotate(int[] nums, int k) {
//         int n=0;
//         while(n<k)
//         {   int temp=0;
//             for(int i=1;i<nums.length-1;i++)
//             {
//                 temp=nums[nums.length-1];
//                 nums[i]=nums[i-1];

//             }
//             nums[0]=temp;
//             n++;
//         }
//         for(int i=0;i<nums.length;i++)
//         {
//             System.out.print("[");
//             if(i!=nums.length-1)
//             {
//                 System.out.print(nums[i]+",");
//             }
//             System.out.println("]");
//         }
        
        
        
//     }
//     public static void main(String[] args)
//     {
//         class1 obj=new class1();
//         int[] arr={1,2,3,4,5,6,7};
//         obj.rotate(arr, 3); 
//     }
// }


// class class1 {
//     public static void main(String[] args)
//     {
//         int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
//         int temp[][]=new int[3][3];
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=0;j<arr.length;j++)
//             {
//                 temp[i][j]=arr[j][i];
//             }
//         }
//         for(int i=0;i<temp.length;i++)
//         {
//             for(int j=0;j<temp.length;j++)
//             {
//                 System.out.print(temp[i][j]+" ");
//             }
//             System.out.println();
//         }

//     }
// }


// class class1 {
//     public static void main(String[] args)
//     {   
//         int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
//         int temp[][]=new int[3][3];
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=0;j<arr.length;j++)
//             {
//                 temp[i][j]=arr[j][i];
                
//             }
//         }
//         for(int i=0;i<temp.length;i++)
//         {
//             for(int j = 0; j<temp.length ; j++){
//                 if(j == 0){
//                     int temp1=temp[i][0];
//                     temp[i][0]=temp[i][temp.length-1];
//                     temp[i][temp.length-1]=temp1;
//                 }
//                 break;
//             }
//         }
//         for(int i=0;i<temp.length;i++)
//         {
//             for(int j=0;j<temp.length;j++)
//             {
//                 System.out.print(temp[i][j]+" ");
//             }
//             System.out.println();
//         }

//     }
// }
import java.util.* ;//set matrix zero

class class1 {
    public static void main(String[] args)
    {   
        int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i][j]==0)
                {
                    for(int x=0;x<3;x++)
                    {
                        arr[i][x]=-1;
                        arr[x][j]=-1;
                    }                    
                }               
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i][j]==-1)
                {
                    arr[i][j]=0;
                    
                }                
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

// class class1 {
//     public static void main(String[] args)
//     {   
//         String s="abc";
//         String t="ahbgdc";
//         int s1=s.length();
//         int t1=t.length();
//         int i=0;
//         int j=0;
//         while(i<s1 && j<t1 )
//         {
//             if(s.charAt(i)==t.charAt(j))
//             {
//                 i++;
//             }
//             j++;
//         }
//         if(i==s.length())
//         {
//             System.out.println("true");
//         }
//         else{
//             System.out.println("false");
//         }
//     }
// }




// class class1 {
//     public static int partition(int []arr,int low,int high)
//     {
//         int pivot=arr[(high+low)/2];
//         while(low<=high)
//         {
//             while(arr[low]<pivot)
//             {
//                 low++;
//             }
//             while(arr[high]>pivot)
//             {
//                 high++;
//             }
//             if(low<=high)
//             {
//                 int temp=arr[low];
//                 arr[low]=arr[high];
//                 arr[high]=temp;
//                 low++;
//                 high--;
//             }
            
//         }
//         return low;        
//     }
//     public static void join(int [] arr ,int low,int high )
//     {
//         int p=partition(arr,low,high);
//         if(low<p-1)
//         {
//             join(arr,low,p-1);
//         }
//         if(p<high)
//         {
//             join(arr,p,high);
//         }
//     }
//     public static void print(int [] arr)
//     {
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.println(arr[i]);
//         }
//     }
//     public static void main(String[] args)
//     {   
//         int arr1[]={5,8,9,3,10,15,12,16};
//         join(arr1,0,arr1.length-1);
//         print(arr1);        
//     }
// }



// import java.io.*;

// class class1 {


//     static void merge(int arr[], int l, int m, int r)
//     {
        
//         int n1 = m - l + 1;
//         int n2 = r - m;
//         int L[] = new int[n1];
//         int R[] = new int[n2];
//         for (int i = 0; i < n1; ++i)
//             L[i] = arr[l + i];
//         for (int j = 0; j < n2; ++j)
//             R[j] = arr[m + 1 + j];
//         int i = 0, j = 0;
//         int k = l;
//         while (i < n1 && j < n2) {
//             if (L[i] <= R[j]) {
//                 arr[k] = L[i];
//                 i++;
//             }
//             else {
//                 arr[k] = R[j];
//                 j++;
//             }
//             k++;
//         }
//         while (i < n1) {
//             arr[k] = L[i];
//             i++;
//             k++;
//         }
//         while (j < n2) {
//             arr[k] = R[j];
//             j++;
//             k++;
//         }
//     }

//     static void sort(int arr[], int l, int r)
//     {
//         if (l < r) {

//             int m = l + (r - l) / 2;
//             sort(arr, l, m);
//             sort(arr, m + 1, r);
//             merge(arr, l, m, r);
//         }
//     }

//     static void printArray(int arr[])
//     {
//         int n = arr.length;
//         System.out.print("[");
//         for (int i = 0; i < n; ++i)
//             System.out.print(arr[i] + " ");
//         System.out.print("]");
//     }

//     public static void main(String args[])
//     {
//         int arr[] = { 15,5,24,8,1,3,16,10,20};
//         sort(arr, 0, arr.length - 1);
//         printArray(arr);
//     }
// }














