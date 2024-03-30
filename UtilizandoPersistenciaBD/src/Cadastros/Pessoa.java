package Cadastros;

public class Pessoa { //Classe, atributos da classe
	private int idPessoa;
	private String nomePessoa;
	private String email;
	
	public Pessoa() {		//construtor
		
	}
	
	public Pessoa(String nomePessoa, String email) {   //ALTERAÇÕES (nome+email)
		super();
		this.nomePessoa = nomePessoa;
		this.email = email;
	}
	
	public Pessoa (int idPessoa, String nomePessoa, String email) {  //INCLUSÕES 
		super();
		this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", nomePessoa=" + nomePessoa + ", email=" + email + "]";
	}

	public int getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;	
	
}
}
