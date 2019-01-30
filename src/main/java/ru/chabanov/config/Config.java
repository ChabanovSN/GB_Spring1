package ru.chabanov.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    CameraRoll cameraRollC(){
        return  new ColorCameraRoll();
    }
    CameraRoll cameraRollBW(){
        return  new BlackAndWhiteCameraRoll();
    }

    @Bean(name = "cameraC")
    Camera cameraM(){
        Camera camera = new CameraImp();
        ((CameraImp) camera).setCameraRoll(cameraRollC());
        return camera;
    }
    @Bean(name = "cameraBW")
    Camera cameraBW(){
        Camera camera = new CameraImp();
        ((CameraImp) camera).setCameraRoll(cameraRollBW());
        return camera;
    }

}
