package david.augusto.luan.sgeservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

    @RequestMapping("/")
    public String demo() {
        return "Primeiro service";
    }
}
