package me.jaga.basics.springboot.gradle.dao;

import org.springframework.stereotype.Component;

@Component
public class GreetingDAO {

    public String getGreetingMessage() {
        return "Welcome Greetings!";
    }
}
