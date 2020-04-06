package project.mpp.foodservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import project.mpp.foodservice.domain.Food;
import project.mpp.foodservice.persistence.FoodRepository;
import project.mpp.foodservice.service.FoodService;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication
public class FoodServiceApplication {

    @Autowired
    private FoodService service;

    @Autowired
    private FoodRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(FoodServiceApplication.class, args);
    }

    @PostConstruct
    public void checkIfWorks(){
        //repository.deleteAll();

        service.create(new Food(null, "Biryani", 5.00, "Indian Cuisine best for hot weather.", "http://localhost:8081/swagger-ui.html#/food-item-resource", "restaurant1"));

        service.create(new Food(null, "Mo:Mo", 3.50, "Nepali Cuisine best for cold weather.", "http://localhost:8081/swagger-ui.html#/food-item-resource", "restaurant1"));
    }
}
