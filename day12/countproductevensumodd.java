//WAP to print count product of even number 
//count sum of odd number 
//range is from 53 to 109

class ProductOfEvenNumAndSumOfOddNumFrom53And109{
    public static void main(String []args){
        int product=1;
        int sum=0;
        int productcount=0;
        int sumcount=0;
        for(int i=53;i<=109;i++){
            if(i%2==0){
                product=product*i;
                productcount++;
            }
            else{
                sum=sum+i;
                sumcount++;
            }
        }
        System.out.println(productcount);
        System.out.println(sumcount);

    }
}