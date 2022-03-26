package edu.eci.cvds.sampleprj.dao;

import java.util.Date;
import java.util.List;

import edu.eci.cvds.samples.entities.Cliente;

public interface ClienteDAO {
    
    public void save(Cliente cliente) throws PersistenceException;

    public Cliente load(int documento) throws PersistenceException;

    public void agregarItemRentadoACliente( long id, 
    int idit, 
    Date fechainicio,
    Date fechafin) throws PersistenceException;

    public List<Cliente> consultarClientes() throws PersistenceException;

}
