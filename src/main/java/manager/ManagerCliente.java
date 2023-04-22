package manager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import models.Cliente;
import services.ClienteServico;
import utils.Mensagens;

/**
 *
 * @author brunomonteiro
 */

@Named
@ViewScoped
public class ManagerCliente implements Serializable {
    
    @EJB
    ClienteServico clienteServico;
    private Cliente cliente;
    private List<Cliente> clientes;
    
    @PostConstruct
    public void iniciar() {
        cliente = new Cliente();
        clientes = new ArrayList<>();
        buscarTodos();
    }
    
    public String salvar() {
        cliente.setActive(true);
        clienteServico.salvar(cliente);
        iniciar();
        Mensagens.mensagem("Cliente cadastrado com sucesso!");
        return "clientes.xhtml?faces-redirect=true";
    }
    
    public String redirecionarCadastroCliente() {
        return "cadastrarCliente.xhtml?faces-redirect=true";
    }
    
    public void limpar() {
        cliente = new Cliente();
    }
    
    public void editar() {
        clienteServico.editar(cliente);
        Mensagens.mensagem("Editando cliente!");
    }
    
    public void excluir(Cliente cliente) {
        clienteServico.excluir(cliente);
        Mensagens.mensagem("Cliente excluído com sucesso!");
    }
    
    public void buscarTodos() {
        clientes = clienteServico.buscarTodos();
    }
    
    public void buscarEspecifico() {
        clientes = clienteServico.buscarEspecifico(cliente);
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
