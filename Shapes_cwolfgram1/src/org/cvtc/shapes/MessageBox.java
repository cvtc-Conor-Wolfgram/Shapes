package org.cvtc.shapes;

import javax.swing.JOptionPane;

public class MessageBox implements Dialog {

	// Uses JOptionPane to show dialog boxes of passed in strings
	@Override
	public int show(String message, String title) {
		
		JOptionPane renderMessage = new JOptionPane();
		
		JOptionPane.showMessageDialog(renderMessage, message, title, JOptionPane.OK_OPTION);
		
		return JOptionPane.OK_OPTION;
	}
	
	//Default Constructor
	public MessageBox() {
		
	}

}
