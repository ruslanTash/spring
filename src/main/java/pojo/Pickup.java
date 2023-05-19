package pojo;
import lombok.*;

@Getter
@Setter

public class Pickup extends Transport{
    private double load;

    public Pickup(String brand, String model, int year) {
        super(brand, model, year);
    }

    public Pickup(String brand, String model, int year, double load) {
        super(brand, model, year);
        this.load = load;
    }

    public static void getStart(){
        System.out.println("<"  + Pickup.class + ">" + " готов к работе");
    }

    @Override
    public String toString() {
        return "Pickup{" +
                "load=" + load +
                "} " + super.toString();
    }
}
