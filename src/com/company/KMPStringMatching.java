package com.company;

public class KMPStringMatching {
    /* find pattern position in String txt */
    public static void KMPSearch(String txt, String pat) {
        int N = txt.length();
        int M = pat.length();

        int lps[] = new int[M];
        int i = 0; // idx for txt
        int j = 0; // idx for pattern

        // Preprocess the pattern (calculate lps[] array)
        computeLPSArray(pat, M, lps);

        while (i < N){
            if (pat.charAt(j) == txt.charAt(i)){
                ++i;
                ++j;
                if (M == j){
                    System.out.println("Found pattern " + "at index  " + (i - j));
                    j = lps[j - 1];
                }
            }
            else {
                if (j > 0)
                    j = lps[j - 1];
                else
                    ++i;
            }
        }
    }

    public static void computeLPSArray(String pat, int M, int lps[]){
        // length of the previous longest prefix suffix
        int len = 0;
        int i = 1;
        lps[0] = 0; // lps[0] is always 0

        while (i < M){
            if(pat.charAt(i) == pat.charAt(len)){
                ++len;
                lps[i] = len;
                ++i;
            }else {
                if (0 != len){
                    len = lps[len - 1];
                }
                else{
                    lps[i] = len;
                    ++i;
                }
            }
        }
    }
}
