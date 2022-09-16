/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ListaEmpresasServlet", urlPatterns = {"/listaEmpresas"})
public class ListaEmpresasServlet extends HttpServlet {

    
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Banco banco = new Banco();
        List<Empresa> lista = banco.getEmpresas();
     
        PrintWriter out = response.getWriter();
        
        out.println("<html><body>");
        out.println("<ul>");
        for (Empresa empresa : lista){
                out.println("<li>" + empresa.getNome() + "</li>");
            }    
        out.println("</ul>");
        out.println("</body></html>");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    

}
