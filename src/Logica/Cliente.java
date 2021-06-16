package Logica;

import java.sql.Date;

/**
 *
 * @author Alexandre Nântua
 */
public class Cliente {
    private String Nome;
    private String Telefone1;
    private String Telefone2;
    private String Email;
    private String Endereco;
    private String NSerie;
    private String Marca;
    private String Modelo;
    private Date DataRec;
    private Date DataEnt;
    private String Garantia;
    private Date DataGar;
    private String Observacoes;
    private String Status;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTelefone1() {
        return Telefone1;
    }

    public void setTelefone1(String Telefone1) {
        this.Telefone1 = Telefone1;
    }

    public String getTelefone2() {
        return Telefone2;
    }

    public void setTelefone2(String Telefone2) {
        this.Telefone2 = Telefone2;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getNSerie() {
        return NSerie;
    }

    public void setNSerie(String NSerie) {
        this.NSerie = NSerie;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public Date getDataRec() {
        return DataRec;
    }

    public void setDataRec(Date DataRec) {
        this.DataRec = DataRec;
    }

    public Date getDataEnt() {
        return DataEnt;
    }

    public void setDataEnt(Date DataEnt) {
        this.DataEnt = DataEnt;
    }

    public String getGarantia() {
        return Garantia;
    }

    public void setGarantia(String Garantia) {
        this.Garantia = Garantia;
    }

    public Date getDataGar() {
        return DataGar;
    }

    public void setDataGar(Date DataGar) {
        this.DataGar = DataGar;
    }

    public String getObservacoes() {
        return Observacoes;
    }

    public void setObservacoes(String Observacoes) {
        this.Observacoes = Observacoes;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
}
