package com.mycompany.vetorde1000num;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joseliojr
 */
public class ListaDupla {
    Celula primeira;
    Celula ultima;
    int totalDeElementos = 0;
    
    boolean posicaoOcupada(int pos){
        return((pos>=0)&&(pos<this.totalDeElementos));
        
    }
    
    Celula pegaCelula(int pos){
        if(!this.posicaoOcupada(pos)){
           System.out.println("Erro: posição não existe");
           return null;
        }else{
            Celula atual = this.primeira;

            for(int i=0;i<pos;i++){
                atual = atual.getProxima();
            }
            return(atual);
        } 
        
    }
    
    Object pega(int pos){
        return(this.pegaCelula(pos).getElemento());
        
    }
    
    void AdicionaNoComeco(Object elemento){
        if(this.totalDeElementos==0){
            Celula nova = new Celula(elemento);

            this.primeira = nova;
            this.ultima = nova;
            
        }else{
            Celula nova = new Celula(this.primeira,elemento);

            this.primeira.setAnterior(nova);
            this.primeira = nova;
            
        }
        this.totalDeElementos++;
    }
    
    void adiciona(Object elemento){
        if(this.totalDeElementos==0){
            this.AdicionaNoComeco(elemento);
            
        }else{
            Celula nova = new Celula(elemento);

            this.ultima.setProxima(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            this.totalDeElementos++;
            
        }
        
    }
    
    void adiciona(int pos, Object elemento){
        if(pos==0){
            this.AdicionaNoComeco(elemento);
            
        }else if(pos==this.totalDeElementos){
            this.adiciona(elemento);
            
        }else{
            Celula ant = this.pegaCelula(pos-1);

            Celula prox = ant.getProxima();

            Celula nova = new Celula(ant.getProxima(),elemento);

            nova.setAnterior(ant);
            ant.setProxima(nova);
            prox.setAnterior(nova);
            this.totalDeElementos++;
            
        }
    }
    
    int tamanho(){
        return(this.totalDeElementos);
    }
    
    String imprimir(){
        if(this.totalDeElementos==0){
            return("[]");
            
        }else{
            StringBuilder builder = new StringBuilder("[");

            Celula atual = this.primeira;

            for(int i=0;i<this.totalDeElementos-1;i++){

                builder.append(atual.getElemento());

                builder.append(",");
                atual = atual.getProxima();
            }
            
            builder.append(atual.getElemento());
            builder.append("]");
            return(builder.toString());                                
        }
    }
    
    public void removeNumerosPrimos() {
        Celula atual = this.primeira;

        while (atual != null) {
            Celula proxima = atual.proxima;

            if (ehPrimo((int) atual.getElemento())) {
                if (atual.anterior != null) {
                    atual.anterior.proxima = proxima;
                } else {
                    primeira = proxima;
                    if (primeira != null) {
                        primeira.anterior = null;
                    }
                }

                if (proxima != null) {
                    proxima.anterior = atual.anterior;
                }
            }

            atual = proxima;
        }
    }

    private boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}