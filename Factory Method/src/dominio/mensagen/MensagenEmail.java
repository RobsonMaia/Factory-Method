package dominio.mensagen;

import javax.swing.JOptionPane;

public class MensagenEmail implements Mensagem {
	
	@Override
	public void enviar(String mensagem) {
		JOptionPane.showMessageDialog(null,"E-MAIL: " + mensagem);
	}

}
