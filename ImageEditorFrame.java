import java.awt.*;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;


public class ImageEditorFrame extends JFrame {
	ImageEditorPanel panel = new ImageEditorPanel();
	public ImageEditorFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);
		
		setTitle("Jan ist bloed!");
		
		add(panel);
	}

	private void setDummyImage(){ 
		BufferedImage bufferedImage = new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB); 
		Graphics g = bufferedImage.getGraphics(); 
		g.setColor(Color.YELLOW); 
		g.fillOval(10, 10, 380, 280); 
		panel.setImage(bufferedImage); 
		}

	public static void main(String[] args) {
		ImageEditorFrame editorFrame = new ImageEditorFrame();
		
		
	}
}
