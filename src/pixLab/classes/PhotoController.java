package pixLab.classes;

import pixLab.classes.PhotoFrame;

public class PhotoController {
private PhotoFrame baseFrame;
	
	public void start()
	{
		baseFrame = new PhotoFrame(this);
	}
}
