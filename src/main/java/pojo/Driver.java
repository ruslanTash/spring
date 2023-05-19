package pojo;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;


@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor


public class Driver {
    private String name;
    private Transport transport;


    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", transport=" + transport +
                '}';
    }
}
