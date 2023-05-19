package pojo;
import lombok.*;

@Getter
@Setter

public class Bus extends Transport{
    private int seatCount;

    public Bus(String brand, String model, int year) {
        super(brand, model, year);
    }

    public static void getStart(){
        System.out.println("<"  + Bus.class + ">" + " готов к работе");
    }

    public Bus(String brand, String model, int year, int seatCount) {
        super(brand, model, year);
        this.seatCount = seatCount;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "seatCount=" + seatCount +
                "} " + super.toString();
    }
}
