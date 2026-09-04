package Strings;

public class PredefinedMethods {
    public static void main(String[] args) {
        String name = "rock Star";

        System.out.println(name.toUpperCase());

        System.out.println(name.toLowerCase());

        System.out.println("Length " + name.length());

        String company = "accenture company";
        System.out.println("company1 length" + company.length());

        String company2 = "                accenture  company       ";
        System.out.println("Company2 length " + company2.length()); // 20

        System.out.println("after using trim " + company2.trim().length()); // 18

        String message = "Good Morning all";
        System.out.println(message.startsWith("Morning"));

        // Ends With

        System.out.println(message.endsWith("a"));

        System.out.println("Char At" + name.charAt(0)); // R
        System.out.println("Char At " + name.charAt(4)); // O
        System.out.println("Substring " + name.substring(3));

        // contains
        String word = "Rock Star is Rocking";
        System.out.println(word.contains("Rock"));
        System.out.println(word.contains("ar "));
        System.out.println(word.contains("TV"));

        // indexOf
        System.out.println(name.indexOf('r'));
        System.out.println(name.indexOf('l'));

        System.out.println(name.lastIndexOf('r'));
    }
}