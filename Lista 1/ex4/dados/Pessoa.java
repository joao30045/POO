package ex4.dados;

public class Pessoa {
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String toString(){
        return "Pessoa: Nome: " + nome + ", CPF: " + cpf;
    }
}
