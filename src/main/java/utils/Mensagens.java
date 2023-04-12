package utils;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author brunomonteiro
 */
public class Mensagens {
    public static void mensagem(String mensagem) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(mensagem));
    }
}
