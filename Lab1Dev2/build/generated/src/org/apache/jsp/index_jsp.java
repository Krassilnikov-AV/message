package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("         <title>Cообщение</title>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write(" <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write(" <title> Messages </title>\n");
      out.write("        <style>\n");
      out.write("            from {\n");
      out.write("                font-size: larger;\n");
      out.write("                      }\n");
      out.write("                      body {\n");
      out.write("                          background-color: #00FF00;\n");
      out.write("                      }\n");
      out.write("        </style>       \n");
      out.write("    </head>\n");
      out.write("   <!--\n");
      out.write("         body - Этот элемент заключает в себе гипертекст, который определяет\n");
      out.write("   собственно Web страницу. Это та произвольная часть документа, которую\n");
      out.write("   разрабатывает автостраницы и которая отображается броузером.\n");
      out.write("   Соответственно, конечный тег этс го элемента надо искать в конце HTML-файла.\n");
      out.write("   Внутри элемента BODY можно использовать все элементы, предназначенные для дизайна\n");
      out.write("   Web-страницы. Внутри начального тега элемента BODY можно расположить ряд атрибутов, \n");
      out.write("   обеспечивающих установки для всей страницы целиком.\n");
      out.write("          \n");
      out.write("   -->\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        ");
 String msg = (String)request.getAttribute("msg");
        if(msg != null) {
            out.println("<h1>" + msg + "</h1>");
        }
        
      out.write("\n");
      out.write("        <!-- \n");
      out.write("            form - этот элемент необходим для построения достаточно сложных форм.\n");
      out.write("        После заполнения формы и подтверждения ввода со стороны пользователя,\n");
      out.write("        введенная информация пересылается на сервер и обрабатывается при помощи\n");
      out.write("        CGI-программы, связанной с формой\n");
      out.write("           action - этот атрибут  должен указывать на имя программы с помощью атрибута\n");
      out.write("        method можно задать протокол для пересылки данных на сервер. \n");
      out.write("        Протокол GET используется по умолчанию, но в большинстве случаев он\n");
      out.write("        не удовлетворяет разработчиков, поэтому чаще используется протокол POST.\n");
      out.write("         -->\n");
      out.write("        <form action=\"Lab1\" method=\"POST\" target=\"blank\">\n");
      out.write("       <!--\n");
      out.write("         -  input этот элемент позволяет создавать различные части формы, такие как флажки\n");
      out.write("       переключатели, поля ввода. Элемент не имеет конечного тега, так как все параметры\n");
      out.write("       задаются при помощи атрибутов.\n");
      out.write("         -  type - этот элемент определяет вид атрибута:\n");
      out.write("         -  type=\"text\" - создание поля ввода, в котором можно автоматически разместить\n");
      out.write("       произвольный текст, используя атрибут value\n");
      out.write("         -  type=\"submit\" — создание кнопки, щелчок на которой подтверждает ввод информации\n");
      out.write("       в форму. Атрибут value используется для определения надписи на кнопке;\n");
      out.write("         -  type=\"reset\" — тоже кнопка, но для отмены ввода данных в форму;\n");
      out.write("       -->\n");
      out.write("       <input type=\"text\" name=\"info\" size=\"25\" /> \n");
      out.write("        <input type=\"submit\" value=\"Send\" />  \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- чтобы просмотреть содержимое изменений,\n");
      out.write("      достатточно созранить изменения, в браузере изменения отобразятся.\n");
      out.write("-->");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
