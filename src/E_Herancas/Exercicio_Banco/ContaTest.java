package E_Herancas.Exercicio_Banco;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    Conta origem;
    Conta destino;

    @BeforeEach
    void executaAntes(){
        System.out.println("*****");
        origem = new Conta();
        origem.setSaldo(100);
        origem.setNumero(123);
        origem.setAgencia(456);
        origem.setCliente("B");

        destino = new Conta(100,100,"A");
    }

    @Test
    void getsTest(){
        assertEquals(100, origem.getSaldo());
        assertEquals(123, origem.getNumero());
        assertEquals(456, origem.getAgencia());
        assertEquals("B", origem.getCliente());
    }

    @Test
    void depositoTest(){
        assertTrue(origem.deposito(100));
        assertEquals(200, origem.getSaldo());
    }

    @Test
    void saquePossivelTest(){
        assertTrue(origem.saque(50));
        assertEquals(50, origem.getSaldo());
    }

    @Test
    void saqueImpossivelTest(){
        assertFalse(origem.saque(200));
        assertEquals(100, origem.getSaldo());
    }

    @Test
    void toStringTest(){
        destino.setSaldo(100);
        assertEquals("100-100 - A - R$100.0\n", destino.toString());
    }

    @Test
    void transferenciaCorretaTest(){
        assertTrue(origem.transferencia(destino, 100));
        assertEquals(0, origem.getSaldo());
        assertEquals(100, destino.getSaldo());
    }

    @Test
    void transferenciaIncorretaTest(){
        Conta c = new ContaUniversitaria();
        c.setSaldo(2000);
        assertFalse(origem.transferencia(destino, 120));
        assertEquals(100, origem.getSaldo());
        assertEquals(0, destino.getSaldo());
        assertFalse(origem.transferencia(c, 50));
        assertEquals(100, origem.getSaldo());
        assertEquals(2000, c.getSaldo());
    }

}