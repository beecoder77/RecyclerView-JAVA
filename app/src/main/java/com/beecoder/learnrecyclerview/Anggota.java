package com.beecoder.learnrecyclerview;

public class Anggota {
    private String nama, kelas, divisi;

    public Anggota(){

    }

    public Anggota(String nama, String kelas, String divisi){
        this.nama = nama;
        this.kelas = kelas;
        this.divisi = divisi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }
}
