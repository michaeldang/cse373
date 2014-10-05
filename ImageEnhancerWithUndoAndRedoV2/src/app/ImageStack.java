package app;

import java.io.*;
import java.util.ArrayList;
import java.awt.image.BufferedImage;

public class ImageStack {
	private ArrayList<BufferedImage> imageStack;
	private boolean wasPoppedLast = false;
	
	public ImageStack() {
		imageStack = new ArrayList<BufferedImage>();
	}
	
	public void push(BufferedImage givenImage) {
		imageStack.add(givenImage);
		wasPoppedLast = false;
	}
	
	public BufferedImage pop() throws Exception {
		try {
			BufferedImage returnImage = imageStack.remove(imageStack.size() - 1);
			wasPoppedLast = true;
			return returnImage;
		} catch (Exception stackEmptyError) {
			return null;
		}
	}
	
	public BufferedImage peek() throws Exception {
		try {
			return imageStack.get(imageStack.size() - 1);
		} catch (Exception e) {
			return null;
		}
	}
	
	public boolean isEmpty() {
		return imageStack.isEmpty();
	}
	
	public void clear() {
		imageStack.clear();
		wasPoppedLast = false;
	}
	
	public boolean popWasLast() {
		return wasPoppedLast;
	}
	
	public int getSize() {
		return imageStack.size();
	}
}
