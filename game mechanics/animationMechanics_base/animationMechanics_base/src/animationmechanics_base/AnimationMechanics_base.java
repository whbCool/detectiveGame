/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animationmechanics_base;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author bobjoe
 * 
 * import spritework here
 * 
 * animation engine goes here
 */
public class AnimationMechanics_base {

    private static BufferedImage spriteSheet;
    private static final int TILE_SIZE = 4;
    
    public static BufferedImage loadSpriteUP(String file) {
        
        BufferedImage sprite = null;
        
        try {
            sprite = ImageIO.read(new File ("/" + file + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return sprite;
    }
    
    public static BufferedImage getSprite(int xGrid, int yGrid) {
        
        if (spriteSheet == null) {
            spriteSheet = loadSpriteUP("AnimationSpriteSheet");
        }
        
        return spriteSheet.getSubimage(xGrid * TILE_SIZE, yGrid * TILE_SIZE, TILE_SIZE, TILE_SIZE);
    }
}