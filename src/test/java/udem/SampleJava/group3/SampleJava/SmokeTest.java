package udem.SampleJava.group3.SampleJava;

import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.boot.test.context.SpringBootTest;
import udem.SampleJava.servingwebcontent.ServingWebContentApplication;

@SpringBootTest(classes={ServingWebContentApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SmokeTest {
    /*
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private GreetingController controller;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

    @Test
    public void IndexShouldReturnDefaultMessage() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:"+ port+"/",
                String.class)).contains("Greetings from Spring Boot!");
    }

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/greeting",
                String.class)).contains("Hello, World!");
    }

    @Test
    public void greetingShouldReturntMessageWithParam() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/greeting?name=juan",
                String.class)).contains("Hello, juan!");
    }
    */
}
