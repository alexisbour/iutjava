package edu.iut.gui.listeners;

import javax.swing.JOptionPane;

public class ApplicationInfoMessageDialog extends
		AbstractApplicationMessageDialog {

	@Override
		public void showMessage(String level, String message) {
			/** UTILISER l'AIDE FORUNIR DANS L'ENNONCE */
			JOptionPane.showMessageDialog(null, message,level,JOptionPane.INFORMATION_MESSAGE,null);
		}

}

