import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class AnimalColorFrame extends JFrame {

	private JPanel contentPane;
	public String answer = "";

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
		setTitle("Animal Color");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);		
		
		JLabel imgLabel = new JLabel("");
		imgLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		imgLabel.setBounds(0, 0, 537, 352);
		contentPane.add(imgLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(comboBox.getSelectedItem().toString() == "Cat"){
					imgLabel.setIcon(new ImageIcon("C:\\Users\\Alex Armatas\\Desktop\\testcat.png"));
					answer = "Gray";
				}else if(comboBox.getSelectedItem().toString() == "Bear"){
					imgLabel.setIcon(new ImageIcon("C:\\Users\\Alex Armatas\\Desktop\\testbear.jpg"));
					answer = "Brown";
				}else if(comboBox.getSelectedItem().toString() == "Dog"){
					imgLabel.setIcon(new ImageIcon("C:\\Users\\Alex Armatas\\Desktop\\testdog.jpg"));
					answer = "Yellow";
				}
			}
		});
		
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 32));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Dog", "Cat", "Bear"}));
		comboBox.setBounds(541, 208, 344, 39);
		contentPane.add(comboBox);
		
		JLabel lblChooseAnAnimal = new JLabel("Choose an Animal");
		lblChooseAnAnimal.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblChooseAnAnimal.setBounds(590, 147, 236, 33);
		contentPane.add(lblChooseAnAnimal);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 350, 900, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("Animal Colors");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(95, 350, 182, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblCorrect = new JLabel("Correct: 0");
		lblCorrect.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblCorrect.setBounds(26, 393, 182, 33);
		contentPane.add(lblCorrect);
		
		JLabel lblIncorrect = new JLabel("Incorrect: 0");
		lblIncorrect.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblIncorrect.setBounds(26, 449, 182, 33);
		contentPane.add(lblIncorrect);
		
		JLabel lblWhatColorIs = new JLabel("What Color is the Animal?");
		lblWhatColorIs.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblWhatColorIs.setBounds(291, 481, 356, 33);
		contentPane.add(lblWhatColorIs);
		
		JLabel lblWhatColorIs_1 = new JLabel("What color is it?");
		lblWhatColorIs_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblWhatColorIs_1.setBounds(590, 350, 236, 33);
		contentPane.add(lblWhatColorIs_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "Brown", "Black", "Blue", "Red", "Green", "Yellow", "White", "Orange", "Grey", "Pink"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		comboBox_1.setBounds(541, 414, 344, 39);
		contentPane.add(comboBox_1);
	}
}
