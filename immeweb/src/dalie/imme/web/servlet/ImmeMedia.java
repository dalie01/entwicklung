package dalie.imme.web.servlet;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import dalie.imme.design.sf.internal.navigation.Navigation;

public class ImmeMedia implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		/*
		File f = new File(
				arg0.getServletContext().getRealPath(File.separator) + 
					Navigation.DIR_WHERE_FOUND_NEW_PICTURE);
		
			File[] files = f.listFiles();
			for (int i = 0; i < files.length; i++) {
				File file = files[i];
				System.out.println(file.getName());
				if (file.getName().endsWith(".JPG")
					|| file.getName().endsWith(".jpg")) {
					try {
						BufferedImage img = ImageIO.read(file);
						System.out.println(file.getName() + ":" + img.getWidth() + ":" + img.getHeight());
						
						AffineTransform transform = AffineTransform.getScaleInstance(0.5, 0.5);
						AffineTransformOp op = new AffineTransformOp(transform,null);
						
						BufferedImage scaledImage = op.filter(img, null);
						String pathToWeb = arg0.getServletContext().getRealPath(File.separator) + Navigation.DIR_IMMEWEB_PICTURE;
						File newfile = new File(pathToWeb + file.getName());
						
						ImageIO.write(scaledImage, "jpeg", newfile);
						
						//file.delete();
						  
						 
					} catch (IOException e) {
						e.printStackTrace();
					}//catch
				}//endif
			}//for
		
		
		 */
	}
}
