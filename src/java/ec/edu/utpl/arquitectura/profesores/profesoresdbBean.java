/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.arquitectura.profesores;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Rafael
 */
@Stateless
public class profesoresdbBean implements profesoresBeanRemote{

    @Override
    public List<Profesores> obtenerTodo() {
    
        EntityManager entityManager = Persistence.createEntityManagerFactory("profesoresdbPU").createEntityManager();
        Query query = entityManager.createNamedQuery("Profesores.findAll");
        List<Profesores> lecturas= query.getResultList();   
        return lecturas;
    
    }
    
}
