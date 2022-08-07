package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.ClienteRepository;
import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.model.EnderecoRepository;
import one.digitalinnovation.gof.service.ClienteService;
import one.digitalinnovation.gof.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Implementação da Strategy {@link ClienteService}, que pode ser injetada
 * pelo Spring (via {@link Autowired}). Sendo assim, a classe é um {@link Service}
 * e será tratada como um Singleton
 *
 * @author thiagoavieira
 */
@Service
public class ClienteServiceImpl implements ClienteService {

    // Singleton: Injetar os componentes do Spring com @Autowired.
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    // Strategy: Implementar os métodos definidos na interface.
    // Facade: Abstrair integrações com subsistemas, promovendo uma interface simples.

    @Override
    public Iterable<Cliente> buscarTodosClientes() {
        // Busca todos os Clientes.
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarClientePorId(Long id) {
        // Busca um Cliente específico pelo ID.
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        // Busca o Cliente por ID, caso exista, executa:
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if(clienteBd.isPresent()){
            salvarClienteComCep(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        // Deleta o Cliente pelo ID.
        clienteRepository.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente){
        // Verifica pelo CEP se o Endereco do Cliente já existe.
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            // Caso o Endereco não exista, integra-se com o ViaCEP e persiste o retorno.
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        // Insere o Cliente, vinculando o Endereco (novo ou existente).
        clienteRepository.save(cliente);
    }
}