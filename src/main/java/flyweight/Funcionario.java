package flyweight;

public class Funcionario {
	private String nome;
	private String codigo;
    private Banco banco;

    public Funcionario(String nome, String codigo, Banco banco) {
        this.nome = nome;
        this.codigo = codigo;
        this.banco = banco;
    }

    public String obterFuncionario() {
        return "Funcionario:" +"nome=" + this.nome +", codigo=" + this.codigo + ", banco=" + this.banco.getCodigo() + ".";
    }
}
