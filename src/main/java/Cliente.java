import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private CPF cpf;
    private Assinatura assinatura;
    private List<Telefone> telefones;

    public Cliente(String nome, CPF cpf, Assinatura assinatura) {
        this.nome = nome;
        this.cpf = cpf;
        this.assinatura = assinatura;
        this.telefones = new ArrayList<>();
    }

    public void adicionarTelefone(Telefone telefone) {
        telefones.add(telefone);
    }

    public String getNome() {
        return nome;
    }

    public CPF getCpf() {
        return cpf;
    }

    public Assinatura getAssinatura() {
        return assinatura;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }
}
