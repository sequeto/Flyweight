package flyweight;

import java.util.ArrayList;
import java.util.List;

public class SistemaPagamento {
	private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public void RegistrarFuncionario(String nomeFuncionario, String codigoFuncionario, String nomeBanco, String codigoBanco){
        Banco banco = BancoFactory.getBanco(nomeBanco, codigoBanco);
        Funcionario funcionario = new Funcionario(nomeFuncionario,codigoFuncionario, banco);
        funcionarios.add(funcionario);
    }

    public List<String> obterFuncionarios() {
        List<String> saida = new ArrayList<String>();
        for (Funcionario funcionario : this.funcionarios) {
            saida.add(funcionario.obterFuncionario());
        }
        return saida;
    }
}
