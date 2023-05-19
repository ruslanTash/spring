package pojo;
import lombok.*;

@Getter
@Setter

public class Car extends Transport{
    private double engineVolume;

    public Car(String brand, String model, int year) {
        super(brand, model, year);
    }

    public Car(String brand, String model, int year, double engineVolume) {
        super(brand, model, year);
        this.engineVolume = engineVolume;
    }

    public static void getStart(){
        System.out.println("<"  + Car.class + ">" + " готов к работе");
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineVolume=" + engineVolume +
                "} " + super.toString();
    }
}
