package br.com.DTO;

public class MaquinaDTO {
    private int id_maquina, id_lab;
    private String nome_maquina, tipo_maquina, desc_maquina, status_maquina, mem_ram, processador;

    public int getId_maquina() {
        return id_maquina;
    }

    public void setId_maquina(int id_maquina) {
        this.id_maquina = id_maquina;
    }

    public int getId_lab() {
        return id_lab;
    }

    public void setId_lab(int id_lab) {
        this.id_lab = id_lab;
    }

    public String getNome_maquina() {
        return nome_maquina;
    }

    public void setNome_maquina(String nome_maquina) {
        this.nome_maquina = nome_maquina;
    }

    public String getTipo_maquina() {
        return tipo_maquina;
    }

    public void setTipo_maquina(String tipo_maquina) {
        this.tipo_maquina = tipo_maquina;
    }

    public String getDesc_maquina() {
        return desc_maquina;
    }

    public void setDesc_maquina(String desc_maquina) {
        this.desc_maquina = desc_maquina;
    }

    public String getStatus_maquina() {
        return status_maquina;
    }

    public void setStatus_maquina(String status_maquina) {
        this.status_maquina = status_maquina;
    }

    public String getMem_ram() {
        return mem_ram;
    }

    public void setMem_ram(String mem_ram) {
        this.mem_ram = mem_ram;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

}
