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
public class Persegi implements MenghitungBidang{

    float panjang;
    float lebar;
    float luas;
    public Persegi(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.luas = hitungLuas();
    }
    
    @Override
    public float hitungLuas(){
        return this.panjang * this.lebar;
    }
    
    @Override
    public float hitungKeliling(){
        return 2 * (this.panjang + this.lebar);
    }
    
}
