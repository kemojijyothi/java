//WAP to print the palidrome number from 1 to 200
class PlidromenumberFrom2to200{
    public static void main(String []args){
        for(int i=1;i<=200;i++){
            int rev=0;
            int temp=i;
            while(temp>0){
                int rem=temp%10;
                rev=rev*10+rem;
                temp=temp/10;
            }
            if(rev==i){
                System.out.println("it is palidrome number  "+rev);
            }
        }
    }
}