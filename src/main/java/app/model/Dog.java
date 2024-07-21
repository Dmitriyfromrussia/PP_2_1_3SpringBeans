package app.model;

import org.springframework.stereotype.Component;

@Component("anyDog") //можно не прописывать ID бина
public class Dog extends Animal {
    @Override
    public String toString() {
        return "I'm a Dog";
    }
}
