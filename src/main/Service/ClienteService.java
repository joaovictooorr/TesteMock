package Service;

import DAO.IClienteDAO;

public class ClienteService {
    private IClienteDAO clienteDao;

    public ClienteService(IClienteDAO clienteDao) {
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Salvo";
    }

    public String buscar(){
        clienteDao.buscar();
        return "Busca";
    }

    public String excluir(){
        clienteDao.excluir();
        return "Excluido";
    }

    public String atualizar(){
        clienteDao.atualizar();
        return "Atualizado";
    }


}
