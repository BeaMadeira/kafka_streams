package Data;

import javax.persistence.*;
import java.util.List;

@Entity
public class Gestores {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idGestor;

    @OneToMany(mappedBy="gestor")
    private List<Clientes> clientes;


    private String nome="";

    public Gestores( String nome) {
        this.nome = nome;
    }

    public Gestores() {

    }

    public int getIdGestor() {
        return idGestor;
    }

    public void setIdGestor(int idGestor) {
        this.idGestor = idGestor;
    }

    public List<Clientes> getClientes() {
        return clientes;
    }

    public void setClientes(List<Clientes> clientes) {
        this.clientes = clientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
