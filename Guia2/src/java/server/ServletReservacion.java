/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package server;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author Kevin Flores
 */
@WebServlet(name = "ServletReservacion", urlPatterns = {"/ServletReservacion"})
public class ServletReservacion extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletReservacion</title>");
            out.println("</head>");
            out.println("<body>");
            
            String nombres = request.getParameter("tfNombres");
            String apellidos = request.getParameter("tfApellidos");
            String idHabitacion = request.getParameter("tfIDHabitacion");
            String tipoDeHabitacion = request.getParameter("rbTipoDeHabitacion");
            String fechaEntrada = request.getParameter("tfFechaEntrada");
            String fechaSalida = request.getParameter("tfFechaSalida");

            out.println("<h1>Registro exitoso de Reservacion</h1>");
            out.println("<strong>Nombres: </strong>" + nombres);
            out.println("<br><strong>Apellidos: </strong>" + apellidos);
            out.println("<br><strong>ID Habitación: </strong>" + idHabitacion);
            out.println("<br><strong>Tipo de Habitacion: </strong>" + tipoDeHabitacion);
            out.println("<br><strong>Fecha de Entrada: </strong>" + fechaEntrada);
            out.println("<br><strong>Fecha de Salida: </strong>" + fechaSalida);
            
            
            out.println("</body>");
            out.println("</html>");
        }
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
