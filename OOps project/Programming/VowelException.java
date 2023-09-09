package Programming;

import java.util.Scanner;

public class VowelException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        try{
            check(s);
            System.out.println("String conatis vowels");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void check(String s) throws Exception {
        int count = 0;
        char ch[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++)
        {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                count++;
            }

        }
        if(count<=0){
            throw new StringNotContainsVowelExeception();
        }

    }
}
class  StringNotContainsVowelExeception extends Exception{
    public String getMessage(){
        return "String doesnot contain any vowels";
    }
}

