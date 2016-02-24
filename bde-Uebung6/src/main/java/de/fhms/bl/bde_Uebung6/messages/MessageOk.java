package de.fhms.bl.bde_Uebung6.messages;

import javax.swing.JOptionPane;

public class MessageOk {
	public static void main( String[] args ){
		String header = "Erfolg!";
		String content = "Oozie Workflow war erfolgreich!";

		JOptionPane.showMessageDialog(null,
				content,
				header,					      
				JOptionPane.WARNING_MESSAGE);

		System.exit(0);    
		}
}
