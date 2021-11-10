package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAOImpl implements CarDAO {
    private List<Car> cars;
    private static int CAR_COUNT;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CAR_COUNT, "BMW", "2018"));
        cars.add(new Car(++CAR_COUNT, "Audi", "2003"));
        cars.add(new Car(++CAR_COUNT, "Mitsubishi", "2017"));
        cars.add(new Car(++CAR_COUNT, "Opel", "2006"));
        cars.add(new Car(++CAR_COUNT, "Kia Rio", "2013"));
    }

    public List<Car> show(Integer count) {
        if (count == null) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}