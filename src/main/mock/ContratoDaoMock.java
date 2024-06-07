package mock;

import DAO.IContratoDAO;

public class ContratoDaoMock implements IContratoDAO {
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
