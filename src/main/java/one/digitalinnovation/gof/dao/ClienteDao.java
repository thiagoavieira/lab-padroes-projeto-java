package one.digitalinnovation.gof.dao;

import one.digitalinnovation.gof.model.Cliente;

import java.util.Optional;
import java.util.stream.Stream;

public interface ClienteDao {

    Stream<Cliente> getAll() throws Exception;

    Optional<Cliente> getById(int id) throws Exception;

    boolean add(Cliente cliente) throws Exception;

    boolean update(Cliente cliente) throws Exception;

    boolean delete(Cliente cliente) throws Exception;
}
