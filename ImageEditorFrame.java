import javax.swing.JFrame;


public class ImageEditorFrame extends JFrame {
	public ImageEditorFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		ImageEditorFrame editorFrame = new ImageEditorFrame();
	}
}
