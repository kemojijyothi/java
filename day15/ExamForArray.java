/*we have iniltialize array in 3 ways 
   1. without assigning values 
   syntax: int[] array=new int[5];
   2.after the declaration of the array
   syntax: int [] number;
   numbers= new int[]{22,34,56};
   3.initialize and assign values together
   syntax: int [] numbers={23,45,43,23,54};
 */




//assigning values
class ExamForArray{
    public static void main(String [] args){
        int [] num={12,28,46,34,36,89};
        {
            for(int i=0;i<6;i++){
                System.out.println(num[i]);

            }
        }
    }
}