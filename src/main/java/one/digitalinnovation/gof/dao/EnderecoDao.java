package one.digitalinnovation.gof.dao;

import one.digitalinnovation.gof.model.Endereco;

import java.util.Optional;
import java.util.stream.Stream;

public interface EnderecoDao {

    Stream<Endereco> getAll() throws Exception;

    Optional<Endereco> getById(String id) throws Exception;

    boolean add(Endereco endereco) throws Exception;

    boolean update(Endereco endereco) throws Exception;

    boolean delete(Endereco endereco) throws Exception;
}
