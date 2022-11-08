package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(HttpServletRequest request, ModelMap model) {
        String count = request.getParameter("count");
        List<Car> cars = CarService.carList((count != null) ? Integer.parseInt(count) : 0);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
