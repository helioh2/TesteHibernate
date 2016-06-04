package dao;

import br.ufpr.tarefas.modelo.Tarefa;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class HibernateTarefaDao {
    
    private EntityManager manager;

    public HibernateTarefaDao() {
        EntityManagerFactory factory 
                = Persistence.createEntityManagerFactory("tarefas");
        manager = factory.createEntityManager();
    }
    
    public void buildDb() {
        manager.getTransaction().begin();

        manager.persist(new Tarefa("bjbjhb",true,Calendar.getInstance()));

        manager.getTransaction().commit();
    }

    public void persist(Tarefa tarefa) {
       manager.getTransaction().begin();

        manager.persist(tarefa);

        manager.getTransaction().commit();
    }
    
    
    
}
