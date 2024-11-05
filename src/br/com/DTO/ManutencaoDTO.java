package br.com.DTO;

public class ManutencaoDTO {
    private int id_manutencao, id_peca, id_maquina;
    private String desc_manutencao, status_manutencao, data_entrada, data_saida, responsavel, solucao;

    public int getId_manutencao() {
        return id_manutencao;
    }

    public void setId_manutencao(int id_manutencao) {
        this.id_manutencao = id_manutencao;
    }

    public int getId_peca() {
        return id_peca;
    }

    public void setId_peca(int id_peca) {
        this.id_peca = id_peca;
    }

    public int getId_maquina() {
        return id_maquina;
    }

    public void setId_maquina(int id_maquina) {
        this.id_maquina = id_maquina;
    }

    public String getDesc_manutencao() {
        return desc_manutencao;
    }

    public void setDesc_manutencao(String desc_manutencao) {
        this.desc_manutencao = desc_manutencao;
    }

    public String getStatus_manutencao() {
        return status_manutencao;
    }

    public void setStatus_manutencao(String status_manutencao) {
        this.status_manutencao = status_manutencao;
    }

    public String getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(String data_entrada) {
        this.data_entrada = data_entrada;
    }

    public String getData_saida() {
        return data_saida;
    }

    public void setData_saida(String data_saida) {
        this.data_saida = data_saida;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getSolucao() {
        return solucao;
    }

    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

}