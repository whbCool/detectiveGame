/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animationmechanics_base;

import java.awt.image.BufferedImage;

/**
 *
 * @author bobjoe
 */
public class animationMechanics_frame {
    
    private BufferedImage frame;
    private int duration;
    
public animationMechanics_frame(BufferedImage frame, int duration) {
        this.frame = frame;
        this.duration = duration;
    }
    
    public BufferedImage get_frame() {
        return frame;
    }
    
    public void frame_set(BufferedImage frame) {
        this.frame = frame;
    }
    
    public int get_duration() {
        return duration;
    }
    
    public void set_duration() {
        this.duration = duration;
    }
}
