package aegis.java.basic.section07_String.practice;

import java.util.Arrays;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        /*
        {
            StringBuilder builder = new StringBuilder("Hello world!");
            StringBuilder res = builder.reverse();
            System.out.println(res);
        }
        {
            String str = "Hello world!";
            StringBuilder builder = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                builder.append(str.charAt(i));
            }
            System.out.println(builder.toString());
        }
        {
            String str = "Hello World!";
            StringBuilder builder = new StringBuilder();
            builder.setLength(str.length());

            for (int i = 0; i < str.length() / 2; i++) {
                char left = str.charAt(i);
                final int fromRight = str.length() - i - 1;
                builder.insert(i, str.charAt(fromRight));
                builder.insert(fromRight, left);
            }
            System.out.println(builder.toString());
        }
        {
            String str = "Hello World!";
            StringBuilder builder = new StringBuilder();
            builder.setLength(str.length());

            for (int i = 0; i < str.length() / 2; i++) {
                char left = str.charAt(i);
                final int fromRight = str.length() - i - 1;
                builder.setCharAt(i, str.charAt(fromRight));
                builder.setCharAt(fromRight, left);
            }
            System.out.println(builder.toString());
        }*/
        {
            String str = "Hello World!";
            StringBuilder builder = new StringBuilder();
            builder.append(str);

            for (int i = 0; i < str.length() / 2; i++) {
                char temp = str.charAt(i);
                builder.setCharAt(i, str.charAt(str.length() - i - 1));
                builder.setCharAt(str.length() - i - 1, temp);
            }
            System.out.println(builder.toString());
        }
        /*
        {
            String str = "Hello World!";
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < str.length() / 2; i++) {
                char left = str.charAt(i);
                final int fromRight = str.length() - i - 1;
                builder.insert(i, str.charAt(fromRight));
                int kek = 0;
                if (i == 0) {
                    kek = 1;
                }
                builder.insert(i * 2 + kek, left);
            }
            System.out.println(builder.toString());
        }
         */
    }
}