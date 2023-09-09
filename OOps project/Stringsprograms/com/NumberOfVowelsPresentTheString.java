package Stringsprograms.com;

public class NumberOfVowelsPresentTheString {
    public static void main(String[] args) {
        String s="RyalaseemaUniversity";
        String vowels="aeiou";
        s=s.toLowerCase();
        for(int i=0;i<vowels.length();i++){
            char c=vowels.charAt(i);
            int count=0;
            for(int j=0;j<s.length();j++)
            {
                char ch1=s.charAt(j);
                if(c==ch1){
                    count++;
                }
            }
            if(count!=0){
                System.out.println(c+" presents "+count+" times ");
            }
        }
    }
}
