package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Qualifier("anyDog")
    @Autowired
    private Animal animal;

    @Autowired
    private Timer timerBean;

    public Timer getTimer() {
        return timerBean;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timerBean.getTime()); // было System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }


}
