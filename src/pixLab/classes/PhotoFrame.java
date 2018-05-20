package pixLab.classes;
import java.awt.Dimension;

import javax.swing.JFrame;
import pixLab.classes.PhotoController;
import pixLab.classes.PhotoPanel;

public class PhotoFrame extends JFrame
{
	private PhotoPanel basePanel;
	private PhotoController baseController;
	
	public PhotoFrame(PhotoController baseController)
	{
		super();
		this.baseController = baseController;
		basePanel = new PhotoPanel(baseController);
		
		
		setupFrame();
	}
	

	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Shapes are amazing");
		this.setSize(new Dimension(1000, 1000));
		this.setResizable(false);
		this.setVisible(true);
		
	}
}