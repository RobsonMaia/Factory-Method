package dominio;

import javax.swing.JOptionPane;

import dominio.mensagen.Mensagem;
import dominio.mensagen.MensagenFactory;

public class Main {
	
	public static void main (String[] args) {
		
		String texto = JOptionPane.showInputDialog(null);
		
		Mensagem mensagem = MensagenFactory.getMensagem(1); /*alterando de 1 pra 2
		altera de sms pra email*/
		mensagem.enviar(texto);
	}

}
