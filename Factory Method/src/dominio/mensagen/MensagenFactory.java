package dominio.mensagen;

public class MensagenFactory {

	public static Mensagem getMensagem(int i) {
		if (i == 1) {
			return new  MensagemSMS();
		}else if(i == 2) {
			return new MensagenEmail();
		}else {
			return new 	MensagemSMS();
		}
 
	}
	
}
