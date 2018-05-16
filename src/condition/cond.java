package condition;

import java.io.*;
import java.util.*;


public class cond {
    void cond(int a, int b, int c){
        if (a==b&&b==c&&a==c){
            System.out.println("equle");
        } else {
            System.out.println("Дичь");
        }
    }
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    cond cn = new cond();
        System.out.println("Enter A");
        int w = in.nextInt();
        System.out.println("Enter B");
        int e = in.nextInt();
        System.out.println("Enter C");
        int r = in.nextInt();
        cn.cond(w,e,r);
    }
}
