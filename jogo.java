package Brasileirao;

import java.util.Random;

public class Jogo {
    private time desafiado;
    private time desafiante;
    private int rouds;
    private boolean aprovada;
    public void marcarjogo(time l1,time l2){
        if(l1.getSerie()==l2.getSerie()&&l1!=l2){
            this.aprovada=true;
            this.desafiado=l1;
            this.desafiante=l2;
        }
        else{
            this.aprovada=false;
            this.desafiado=null;
            this.desafiante=null;
        }
    }
    public  void jogar(){
        if(this.aprovada)
        {   System.out.println("=======================");
            System.out.println("#### Time Desefiado ####");    
            this.desafiado.apresentar();
            System.out.println("### Time Desafiante ####");
            this.desafiante.apresentar();
            Random aleatorio=new Random();
            int vencedor=aleatorio.nextInt(3);
                    switch(vencedor){
                        case 0:
                            System.out.println("empatou");
                            this.desafiado.empatarjogo();
                            this.desafiante.empatarjogo();
                            break;
                        case 1:
                            System.out.println("vencedor: "+this.desafiado.getNome());
                            this.desafiado.ganharjogo();
                            this.desafiante.perderjogo();
                            break;
                        case 2:
                            System.out.println("vencedor");
                            this.desafiado.perderjogo();
                            this.desafiante.ganharjogo();
                            break;
                    }
                    System.out.println("=============================");
        }
        else{
            System.out.println("Nao Pode Ter o Jogo:");
        }
    }

    

    public time getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(time desafiado) {
        this.desafiado = desafiado;
    }

    public time getDesafinate() {
        return desafiante;
    }

    public void setDesafinate(time desafinate) {
        this.desafiante = desafinate;
    }

    public int getRouds() {
        return rouds;
    }

    public void setRouds(int rouds) {
        this.rouds = rouds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    @Override
    public String toString() {
        return "Jogo{" + "desafiado=" + desafiado + ", desafiante=" + desafiante + ", rouds=" + rouds + ", aprovada=" + aprovada + '}';
    }
    
    
}
