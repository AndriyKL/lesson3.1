package com.company;

public class Main {

    public static void main(String[] args) {
        String givenString = "({a<({ds(d)fsfsf})q>w21}as)";
        System.out.println(givenString);

        String[] LeftArray = new String[] {"{", "(", "<"};
        String[] RightArray = new String[] {"}", ")", ">"};

        givenString = givenString.replaceAll("[^{}()<>]", "");
        System.out.println(givenString);

        int a = 0;
        for(int i = 0; i + 1 < givenString.length(); i++){


            a++;
        }
    }
}
