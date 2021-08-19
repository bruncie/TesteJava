import java.time.LocalDateTime;

public class Elevador1 {
    private int andarAtual;
    private int ultimoandar;
    private int capacidade;
    private int pessoasTotal;

    Elevador1(){
        this.andarAtual = 0;
        this.pessoasTotal = 0;
    }

    public void inicializar(){
        this.ultimoandar = getUltimoandar();
        this.capacidade = getCapacidade();
        LocalDateTime datahora = LocalDateTime.now();
        System.out.println("Elevador de " +  this.ultimoandar + " andares" + 
                         " com capacidade para " + this.capacidade + " pessoas " +
                          "iniciado às " + datahora +
                         " com " + this.pessoasTotal + 
                         " no andar " +this.andarAtual);
    }

    public int entrar( int x ){

        if(this.pessoasTotal <= this.capacidade){
            this.pessoasTotal = this.pessoasTotal + x;
            System.out.println("Entre, só temos "+this.pessoasTotal+" pessoas");
        }else{
            System.out.println("O elevador está cheio, aguarde");
        }
        return this.pessoasTotal;
    }

    public int sair( int x ){
        if(this.pessoasTotal>0){
            this.pessoasTotal = this.pessoasTotal - x;
            System.out.println("Número total de pessoas no elevador: "+this.pessoasTotal);
        }else{
            System.out.println("O elevador está vasio.");
        }
        return this.pessoasTotal;
    }

    public int subir(){
        if(this.andarAtual < this.ultimoandar){
            this.andarAtual++;
            System.out.println("Subindo para o  " + this.andarAtual + " andar.");
        }else{
            System.out.println("Esse é o último andar.");
        }
        return this.andarAtual;
    }

    public int descer(){
        if ( this.andarAtual == 0 ){
            System.out.println("Vocẽ está no terreo");
        }else{
            this.andarAtual = this.andarAtual--;
            System.out.println("Você está descendo para o " + this.andarAtual + "andar");
        }
        return this.andarAtual;
    }



    public int getAndarAtual(){
        return andarAtual;
    }
    public void setAndarAtual(int andarAtual){
        this.andarAtual = andarAtual;
    }
    public int getUltimoandar(){
        return ultimoandar;
    }
    public void setUltimoandar(int ultimoandar){
        this.ultimoandar = ultimoandar;
    }
    public int getCapacidade(){
        return capacidade;
    }
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
    public int getPessoasTotal(){
        return pessoasTotal;
    }
    public void setPessoasTotal(int pessoasTotal){
        this.pessoasTotal = pessoasTotal;
    }
}
