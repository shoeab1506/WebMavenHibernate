package br.senac.rn.dao;

import br.senac.rn.model.Cliente;

public class ClienteDAO extends AbstractGenericDAO<Cliente>{

    public Class<Cliente> getClassType(){
        return Cliente.class;
    }
}