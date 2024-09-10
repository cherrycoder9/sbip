package code.master.sbip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String helloWorld() {
        return "<h1>헬로월드</h1>";
    }
}
