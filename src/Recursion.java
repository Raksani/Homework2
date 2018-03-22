import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Raksani Khunamas.
 */

public class Recursion {
    /**
     * Remove duplicate consecutive items from a list, changing the list parameter.
     * For example, if list = { a, b, b, b, c, b, c, c} then after calling unique the list
     * will contain {a, b, c, b, c}. Only consecutive duplicates are removed.
     * Objects are compared using their own equals method.
     * @param list of any kind of object. The elements are not null.
     * @return reference to the list parameter with consecutive duplicates removed.
     **/
    public static List unique(List list){
        //base case.
        if(list.size() <= 1){
            return list;
        }
        //compare index n and n-1.
        if(list.get(0).equals(list.get(1))){
            list.remove(0);
            unique(list);
        }
        else{
            unique(list.subList(1,list.size()));
        }
        return list;
    }

    /**
     * fibonacci by using recursion.
     * @param n
     * @return result of fibonacci
     */

    //simple fibonacci
    public static long fibonacci(int n){
        //base case
        if(n<=2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    private static long fibonacci1(int a,int b,int n){
        if(n==0){
            return a;
        }
        else {
            return fibonacci1(b,a+b,n-1);
        }
    }

    public static long fibonacci2(int n){
        return fibonacci1(0,1,n);
    }

    public static int fibonacci3(int n, int a, int b)
    {
        if(n==0){
            return a;
        }
        return fibonacci3(n-1,b,a+b);
    }
    public static int fibonacci4(int n){
        if(n<2) {
            return n;
        }
        return fibonacci3(n,0,1);
    }
    public static void main(String[] args){
        //list = { a, b, b, b, c, b, c, c};
        List list = new ArrayList();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("d");
        list.add("e");
        list.add("f");
        //print original list
        System.out.println(list.toString());
        //print list after remove duplicate characters.
        System.out.println(unique(list).toString());
        //print fibonacci
        System.out.println(fibonacci3(1,1,2));
        System.out.println(fibonacci2(3));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci4(3));

    }
}
