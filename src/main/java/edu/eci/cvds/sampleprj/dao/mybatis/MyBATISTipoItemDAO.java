package edu.eci.cvds.sampleprj.dao.mybatis;

import java.util.List;

import com.google.inject.Inject;
// import com.google.inject.Singleton;
import edu.eci.cvds.sampleprj.dao.TipoItemDAO;
import edu.eci.cvds.sampleprj.dao.PersistenceException;
// import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ClienteMapper;
import edu.eci.cvds.samples.entities.TipoItem;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.TipoItemMapper;
// import edu.eci.cvds.samples.entities.TipoItem;
// import java.sql.SQLException;

public class MyBATISTipoItemDAO implements TipoItemDAO{
    
    @Inject
    private TipoItemMapper tipoItemMapper;    
  
    @Override
    public void save(String des) throws PersistenceException{
        try{
            tipoItemMapper.addTipoItem(des);
        }
        catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("Error al registrar el item "+des,e);
        }          
    }
  
    @Override
    public TipoItem load(int id) throws PersistenceException {
        try{
            return tipoItemMapper.getTipoItem(id);
        }
        catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("Error al consultar el item "+id,e);
        }
    }

    @Override
    public List<TipoItem> consultarTipos() throws PersistenceException {
        try{
            return tipoItemMapper.getTiposItems();
        }
        catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("Error al consultar el los tipos de item",e);
        }
    }
}
