package pro.sky.calculator.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.Service.ServiceCalculator;

import java.util.Objects;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final ServiceCalculator serviceCalculator;

    public Controller(ServiceCalculator serviceCalculator) {
        this.serviceCalculator = serviceCalculator;
    }

    @GetMapping
    public String welcome() {
        return serviceCalculator.welcome();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(value = "num1", required = false) Float a,
                       @RequestParam(value = "num2", required = false) Float b) {
        if (Objects.isNull(a) || Objects.isNull(b)) {
            return "Неправильно переданы параметры!";
        }
        return a + " + " + b + " = " + serviceCalculator.plus(a, b);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(value = "num1", required = false) Float a,
                       @RequestParam(value = "num2", required = false) Float b) {
        if (Objects.isNull(a) || Objects.isNull(b)) {
            return "Неправильно переданы параметры!";
        }
        return a + " - " + b + " = " + serviceCalculator.minus(a, b);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Float a,
                       @RequestParam(value = "num2", required = false) Float b) {
        if (Objects.isNull(a) || Objects.isNull(b)) {
            return "Неправильно переданы параметры!";
        }
        return a + " * " + b + " = " + serviceCalculator.multiply(a, b);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(value = "num1", required = false) Float a,
                       @RequestParam(value = "num2", required = false) Float b) {
        if (Objects.isNull(a) || Objects.isNull(b)) {
            return "Неправильно переданы параметры!";
        }
        if (a == 0 || b == 0) {
            return "Ошибка! На ноль делить нельзя!";
        } else {
            return a + " / " + b + " = " + serviceCalculator.divide(a, b);
        }
    }

}


