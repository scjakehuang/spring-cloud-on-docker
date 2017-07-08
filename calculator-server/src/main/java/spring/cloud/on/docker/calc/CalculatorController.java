package spring.cloud.on.docker.calc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by viki on 17-7-6.
 */
@RestController
@RequestMapping("/calc/api")
public class CalculatorController {
    @GetMapping("/add")
    public Double add(@RequestParam(value = "opA", required = true) Double opA,
                       @RequestParam(value = "opB", required = true) Double opB) {
        return opA + opB;
    }

    @GetMapping("/subtract")
    public Double subtract(@RequestParam(value = "opA", required = true) Double opA,
                       @RequestParam(value = "opB", required = true) Double opB) {
        return opA - opB;
    }

    @GetMapping("/multiply")
    public Double multiply(@RequestParam(value = "opA", required = true) Double opA,
                       @RequestParam(value = "opB", required = true) Double opB) {
        return opA * opB;
    }

    @GetMapping("/divide")
    public Double plus(@RequestParam(value = "opA", required = true) Double opA,
                       @RequestParam(value = "opB", required = true) Double opB) {
        if (opB.equals(0.0)){
            return 0.0;
        }

        return opA / opB;
    }

    @GetMapping("/sqrt")
    public Double multiply(@RequestParam(value = "opA", required = true) Double opA) {
        return Math.sqrt(opA);
    }
}
