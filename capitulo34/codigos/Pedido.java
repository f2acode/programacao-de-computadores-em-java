import java.util.*;

public class Pedido {
  private int numero;
  private Date data;
  private Date horario;
  private int idCliente;
  private char status;
  private List<Item> itens;
  
  public Pedido() {
    this(0,null,null,0,'A');
  }
  
  public Pedido(int numero, Date data, Date horario,
    int idCliente, char status) {
    setNumero(numero);
    setData(data);
    setHorario(horario);
    setIdCliente(idCliente);
    setStatus(status);
    itens = new ArrayList<Item>();
  }

  public int getNumero() {
    return numero;
  }

  public Date getData() {
    return data;
  }

  public Date getHorario() {
    return horario;
  }

  public int getIdCliente() {
    return idCliente;
  }

  public char getStatus() {
    return status;
  }
  
  public List<Item> getItens() {
    return itens;
  }
  
  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public void setHorario(Date horario) {
    this.horario = horario;
  }

  public void setIdCliente(int idCliente) {
    this.idCliente = idCliente;
  }

  public void setStatus(char status) {
    this.status = status;
  }
  
  public void setItens(List<Item> itens) {
    this.itens = itens;
  }
  
  public void incluirItem(Item item) {
    if (item == null) return;
    if (itens.contains(item)) itens.set(itens.indexOf(item), item);
    else itens.add(item);
  }
  
  public void excluirItem(Item item){
    if (item == null) return;
    if (itens.contains(item)) itens.remove(item);
  }
  
  public void limparItens() {
    itens.clear();
  }
}
