package flyweight;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SistemaPagamentoTest {
	
	@Test
    public void deveRetornarFuncionarios() {
        SistemaPagamento sistema = new SistemaPagamento();
        sistema.RegistrarFuncionario("Joao", "13620218650", "Banco do Brasil", "001");
        sistema.RegistrarFuncionario("Maria", "02132574677", "Nubank", "260");
        sistema.RegistrarFuncionario("Jose", "13620218657", "Itau Unibanco", "341");

        List<String> saida = Arrays.asList(
                "Funcionario:nome=Joao, codigo=13620218650, banco=001.",
                "Funcionario:nome=Maria, codigo=02132574677, banco=260.",
                "Funcionario:nome=Jose, codigo=13620218657, banco=341.");

        assertEquals(saida, sistema.obterFuncionarios());
    }

    @Test
    public void deveRetornarTotalBancos() {
        SistemaPagamento sistema = new SistemaPagamento();
        sistema.RegistrarFuncionario("Joao", "13620218650", "Banco do Brasil", "001");
        sistema.RegistrarFuncionario("Maria", "02132574677", "Nubank", "260");
        sistema.RegistrarFuncionario("Jose", "13620218657", "Itau Unibanco", "341");

        assertEquals(3, BancoFactory.getTotalBancos());
    }

}
