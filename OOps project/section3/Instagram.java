package section3;

public class Instagram {
    Instagram(){

        System.out.println("login to the user credentials");
    }
    Instagram(long mobilenumber){
       this();
        System.out.println("enter mobile number");
    }
    Instagram(int otp){
        this(9676658044l);
        System.out.println(" enter OTP");
    }
    Instagram(String password){
      this(67);
        System.out.println("set a password");
    }

    public static void main(String[] args) {
        Instagram i=new Instagram(" jyothi");
    }

}
