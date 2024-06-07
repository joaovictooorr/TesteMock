package Service;

import DAO.IContratoDAO;

public class ContratoService implements IContratoDAO {

    private IContratoDAO contratoDAO;

    public ContratoService(IContratoDAO contratoDAO) {
        this.contratoDAO = contratoDAO;
    }

    @Override
    public String salvar() {
        contratoDAO.salvar();
        return "Salvo";
    }

    @Override
    public String buscar() {
        contratoDAO.buscar();
        return "Busca";
    }

    @Override
    public String excluir() {
        contratoDAO.excluir();
        return "Excluido";
    }

    @Override
    public String atualizar() {
        contratoDAO.atualizar();
        return "Atualizado";
    }
}
