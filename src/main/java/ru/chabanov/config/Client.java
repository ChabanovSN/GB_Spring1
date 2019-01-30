package ru.chabanov.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Camera cameraC = context.getBean("cameraC", CameraImp.class );
        Camera cameraBW = context.getBean("cameraBW", CameraImp.class );
        cameraC.doPhotograph();
        cameraBW.doPhotograph();
    }

}
