package services;

import javax.ejb.Stateless;
import models.Produto;

/**
 *
 * @author brunomonteiro
 */

@Stateless
public class ProdutoServico extends GenericoServico<Produto> {
    
    public ProdutoServico() {
        super(Produto.class);
    }
    
    
    
}
