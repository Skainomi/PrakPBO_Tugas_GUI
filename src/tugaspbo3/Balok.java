/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo3;

/**
 *
 * @author maaid
 */
public class Balok extends Persegi implements MenghitungRuang {

    float volume;
    float luasPermukaanVolume;
    float tinggi;
    
    public Balok(float panjang, float lebar, float tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public float hitungVolume() {
        return super.panjang * this.tinggi * super.lebar;
    }

    @Override
    public float hitungLuasPermukaan() {
        return 2 * ((super.panjang * super.lebar) + (super.lebar * this.tinggi) + (this.tinggi * super.panjang));
    }

    @Override
    public float hitungKeliling() {
        return super.hitungKeliling(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float hitungLuas() {
        return super.hitungLuas(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
