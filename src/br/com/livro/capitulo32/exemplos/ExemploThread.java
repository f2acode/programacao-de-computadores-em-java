package br.com.livro.capitulo32.exemplos;
public class ExemploThread {
  public static void main(String[] args) {
    Thread tc = Thread.currentThread();
    
    tc.setName("Thread corrente");
    tc.setPriority(Thread.MIN_PRIORITY);
    System.out.println("Nome: " + tc.getName());
    System.out.println("Prioridade: " + tc.getPriority());
    
    try {Thread.sleep(1000);}
    catch(InterruptedException iex) {
      System.out.println("Erro: thread interrompida");
    }
    
    System.out.println();
    tc.setName("Thread �nica");
    tc.setPriority(Thread.MAX_PRIORITY);
    System.out.println("Nome: " + tc.getName());
    System.out.println("Prioridade: " + tc.getPriority());
    
    try {Thread.sleep(1000);}
    catch(InterruptedException iex) {
      System.out.println("Erro: thread interrompida");
    }
    
    System.out.println();
    tc.setName("Thread atual");
    tc.setPriority(Thread.NORM_PRIORITY);
    System.out.println("Nome: " + tc.getName());
    System.out.println("Prioridade: " + tc.getPriority());
  }
}
