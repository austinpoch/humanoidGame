/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Austin Poch
 */
public class LocationControl {
 public int ironShopCalculations(int iron, int lbsPerGun, int lbsPerSword){
     int output = 0;
     
     if (iron >= 18 || iron <= 36 || lbsPerGun == 1 || lbsPerGun == 3 || 
        lbsPerGun == 6 || lbsPerSword == 1 || lbsPerSword == 3 || lbsPerSword == 6){
        output = (iron - (lbsPerGun * 3)) / lbsPerSword;
         return output;
     }
     else
         return -1;
     }
   
   public int gunShopCalculations(int mags, int rounds, int grains){
     
       int output = 0;
     
     if (1 <= mags || mags <= 5 || 10 <= rounds || rounds <= 20 || 
             100 <= grains || grains <= 150){
         output = (mags * rounds * grains);
         return output;
     }
     else
         return -1;  
   }
   
   public int forestCalculations(int loggers, int hoursPerTree, int totalHours){
       int output;
       
       if (1 <= loggers || loggers <= 5 || 1 <= hoursPerTree || 
               hoursPerTree <= 5 || 8 <= totalHours || totalHours <= 20){
           output = (loggers * hoursPerTree * totalHours);
       return output;
       }
       else
           return -1;
    }   
}
