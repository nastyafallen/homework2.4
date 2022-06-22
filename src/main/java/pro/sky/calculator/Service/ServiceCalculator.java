package pro.sky.calculator.Service;

import org.springframework.stereotype.Service;

@Service
public class ServiceCalculator {
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    public Float plus(Float a, Float b) {
        return a + b;
    }

    public Float minus(Float a, Float b) {
        return a - b;
    }

    public Float multiply(Float a, Float b) {
        return a * b;
    }

    public Float divide(Float a, Float b) {
        return a / b;
    }
}
