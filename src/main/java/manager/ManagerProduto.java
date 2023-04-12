package manager;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import models.Produto;

/**
 *
 * @author brunomonteiro
 */

@Named
@ViewScoped
public class ManagerProduto implements Serializable {
    
    private Produto produto;
    
    @PostConstruct
    public void instanciar() {
        produto = new Produto();
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
