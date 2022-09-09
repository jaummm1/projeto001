
package atividade01;

import javax.swing.JOptionPane;
// subtrair(tipo valor)
// dividir(tipo valor)
// multiplicar(tipo valor)
// atributo para representar o valor deste objeto

public class Numero {

  private int x;
  private int valor;

  public void somar() {
    this.x += this.valor;
    JOptionPane.showMessageDialog(null, "A soma é: " + this.x);
  }

  public void subtrair() {
    this.x -= this.valor;
    JOptionPane.showMessageDialog(null, "A subtração dos valores é: " + this.x);
  }

  public void dividir() {
    this.x /= this.valor;
    JOptionPane.showMessageDialog(null, "A Divisão dos valores é: " + this.x);
  }

  public void multiplicar() {
    this.x *= this.valor;
    JOptionPane.showMessageDialog(null, "A multiplicação dos valores é: " + this.x);
  }

  public void valor(int x, int valor) {
    this.x = x;
    this.valor = valor;
  }

}
