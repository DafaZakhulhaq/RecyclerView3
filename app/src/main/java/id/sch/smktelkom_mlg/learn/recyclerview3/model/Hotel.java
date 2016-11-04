package id.sch.smktelkom_mlg.learn.recyclerview3.model;

import java.io.Serializable;

/**
 * Created by Dafa Zakhulhaq on 02/11/2016.
 */

public class Hotel implements Serializable {

    public String judul;
    public String deskripsi;
    public String foto;
    public String lokasi;
    public String detail;


    public Hotel(String judul, String deskripsi, String foto, String lokasi, String detail) {

        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
        this.lokasi = lokasi;
        this.detail = detail;

    }


}
