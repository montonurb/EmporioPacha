package services;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author brunomonteiro
 */
public class GenericoServico<T> {

    public GenericoServico(Class<T> entidade) {
        this.entidade = entidade;
    }
    
    private Class<T> entidade;
    
    @PersistenceContext
    private EntityManager manager;
    
    public void salvar(T entidade) {
        manager.persist(entidade);
    }
    
    public void editar(T entidade) {
        manager.merge(entidade);
    }
    
    public void excluir(T entidade) {
        manager.remove(entidade);
    }
    
    public List<T> buscarTodos() {
        String sql = "SELECT e FROM " + entidade.getName() + " e ";
        System.out.println("SQL" + sql);
        return manager.createQuery(sql).getResultList();
    }

    public EntityManager getManager() {
        return manager;
    }

    public void setManager(EntityManager manager) {
        this.manager = manager;
    }
}
