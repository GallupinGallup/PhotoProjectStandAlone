package pixLab.classes;

import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import pixLab.classes.PhotoController;
import pixLab.classes.PhotoPanel;

/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Tyler Gallup
 */
public class PictureTester {
	private static String filename;
	static Picture file = new Picture (filename);
	public static void setFilename(String file) {
		filename = file;
	}
	/** Method to test zeroBlue */
	public static void testZeroBlue() {
		file.explore();
		file.zeroBlue();
		file.explore();
	}

	/** Method to test mirrorVertical */
	public static void testMirrorVertical() {
		
		file.explore();
		file.mirrorVertical();
		file.explore();
	}

	public static void testMirrorVerticalRightToLeft() {
		Picture bike = new Picture("blueMotorcycle.jpg");
		bike.explore();
		bike.mirrorVerticalRightToLeft();
		bike.explore();
	}

	public static void testMirrorDiagonal() {
		file.explore();
		file.mirrorDiagonal();
		file.explore();

	}

	public static void testMirrorGull() {
		file.mirrorGull();
		file.explore();

	}

	public static void testMirrorDiagonalUphill() {
		file.explore();
		file.mirrorDiagonalUphill();
		file.explore();
	}

	public static void testmirrorHorizantalBottomToTop() {
		file.explore();
		file.mirrorHorizantalBottomToTop();
		file.explore();
	}

	/** Method to test mirrorTemple */
	public static void testMirrorTemple() {
		file.explore();
		file.mirrorTemple();
		file.explore();
	}

	/** Method to test the collage method */
	public static void testCollage() {
		file.createCollage();
		file.explore();
	}

	public static void testEdgeDetection4Pic2() {
		file.edgeDetection(4);
		file.repaint();
//		file.setTitle("Option 6");
//		file.explore();
	}

		public static void testfullRandom() {
		file.fullRandom();
		file.explore();
		file.Glitch();
		file.explore();
		file.fullRandomGreen();
		file.explore();
		file.fullRandomrRed();
		file.explore();
	}

	public static void ValMeme() {
		file.ValMeme();
		file.explore();
		file.write("ValentinesDayMeme!");
	}

	public static void TestGlitchArt() {
		file.GlitchArt();
		file.explore();
	}
	
	public static void save() {
		File f = new File("MyFile.png");
		try {
			ImageIO.write(file.buffConverter(), "jpg", new File("/Users/robertgallup/Desktop/SebastianEdited2.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Main method for testing. Every class can have a main method in Java
	 */
	public static void main(String[] args) {
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
		PhotoController runController = new PhotoController();
		runController.start();
	}

}