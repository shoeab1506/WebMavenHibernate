package br.gov.rn.pm.dao;

import br.senac.rn.dao.*;
import br.gov.rn.pm.model.Funcao;

import java.util.List;

import javax.persistence.Query;

public class FuncaoDAO extends AbstractGenericDAO<Funcao>{
    
    
    public Class<Funcao> getClassType(){
        return Funcao.class;
    }
    
    @SuppressWarnings("unchecked")
	public List<Funcao> buscarPorFiltro(String filtro){
        try{
            gerenciadorEntidade = getGerenciadorEntidade();
            Query query = gerenciadorEntidade.createQuery("SELECT f FROM Funcao f WHERE f.nome LIKE :filtro");
            query.setParameter("filtro", "%"+ filtro +"%");
            return query.getResultList();
        }catch(Exception erro){
            System.out.println(" # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # ");
            System.out.println(" Erro ao buscar lista de FUNCAO : " + erro.toString());
            System.out.println(" # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # ");
            System.out.println(" # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # # ");
            
        }
        return null;
    }
    
}
