/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptercliente.model;

import lib.ClienteExterno;

/**
 *
 * @author helle
 */
public class AdapterCE implements ICliente {

    private ClienteExterno ce;
    
    public AdapterCE(ClienteExterno ce) {
        this.ce = ce;
    }
    
    @Override
    public String getNomeCompleto() {
        String nomeCompleto = ce.getNome() + " " + ce.getSobreNome();
        
        return nomeCompleto;
    }

    @Override
    public void setNomeCompleto(String nomeCompleto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTelefone() {
        String telefone = ce.getDddCelular() + ce.getDddTelefone();
        
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEmail() {
        String email = ce.getEmail();
        return email;
    }

    @Override
    public void setEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCelular() {
        String celular = ce.getDddCelular()+ce.getCelular();
        return celular;
    }

    @Override
    public void setCelular(String celular) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
