package com.javaee.string;

public class StringTest {
    public static void main(String[] args) {
        String s = "123";
        char[] c = {'a', 'b'};
        swap(s, c);
        System.out.println(s);// 123
        System.out.println(c);// ab

        String str1 = "hello";
        String str2 = "he" + new String("llo");
        System.err.println(str1 == str2);
        System.err.println("abc" == "abc");
    }

    public static String swap(String s, char[] c) {
        s = "abc";
        char[] d = {'d'};
        c = d;
        return s;
    }

    public static void main2(String[] args) {
        String s = "abc";
        String s2 = new String("abc");
//		StringBuffer sb = s; //编译报错
//		StringBuffer sb = "abc"; //编译报错
        StringBuffer sb = new StringBuffer("abc");
        StringBuilder si = new StringBuilder("abc");
    }
}
