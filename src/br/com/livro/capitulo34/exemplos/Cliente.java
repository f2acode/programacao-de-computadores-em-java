package br.com.livro.capitulo34.exemplos;
import java.text.*;
import java.util.Date;

public class Cliente{
  private int codigo;
  private String nome;
  private String cpf;
  private Date nascimento;
  
  public Cliente() {
    this(0,"","",new Date());
  }
  
  public Cliente(int codigo,String nome){
    setCodigo(codigo);
    setNome(nome);
  }
  
  public Cliente(int codigo,String nome,String cpf,Date nascimento){
    setCodigo(codigo);
    setNome(nome);
    setCpf(cpf);
    setNascimento(nascimento);
  }
  
  public int getCodigo() {
    return codigo;
  }
  
  public String getNome() {
    return nome;
  }
  
  public String getCpf() {
    return cpf;
  }
  
  public Date getNascimento() {
    return nascimento;
  }
  
  public String getNascimentoFmt() {
    DateFormat df = DateFormat.getDateInstance();
    return df.format(nascimento);
  }
  
  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }
  
  public void setCodigo(String codigo) {
    setCodigo( Integer.parseInt(codigo) );
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public void setCpf(String cpf) {
    cpf = cpf.replaceAll("\\.","").replaceAll("-","");
    this.cpf = cpf;
  }
  
  public void setNascimento(Date nascimento) {
    this.nascimento = nascimento;
  }
  
  public void setNascimento(String nascimento) {
    try {
      DateFormat df = DateFormat.getDateInstance();
      df.setLenient(false);
      setNascimento(df.parse(nascimento));
    }
    catch(ParseException pe) {
    }
  }
  
  public String toString() {
    return nome;
  }
  
  public boolean equals(Object obj) {
    if (obj == null || getClass() != obj.getClass()) return false;
    if (this == obj) return true;
    final Cliente outro = (Cliente)obj;
    if (codigo == outro.codigo) return true;
    else return false;
  }
  
  public int hashCode() {
    return 31 + codigo;
  }
}