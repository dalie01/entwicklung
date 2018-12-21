/*
 * Created on 23.01.2010
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
/*
 * @author DV0101 on 23.01.2010 um 07:19:25 
 *
 * Main.java 
 * 
 * no Copyright
 */
package thumnails;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * <b>Class</b>Main :<br>Only for Demonstration.<br>
 * 
 * @version 1.00 on 23.01.2010 um 07:19:25
 * @author dv0101
 * <br><br>
 * create Tumbnails. <br> 
 */
public class Main {

	public static void main(String[] args) {
		
		File f = new File("c:/tmp");
		File[] files = f.listFiles();
		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			if (!file.isDirectory() && file.getName().endsWith(".JPG")) {
				try {
					BufferedImage img = ImageIO.read(file);

					AffineTransform transform = AffineTransform.getScaleInstance(0.5, 0.5);
					AffineTransformOp op = new AffineTransformOp(transform,null);
					System.out.println(img.getHeight() + img.getWidth());
					BufferedImage scaledImage = op.filter(img, null);

					ImageIO.write(scaledImage, "jpeg", new File(file.getAbsolutePath()+ "small_" + file.getName()));

				} catch (IOException e) {
					e.printStackTrace();
				}//catch
			}//endif
		}//for
	}//main

}//class Main
