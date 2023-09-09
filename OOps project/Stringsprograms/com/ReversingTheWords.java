package Stringsprograms.com;

public class ReversingTheWords {
    public static void main(String[] args) {
        String str="Sri padmvatahi mahila visvavidyalayam";
        String s[]=str.split("");
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            if(i==0){
                rev=rev+s[i];
            }
            else{
                rev=rev+s[i]+"";
            }
        }
        System.out.println(rev);
    }
}
