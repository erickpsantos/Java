
package Brasileirao;
public class time {
    private String nome;
    private String nacionalidade;
    private String divisao;
    private int vitorias;
    private int derrotas;
    private int empates;
    public void apresentar(){
        System.out.println("divisao:"+this.getSerie());
        System.out.println("time: "+this.getNome());
        System.out.println("origem: "+this.getNacionalidade());
        System.out.println("ganhou: "+this.getVitorias());
        System.out.println("perdeu: "+this.getDerrotas());
        System.out.println("empatou: "+this.getEmpates());
    
    }
    public void  status(){
        System.out.println(this.getNome());
        System.out.println(this.getSerie());
        System.out.println(this.getVitorias()+" vitorias");
        System.out.println(this.getDerrotas()+" derrotas");
        System.out.println(this.getEmpates()+ " empates");    
                
        
    }
    public void ganharjogo(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderjogo(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarjogo(){
        this.setEmpates(this.getDerrotas()+1);
    }

    public time(String nome, String nacionalidade,String Serie,int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.divisao=Serie;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    public String getSerie(){
       return divisao;
    
    }

    @Override
    public String toString() {
        return "time{" + "nome=" + nome + ", nacionalidade=" + nacionalidade + ", divisao=" + divisao + ", vitorias=" + vitorias + ", derrotas=" + derrotas + ", empates=" + empates + '}';
    }

   
    public void setSerie(String serie){
        this.divisao=serie;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    

   
    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    
    
}
