import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class inicio extends JFrame {
	private ImageIcon miImagen = new ImageIcon("Java.png");
	public inicio() {
		JFrame miFrame = new JFrame();
		miFrame.setTitle("Imagenes en Java");
		miFrame.setBounds(50, 50, 518, 518);
		miFrame.setLayout(null);
		
		JLabel miLabel = new JLabel(miImagen);
		miLabel.setBounds(0, 0, 518, 518);
		miFrame.add(miLabel);
		
		miFrame.setVisible(true);
	}
	public static void main(String[] args) {
		new inicio();
	}
}