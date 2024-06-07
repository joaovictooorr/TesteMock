package ServiceTest;


import DAO.IClienteDAO;
import Service.ClienteService;
import mock.ClienteDaoMock;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {
    @Test
    public void salvarTest(){
        IClienteDAO clienteDAO = new ClienteDaoMock();
        ClienteService service = new ClienteService(clienteDAO);
        String esperado = service.salvar();
        Assert.assertEquals("Salvo",esperado);

    }

    @Test
    public void excluirTest(){
        IClienteDAO clienteDAO = new ClienteDaoMock();
        ClienteService service = new ClienteService(clienteDAO);
        String esperado = service.excluir();
        Assert.assertEquals("Excluido",esperado);
    }

    @Test
    public void buscarTest(){
        IClienteDAO clienteDAO = new ClienteDaoMock();
        ClienteService service = new ClienteService(clienteDAO);
        String esperado = service.buscar();
        Assert.assertEquals("Busca",esperado);

    }

    @Test
    public void atualizarTest(){
        IClienteDAO clienteDAO = new ClienteDaoMock();
        ClienteService service = new ClienteService(clienteDAO);
        String esperado = service.atualizar();
        Assert.assertEquals("Atualizado",esperado);

    }
}
