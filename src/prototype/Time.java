package prototype;

public class Time implements Cloneable {
  private String nome;
  private String pais;

  public Time(String nome, String pais) {
    super();
    this.nome = nome;
    this.pais = pais;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  @Override
  public String toString() {
    return "Time{" +
            "nome='" + getNome() + '\'' +
            ", pais='" + getPais() + "'" +
            '}';
  }
}
