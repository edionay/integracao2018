package sistema_principal;

import com.google.gson.Gson;
import org.junit.Test;
import venda.Venda;

import static org.junit.Assert.*;
import static sistema_principal.Desserializador.jsonParaVenda;

public class DesserializadorTest {

    @Test
    public void testJsonParaVenda() {

        Venda venda = new Venda("Sabonete",2.50,10);

        String json = "{\"produto\":\"Sabonete\",\"valor\":2.5,\"quantidade\":10 }";
        assertEquals(venda, jsonParaVenda(json));
    }
}