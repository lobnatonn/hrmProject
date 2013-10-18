package tn.edu.esprit.erpBi.hrmProjectClient.gui.identificationFrame;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import tn.edu.esprit.erpBi.hrmProjectClient.ProducerMessenger;

public class MessengerMailing extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	private final JLabel text = new JLabel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MessengerMailing frame = new MessengerMailing();
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
	public MessengerMailing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		textField = new JTextField();
		textField.setColumns(10);

		JButton btnSendMail = new JButton("send mail");
		btnSendMail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProducerMessenger.writeMessage(textField.getText());
				JOptionPane.showMessageDialog(null,
						"a mail have been sent to M/Ms:" + textField.getText(),
						"Title", JOptionPane.INFORMATION_MESSAGE);

			}
		});

		JLabel lblTypeYourMail = new JLabel("tape your mail");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(
				Alignment.LEADING).addGroup(
				Alignment.TRAILING,
				gl_contentPane
						.createSequentialGroup()
						.addGap(73)
						.addComponent(lblTypeYourMail)
						.addPreferredGap(ComponentPlacement.RELATED, 96,
								Short.MAX_VALUE)
						.addGroup(
								gl_contentPane
										.createParallelGroup(Alignment.LEADING)
										.addComponent(btnSendMail)
										.addComponent(textField,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
						.addGap(123)));
		gl_contentPane
				.setVerticalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGap(44)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																textField,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lblTypeYourMail))
										.addPreferredGap(
												ComponentPlacement.RELATED, 88,
												Short.MAX_VALUE)
										.addComponent(btnSendMail).addGap(77)));
		contentPane.setLayout(gl_contentPane);
	}
}
