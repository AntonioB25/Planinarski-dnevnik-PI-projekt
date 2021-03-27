package fer.hr.inverzni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3000/")
@SpringBootApplication
public class InverzniApplication {

    public static void main(String[] args) {
        SpringApplication.run(InverzniApplication.class, args);
    }

}
