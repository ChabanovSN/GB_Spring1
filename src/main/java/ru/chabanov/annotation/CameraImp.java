package ru.chabanov.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("camera")
public class CameraImp implements Camera {
    @Autowired
    @Qualifier("bw")
    private CameraRoll cameraRoll;
    public CameraRoll getCameraRoll() {
        return cameraRoll;
    }
    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }
    public void doPhotograph(){

        System.out.println("Щелк!");
        cameraRoll.processing();

    }

}
