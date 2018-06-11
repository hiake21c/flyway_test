package kr.co.jongminkim.flywaydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

@SpringBootApplication
public class FlywaydemoApplication {

 /*   @Autowired
    JdbcTemplate jdbcTemplate;
*/
    public static void main(String[] args) {
        SpringApplication.run(FlywaydemoApplication.class, args);
    }

//    @Bean
    /*public void runner() {
        // Create the Flyway instance
        Flyway flyway = new Flyway();

        // Point it to the database
        flyway.setDataSource("jdbc:h2:file:target/foobar", "sa", null);

        // Start the migration
        flyway.migrate();

    }*/
}
