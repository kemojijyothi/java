package Stringsprograms.com;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s="Manohara na Hrudyayamuneee";
        String og=" ";
        char ch[]=s.toCharArray();
        int freq[]=new int[ch.length];
        for(int i=0;i<ch.length;i++){
            int count=0;
            for(int j=i+i;j<ch.length;j++)
            {
                if(ch[i]==ch[j]){
                    count++;
                    freq[j]=-1;
                }
            }
            if(freq[i]!=1){
                freq[i]=count;
            }

            for(int k=0;k<freq.length;k++){
                if(freq[i]!=-1&&ch[i]!=' '){
                    og=og+ch[i];
                }
            }

        }
        System.out.println(og);
    }
}
