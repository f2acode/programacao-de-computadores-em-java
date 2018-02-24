package br.com.livro.capitulo22.exemplos;
import java.util.Collections;
import java.util.ListIterator;
import java.util.List;
import java.util.ArrayList;

public class Livro {
  private int codigo;
  private String titulo;
  private int ano;
  private Editora editora;
  private List<Autor> autores;
  private List<Capitulo> capitulos;
  
  public Livro() {
    titulo = "";
    editora = new Editora();
    autores = new ArrayList<Autor>();
    capitulos = new ArrayList<Capitulo>();
  }
  
  public Livro(int codigo, String titulo, int ano, Editora editora) {
    setCodigo(codigo);
    setTitulo(titulo);
    setAno(ano);
    setEditora(editora);
    autores = new ArrayList<Autor>();
    capitulos = new ArrayList<Capitulo>();
  }
  
  public int getCodigo() {
    return codigo;
  }
  
  public String getTitulo() {
    return titulo;
  }
  
  public int getAno() {
    return ano;
  }
  
  public Editora getEditora() {
    return editora;
  }
  
  public List<Autor> getAutores() {
    if (autores == null) autores = new ArrayList<Autor>();
    return autores;
  }
  
  public List<Capitulo> getCapitulos() {
    if (capitulos == null) capitulos = new ArrayList<Capitulo>();
    return capitulos;
  }
  
  public ListIterator<Autor> getIteratorAutores() {
    if (autores == null) autores = new ArrayList<Autor>();
    return autores.listIterator();
  }
  
  public ListIterator<Capitulo> getIteratorCapitulos() {
    if (capitulos == null) capitulos = new ArrayList<Capitulo>();
    return capitulos.listIterator();
  }
  
  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }
  
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  
  public void setAno(int ano) {
    this.ano = ano;
  }
  
  public void setEditora(Editora editora) {
    this.editora = editora;
  }
  
  public void setAutores(List<Autor> autores) {
    this.autores = autores;
  }
  
  public void setCapitulos(List<Capitulo> capitulos) {
    this.capitulos = capitulos;
  }
  
  public void incluirAutor(Autor autor) {
    if (autor == null || autores.contains(autor)) return;
    if (autores == null) autores = new ArrayList<Autor>();
    autores.add(autor);
  }
  
  public void incluirCapitulo(Capitulo capitulo) {
    if (capitulo == null || capitulos.contains(capitulo)) return;
    if (capitulos == null) capitulos = new ArrayList<Capitulo>();
    capitulos.add(capitulo);
  }
  
  public void excluirAutor(Autor autor) {
    if (autor == null || autores == null) return;
    if (autores.contains(autor))
      autores.remove(autor);
  }
  
  public void excluirCapitulo(Capitulo capitulo) {
    if (capitulo == null || capitulos == null) return;
    if (capitulos.contains(capitulo))
      capitulos.remove(capitulo);
  }
  
  public void limparAutores() {
    if (autores != null) autores.clear();
  }
  
  public void limparCapitulos() {
    if (capitulos != null) capitulos.clear();
  }
  
  public void ordenarAutores() {
    Collections.sort(autores);
  }
  
  public void ordenarCapitulos() {
    Collections.sort(capitulos);
  }
  
  public String toString() {
    return codigo + " - " + titulo + " - " + ano + " - " + 
      editora.getNome();
  }
}
