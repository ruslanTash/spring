package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pojo.*;


@Configuration

public class AppConfig {
    @Bean
    public Car car() {
        return new Car("Lada", "Vesta", 2023, 1.6);
    }
    @Bean
    public Bus bus(){
        return new Bus("PAZ", "3205", 2020, 50);
    }
    @Bean
    public Pickup pickup(){
        return new Pickup("UAZ", "Hunter", 2018, 2.5);
    }

    @Bean (name = "driverCar")
    public Driver driverCar(){
        return new Driver("Micael", car());
    }
    @Bean (name = "driverBus")
    public Driver driverBus(){
        return new Driver("Ivanich", bus());
    }
    @Bean (name = "driverPickup")
    public Driver driverPickup(){
        return new Driver("Lesnick", pickup());
    }

}

