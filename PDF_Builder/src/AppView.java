
import java.awt.event.ActionListener;

import javax.swing.*;

public class AppView extends JFrame{
	
	private JButton createButton = new JButton("Create PDF");
	private JTextArea inputTextArea = new JTextArea(40,40);
	private JTextField pdfTitle = new JTextField(25);
	private JLabel titleLabel = new JLabel("PDF title: ");
	private String confirmationMsg;
	private JLabel confirmationLabel = new JLabel(confirmationMsg);
	
	
	AppView(){
		JPanel mainPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 800);
		
		mainPanel.add(titleLabel);
		mainPanel.add(pdfTitle);
		mainPanel.add(inputTextArea);
		mainPanel.add(createButton);
		
		this.getContentPane().add(mainPanel);
	}
	
	public String getText(){
		return inputTextArea.getText();
	}
	
	public String getTitle(){
		return pdfTitle.getText();
	}
	
	public void addCreateListener(ActionListener listenerForCreateButton){
		createButton.addActionListener(listenerForCreateButton);
	}
	
	public void displayConfirmationMessage(String message){
		this.getContentPane().add(confirmationLabel);
	}
	
	protected void setConfirmationMessage(String title){
		confirmationMsg = "Successfuly created "+title+".pdf";
	}

	public void displayErrorMessage(String message) {
		JOptionPane.showMessageDialog(this, message);
	}
}
