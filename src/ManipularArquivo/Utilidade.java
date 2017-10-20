
package ManipularArquivo;

public class Utilidade {
  
  private ManipularArquivo manp;

  public Utilidade(ManipularArquivo manp) {
    this.manp = manp;
  }
  
  private String enter () {
    return System.getProperty("line.separator");
  }
  public void imprimirTabuada (String caminho, String nomeArquivo, int tabuada) {
    this.manp.setCaminhoEscrita(caminho);
    this.manp.setNomeArquivoEscrita(nomeArquivo);
    String conteudo = "*--------------*" + enter();
    for (int i = 1; i <= 10; i++) {
      if (i == 1) {
        conteudo = conteudo.concat("|  " + i + " x " + tabuada + " = " + (i*tabuada) + "  |" + enter() );
      } else if (i == 10) {
        conteudo = conteudo.concat("| " + i + " x " + tabuada + " = " + (i*tabuada) + " |" + enter() );
      } else {
        conteudo = conteudo.concat("|  " + i + " x " + tabuada + " = " + (i*tabuada) + " |" + enter() );
      }
    }
    conteudo = conteudo.concat("*--------------*" + enter());
    this.manp.setConteudoEscrita(conteudo);
    this.manp.escreverArquivo();
  }
  public void imprimirTabuadaQualquer (String caminho, String nomeArquivo, int tabuada, int inicio, int fim) {
    this.manp.setCaminhoEscrita(caminho);
    this.manp.setNomeArquivoEscrita(nomeArquivo);
    String conteudo = "";
    for (int i = inicio; i <= fim; i++) {
      conteudo = conteudo.concat(i + " x " + tabuada + " = " + (i*tabuada) + enter() );
    }
    this.manp.setConteudoEscrita(conteudo);
    this.manp.escreverArquivo();
  }
  
}
