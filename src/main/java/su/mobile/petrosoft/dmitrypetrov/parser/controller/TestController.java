package su.mobile.petrosoft.dmitrypetrov.parser.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import su.mobile.petrosoft.dmitrypetrov.parser.service.test.TestService;



@RestController
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @PostMapping(value = "/test")
    public void convertXmlToJson(@RequestBody String json) throws JsonProcessingException {
        testService.test(json);
    }
}
