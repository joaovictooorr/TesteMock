package ServiceTest;


import DAO.IContratoDAO;
import Service.ContratoService;
import mock.ContratoDaoMock;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest(){
        IContratoDAO contratoDAO = new ContratoDaoMock();
        ContratoService contratoService = new ContratoService(contratoDAO);
        String esperado = contratoService.salvar();
        Assert.assertEquals("Salvo",esperado);
    }

    @Test
    public void excluirTest(){
        IContratoDAO contratoDAO = new ContratoDaoMock();
        ContratoService contratoService = new ContratoService(contratoDAO);
        String esperado = contratoService.excluir();
        Assert.assertEquals("Excluido",esperado);
    }

    @Test
    public void buscarTest(){
        IContratoDAO contratoDAO = new ContratoDaoMock();
        ContratoService contratoService = new ContratoService(contratoDAO);
        String esperado = contratoService.buscar();
        Assert.assertEquals("Busca",esperado);
    }

    @Test
    public void atualizarTest(){
        IContratoDAO contratoDAO = new ContratoDaoMock();
        ContratoService contratoService = new ContratoService(contratoDAO);
        String esperado = contratoService.atualizar();
        Assert.assertEquals("Atualizado",esperado);
    }
}
