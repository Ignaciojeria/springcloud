package openj9.example.openj9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Openj9Application {

    public static void main(String[] args) {
        SpringApplication.run(Openj9Application.class, args);
    }

    @GetMapping("/hello/{to}")
    public String helloWorld(@PathVariable String to) {
        return "hello ".concat(to);
    }

}
