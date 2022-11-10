package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {
    @Override
    public List<Car> carList(int count) {
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
