package spring.cloud.on.docker.provider;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by viki on 17-7-7.
 */

@FeignClient(value = "formula-service", path = "/formula/math")
public interface FormulaProvider {
    @RequestMapping(method = RequestMethod.GET, value = "pythagorean")
    Double pythagorean(@RequestParam(value = "opA", required = true) Double opA,
               @RequestParam(value = "opB", required = true) Double opB);
}