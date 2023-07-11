//WAP to print the length or size of an array with out using any inbuilt Function
class SizeOfArray{
    public static void main(String []args){
        int a[]={5,7,6,8,8,9,6};
        int count=0;
        for(int i:a){
            count++;
        }
        System.out.println(count);
    }
} 