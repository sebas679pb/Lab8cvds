package edu.eci.cvds.sampleprj.dao;

import java.util.Date;

import org.apache.ibatis.exceptions.PersistenceException;

import edu.eci.cvds.samples.entities.Cliente;

public interface ClienteDAO {
    
    public void save( int id, 
    int idit, 
    Date fechainicio,
    Date fechafin) throws PersistenceException;

    public Cliente load(int documento) throws PersistenceException;

}
