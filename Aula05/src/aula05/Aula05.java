package aula05;
public class Aula05 {
    public static void main(String[] args) {
      ContaBanco c1 = new ContaBanco();
      c1.setNumConta(11111);
      c1.setDono("Magnovaldo");
      c1.abrirConta("CC");
  
      ContaBanco c2 = new ContaBanco();
      c2.setNumConta(22222);
      c2.setDono("Lucas Magno");
      c2.abrirConta("CP");

      
      c1.depositar(100);
      c2.depositar(500);
      
      c1.estadoAtual();
      c2.estadoAtual();
    }
    
}
