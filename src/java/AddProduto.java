/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.Produto;

/**
 *
 * @author Desenvolvimento
 */
public class AddProduto extends HttpServlet {

   public void doPost(HttpServletRequest request, HttpServletResponse response)
                     throws ServletException, IOException{

      String descricao = request.getParameter("descicao");
      float preco = Float.parseFloat(request.getParameter("preco"));

      Produto p = new Produto();
      p.setDescricao(descricao);
      p.setPreco(preco);

      Produto.lista.add(p);

      response.sendRedirect("index.jsp");
   }
}
