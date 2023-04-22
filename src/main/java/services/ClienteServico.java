package services;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;
import models.Cliente;

/**
 *
 * @author brunomonteiro
 */

@Stateless
public class ClienteServico extends GenericoServico<Cliente> {
    
    public ClienteServico() {
        super(Cliente.class);
    }
    
    public List<Cliente> buscarEspecifico(Cliente cliente) {
        String sql = "SELECT c FROM Cliente c WHERE c.active = true";
        
        if(!cliente.getNome().equals("") && cliente.getNome() != null) {
            sql += " AND LOWER(c.nome) like LOWER(:nome)";
        }
        
        if(!cliente.getWhatsapp().equals("") && cliente.getWhatsapp()!= null) {
            sql += " AND c.whatsapp = :whatsapp";
        }
        Query query = getManager().createQuery(sql);
        
        if(!cliente.getNome().equals("") && cliente.getNome() != null) {
            query.setParameter("nome", "%" + cliente.getNome() + "%");
        }
        
        if(!cliente.getWhatsapp().equals("") && cliente.getWhatsapp()!= null) {
            query.setParameter("whatsapp", cliente.getWhatsapp());
        }
        
        return query.getResultList();
    }
}
