package me.song;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

// Controller만 스캔하는 애들
@Configuration
@ComponentScan(useDefaultFilters = false, includeFilters = @ComponentScan.Filter(Controller.class)) // 다 스캔하지 않고, controller만 스캔함
public class WebConfig {
}
