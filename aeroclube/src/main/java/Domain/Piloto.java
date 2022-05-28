package Domain;

import javax.persistence.*;

@Entity
public class Piloto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	@Column(nullable = false)
	String nome, aviao_preferido;
	
	public Piloto() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAviao_preferido() {
		return aviao_preferido;
	}

	public void setAviao_preferido(String aviao_preferido) {
		this.aviao_preferido = aviao_preferido;
	}

	@Override
	public String toString() {
		return "piloto [id=" + id + ", nome=" + nome + ", aviao_preferido=" + aviao_preferido + "]";
	}
	
	
	
}
