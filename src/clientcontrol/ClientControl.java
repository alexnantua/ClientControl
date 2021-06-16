package clientcontrol;

import Principal.Tela_Principal;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

/**
 *
 * @author Alexandre Nântua
 */
public class ClientControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, JRException, FileNotFoundException {
        new Tela_Principal().setVisible(true);
        
        ClientControl reporte = new ClientControl();
        reporte.gerarRelatorio();
    }
    
    public void gerarRelatorio() throws net.sf.jasperreports.engine.JRException, FileNotFoundException, SQLException{
        InputStream inputStream = null;
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:sqlserver://babyhost.ddns.net;databaseName=ClientControl;user=alexnantua;password=357900");
            inputStream = new FileInputStream ("src/clientcontrol/Relatorio1.jrxml");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClientControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        Map parameters = new HashMap();
        parameters.put("REPORT_CONNECTION",con);
        JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters);
        JasperExportManager.exportReportToPdfFile(jasperPrint, "src/clientcontrol/Relatorio1.pdf");
         
    }
    
}

//SQLSERVER
//create table Clientes
//(
//Cod int identity(1,1),
//Nome varchar(50),
//Telefone1 varchar(15),
//Telefone2 varchar(15),
//Email varchar(50),
//Endereco varchar(MAX),
//NSerie varchar(40),
//Marca varchar(20),
//Modelo varchar(15),
//DataRec date,
//DataEnt date,
//Garantia varchar(10),
//DataGar date,
//Observacoes varchar(MAX),
//Status varchar(20)
//)

//MYSQL
//create table Clientes
//(
//Cod int AUTO_INCREMENT primary key,
//Nome varchar(50),
//Telefone1 varchar(15),
//Telefone2 varchar(15),
//Email varchar(50),
//Endereco varchar(100),
//NSerie varchar(40),
//Marca varchar(20),
//Modelo varchar(15),
//DataRec date,
//DataEnt date,
//Garantia varchar(10),
//DataGar date,
//Observacoes varchar(200),
//Status varchar(20)
//);