package br.com.DAO;

import br.com.DTO.MaquinaDTO;
import br.com.VIEW.InternalFrameManutencao;
import br.com.VIEW.InternalFrameMaquina;
import static br.com.VIEW.InternalFrameMaquina.tblMaquina;
import static br.com.VIEW.InternalFrameMaquina.txtPesquisa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class MaquinaDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void cadastrarMaquina(MaquinaDTO objMaquinaDTO) {
        String sql = "insert into maquina(nome_maquina, numero_serie, tipo_maquina, descricao_maquina, status_maquina, id_laboratorio, memoria_ram, processador) values (?, ?, ?, ?, ?, ?, ?, ?)";
        conexao = new ConexaoDAO().conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, objMaquinaDTO.getNome_maquina());
            pst.setInt(2, objMaquinaDTO.getNum_serie());
            pst.setString(3, objMaquinaDTO.getTipo_maquina());
            pst.setString(4, objMaquinaDTO.getDesc_maquina());
            pst.setString(5, objMaquinaDTO.getStatus_maquina());
            pst.setInt(6, objMaquinaDTO.getId_lab());
            pst.setString(7, objMaquinaDTO.getMem_ram());
            pst.setString(8, objMaquinaDTO.getProcessador());

            int res = pst.executeUpdate();
            if (res == 1) {
                JOptionPane.showMessageDialog(null, "SUCESSO!\nCadastro feito com êxito.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar.");
            }
            pst.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Máquina: " + e);
            limpar();
        }
    }

    public void editar(MaquinaDTO objMaquinaDTO) {
        String sql = "update maquina set nome_maquina = ?, numero_serie = ?, tipo_maquina = ?, descricao_maquina = ?, status_maquina = ?, id_laboratorio = ?, memoria_ram = ?, processador = ? where id_maquina = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(9, objMaquinaDTO.getId_maquina());
            pst.setString(1, objMaquinaDTO.getNome_maquina());
            pst.setInt(2, objMaquinaDTO.getNum_serie());
            pst.setString(3, objMaquinaDTO.getTipo_maquina());
            pst.setString(4, objMaquinaDTO.getDesc_maquina());
            pst.setString(5, objMaquinaDTO.getStatus_maquina());
            pst.setInt(6, objMaquinaDTO.getId_lab());
            pst.setString(7, objMaquinaDTO.getMem_ram());
            pst.setString(8, objMaquinaDTO.getProcessador());

            int res = pst.executeUpdate();
            if (res > 0) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "SUCESSO\nMáquina editada com êxito.");
            } else {
                JOptionPane.showMessageDialog(null, "ERRO: Máquina não existe.");
                conexao.close();
                limpar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Editar: " + e);
        }
    }

    public void pesquisaAuto() {
        String sql = "SELECT \nm.id_maquina, \nm.nome_maquina, \nm.numero_serie, \nm.tipo_maquina, \nm.descricao_maquina, \nm.status_maquina, \nm.memoria_ram, \nm.processador, \nl.nome_laboratorio, \nl.id_laboratorio \nFROM \nMaquina m \nJOIN \nLaboratorio l ON m.id_laboratorio = l.id_laboratorio;";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) InternalFrameMaquina.tblMaquina.getModel();
            model.setNumRows(0);
            System.out.println(pst);

            while (rs.next()) {
                int id = rs.getInt("id_maquina");
                String nome = rs.getString("nome_maquina");
                int num = rs.getInt("numero_serie");
                String senha = rs.getString("tipo_maquina");
                String tipo = rs.getString("descricao_maquina");
                String status = rs.getString("status_maquina");
                String mem = rs.getString("memoria_ram");
                String proc = rs.getString("processador");
                String nome_lab = rs.getString("nome_laboratorio");
                int id_lab = rs.getInt("id_laboratorio");
                model.addRow(new Object[]{id, nome, num, senha, tipo, status, mem, proc, nome_lab, id_lab});
            }
            conexao.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Pesquisa Automática: " + e);
        }

    }
    
    public void pesquisaAutoManutencao() {
        String sql = "SELECT \nm.id_maquina, \nm.nome_maquina, \nm.numero_serie, \nm.tipo_maquina, \nm.descricao_maquina, \nm.status_maquina, \nm.memoria_ram, \nm.processador, \nl.nome_laboratorio, \nl.id_laboratorio \nFROM \nMaquina m \nJOIN \nLaboratorio l ON m.id_laboratorio = l.id_laboratorio;";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) InternalFrameManutencao.tblMaquina.getModel();
            model.setNumRows(0);
            System.out.println(pst);

            while (rs.next()) {
                int id = rs.getInt("id_maquina");
                String nome = rs.getString("nome_maquina");
                int num = rs.getInt("numero_serie");
                String senha = rs.getString("tipo_maquina");
                String tipo = rs.getString("descricao_maquina");
                String status = rs.getString("status_maquina");
                String mem = rs.getString("memoria_ram");
                String proc = rs.getString("processador");
                String nome_lab = rs.getString("nome_laboratorio");
                int id_lab = rs.getInt("id_laboratorio");
                model.addRow(new Object[]{id, nome, num, senha, tipo, status, mem, proc, nome_lab, id_lab});
            }
            conexao.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Pesquisa Automática: " + e);
        }

    }
    
    public void pesquisa(){
        String sql = "select * from Maquina where nome_maquina like ?";
        conexao = ConexaoDAO.conector();
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtPesquisa.getText() + "%");
            rs = pst.executeQuery();
            
            tblMaquina.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Método Pesquisa: "+e);
        }
    }

    public void deletar(MaquinaDTO objMaquinaDTO) {
        String sql = "delete from maquina where id_maquina = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objMaquinaDTO.getId_maquina());
            int res = pst.executeUpdate();
            if (res > 0) {
                conexao.close();
                JOptionPane.showMessageDialog(null, "SUCESSO\nMáquina editada com êxito.");
                limpar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Método Deletar: " + e);
        }
    }

    public void limpar() {
        InternalFrameMaquina.txtIDMaq.setText(null);
        InternalFrameMaquina.txtNomeMaquina.setText(null);
        InternalFrameMaquina.txtNumSerie.setText(null);
        InternalFrameMaquina.txtTipo.setText(null);
        InternalFrameMaquina.txtDesc.setText(null);
        InternalFrameMaquina.txtIDMaq.setText(null);
        InternalFrameMaquina.txtMemRam.setText(null);
        InternalFrameMaquina.txtProcessador.setText(null);
    }
}
