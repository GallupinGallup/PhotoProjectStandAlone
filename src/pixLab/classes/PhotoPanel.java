package pixLab.classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

import pixLab.classes.PhotoController;
import pixLab.classes.PictureTester;

public class PhotoPanel extends JPanel {
	private PhotoController baseController;
	private PictureTester photo;
	private SpringLayout baseLayout;
	private JButton viewButton;
	private JTextField oldFileName;
	private JTextField newFileName;
	private JButton nameSelectorButton;
	// private JFileChooser fileChoser;
	private JButton saveButton;
	private JButton exploreButton;
	private JComboBox editSelector;

	private String oldFileNameString;
	private String newFileNameString;
	String[] editTypes = {"selcect edit type here", "Remove blue", "Mirror vertical left to right", "Miror vertical right to left",
			"Mirror diagonal downhill", "Mirror diagonal uphill", "Mirror horizantal bottom to top","Edge detection", "Randomize", "Glitch Art", "" };

	public PhotoPanel(PhotoController baseController) {
		super();
		
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		viewButton = new JButton("Click to see your photo!");

		oldFileName = new JTextField("Enter name of file here!");
		baseLayout.putConstraint(SpringLayout.WEST, oldFileName, 94, SpringLayout.WEST, this);

		newFileName = new JTextField("Enter what you want the name of your edited file to be!");

		// fileChoser = new JFileChooser();
		nameSelectorButton = new JButton("Click here to submit your chosen file!");

		saveButton = new JButton("Click here to save your photo!");

		exploreButton = new JButton("Click here to see your photo!");
		
		editSelector = new JComboBox(editTypes);

		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel() {
		this.setLayout(baseLayout);
		this.setSize(new Dimension(1000, 1000));
		this.add(viewButton);
		this.add(oldFileName);
		this.add(newFileName);
		// this.add(fileChoser);
		this.add(nameSelectorButton);
		this.add(saveButton);
		this.add(editSelector);
	}

	private void setupLayout() {
		baseLayout.putConstraint(SpringLayout.NORTH, viewButton, 222, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, viewButton, 0, SpringLayout.WEST, newFileName);
		baseLayout.putConstraint(SpringLayout.NORTH, saveButton, 68, SpringLayout.SOUTH, viewButton);
		baseLayout.putConstraint(SpringLayout.WEST, saveButton, 382, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, nameSelectorButton, 222, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, nameSelectorButton, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, newFileName, 109, SpringLayout.EAST, oldFileName);
		baseLayout.putConstraint(SpringLayout.SOUTH, newFileName, -808, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, oldFileName, 0, SpringLayout.NORTH, newFileName);
	}

	private void setupListeners() {
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent clicked) {
				newFileNameString = newFileName.getText();
			}
		});
		nameSelectorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent clicked) {
				PictureTester.setFilename(oldFileName.getText());
			}
		});
		exploreButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent clicked) {
				oldFileNameString = oldFileName.getText();
			}
		});

	}

	public String GetOldFile() {
		return oldFileNameString;
	}

	public String GetNewFile() {
		return newFileNameString;
	}
}