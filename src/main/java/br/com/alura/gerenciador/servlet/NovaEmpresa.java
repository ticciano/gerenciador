/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "novaEmpresa", urlPatterns = {"/novaEmpresa"})
public class NovaEmpresa extends HttpServlet {

    protected void processRequest (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        Empresa empresa = new Empresa();
        Banco banco = new Banco();
        
        
        
        empresa.setNome(request.getParameter("nome"));
        banco.adiciona(empresa);
        
        //charmar JSP
        RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresa.jsp");
        request.setAttribute("empresa", empresa.getNome());
        rd.forward(request, response);
  

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
