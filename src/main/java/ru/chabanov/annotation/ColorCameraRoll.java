package ru.chabanov.annotation;

import org.springframework.stereotype.Component;

@Component ("color")
public class ColorCameraRoll implements CameraRoll {

    public void processing() {

        System.out.println("-1 цветной кадр");
    }
}
