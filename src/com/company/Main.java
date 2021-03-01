package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Fuckts about me");

        byte age = 21;
        System.out.println("Hi. My name is Vlad. I am " + age + " years old.");
        // 2^16 = 65000
        short year = 2021;
        System.out.println("It is " + year + " year now");
        // 2^32 = 2 000 000 000
        int salary = 66666;
        System.out.println("I'd to get "+salary+" a month till the 25 years.");
        //long 2^64

        long pop = 3_200_000_000l;
        System.out.println("As all humans I have about a " + pop + " molecules in my DNA");

        //float
        float V = 3.25f;
        System.out.println("I was born with the "+V +" weight");

        //double
        double V2 = 71.1415926;
        System.out.println("And now its about "+V2);

        //char
        char e = 'e';
        System.out.println("Of course i love some memes so here is one 'this is internet explorer logo' => '"+e+"'");

        //bool
        boolean fact = true;
        System.out.println("And this is " + fact + " story");

        String str = "So even if it is a horrible story about myself Im pretty glad I did it";
        System.out.println(str);


    }
}
