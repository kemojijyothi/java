//WAP to print ASSCII value from small a to z
class Asscii{
    public static void main(String []args){
        int position=97;
        for(char ch='a';ch<='z';ch++){
            System.out.println(ch+"-"+position);
            position++;
        }
    }
}