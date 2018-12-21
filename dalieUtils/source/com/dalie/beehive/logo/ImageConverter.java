package com.dalie.beehive.logo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.awt.image.ImageProducer;
import java.awt.image.RGBImageFilter;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageConverter {

	public static void main(String[] args) throws IOException {


		File folder = new File( System.getProperty("user.dir") + 
				"\\src\\resources\\dalieUtils\\images");
		File[] listOfFiles = folder.listFiles();
		
		for (File file : listOfFiles) {
			if (file.isFile()) {
				String outputFileName = System.getProperty("user.dir") + 
						"\\src\\resources\\dalieUtils\\images\\converted\\" + file.getName();
				
				BufferedImage source = ImageIO.read(file);  
				
				int color = source.getRGB(2, 0);  
				
				Image imageWithTransparency = makeColorTransparent(
						source, new Color(112,112,112),new Color(200, 200, 255));  
				BufferedImage transparentImage = imageToBufferedImage(imageWithTransparency);  
				
				File out = new File(outputFileName);  
				ImageIO.write(transparentImage, "PNG", out);  
			}
		}
		
	}
	
	/** 
	 * Make provided image transparent wherever color matches the provided color. 
	 * 
	 * @param im BufferedImage whose color will be made transparent. 
	 * @param color Color in provided image which will be made transparent. 
	 * @return Image with transparency applied. 
	 */  
	public static Image makeColorTransparent(final BufferedImage im, final Color c1,final Color c2) {  
		// Primitive test, just an example
		final int r1 = c1.getRed();
		final int g1 = c1.getGreen();
		final int b1 = c1.getBlue();
		final int r2 = c2.getRed();
		final int g2 = c2.getGreen();
		final int b2 = c2.getBlue();
		ImageFilter filter = new RGBImageFilter()
		{
			public final int filterRGB(int x, int y, int rgb)
			{
				int r = (rgb & 0xFF0000) >> 16;
				int g = (rgb & 0xFF00) >> 8;
				int b = rgb & 0xFF;
				if (r >= r1 && r <= r2 &&
						g >= g1 && g <= g2 &&
						b >= b1 && b <= b2)
				{
					// Set fully transparent but keep color
					return rgb & 0xFFFFFF;
				}
				return rgb;
			}
		};

		final ImageProducer ip = new FilteredImageSource(im.getSource(), filter);  
		return Toolkit.getDefaultToolkit().createImage(ip);  
	} /* makeColorTransparent */   
	
	/** 
	 * Convert Image to BufferedImage. 
	 * 
	 * @param image Image to be converted to BufferedImage. 
	 * @return BufferedImage corresponding to provided Image. 
	 */  
	private static BufferedImage imageToBufferedImage(final Image image) {  
		final BufferedImage bufferedImage =  
				new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);  
		final Graphics2D g2 = bufferedImage.createGraphics();  
		g2.drawImage(image, 0, 0, null);  
		g2.dispose();  
		return bufferedImage;  
	} /* imageToBufferedImage */ 
	
}
