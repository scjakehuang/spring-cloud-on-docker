package spring.cloud.on.docker.cuboid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.on.docker.provider.CalculatorProvider;
import spring.cloud.on.docker.provider.FormulaProvider;

/**
 * Created by viki on 17-7-7.
 */
@RestController
@RequestMapping("/cuboid")
public class CuboidController {
    @Autowired
    private FormulaProvider formulaProvider;
    @Autowired
    private CalculatorProvider calculatorProvider;

    @GetMapping("/area")
    public Double add(@RequestParam(value = "length", required = true) Double opA,
                      @RequestParam(value = "width", required = true) Double opB) {
        return calculatorProvider.multiply(opA, opB);
    }

    @GetMapping("/diagonal")
    public Double diagonal(@RequestParam(value = "length", required = true) Double opA,
                      @RequestParam(value = "width", required = true) Double opB) {
        return formulaProvider.pythagorean(opA, opB);
    }
}
