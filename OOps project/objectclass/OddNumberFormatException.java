package objectclass;

public class OddNumberFormatException extends RuntimeException {
    @Override
    public String getMessage(){
        return "length of the string is odd";
    }
}

