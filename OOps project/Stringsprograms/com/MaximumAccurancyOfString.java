package Stringsprograms.com;

public class MaximumAccurancyOfString {
    public static void main(String[] args) {
        String s="kattappa";
        char ch[]=s.toCharArray();
        int freq[]=new int[ch.length];
        for(int i=0;i<ch.length;i++)
        {
            int count=1;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                    freq[i]=-1;
                }
            }
            if(freq[i]!=-1){
                freq[i]=count;
            }
        }
        int max=0;
        for(int i:freq)
        {
            if(i>max)
            {
                max=i;
            }
        }
        for(int i=0;i<ch.length;i++)
        {
            if(freq[i]==max){
                System.out.println(ch[i]+" presents "+max+"times");
            }
        }
    }
}
