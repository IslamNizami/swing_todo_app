package org.example;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class SoundUtil {

    public static void playSound(String soundFilename) {
        try {
            File soundFile = new File(soundFilename);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
