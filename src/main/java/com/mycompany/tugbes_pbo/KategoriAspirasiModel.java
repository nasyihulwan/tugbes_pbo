/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugbes_pbo;

public class KategoriAspirasiModel {
    private String id;
    private String namaKategori;

    public KategoriAspirasiModel(String id, String namaKategori) {
        this.id = id;
        this.namaKategori = namaKategori;
    }

    public String getId() {
        return id;
    }

    public String getNamaKategori() {
        return namaKategori;
    }

    @Override
    public String toString() {
        return namaKategori; // Ini yang akan ditampilkan di JComboBox
    }
}
