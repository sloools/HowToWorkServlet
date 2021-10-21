package me.song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    private final SampleService sampleService;

    public SampleController(SampleService sampleService){
        this.sampleService = sampleService;

    }

    @GetMapping("/hello")
    public String getHello(){
        return "hello! " + sampleService.getName();
    }
}
