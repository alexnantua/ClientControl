package Dao;

import Logica.Cliente;
import clientcontrol.BD.CriaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BuscaCliente {

    private Connection conexao;

    public BuscaCliente() throws SQLException {
        this.conexao = CriaConexao.getConexao();
    }

    public List<Cliente> getLista() throws SQLException {
        String sql = "select * from Clientes where Nome like '%'";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        List<Cliente> clientes = new ArrayList<Cliente>();

        while (rs.next()) {
            Cliente c1 = new Cliente();

            c1.setNome(rs.getString("Nome"));
            c1.setTelefone1(rs.getString("Telefone1"));
            c1.setTelefone2(rs.getString("Telefone2"));
            c1.setEmail(rs.getString("Email"));
            c1.setEndereco(rs.getString("Endereco"));
            c1.setNSerie(rs.getString("NSerie"));
            c1.setMarca(rs.getString("Marca"));
            c1.setModelo(rs.getString("Modelo"));
            c1.setDataRec(rs.getDate("DataRec"));
            c1.setDataEnt(rs.getDate("DataEnt"));
            c1.setGarantia(rs.getString("Garantia"));
            c1.setDataGar(rs.getDate("DataGar"));
            c1.setObservacoes(rs.getString("Observacoes"));
            c1.setStatus(rs.getString("Status"));

            clientes.add(c1);
        }

        rs.close();
        stmt.close();
        return clientes;
    }
}
