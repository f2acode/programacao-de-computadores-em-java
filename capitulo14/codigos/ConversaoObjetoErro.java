public class ConversaoObjetoErro{
  public static void main(String[] args) {
    Veiculo v1 = new Onibus("AAA-3388",2009,46);
    Caminhao truck = (Caminhao)v1;
  }
}