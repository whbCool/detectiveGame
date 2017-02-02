/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animationmechanics_base;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author bobjoe
 */
public class animationMechanics_animation {
    private int frame_count;
    private int frame_delay;
    private int frame_current;
    private int frame_animationDirection;
    private int frames_total;
    
    private boolean frame_stop;
    
    private List<animationMechanics_frame> frames = new ArrayList<animationMechanics_frame>();
    
    public animationMechanics_animation(BufferedImage[] frames, int frame_delay) {
        this.frame_delay = frame_delay;
        this.frame_stop = true;
        
        for (BufferedImage frame : frames) {
            addFrame(frame, frame_delay);
        }
        
        this.frame_count = 0;
        this.frame_delay = frame_delay;
        this.frame_current = 0;
        this.frame_animationDirection = 1;
        this.frames_total = this.frames.size();
             
    }
    
    public void start() {
        if (!frame_stop) {
            return;
        }
        
        if (frames.size() == 0) {
            return;
        }
        
        frame_stop = false;
    }
    
    public void stop() {
        if (frames.size() == 0) {
            return;
        }
        
        frame_stop = true;
    }
    
    public void restart() {
        if (frames.size() == 0) {
            return;
        }
    }
    
    private void frame_add(BufferedImage frame, int duration) {
        if (duration <= 0) {
            System.err.println("Bad duration:" + duration);
            throw new RuntimeException("Bad duration:" + duration);
        }
        
        frames.add(new animationMechanics_frame(frame, duration));
        frame_current = 0;
    }
    
    public void update() {
        if (!frame_stop) {
            frame_count++;
            
            if (frame_count > frame_delay) {
                frame_count = 0;
                frame_current += frame_animationDirection;
                
                if (frame_current > frames_total - 1);
                    frame_current = 0;
            }
            else if (frame_current < 0) {
                frame_current = frames_total - 1;
            }
        }
    }

    private void addFrame(BufferedImage frame, int frame_delay) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
