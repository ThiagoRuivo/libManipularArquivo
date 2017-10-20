/*
  Cabeçalho
  Data: 18/10/2017
  Autor: Thiago Baldykowski
  Descrição: 
*/
package ManipularArquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManipularArquivo {
  /*
    Campos::  
  */
  private String caminhoEscrita;
  private String conteudoEscrita;
  private String nomeArquivoEscrita;
  private String caminhoLeitura;
  private String conteudoLeitura;
  private String nomeArquivoLeitura;
  private String caminhoOrigem1;
  private String caminhoOrigem2;
  private String arquivoOrigem1;
  private String arquivoOrigem2;
  private String conteudoInsercao;
  private String conteudoAlteracao;
  private String caminhaDelecao;
  private String arquivoDelecao;
  private long numeroLinhasLidas;
  private int indexInsercao; 
  private int indexAlteracao;

  /*
    Construtores::
  */
  public ManipularArquivo() {
    this.caminhoEscrita = "";
    this.caminhoLeitura = "";
    this.conteudoEscrita = "";
    this.conteudoLeitura = "";
    this.nomeArquivoEscrita = "";
    this.nomeArquivoLeitura = "";
  }
  public ManipularArquivo(String caminhoEscrita, String caminhoLeitura) {
    this.caminhoEscrita = caminhoEscrita;
    this.caminhoLeitura = caminhoLeitura;
    this.conteudoEscrita = "";
    this.conteudoLeitura = "";
    this.nomeArquivoEscrita = "";
    this.nomeArquivoLeitura = "";
  }
  public ManipularArquivo(String caminhoEscrita, String caminhoLeitura, String nomeArquivoEscrita, String nomeArquivoLeitura) {
    this.caminhoEscrita = caminhoEscrita;
    this.caminhoLeitura = caminhoLeitura;
    this.nomeArquivoEscrita = nomeArquivoEscrita;
    this.nomeArquivoLeitura = nomeArquivoLeitura;
    this.conteudoEscrita = "";
    this.conteudoLeitura = "";
  }
  public ManipularArquivo(String conteudoEscrita) {
    this.conteudoEscrita = conteudoEscrita;
    this.caminhoEscrita = "";
    this.conteudoLeitura = "";
    this.conteudoLeitura = "";
    this.nomeArquivoEscrita = "";
    this.nomeArquivoLeitura = "";
  }
  public ManipularArquivo(String caminhoEscrita, String conteudoEscrita, String nomeArquivoEscrita) {
    this.caminhoEscrita = caminhoEscrita;
    this.conteudoEscrita = conteudoEscrita;
    this.nomeArquivoEscrita = nomeArquivoEscrita;
    this.conteudoLeitura = "";
    this.conteudoLeitura = "";
    this.nomeArquivoLeitura = "";
  }
  
  // lógica de inicilização
  public void iniciarManipularArquivo () {
  }

  // gets e sets
  public String getCaminhoEscrita() {
    return caminhoEscrita;
  }
  public void setCaminhoEscrita(String caminhoEscrita) {
    this.caminhoEscrita = caminhoEscrita;
  }
  public String getCaminhoLeitura() {
    return caminhoLeitura;
  }
  public void setCaminhoLeitura(String caminhoLeitura) {
    this.caminhoLeitura = caminhoLeitura;
  }
  public String getConteudoEscrita() {
    return conteudoEscrita;
  }
  public void setConteudoEscrita(String conteudoEscrita) {
    this.conteudoEscrita = conteudoEscrita;
  }
  public String getConteudoLeitura() {
    return conteudoLeitura;
  }
  public void setConteudoLeitura(String conteudoLeitura) {
    this.conteudoLeitura = conteudoLeitura;
  }
  public String getNomeArquivoEscrita() {
    return nomeArquivoEscrita;
  }
  public void setNomeArquivoEscrita(String nomeArquivoEscrita) {
    this.nomeArquivoEscrita = nomeArquivoEscrita;
  }
  public String getNomeArquivoLeitura() {
    return nomeArquivoLeitura;
  }
  public void setNomeArquivoLeitura(String nomeArquivoLeitura) {
    this.nomeArquivoLeitura = nomeArquivoLeitura;
  }
  public String caminhoCompletoLeitura () {
    return this.caminhoLeitura + this.nomeArquivoLeitura;
  }
  public String caminhoCompletoEscrita () {
    return this.caminhoEscrita + this.nomeArquivoEscrita;
  }
  public String getCaminhoOrigem1() {
    return caminhoOrigem1;
  }
  public void setCaminhoOrigem1(String caminhoOrigem1) {
    this.caminhoOrigem1 = caminhoOrigem1;
  }
  public String getCaminhoOrigem2() {
    return caminhoOrigem2;
  }
  public void setCaminhoOrigem2(String caminhoOrigem2) {
    this.caminhoOrigem2 = caminhoOrigem2;
  }
  public String getArquivoOrigem1() {
    return arquivoOrigem1;
  }
  public void setArquivoOrigem1(String arquivoOrigem1) {
    this.arquivoOrigem1 = arquivoOrigem1;
  }
  public String getArquivoOrigem2() {
    return arquivoOrigem2;
  }
  public void setArquivoOrigem2(String arquivoOrigem2) {
    this.arquivoOrigem2 = arquivoOrigem2;
  }
  public long getNumeroLinhasLidas() {
    return numeroLinhasLidas;
  }
  public int getIndexInsercao() {
    return indexInsercao;
  }
  public void setIndexInsercao(int indexInsercao) {
    this.indexInsercao = indexInsercao;
  }
  public String getConteudoInsercao() {
    return conteudoInsercao;
  }
  public void setConteudoInsercao(String conteudoInsercao) {
    this.conteudoInsercao = conteudoInsercao;
  }
  public String getConteudoAlteracao() {
    return conteudoAlteracao;
  }
  public void setConteudoAlteracao(String conteudoAlteracao) {
    this.conteudoAlteracao = conteudoAlteracao;
  }
  public int getIndexAlteracao() {
    return indexAlteracao;
  }
  public void setIndexAlteracao(int indexAlteracao) {
    this.indexAlteracao = indexAlteracao;
  }
  public String getCaminhaDelecao() {
    return caminhaDelecao;
  }
  public void setCaminhaDelecao(String caminhaDelecao) {
    this.caminhaDelecao = caminhaDelecao;
  }
  public String getArquivoDelecao() {
    return arquivoDelecao;
  }
  public void setArquivoDelecao(String arquivoDelecao) {
    this.arquivoDelecao = arquivoDelecao;
  }

  // métodos de ação
  private String enter () {
    return System.getProperty("line.separator");
  }
  private void inverterCaminhos() {
    String caminhoEscritoAntigo = this.caminhoEscrita;
    String nomeArquivoAntigo = this.nomeArquivoEscrita;
    this.caminhoEscrita = this.caminhoLeitura;
    this.nomeArquivoEscrita = this.nomeArquivoLeitura;
    this.caminhoLeitura = caminhoEscritoAntigo;
    this.nomeArquivoLeitura = nomeArquivoAntigo;
  }
  public void lerArquivo () throws IOException {
    String caminhoCompleto = caminhoCompletoLeitura();
    InputStream inpStream;
    File file = new File(caminhoCompleto);
    if (!"".equals(this.caminhoLeitura) && !"".equals(this.nomeArquivoLeitura)) {
      //System.out.println("Caminho e nome do arquivo com estensão estão preenchidos");
      if (file.exists()) {
        //System.out.println("O Arquivo existe");
        try {
          inpStream = new FileInputStream(caminhoCompleto);
          InputStreamReader inpStreamReader = new InputStreamReader(inpStream);
          BufferedReader bffReader = new BufferedReader(inpStreamReader);
          this.conteudoLeitura = "";
          String linha = bffReader.readLine();
          this.numeroLinhasLidas = 0;
          while (linha != null) {
            this.conteudoLeitura = this.conteudoLeitura.concat(linha + System.getProperty("line.separator"));
            linha = bffReader.readLine();
            this.numeroLinhasLidas++;
          }
          inpStream.close();
          inpStreamReader.close();
          bffReader.close();
          System.out.println("Arquivo lido com sucesso, o conteúdo do arquivo foi atribuído ao campo: 'conteudoLeitura'");
        } catch (FileNotFoundException e) {
          System.out.println("Arquivo " + caminhoCompleto + " não encontrado");
          Logger.getLogger(ManipularArquivo.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
          System.out.println("erro ao ler arquivo");
          Logger.getLogger(ManipularArquivo.class.getName()).log(Level.SEVERE, null, e);
        }
      } else {
        System.out.println("Arquivo não existe no local especificado");
      }
    }
  }
  public void escreverArquivo () {
    if (!"".equals(this.caminhoEscrita) && !"".equals(this.nomeArquivoEscrita)) {
      String caminhoCompleto = caminhoCompletoEscrita();
      try {
        FileWriter flWriter = new FileWriter(caminhoCompleto);
        BufferedWriter bffWriter = new BufferedWriter(flWriter);
        bffWriter.write(this.conteudoEscrita);
        bffWriter.close();
        System.out.println("O arquivo foi escrito com sucesso, todo o conteúdo do campo 'conteudoEscrita' foi gravado no arquivo");
      } catch (Exception e) {
        System.out.println("Erro ao tentar gravar o arquivo");
        System.out.println(e);
      }
    } else {
      System.out.println("É preciso definir o caminho e o nome do arquivo com a extensão");
    }
  }
  public void escreverFinalArquivo () throws IOException {
    String conteudoLeituraAtual = this.conteudoLeitura;
    String conteudoAtualArquivo = "";
    inverterCaminhos();
    lerArquivo();
    conteudoAtualArquivo = this.conteudoLeitura;
    conteudoAtualArquivo = conteudoAtualArquivo.concat(this.conteudoEscrita);
    this.conteudoEscrita = conteudoAtualArquivo;
    this.conteudoLeitura = conteudoLeituraAtual;
    inverterCaminhos();
    escreverArquivo();
    System.out.println("Escrita realizada no final do arquivo com sucesso");
  }
  private boolean validarCamposInsercao () {
    boolean valido[] = new boolean[6];
    boolean validade = true;
    if ("".equals(this.caminhoLeitura)) {
      valido[0] =false;
      System.out.println("O caminho de leitura não pode estar vazio");
    } else {
      valido[0] = true;
    }
    if ("".equals(this.nomeArquivoLeitura)) {
      valido[1] = false;
      System.out.println("Nome do arquivo de leitura não pode estar vazio");
    } else {
      valido[1] = true;
    }
    if ("".equals(this.caminhoEscrita)) {
      valido[2] = false;
      System.out.println("Caminho para escrita não pode estar vazio");
    } else {
      valido[2] = true;
    }
    if ("".equals(this.nomeArquivoEscrita)) {
      valido[3] = false;
      System.out.println("Nome do arquivo de escrita não pode estar vazio");
    } else {
      valido[3] = true;
    }
    if ("".equals(this.conteudoInsercao)) {
      valido[4] = false;
      System.out.println("Conteudo a ser inserido não pode estar vazio");
    } else {
      valido[4] = true;
    }
    if ("".equals(this.indexInsercao) && this.indexInsercao < 0) {
      valido[5] = false;
      System.out.println("Indíce de inserção não pode estar vazio e não pode ser menor que zero");
    } else {
      valido[5] = true;
    }
    for (int i = 0; i < valido.length; i++) {
      if (!valido[i]) {
        validade = false;
      }
    }
    return validade;
  }
  private boolean validarCamposAlteracao () {
    boolean valido[] = new boolean[4];
    boolean validade = true;
    if ("".equals(this.caminhoLeitura)) {
      valido[0] =false;
      System.out.println("O caminho de leitura não pode estar vazio");
    } else {
      valido[0] = true;
    }
    if ("".equals(this.nomeArquivoLeitura)) {
      valido[1] = false;
      System.out.println("Nome do arquivo de leitura não pode estar vazio");
    } else {
      valido[1] = true;
    }
    if ("".equals(this.conteudoAlteracao)) {
      valido[2] = false;
      System.out.println("Conteudo a ser alterado não pode estar vazio");
    } else {
      valido[2] = true;
    }
    if ("".equals(this.indexAlteracao) && this.indexInsercao < 0) {
      valido[3] = false;
      System.out.println("Indíce de alteração não pode estar vazio e não pode ser menor que zero");
    } else {
      valido[3] = true;
    }
    for (int i = 0; i < valido.length; i++) {
      if (!valido[i]) {
        validade = false;
      }
    }
    return validade;
  }
  private boolean validarCamposSelecao () {
    boolean valido[] = new boolean[2];
    boolean validade = true;
    if ("".equals(this.caminhoLeitura)) {
      valido[0] =false;
      System.out.println("O caminho de leitura não pode estar vazio");
    } else {
      valido[0] = true;
    }
    if ("".equals(this.nomeArquivoLeitura)) {
      valido[1] = false;
      System.out.println("Nome do arquivo de leitura não pode estar vazio");
    } else {
      valido[1] = true;
    }
    for (int i = 0; i < valido.length; i++) {
      if (!valido[i]) {
        validade = false;
      }
    }
    return validade;
  }
  public void alterarLinha () throws IOException {
    if (validarCamposAlteracao()) {
      lerArquivo();
      String vetor[] = this.conteudoLeitura.split(System.getProperty("line.separator"));
      String vetorFinal [] = new String [vetor.length];
      if (this.indexAlteracao >= vetor.length) {
        System.out.println("O indice informado ultrapassa o limite do número de linhas do arquivo");
      } else {
        for (int i = 0; i < this.indexAlteracao; i++) {
          vetorFinal[i] = vetor[i];
        }
        vetorFinal[this.indexAlteracao] = this.conteudoAlteracao;
        for (int i = (this.indexAlteracao + 1); i < vetorFinal.length; i++) {
          vetorFinal[i] = vetor[i];
        }
        String conteudo = "";
        for (int i = 0; i < vetorFinal.length; i++) {
          conteudo = conteudo.concat(vetorFinal[i] + System.getProperty("line.separator"));
        }
        this.conteudoEscrita = conteudo;
        this.caminhoEscrita = this.caminhoLeitura;
        this.nomeArquivoEscrita = this.nomeArquivoLeitura;
        escreverArquivo();
        System.out.println("Linha alterada com sucesso");
      }
    } else {
      System.out.println("O arquivo não pode ser alterado");
    }
  }
  public void escreverLinha () throws IOException {
    if (validarCamposInsercao()) {
      lerArquivo();
      String vetor[] = this.conteudoLeitura.split(System.getProperty("line.separator"));
      String vetorFinal [] = new String [vetor.length + 1];
      if (this.indexInsercao > vetor.length) {
        System.out.println("O indice informado ultrapassa o limite do número de linhas do arquivo");
      } else {
        for (int i = 0; i < this.indexInsercao; i++) {
          vetorFinal[i] = vetor[i];
        }
        vetorFinal[this.indexInsercao] = this.conteudoInsercao;
        for (int i = (this.indexInsercao + 1); i < vetorFinal.length; i++) {
          vetorFinal[i] = vetor[i-1];
        }
        String conteudo = "";
        for (int i = 0; i < vetorFinal.length; i++) {
          conteudo = conteudo.concat(vetorFinal[i] + System.getProperty("line.separator"));
        }
        this.conteudoEscrita = conteudo;
        escreverArquivo();
        System.out.println("Linha escrita com sucesso");
      }
    } else {
      System.out.println("O conteudo não pode ser inserido");
    }
  }
  public String selecionarLinhas (int indexInicio, int indexFinal) throws IOException {
    String linhas = "";
    if (validarCamposSelecao()) {
      lerArquivo();
      String vetor[] = this.conteudoLeitura.split(System.getProperty("line.separator"));
      if ((indexInicio < 0) || (indexFinal >= vetor.length)) {
        System.out.println("Indices de seleção fora dos limites do arquivo");
      } else {
        linhas = vetor[indexInicio] + System.getProperty("line.separator");
        for (int i = indexInicio + 1 ; i <= indexFinal; i++) {
          linhas = linhas.concat(vetor[i] + System.getProperty("line.separator"));
        }
        System.out.println("Linhas selecionados com sucesso");
      }
    }
    return linhas;
  }
  public void deletarLinha (int indexDeletar) throws IOException {
    String conteudo = "";
    this.caminhoLeitura = this.caminhaDelecao;
    this.nomeArquivoLeitura = this.arquivoDelecao;
    lerArquivo();
    String vetor[] = this.conteudoLeitura.split(System.getProperty("line.separator"));
    String vetorFinal[] = new String[vetor.length - 1];
    if ((indexDeletar < 0) || (indexDeletar > vetor.length)) {
      System.out.println("Linha não pode ser deletado, pois, está fora dos limites do arquivo");
    } else {
      for (int i = 0; i < indexDeletar; i++) {
        vetorFinal[i] = vetor[i];
      }
      for (int i = indexDeletar; i < vetorFinal.length; i++) {
        vetorFinal[i] = vetor[i + 1];
      }
      for (int i = 0; i < vetorFinal.length; i++) {
        conteudo = conteudo.concat(vetorFinal[i] + enter());
      }
      System.out.println("Linha deletada com sucesso");
    }
    this.conteudoEscrita = conteudo;
    this.caminhoEscrita = this.caminhaDelecao;
    this.nomeArquivoEscrita = this.arquivoDelecao;
    escreverArquivo();
  }
  public void concatenarArquivos () throws IOException {
    if (  (!"".equals(this.caminhoOrigem1)) && (!"".equals(this.caminhoOrigem2)) 
       && (!"".equals(this.arquivoOrigem1)) && (!"".equals(this.arquivoOrigem2))) {
      String caminhoCompletoOrigem1 = this.caminhoOrigem1 + this.arquivoOrigem1;
      String caminhoCompletoOrigem2 = this.caminhoOrigem2 + this.arquivoOrigem2;
      File fileOrigem1 = new File(caminhoCompletoOrigem1);
      File fileOrigem2 = new File(caminhoCompletoOrigem2);
      if ((fileOrigem1.exists() == true) && (fileOrigem2.exists() == true)) {
        String conteudoAntigo = this.conteudoLeitura;
        String caminhoAntigo = this.caminhoLeitura;
        String arquivoAntigo = this.nomeArquivoLeitura;
        this.caminhoLeitura = this.caminhoOrigem1;
        this.nomeArquivoLeitura = this.arquivoOrigem1;
        lerArquivo();
        long numero = this.numeroLinhasLidas;
        String conteudoArquivoOrigem1 = this.conteudoLeitura;
        //this.conteudoLeitura = "";
        this.caminhoLeitura = this.caminhoOrigem2;
        this.nomeArquivoLeitura =this.arquivoOrigem2;
        lerArquivo();
        numero += this.numeroLinhasLidas;
        String conteudoArquivoOrigem2 = this.conteudoLeitura;
        this.conteudoEscrita = conteudoArquivoOrigem1 + conteudoArquivoOrigem2;
        escreverArquivo();
        this.conteudoLeitura = conteudoAntigo;
        this.caminhoLeitura = caminhoAntigo;
        this.nomeArquivoLeitura = arquivoAntigo;
        this.numeroLinhasLidas = numero + 1;
        System.out.println("Arquivos unidos com sucesso");
      } else {
        System.out.println("Os arquivos informados não existem");
      }
    } else {
      System.out.println("Verifique os caminhos e os arquivos de origem, pois, estão vazios");
    }
  }
  public void retirarEspaçoVazio () throws IOException {
    lerArquivo();
    String conteudo[] = this.conteudoLeitura.split(enter());
    for (int i = 0; i < conteudo.length; i++) {
      conteudo[i]= conteudo[i].trim();
    }
    String conteudoFinal = "";
    for (int i = 0; i < conteudo.length; i++) {
      conteudoFinal = conteudoFinal.concat(conteudo[i] + enter());
    }
    this.conteudoLeitura = conteudoFinal;
  }
  
  
  // demais métodos
  public void imprimirConfiguracoes () {
    System.out.println("caminho de escrita: " + this.caminhoEscrita);
    System.out.println("caminho de leitura: " + this.caminhoLeitura);
    System.out.println("nome do arquivo para escrita: " + this.nomeArquivoEscrita);
    System.out.println("nome do arquivo para leitura: " + this.nomeArquivoLeitura);
  }
  public void imprimirConteudoLido () {
    System.out.println("conteudo lido do arquivo: " + this.conteudoLeitura);
  }
  public void imprimirConteudoEscrito () {
    System.out.println("conteudo para ser escrito: " + this.conteudoEscrita);
  }
  public void imprimirCaminhoCompletoLeitura () {
    System.out.println("Caminho completo leitura: " + this.caminhoLeitura + this.nomeArquivoLeitura);
  }
  public void imprimirCaminhoCompletoEscrita () {
    System.out.println("Caminho completo escrita: " + this.caminhoEscrita + this.nomeArquivoEscrita);
  }
  
}
