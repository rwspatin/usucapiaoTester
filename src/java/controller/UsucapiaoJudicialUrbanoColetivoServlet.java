/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rwspa
 */
public class UsucapiaoJudicialUrbanoColetivoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String url = "/resultado.jsp";
        String mensagem = "";

        boolean animusDomini = Boolean.parseBoolean(request.getParameter("animusDomini"));
        int prazo = Integer.parseInt(request.getParameter("prazo"));
        boolean posseMansa = Boolean.parseBoolean(request.getParameter("posseMansa"));
        boolean possePassifica = Boolean.parseBoolean(request.getParameter("possePassifica"));
        boolean posseIninterrupta = Boolean.parseBoolean(request.getParameter("posseIninterrupta"));
        int tamanhoTerreno = Integer.parseInt(request.getParameter("tamanhoTerreno"));
        boolean pessoalidade = Boolean.parseBoolean(request.getParameter("pessoalidade"));
        boolean imovelUrbano = Boolean.parseBoolean(request.getParameter("imovelUrbano"));
        boolean registroDeOutroImovel = Boolean.parseBoolean(request.getParameter("registroDeOutroImovel"));
        

        UsucapiaoJudicialUrbanoColetivoController objUsucapiaoController = new UsucapiaoJudicialUrbanoColetivoController();
        boolean vRetorno = objUsucapiaoController.Instancia(animusDomini, prazo, posseMansa, possePassifica, posseIninterrupta, tamanhoTerreno, pessoalidade, imovelUrbano, registroDeOutroImovel);
        if (!vRetorno) {
            mensagem = "Erro. Objeto não Instanciado.";
        } else {
            String usucapiao = objUsucapiaoController.Verifica();
            mensagem = "O resultado: " + usucapiao;
        }
        request.setAttribute("mensagem", mensagem);

        getServletContext().getRequestDispatcher(url).forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
