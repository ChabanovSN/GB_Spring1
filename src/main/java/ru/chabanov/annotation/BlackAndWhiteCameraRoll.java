package ru.chabanov.annotation;

import org.springframework.stereotype.Component;

@Component("bw")
public class BlackAndWhiteCameraRoll implements CameraRoll {
    public void processing(){
        System.out.println("-1 черно-белый кадр");
    }
}
