import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JSeparator;

public class AnimalColorFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalColorFrame frame = new AnimalColorFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AnimalColorFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 32));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Blue", "Green", "Red"}));
		comboBox.setBounds(530, 56, 344, 39);
		contentPane.add(comboBox);
		
		JLabel lblChooseAnAnimal = new JLabel("Choose an Animal");
		lblChooseAnAnimal.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblChooseAnAnimal.setBounds(590, 15, 236, 33);
		contentPane.add(lblChooseAnAnimal);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 254, 900, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("Animal Colors");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(103, 274, 182, 33);
		contentPane.add(lblNewLabel);
	}
}
