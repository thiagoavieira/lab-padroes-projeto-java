package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementação da Strategy {@link ClienteService}, que pode ser injetada
 * pelo Spring (via {@link Autowired}). Sendo assim, a classe é um {@link Service}
 * e será tratada como um Singleton
 *
 * @author thiagoavieira
 */
@Service
public class ClienteServiceImpl implements ClienteService {

    /*  Singleton: Injetar os componentes do Spring com @Autowired.
        Strategy: Implementar os métodos definidos na interface.
        Facade: Abstrair integrações com subsistemas, promovendo uma interface simples. */

    @Override
    public Iterable<Cliente> buscarTodosClientes() {
        return null;
    }

    @Override
    public Cliente buscarClientePorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }

}
