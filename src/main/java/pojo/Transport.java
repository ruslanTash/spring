package pojo;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor


public abstract class Transport {
    private String brand;
    private String model;
    private int year;

    public static void getStart(){
        System.out.println("<"  + Transport.class + ">" + " готов к работе");
    }


    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

}
