package br.com.DAO;

import br.com.DTO.MaquinaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class MaquinaDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void cadastrarMaquina(MaquinaDTO objMaquinaDTO) {
        String sql = "insert into maquina(nome_maquina, tipo_maquina, descricao_maquina, status_maquina, id_laboratorio, memoria_ram, processador) values (?, ?, ?, ?, ?, ?, ?)";
        conexao = new ConexaoDAO().conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, objMaquinaDTO.getNome_maquina());
            pst.setString(2, objMaquinaDTO.getTipo_maquina());
            pst.setString(3, objMaquinaDTO.getDesc_maquina());
            pst.setString(4, objMaquinaDTO.getStatus_maquina());
            pst.setInt(5, objMaquinaDTO.getId_lab());
            pst.setString(6, objMaquinaDTO.getMem_ram());
            pst.setString(7, objMaquinaDTO.getProcessador());

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
        String sql = "update maquina set nome_maquina = ?, tipo_maquina = ?, descricao_maquina = ?, status_maquina = ?, id_laboratorio = ?, memoria_ram = ?, processador = ? where id_maquina = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(8, objMaquinaDTO.getId_maquina());
            pst.setString(1, objMaquinaDTO.getNome_maquina());
            pst.setString(2, objMaquinaDTO.getTipo_maquina());
            pst.setString(3, objMaquinaDTO.getDesc_maquina());
            pst.setString(4, objMaquinaDTO.getStatus_maquina());
            pst.setInt(5, objMaquinaDTO.getId_lab());
            pst.setString(6, objMaquinaDTO.getMem_ram());
            pst.setString(7, objMaquinaDTO.getProcessador());
        
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
        InternalFrameMaquina.txtID.setText(null);
        InternalFrameMaquina.txtNomeMaquina.setText(null);
        InternalFrameMaquina.txtTipoMaquina.setText(null);
        InternalFrameMaquina.txtDescricaoMaquina.setText(null);
        InternalFrameMaquina.txtStatusMaquina.setText(null);
        InternalFrameMaquina.txtIDLaboratorio.setText(null);
        InternalFrameMaquina.txtMemoriaRam.setText(null);
        InternalFrameMaquina.txtProcessador.setText(null);
    }
}

