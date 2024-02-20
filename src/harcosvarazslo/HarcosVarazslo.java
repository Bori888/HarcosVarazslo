/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package harcosvarazslo;

import java.util.random.RandomGenerator;

/**
 *
 * @author IlyésBorbála(SZOFT_2
 */
public class HarcosVarazslo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int meret = 3;
        String palya = "___";
        
        for (int i =0; i<10;i++){
            int harPoz =(int) (Math.random()*meret);
            int varPoz =(int) (Math.random()*meret);
            if (harPoz == varPoz){
                if(harPoz == 0);
                    //palya = palya.substring(0, harPoz)+ "X"+ palya.substring(0, harPoz);
                    palya= "X__";
                }
                
                
                else{
                    palya= harPoz == 1 ? "_X_" :"__X"; 
                }
            
            
            }
            else{
                if (harPoz ==0){
                    if (harPoz ==1){
                        palya= "HV_";
                    }
                    
                
                    else{//varpoz==2
                       palya= "H_V";
                    }
                }
                else if (harPoz ==1){
                    if (harPoz ==0){
                        palya= "VH_";
                    }
                    
                
                    else{//varpoz==2
                       palya= "_HV";
                    }
                }
                else{//(harPoz ==1)
                    if (varPoz ==0){
                        palya= "V_H";
                    }
                    
                
                    else{//varpoz==2
                       palya= "_VH";
                    }
                }
            }
            System.out.println(palya); 
        }
        
        //System.out.println(palya);    
    }
    
}
