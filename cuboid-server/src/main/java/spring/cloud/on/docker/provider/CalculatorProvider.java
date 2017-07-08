package spring.cloud.on.docker.provider;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by viki on 17-7-7.
 */
@FeignClient(value = "calculator-service", path = "/calc/api")
public interface CalculatorProvider {
    @RequestMapping(method = RequestMethod.GET, value = "add")
    Double add(@RequestParam(value = "opA", required = true) Double opA,
               @RequestParam(value = "opB", required = true) Double opB);

    @GetMapping("/multiply")
    Double multiply(@RequestParam(value = "opA", required = true) Double opA,
                    @RequestParam(value = "opB", required = true) Double opB);
}
