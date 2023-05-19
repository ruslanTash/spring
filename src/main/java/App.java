import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.Bus;
import pojo.Car;
import pojo.Driver;
import pojo.Pickup;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        context.getBean(Bus.class).getStart();
        context.getBean(Car.class).getStart();
        context.getBean(Pickup.class).getStart();

        System.out.println(context.getBean("driverCar"));
        System.out.println(context.getBean("driverBus"));
        System.out.println(context.getBean("driverPickup"));
    }
}
