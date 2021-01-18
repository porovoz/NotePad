package flightDuration;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;


public class flightDuration {
    private ZoneId departureZoneID;
    private LocalDate departureDate;
    private LocalTime departureTime;
    private ZoneId arrivalZoneID;
    private LocalDate arrivalDate;
    private LocalTime arrivalTime;

    public ZoneId getDepartureZoneID() {
        return departureZoneID;
    }

    public void setDepartureZoneID(ZoneId departureZoneID) {

        this.departureZoneID = departureZoneID;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public ZoneId getArrivalZoneID() {
        return arrivalZoneID;
    }

    public void setArrivalZoneID(ZoneId arrivalZoneID) {
        this.arrivalZoneID = arrivalZoneID;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public static void main(String[] args) {
     //   public static String askString (String)
       // System.out.println("Enter timezone of departure:");



    }
}
