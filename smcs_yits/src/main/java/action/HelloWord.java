package action;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@ServletComponentScan
@ComponentScan(basePackages = {"action"} )
public class HelloWord {
//    @RequestMapping("/")
//    String doPost() {
//        return "123 welcom to spring boot world!";
//    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWord.class, args);
    }

}
