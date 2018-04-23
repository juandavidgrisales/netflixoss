import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by grisales on 4/23/18.
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServiceApplication {
    public static void main (String [] args) {
        SpringApplication.run(ConfigServiceApplication.class, args);
    }
}
