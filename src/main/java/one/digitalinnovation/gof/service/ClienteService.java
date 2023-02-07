package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;
import org.springframework.context.annotation.Bean;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio do cliente.
 * Com isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 */


public interface ClienteService {

    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
