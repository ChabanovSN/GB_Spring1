package ru.chabanov.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context-app.xml");
        Camera cameraC = context.getBean("cameraC", CameraImp.class );
        Camera cameraBW = context.getBean("cameraBW", CameraImp.class );
        cameraC.doPhotograph();
        cameraBW.doPhotograph();
    }

}
