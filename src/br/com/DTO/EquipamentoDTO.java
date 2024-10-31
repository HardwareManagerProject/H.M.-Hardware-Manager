package br.com.DTO;

public class EquipamentoDTO {
    private int id_equip, id_lab;
    private String nome_equip, tipo_equip, desc_equip;

    public int getId_equip() {
        return id_equip;
    }

    public void setId_equip(int id_equip) {
        this.id_equip = id_equip;
    }

    public int getId_lab() {
        return id_lab;
    }

    public void setId_lab(int id_lab) {
        this.id_lab = id_lab;
    }

    public String getNome_equip() {
        return nome_equip;
    }

    public void setNome_equip(String nome_equip) {
        this.nome_equip = nome_equip;
    }

    public String getTipo_equip() {
        return tipo_equip;
    }

    public void setTipo_equip(String tipo_equip) {
        this.tipo_equip = tipo_equip;
    }

    public String getDesc_equip() {
        return desc_equip;
    }

    public void setDesc_equip(String desc_equip) {
        this.desc_equip = desc_equip;
    }
    
    
}
