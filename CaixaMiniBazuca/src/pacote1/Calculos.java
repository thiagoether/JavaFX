/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote1;

/**
 *
 * @author Thiago Ether
 */
public class Calculos {
    double vb;
    float fb;
    double lv;
    float cmc;
    
    double vb(float vas, float qts, float fs){
      vb = ((Math.sqrt(vas*fs)))/((1/qts)-1);
        return vb;
    }
    
    float fb(float fs, float y){
        fb = fs*y;
        return fb;
    }
    
    double lv(double vb, double fb, double nd){
        lv = ((150000*(Math.pow(4, 2))*nd)/((Math.pow(fb, 2)*vb)))-(2*4);
        return lv;
    }
    
    float cmc(float fb){
        cmc = 34300 / (fb*16);
        return cmc;
    }
    
}
