package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    public static List<Car> carList(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("KIA", "Rio", "white"));
        cars.add(new Car("Toyota", "Solaris", "white"));
        cars.add(new Car("Lada", "Granta", "black"));
        cars.add(new Car("Lada", "Priora", "purple"));
        cars.add(new Car("Mercedes", "Benz", "yellow"));
        if (count == cars.size() || count == 0) return cars;
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
