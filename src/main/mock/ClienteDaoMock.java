package mock;

import DAO.IClienteDAO;

public class ClienteDaoMock implements IClienteDAO {
    @Override
    public String salvar() {
        return "Salvo";
    }

    @Override
    public String buscar() {
        return "Busca";
    }

    @Override
    public String excluir() {
        return "Excluido";
    }

    @Override
    public String atualizar() {
        return "Atualizado";
    }
}
