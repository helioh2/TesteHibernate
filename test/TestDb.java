/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.ufpr.tarefas.modelo.Tarefa;
import dao.HibernateTarefaDao;
import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class TestDb {
    
    public TestDb() {
    }
    
   @Test
   public void test(){
       HibernateTarefaDao dao = new HibernateTarefaDao();
       dao.buildDb();
       dao.persist(new Tarefa("jhkjsjhkh",true,Calendar.getInstance()));
   }
}
