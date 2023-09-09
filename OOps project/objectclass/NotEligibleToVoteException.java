package objectclass;

public class NotEligibleToVoteException extends RuntimeException{
    @Override
    public String getMessage(){
        return "wait for until your turn 18";
    }
}
