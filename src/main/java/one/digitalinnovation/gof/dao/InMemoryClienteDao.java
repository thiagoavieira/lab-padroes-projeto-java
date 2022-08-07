package one.digitalinnovation.gof.dao;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.ClienteRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class InMemoryClienteDao implements ClienteDao{

    private ClienteRepository clienteRepository;

    private final Map<Integer, Cliente> idToCliente = new HashMap<>();

    @Override
    public Stream<Cliente> getAll() throws Exception {
        return (Stream<Cliente>) clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> getById(int id) throws Exception {
        Optional<Cliente> cliente = clienteRepository.findById((long) id);
        return Optional.ofNullable(cliente.get());
    }

    @Override
    public boolean add(Cliente cliente) throws Exception {
        if(cliente == null){
            return false;
        }else{
            clienteRepository.save(cliente);
            return true;
        }
    }

    @Override
    public boolean update(Cliente cliente) throws Exception {
        if(cliente == null){
            return false;
        }else{
            clienteRepository.save(cliente);
            return true;
        }
    }

    @Override
    public boolean delete(Cliente cliente) throws Exception {
        if(cliente == null){
            return false;
        }else{
            clienteRepository.delete(cliente);
            return true;
        }
    }
}
