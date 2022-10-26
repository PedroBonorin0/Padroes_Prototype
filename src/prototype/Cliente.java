package prototype;

public class Cliente implements Cloneable {
  private String cpf;
  private String nome;
  private Time time;
  private String cidadeNatal;

  public Cliente(String cpf, String nome, Time time, String cidadeNatal) {
    this.cpf = cpf;
    this.nome = nome;
    this.time = time;
    this.cidadeNatal = cidadeNatal;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Time getTime() {
    return time;
  }

  public void setTime(Time time) {
    this.time = time;
  }

  public String getCidadeNatal() {
    return cidadeNatal;
  }

  public void setCidadeNatal(String cidadeNatal) {
    this.cidadeNatal = cidadeNatal;
  }

  @Override
  public Cliente clone() throws CloneNotSupportedException {
    Cliente clienteClone = (Cliente) super.clone();
    clienteClone.time = (Time) clienteClone.time.clone();
    return clienteClone;
  }

  @Override
  public String toString() {
    return "Cliente{" +
            "cpf='" + getCpf() +
            "', nome='" + getNome() + '\'' +
            ", time=" + getTime() +
            ", cidadeNatal='" + getCidadeNatal() + '\'' +
            '}';
  }
}
