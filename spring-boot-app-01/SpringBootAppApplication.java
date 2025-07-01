@SpringBootApplication
@RestController
public class SpringBootAppApplication {

   @RequestMapping("/")
   public String home() {
       return "Hello Kubernetes!";
   }

   public static void main(String[] args) {
       SpringApplication.run(SpringBootAppApplication.class, args);
   }

}