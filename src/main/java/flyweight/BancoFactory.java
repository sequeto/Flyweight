package flyweight;

import java.util.HashMap;
import java.util.Map;

public class BancoFactory {
	private static Map<String, Banco> bancos = new HashMap<String, Banco>();

    public static Banco getBanco(String nome, String codigo) {
        Banco banco = bancos.get(codigo);
        if (banco == null) {
            banco = new Banco(nome, codigo);
            bancos.put(codigo, banco);
        }
        return banco;
    }

    public static int getTotalBancos() {
        return bancos.size();
    }
}
