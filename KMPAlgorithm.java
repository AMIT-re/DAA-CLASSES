// public class stringmacth{
//     public static void main(String[] args) {
//         String str1 = "amitsingh";
//         String str2 = "mit";
//         System.out.println("Does \"" + str1 + "\" contain \"" + str2 + "\"? " + contains(str1, str2));
//     }


//     public static boolean contains(String str1, String str2) {
//         int n = str1.length();
//         int m = str2.length();
//         for (int i = 0; i <= n - m; i++) 
//         {
//             int j;
//             for (j = 0; j < m; j++) 
//             {
//                 if (str1.charAt(i + j) != str2.charAt(j)) {
//                     break;
//                 }
//             }
//             if (j == m) {
//                 return true; 
//             }
//         }
//         return false; 
//     }
// }

//KMP ALGORITHM

public class KMPAlgorithm {
    
    // KMP Search
    public static boolean KMPSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        int[] lps = computeLPSArray(pattern);

        int i = 0, j = 0;
        while (i < n) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == m) {
                return true; 
            } else if (i < n && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return false;
    }


    public static int[] computeLPSArray(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];
        int len = 0;
        int i = 1;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    public static void main(String[] args) {
        String text = "abxabcabcaby";
        String pattern = "abcaby";
        System.out.println("Pattern found? " + KMPSearch(text, pattern)); // true
    }
}






