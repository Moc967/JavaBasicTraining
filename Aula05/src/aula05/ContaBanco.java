package aula05;

public class ContaBanco {
//Atributos
public int numConta;
protected String tipo;
private String dono;
private float saldo;
private boolean status;

//Métodos Personalizados    
    public void estadoAtual(){
        System.out.println("--------------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Cliente: "+ this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        if(this.isStatus()){
            System.out.println("Status: Aberta");
        }else{System.out.println("Status: Fechada");
                }
        System.out.println("--------------------------");
    }
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo=="CC"){
            this.setSaldo(50);
        }else if(tipo =="CP") { 
            this.setSaldo(150);        
        }
        System.out.println("Conta aberta com sucesso!");
    }    
    public void fecharConta(){
        if(this.getSaldo()>0){
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
        }else if(this.getSaldo()<0){
            System.out.println("Conta não pode ser fechada pois tem débito");        
        } else {
                this.setStatus(false);
        }
        System.out.println("Conta fechada com sucesso!!");
}        
    public void depositar(float v){
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de "+ this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta fechada!");
        }
    }
    public void sacar (float valorsaque){
        if (this.isStatus()){
            if(this.getSaldo()>=valorsaque){
                this.setSaldo(this.getSaldo() - valorsaque);
                System.out.println("Saque realizado na conta de "+this.getDono());
            }  else {
                System.out.println("Saldo insuficiente para saque");
            }
        }else{
            System.out.println("Impossivel sacar de uma conta fechada!");
            }
    }
    public void pagarMensal(){
        float mensalidade = 0;
        if(this.getTipo()=="CC"){
            mensalidade = 12;
        }else if(this.getTipo()=="CP"){
                mensalidade = 20;
        }
        if (this.isStatus()){
            if(this.getSaldo()>=mensalidade){
                this.setSaldo(this.getSaldo()-mensalidade);
                System.out.println("mensalidade paga com sucesso por  "+this.getDono());
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{ 
            System.out.println("Impossivel pagar mensalidade de uma conta fechada!");
        }                
            
    }
//Métodos Especiais
    public void ContaBanco(float saldo, boolean status) {
    saldo = 0;
    status = false;        
    this.saldo = saldo;
    this.status = status;
    }
    public int getNumConta() {
        return this.numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return this.dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public boolean isStatus() {
        return this.status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
