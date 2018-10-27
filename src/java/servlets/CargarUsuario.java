/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Negocio.entidad.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author RLCR
 */
@WebServlet(name = "CargarUsuario", urlPatterns = {"/CargarUsuario"})
public class CargarUsuario extends HttpServlet {

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
        HttpSession sesion=request.getSession(true);
        List<Usuario> usuarios=new ArrayList();
        Usuario u= new Usuario();
        u.setUsuario("test");
        u.setPass("test");
        u.setNombre("Nombre");
        u.setApellido("Apellido");
        u.setCorreo("test@test.com");
        
        usuarios.add(u);
        sesion.setAttribute("usuarios",usuarios);
        response.sendRedirect("index.jsp");
        
        
        }
    }

   