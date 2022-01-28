import java.util.Date;

/**
 *
 * @author magnovaldo carneiro
 * RA 1713790
 */
public class Cliente {
 
	private String CPF;
	private String Nome;
	private String Telefone;
	private Date DtNasc;
        
    public Cliente() {
	}

	public Cliente(String cpf, String nome, String telefone, Date dtnascimento) {
		CPF = cpf;
		Nome = nome;
		Telefone = telefone;
		DtNasc = dtnascimento;
	} 

	public String getCPF() {
		return this.CPF;
	}
	public void setCPF(String cpf) {
		this.CPF = cpf;
	}
	public String getNome() {
		return this.Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public String getTelefone() {
		return this.Telefone;
	}
	public void setTelefone(String telefone) {
		this.Telefone = telefone;
	}
	public Date getDtNasc() {
		return this.DtNasc;
	}
	public void setDtNasc(Date dtnascimento) {
		this.DtNasc = dtnascimento;
	}	
	
}

