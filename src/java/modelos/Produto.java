/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author Desenvolvimento
 */
public class Produto {
   private String descricao;
   private float preco;
   public static ArrayList<Produto> lista = new ArrayList();

   public String getDescricao() {
      return descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public float getPreco() {
      return preco;
   }

   public void setPreco(float preco) {
      this.preco = preco;
   }


}
