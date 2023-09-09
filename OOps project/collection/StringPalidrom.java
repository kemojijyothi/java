package collection;
import java.util.ArrayList;
import java.util.Scanner;
public class StringPalidrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> str=new ArrayList<>();
        System.out.println("enter the array size");
        int n=sc.nextInt();
        System.out.println("enter string into the arraylist");
        for(int i=0;i<n;i++){
            str.add(sc.next());
        }
        System.out.println(str);
        for(int j=0;j<str.size();j++){
            Object ob=str.get(j);
            if(ob instanceof String){
                String s=(String)ob;
                String s2="";
                for(int k=s.length()-1;k>=0;k--){
                    s2=s2+s.charAt(k);
                }
                if(s2.equals(s)){
                    System.out.println(s+" it is a aplidrome string ");
                }

            }

        }
    }
}
