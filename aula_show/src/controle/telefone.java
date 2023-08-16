package controle;

public class telefone {

	private int idContato;
	private char tipoContato;
	private String numero;
	private int pessoa_idPessoa;
	public int getIdContato() {
		return idContato;
	}
	public void setIdContato(int idContato) {
		this.idContato = idContato;
	}
	public char getTipoContato() {
		return tipoContato;
	}
	public void setTipoContato(char tipoContato) {
		this.tipoContato = tipoContato;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getPessoa_idPessoa() {
		return pessoa_idPessoa;
	}
	public void setPessoa_idPessoa(int pessoa_idPessoa) {
		this.pessoa_idPessoa = pessoa_idPessoa;
	}
	
}

