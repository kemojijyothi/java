package Programming;

public class FightBookingOneWay {
    public void booking(String from,String to){
        System.out.println(" Booking flight ticket from :"+from +" to "+to);
    }
}
class flightBookingRoundTrip extends FightBookingOneWay{
    public void booking(String from,String to ,String startdate,String enddate){
        System.out.println(" Traivalling to: "+to+" from "+from+" on "+startdate+" till "+enddate);
    }
}
class MainFlight{
    public static void main(String[] args) {
        flightBookingRoundTrip fb=new flightBookingRoundTrip();
        fb.booking("Bangolre","belley");
        fb.booking("banglore","kerala","18/02/2023","23/4/2023");
    }

}

