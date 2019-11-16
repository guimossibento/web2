
package dao;

import entidades.Cliente;
import java.util.List;

public interface ClienteDAO {
    
    
    public void save(Cliente tarefa);

    public void delete(Cliente tarefa);

    public Cliente find(int id);

    public List<Cliente> list();
    
}
