package one.digitalinnovation.gof.dao;

import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.model.EnderecoRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class InMemoryEnderecoDao implements EnderecoDao {

    private EnderecoRepository enderecoRepository;

    private final Map<String, Endereco> idToEndereco = new HashMap<>();

    @Override
    public Stream<Endereco> getAll() throws Exception {
        return (Stream<Endereco>) enderecoRepository.findAll();
    }

    @Override
    public Optional<Endereco> getById(String id) throws Exception {
        Optional<Endereco> endereco = enderecoRepository.findById(id);
        return Optional.ofNullable(endereco.get());
    }

    @Override
    public boolean add(Endereco endereco) throws Exception {
        if(endereco == null){
            return false;
        }else{
            enderecoRepository.save(endereco);
            return true;
        }
    }

    @Override
    public boolean update(Endereco endereco) throws Exception {
        if(endereco == null){
            return false;
        }else{
            enderecoRepository.save(endereco);
            return true;
        }
    }

    @Override
    public boolean delete(Endereco endereco) throws Exception {
        if(endereco == null){
            return false;
        }else{
            enderecoRepository.delete(endereco);
            return true;
        }
    }
}
