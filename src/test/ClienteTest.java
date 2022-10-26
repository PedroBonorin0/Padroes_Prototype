package test;

import org.junit.jupiter.api.Test;
import prototype.Cliente;
import prototype.Time;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

  @Test
  void testClone() throws CloneNotSupportedException {
    Cliente cliente = new Cliente("123.321.456-90", "Pedro Bonorino", new Time("Botafogo", "Brasil"), "Niterói");

    Cliente clienteClone = cliente.clone();
    clienteClone.setCpf("000.111.222-33");
    clienteClone.setNome("Carlos Eduardo");
    clienteClone.getTime().setNome("Barcelona");
    clienteClone.getTime().setPais("Espanha");

    assertEquals("Cliente{cpf='123.321.456-90', nome='Pedro Bonorino', time=Time{nome='Botafogo', pais='Brasil'}, cidadeNatal='Niterói'}", cliente.toString());
    assertEquals("Cliente{cpf='000.111.222-33', nome='Carlos Eduardo', time=Time{nome='Barcelona', pais='Espanha'}, cidadeNatal='Niterói'}", clienteClone.toString());
  }
}