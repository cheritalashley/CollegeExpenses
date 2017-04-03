package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JList;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Label;
import java.awt.GridLayout;
import java.awt.TextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.Button;
import java.awt.Frame;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Checkbox;
import java.awt.Font;

public class GUIChallange {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=80,38
	 */
	private final JLabel Languages_1 = DefaultComponentFactory.getInstance().createTitle("New JGoodies title");
	/**
	 * @wbp.nonvisual location=70,38
	 */
	private final JLabel lblGuichallange = DefaultComponentFactory.getInstance().createTitle("GUIChallange");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIChallange window = new GUIChallange();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIChallange() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Programming Languages");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		Label fnLabel = new Label("First Name");
		fnLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		frame.getContentPane().add(fnLabel, "2, 2");
		
		TextField fntextField = new TextField();
		frame.getContentPane().add(fntextField, "4, 2, 9, 1");
		
		Label lnlabel = new Label("Last Name");
		lnlabel.setFont(new Font("Arial", Font.PLAIN, 14));
		frame.getContentPane().add(lnlabel, "2, 4");
		
		TextField lntextField = new TextField();
		frame.getContentPane().add(lntextField, "4, 4, 9, 1");
		
		Label languageslabel = new Label("Languages:");
		languageslabel.setFont(new Font("Arial", Font.PLAIN, 14));
		frame.getContentPane().add(languageslabel, "2, 6, 7, 1");
		
		Checkbox javacheckbox = new Checkbox("Java");
		javacheckbox.setFont(new Font("Arial", Font.PLAIN, 12));
		frame.getContentPane().add(javacheckbox, "2, 8");
		
		Checkbox ccheckbox = new Checkbox("C");
		ccheckbox.setFont(new Font("Arial", Font.PLAIN, 12));
		frame.getContentPane().add(ccheckbox, "4, 8");
		
		Checkbox phpcheckbox = new Checkbox("PHP");
		phpcheckbox.setFont(new Font("Arial", Font.PLAIN, 12));
		frame.getContentPane().add(phpcheckbox, "6, 8");
		
		Checkbox htmlcheckbox = new Checkbox("HTML");
		htmlcheckbox.setFont(new Font("Arial", Font.PLAIN, 12));
		frame.getContentPane().add(htmlcheckbox, "2, 10");
		
		Checkbox pythoncheckbox = new Checkbox("Python");
		pythoncheckbox.setFont(new Font("Arial", Font.PLAIN, 12));
		frame.getContentPane().add(pythoncheckbox, "4, 10");
		
		Checkbox cpluspluscheckbox = new Checkbox("C++");
		cpluspluscheckbox.setFont(new Font("Arial", Font.PLAIN, 12));
		frame.getContentPane().add(cpluspluscheckbox, "6, 10");
		
		Button exitbutton = new Button("Exit");
		exitbutton.setActionCommand("System.exit(0)");
		exitbutton.setFont(new Font("Arial", Font.BOLD, 14));
		frame.getContentPane().add(exitbutton, "9, 10, 4, 1");		
	}
	
}


