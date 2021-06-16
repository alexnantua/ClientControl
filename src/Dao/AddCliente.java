package Dao;

import Logica.Cliente;
import clientcontrol.BD.CriaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Alexandre Nântua
 */
public class AddCliente {
 
    private Connection conexao;

    public AddCliente() throws SQLException {
        this.conexao = CriaConexao.getConexao();
    }

    public void adiciona(Cliente c1) throws SQLException {
        String sql = "insert into Clientes "
                + "(Nome, Telefone1, Telefone2, Email, Endereco,"
                + "NSerie, Marca, Modelo, DataRec, DataEnt,"
                + "Garantia, DataGar, Observacoes, Status) "
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);

        stmt.setString(1, c1.getNome());
        stmt.setString(2, c1.getTelefone1());
        stmt.setString(3, c1.getTelefone2());
        stmt.setString(4, c1.getEmail());
        stmt.setString(5, c1.getEndereco());
        stmt.setString(6, c1.getNSerie());
        stmt.setString(7, c1.getMarca());
        stmt.setString(8, c1.getModelo());
        stmt.setDate(9, c1.getDataRec());
        stmt.setDate(10, c1.getDataEnt());
        stmt.setString(11, c1.getGarantia());
        stmt.setDate(12, c1.getDataGar());
        stmt.setString(13, c1.getObservacoes());
        stmt.setString(14, c1.getStatus());
        
        stmt.execute();
        stmt.close();
    }
    
    
}
