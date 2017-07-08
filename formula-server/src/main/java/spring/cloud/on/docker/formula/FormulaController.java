package spring.cloud.on.docker.formula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.on.docker.provider.CalculatorProvider;

/**
 * Created by viki on 17-7-7.
 */
@RestController
@RequestMapping("/formula/math")
public class FormulaController {

    @Autowired
    private CalculatorProvider calculatorProvider;

    @GetMapping("/pythagorean")
    public Double pythagorean(@RequestParam(value = "opA", required = true) Double opA,
                              @RequestParam(value = "opB", required = true) Double opB) {

        Double a = calculatorProvider.multiply(opA, opA);
        Double b = calculatorProvider.multiply(opB, opB);
        Double c = calculatorProvider.add(a, b);
        Double d = calculatorProvider.sqrt(c);

        return d;
    }
}
