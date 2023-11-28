/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.josephus;
import java.util.ArrayList;

/**
 *
 * @author joseliojr
 */
public class Pessoas {
    ArrayList<Dados> listaDePessoas = new ArrayList<>();
    
    public Pessoas(){
    listaDePessoas.add(new Dados(1, "Joao", "(01) 90101-0101","Rua 01 - Q.01 Lt.01 CEP:01010-101", "010.101.010-10"));
    listaDePessoas.add(new Dados(2, "Carlos", "(02) 90202-0202","Rua 02 - Q.02 Lt.02 CEP:02020-202", "020.202.020-20"));
    listaDePessoas.add(new Dados(3, "Marta", "(03) 90303-0303","Rua 03 - Q.03 Lt.03 CEP:03030-303", "030.303.030-30"));
    listaDePessoas.add(new Dados(4, "Maria", "(04) 90404-0404","Rua 04 - Q.04 Lt.04 CEP:04040-404", "040.404.040-40"));
    listaDePessoas.add(new Dados(5, "Roberto", "(05) 90505-0505","Rua 05 - Q.05 Lt.05 CEP:05050-505", "050.505.050-50"));
    listaDePessoas.add(new Dados(6, "Rodrigo", "(06) 90606-0606","Rua 06 - Q.06 Lt.06 CEP:06060-606", "060.606.060-60"));
    listaDePessoas.add(new Dados(7, "Junior", "(07) 90707-0707","Rua 07 - Q.07 Lt.07 CEP:07070-707", "070.707.070-70"));
    listaDePessoas.add(new Dados(8, "Claudia", "(08) 90808-0808","Rua 08 - Q.08 Lt.08 CEP:08080-808", "080.808.080-80"));
    listaDePessoas.add(new Dados(9, "Fatima", "(09) 90909-0909","Rua 09 - Q.09 Lt.09 CEP:09090-909", "090.909.090-90"));
    listaDePessoas.add(new Dados(10, "Rick", "(10) 91010-1010","Rua 10 - Q.10 Lt.10 CEP:10101-010", "101.010.101-01"));
    listaDePessoas.add(new Dados(11, "Roberta", "(11) 91111-1111","Rua 11 - Q.11 Lt.11 CEP:11111-111", "111.111.111-11"));
    listaDePessoas.add(new Dados(12, "Livio", "(12) 91212-1212","Rua 12 - Q.12 Lt.12 CEP:12121-212", "121.212.121-21"));
    listaDePessoas.add(new Dados(13, "Claudio", "(13) 91313-1313","Rua 13 - Q.13 Lt.13 CEP:13131-313", "131.313.131-31"));
    listaDePessoas.add(new Dados(14, "Bruno", "(14) 91414-1414","Rua 14 - Q.14 Lt.14 CEP:14141-414", "141.414.141-41"));
    listaDePessoas.add(new Dados(15, "Batista", "(15) 91515-1515","Rua 15 - Q.15 Lt.15 CEP:15151-515", "151.515.151-51"));
    listaDePessoas.add(new Dados(16, "Neto", "(16) 91616-1616","Rua 16 - Q.16 Lt.16 CEP:16161-616", "161.616.161-61"));
    listaDePessoas.add(new Dados(17, "Pedro", "(17) 91717-1717","Rua 17 - Q.17 Lt.17 CEP:17171-717", "171.717.171-71"));
    listaDePessoas.add(new Dados(18, "Aline", "(18) 91818-1818","Rua 18 - Q.18 Lt.18 CEP:18181-818", "181.818.181-81"));
    listaDePessoas.add(new Dados(19, "Adriana", "(19) 91919-1919","Rua 19 - Q.19 Lt.19 CEP:19191-919", "191.919.191-91"));
    listaDePessoas.add(new Dados(20, "Francisco", "(20) 92020-2020","Rua 20 - Q.20 Lt.20 CEP:20202-202", "202.020.202-02"));
    }
    
    public ArrayList<Dados> getListaDePessoas(){
        return listaDePessoas;
    }
    
    public int sobrevivente(int m){
        int x = listaDePessoas.size();
        int calc = 0;
        
        while(x>1){
            calc=(calc+m-1)%x;
            
            listaDePessoas.remove(calc);
            x--;
        }
        return listaDePessoas.get(0).getNumero();
    }
}
