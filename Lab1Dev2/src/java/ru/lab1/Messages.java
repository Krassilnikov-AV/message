/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lab1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alekra
 */
@WebServlet(name = "Messages", urlPatterns = {"/Messages"})
public class Messages extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 
//  
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
                                                                throws ServletException, IOException {
        // команда позволяющая считывать русские буквы
        request.setCharacterEncoding("UTF-8");
      
        response.setContentType("text/html;charset=UTF-8");
// получаем параметры строки прописанные в HTML с указанием в качестве параметра имени 
        String info = request.getParameter("info");
// выводим число целое
       int k = 0;           // к - целое число (слово)
       // flag - переменная для обозначения является ли числом введенное значение
       int flag = 0;        
// обработка запроса 
       try {
           k = Integer.parseInt(info);        
           flag = 1;
       } catch(NumberFormatException nfe) {
        // если строка 
           if(!info.trim().isEmpty()) {
               // если  не число
               flag = 0;
               k = info.split(" +").length;    // количество слов
           }  
           else {     
// если строка не введена
// setAttribute() - этот метод устанавливает атрибут, который можно получить в jsp.
               request.setAttribute("msg", "Пустая строка");
         //желательно делать до того как перешли на другую страницу    
               request.getRequestDispatcher("index.jsp").forward(request, response);     
           }
       }
  // вывод ответа в браузере     
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Lab1</title>");            
            out.println("</head>");
            out.println("<body>");
// метод getContextPath - 

            out.println("<h1>Servlet Messages at " + request.getContextPath() + "</h1>");
            if( flag==0)       
            {
            out.println("<h1>Servlet  Получена строка: " + info + "</h1>");
            out.println("<h1>Servlet  Количество слов: " + k + "</h1>");
            }
            if(flag==1)
            out.println("<h1>Servlet  Число больше введенного: " + (k+1) + "</h1>");                   
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
/* Get не сможет принимать объемный текст,
                   с целыми томами лучше справится POST.
*/