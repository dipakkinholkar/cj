package com.green.screenshot;
import java.awt.Robot;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
 
public class takeScreenShop {

	
	public static void main(String[] args) {

		System.out.print("execution started...");
			try {
				
					
			Robot robot=new Robot();  //used for generate native system input events.
			
			Rectangle r=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			
			BufferedImage screenshot=robot.createScreenCapture(r);
			
			ImageIO.write(screenshot, "JPG" , new File("C:\\Users\\Dipak Kinholkar\\OneDrive\\Desktop\\screen\\screen.jpg"));
		
			}
			
			catch(Exception e)
			{
				
				
				e.printStackTrace();
			}
		
		
		
	}

}
