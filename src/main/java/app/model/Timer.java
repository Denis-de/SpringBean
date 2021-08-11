package app.model;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Timer extends Animal {

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
