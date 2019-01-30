package ru.chabanov.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Camera camera = context.getBean("camera", CameraImp.class );
        camera.doPhotograph();
        // меняем пленку на цветную
        CameraRoll cameraRollColor = context.getBean("color", ColorCameraRoll.class );
        ((CameraImp) camera).setCameraRoll(cameraRollColor);
        camera.doPhotograph();

    }

}
