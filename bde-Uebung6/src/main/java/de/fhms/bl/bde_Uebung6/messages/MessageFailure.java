package de.fhms.bl.bde_Uebung6.messages;

import javax.swing.JOptionPane;

public class MessageFailure {
	public static void main( String[] args ){
		String header = "Fehler!";
		String content = "Oozie Workflow war leider nicht erfolgreich erfolgreich!";

		JOptionPane.showMessageDialog(null,
				content,
				header,					      
				JOptionPane.WARNING_MESSAGE);

		System.exit(0);
	}
}
