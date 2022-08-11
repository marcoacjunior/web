package model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nomes;
	@Column
	private String sobrenomes;
	@Column
	private String endereco;
	@Column
	private String email;
	@Column
	private String telefone;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomes() {
		return nomes;
	}
	public void setNomes(String nomes) {
		this.nomes = nomes;
	}
	public String getSobrenomes() {
		return sobrenomes;
	}
	public void setSobrenomes(String sobrenomes) {
		this.sobrenomes = sobrenomes;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nomes=" + nomes + ", sobrenomes=" + sobrenomes + ", endereco=" + endereco
				+ ", email=" + email + ", telefone=" + telefone + "]";
	}


	
}
