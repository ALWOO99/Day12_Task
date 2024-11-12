package vttp.batchb.ssf.day12task.controller;

import java.security.SecureRandom;
import java.util.Random;

public class Constants {

    public static final String[] PICTURES = {
        "number0.jpg", "number1.jpg", "number2.jpg", "number3.jpg", "number4.jpg",
        "number5.jpg", "number6.jpg", "number7.jpg", "number8.jpg", "number9.jpg",
        "number10.jpg", "number11.jpg", "number12.jpg", "number13.jpg", "number14.jpg",
        "number15.jpg", "number16.jpg", "number17.jpg", "number18.jpg", "number19.jpg",
        "number20.jpg", "number21.jpg", "number22.jpg", "number23.jpg", "number24.jpg",
        "number25.jpg", "number26.jpg", "number27.jpg", "number28.jpg", "number29.jpg",
        "number30.jpg"
    };

    // Generates a list of `count` random picture URLs
    public static String generatePic() {

        Random rnd = new SecureRandom();
        int idx = rnd.nextInt(PICTURES.length);
        

        return "/images/%s".formatted(PICTURES[idx]);
    }
}
