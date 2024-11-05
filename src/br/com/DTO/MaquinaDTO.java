package br.com.DTO;

public class MaquinaDTO {
    private int id_maquina, id_lab;
    private String nome_maquina, tipo_maquina, desc_maquina, mem_ram, processador;

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
    
    public int getId_maquina() {
        return id_maquina;
    }

    public void setId_maquina(int id_equip) {
        this.id_maquina = id_equip;
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

    public void setNome_maquina(String nome_equip) {
        this.nome_maquina = nome_equip;
    }

    public String getTipo_maquina() {
        return tipo_maquina;
    }

    public void setTipo_maquina(String tipo_equip) {
        this.tipo_maquina = tipo_equip;
    }

    public String getDesc_maquina() {
        return desc_maquina;
    }

    public void setDesc_maquina(String desc_equip) {
        this.desc_maquina = desc_equip;
    }
    
    
}
