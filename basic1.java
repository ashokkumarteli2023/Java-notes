//loop like while, for etc and if, else if etc. must evaluate to a boolean value
// " long long " does not exist



import java.util.*;
public class basic1 {
    public static void main(String[] argu)
    {
        // long mod=1e9+7; //error: possible lossy conversion from "double" to long
        // long mod=(long)1e9+7; 
        // System.out.println(mod);

        // String str="Ashok Kumar Teli";
        // System.out.println(str.length());

        // int maxi=Integer.MAX_VALUE;
        // System.out.println(maxi);

        // int num=Math.abs(Integer.MIN_VALUE);  //o/p:-2147483648 {take care of it}
        // System.out.println(num);

        // String s1 = new String("example");
        // String s2="example";
        // // System.out.println(s1+" & "+s2);
        // //Now if I want to append any character in s1 or s2 it will take O(N) time, Hence
        // StringBuilder ans = new StringBuilder();
        // ans.append('E');
        // ans.append('Y');
        // ans.append('E');
        // System.out.println(ans.toString());

        int num=10;
        double num1=10;
        System.out.println(Math.log(num));  //2.302585092994046 {int to double}
        System.out.println(Math.log(num1));  //2.302585092994046
        //Syntax   public static "double" log("double" a)

        System.out.println("num ceil"+Math.ceil(num));  //10.0 {int to double}
        System.out.println("log(num) ceil"+Math.ceil(Math.log(num)));
        //Syntax  double java.lang.Math.ceil(double a)
    }
}
