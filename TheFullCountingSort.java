import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
import java.util.Arrays;
import java.util.ArrayList;

public class TheFullCountingSort {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int a;
        int max = -999999;
//        String ans = "";
        StringBuilder ans = new StringBuilder();
        String s;
//        ArrayList<ArrayList<String>> res = new ArrayList<>(100);
        ArrayList<String> res = new ArrayList<>(100);
        
        for (int i = 0; i <= 100; i++) {
            res.add("");
        }	
        
        for (int i = 0; i < n; ++i) {
        	String[] tmp = in.readLine().split(" ");
        	a = Integer.parseInt(tmp[0]);
        	s = tmp[1];
            if (a >= max) {
                max = a;
            }
            if (i < n/2) {
            	String temp = res.get(a);
            	res.set(a, temp + "- ");
            }
            else {
            	String temp = res.get(a);
            	res.set(a, temp + s + " ");
            }
        }
        
        for (int i = 0; i <= max; ++i) {
            ans.append(res.get(i));
        }
        
        System.out.println(ans);
        
    }

}
