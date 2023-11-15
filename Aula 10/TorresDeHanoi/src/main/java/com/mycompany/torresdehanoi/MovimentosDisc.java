/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.torresdehanoi;

/**
 *
 * @author joseliojr
 */
public class MovimentosDisc {
    Long movimentos(long i){
        return (i==0 || i==1?i:2*movimentos(i-1)+1);
    }
}
