package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "bhaskaraServlet", urlPatterns = {"/dataClient"})
public class bhaskaraServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        double a = Double.parseDouble(request.getParameter("numberOne"));
        double b = Double.parseDouble(request.getParameter("numberTwo"));
        double c = Double.parseDouble(request.getParameter("numberThree"));
        
        if(a == 0){
            System.out.println("Erro: o elemento A é zero");
            return;
        }
        
        double delta = Math.pow(b,2) - 4*a*c;
        System.out.println(Math.sqrt(delta));
        
        if(delta < 0){
            System.out.println("O delta é negativo. Equação não possui raízes reais");
            return;
        }
        
        double xPos = (-b + Math.sqrt(delta)) / (2*a) ;
        double xNeg = (-b - Math.sqrt(delta)) / (2*a) ;
        
        
        System.out.println("Delta positivo: " + xPos);
        System.out.println("Delta negativo: " + xNeg);
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
