package com.company;
public class Main {

    public static void main(String[] args) {
	// write your code here
        String txt = "Betty botter bought a bit of butter.\nThe butter Betty Botter bought was a Bit Bitter. and made her Batter bitter/ ";
        String pat = "Botter";
        KMPStringMatching.KMPSearch(txt, pat);
    }
}
