package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signupForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/jspf/header.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/header1.jspf");
  }

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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/StyleSheet.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>Welcome to La Bella Fashion</title>\n");
      out.write("    </head>\n");
      out.write(" <body>      \n");
      out.write("       <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("           <div class=\"container-fluid\">\n");
      out.write("              <div class=\"navbar-header\">     \n");
      out.write("                  <img src=\"images/labella.jpg\" id=\"logo\" alt=\"La Bella Fashion logo\">       \n");
      out.write("              </div>   \n");
      out.write("        <div>   \n");
      out.write("           <ul class=\"nav navbar-nav navbar-left\">        \n");
      out.write("                <li class=\"active\">\n");
      out.write("                   <a href=\"index.jsp\"><Strong>WOMEN</Strong></a>\n");
      out.write("                   <ul>\n");
      out.write("                        <li><a href=\"images/product.html\">LACES & PRINTS</a></li>\n");
      out.write("                        <li><a href=\"images/fashionable.html\">FASHIONABLE FLOWERS</a></li>\n");
      out.write("                        <li><a href=\"images/work.html\">WORK</a></li>                          \n");
      out.write("                   </ul>\n");
      out.write("                </li>  \n");
      out.write("                <li>\n");
      out.write("                      <a href=\"index.jsp\"><strong>KIDS</strong></a>\n");
      out.write("                    <ul>\n");
      out.write("                      <li><a href=\"images/girls.html\">GIRLS</a></li>\n");
      out.write("                      <li><a href=\"images/boys.html\">BOYS</a></li>\n");
      out.write("                   </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                     <a href=\"index.jsp\"><strong>MEN</strong> </a>\n");
      out.write("                   <ul>\n");
      out.write("                     <li><a href=\"images/comfortably.html\">COMFORTABLY COOL</a></li>\n");
      out.write("                     <li><a href=\"images/formally.html\">FORMALLY INFORMAL</a></li>\n");
      out.write("                   </ul>\n");
      out.write("            \n");
      out.write("                </li> \n");
      out.write("                <li>\n");
      out.write("                       <a href=\"toOrder\"><strong>WHERE TO BUY</strong></a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                      <a href=\"visit\"><strong>VISIT US</strong></a>\n");
      out.write("               </li>\n");
      out.write("         </ul>\n");
      out.write("   </div>       \n");
      out.write("               \n");
      out.write("       <div class=\"footer1\">           \n");
      out.write("            <form method=\"POST\" action=\"searchServlet\">\n");
      out.write("                <input type=\"text\"  name=\"keyword\" id=\"keyword\" placeholder=\"Search...\" required>\n");
      out.write("                <input type=\"Submit\" name=\"submit\" value=\"Search\">\n");
      out.write("            </form>\n");
      out.write("      </div>\n");
      out.write("        <ul> \n");
      out.write("                <li class=\"signup\"><a href=\"signupForm\"><span class=\"glyphicon glyphicon-user\"></span>Sign Up</a></li>\n");
      out.write("                <li class=\"login\"><a href=\"login\"><span class=\"glyphicon glyphicon-log-in\"></span>Login</a></li>\n");
      out.write("        </ul> \n");
      out.write("   </div>     \n");
      out.write(" </nav>\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/StyleSheet.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>Welcome to La Bella Fashion</title>\n");
      out.write("    </head>\n");
      out.write(" <body>      \n");
      out.write("       <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("           <div class=\"container-fluid\">\n");
      out.write("                 <div class=\"navbar-header\">     \n");
      out.write("                        <img src=\"images/labella.jpg\" id=\"logo\" alt=\"La Bella Fashion logo\">       \n");
      out.write("                 </div>   \n");
      out.write("                 <div>   \n");
      out.write("                        <ul class=\"nav navbar-nav navbar-left\">        \n");
      out.write("                         <li class=\"active\">\n");
      out.write("                                <a href=\"index.jsp\"><Strong>WOMEN</Strong></a>\n");
      out.write("                                <ul>\n");
      out.write("                                     <li><a href=\"images/product.html\">LACES & PRINTS</a></li>\n");
      out.write("                                     <li><a href=\"images/fashionable.html\">FASHIONABLE FLOWERS</a></li>\n");
      out.write("                                     <li><a href=\"images/work.html\">WORK</a></li>                          \n");
      out.write("                                </ul>\n");
      out.write("                         </li>  \n");
      out.write("                         <li>\n");
      out.write("                                <a href=\"index.jsp\"><strong>KIDS</strong></a>\n");
      out.write("                                <ul>\n");
      out.write("                                      <li><a href=\"images/girls.html\">GIRLS</a></li>\n");
      out.write("                                      <li><a href=\"images/boys.html\">BOYS</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                         </li>\n");
      out.write("                         <li>\n");
      out.write("                                <a href=\"index.jsp\"><strong>MEN</strong> </a>\n");
      out.write("                                <ul>\n");
      out.write("                                      <li><a href=\"images/comfortably.html\">COMFORTABLY COOL</a></li>\n");
      out.write("                                      <li><a href=\"images/formally.html\">FORMALLY INFORMAL</a></li>\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                        </li> \n");
      out.write("                        <li>\n");
      out.write("                               <a href=\"toOrder\"><strong>WHERE TO BUY</strong></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                              <a href=\"visit\"><strong>VISIT US</strong></a>\n");
      out.write("                       </li>\n");
      out.write("                   </ul>\n");
      out.write("                </div>       \n");
      out.write("               \n");
      out.write("               <div class=\"footer1\">           \n");
      out.write("                    <form method=\"POST\" action=\"searchServlet\">\n");
      out.write("                        <input type=\"text\"  name=\"keyword\" id=\"keyword\" placeholder=\"Search...\" required>\n");
      out.write("                        <input type=\"Submit\" name=\"submit\" value=\"Search\">\n");
      out.write("                    </form>\n");
      out.write("              </div>\n");
      out.write("              <ul>            \n");
      out.write("                <li class=\"login\"><a href=\"logout\"><span class=\"glyphicon glyphicon-log-in\"></span>LogOut</a></li>\n");
      out.write("              </ul> \n");
      out.write("     </div>     \n");
      out.write(" </nav>\n");
      out.write("   \n");
      out.write(' ');
      out.write(' ');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/StyleSheet.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>Welcome to La Bella Fashion</title>\n");
      out.write("    </head>\n");
      out.write(" <body>      \n");
      out.write("       <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("           <div class=\"container-fluid\">\n");
      out.write("              <div class=\"navbar-header\">     \n");
      out.write("                  <img src=\"images/labella.jpg\" id=\"logo\" alt=\"La Bella Fashion logo\">       \n");
      out.write("              </div>   \n");
      out.write("        <div>   \n");
      out.write("           <ul class=\"nav navbar-nav navbar-left\">        \n");
      out.write("                <li class=\"active\">\n");
      out.write("                   <a href=\"index.jsp\"><Strong>WOMEN</Strong></a>\n");
      out.write("                   <ul>\n");
      out.write("                        <li><a href=\"images/product.html\">LACES & PRINTS</a></li>\n");
      out.write("                        <li><a href=\"images/fashionable.html\">FASHIONABLE FLOWERS</a></li>\n");
      out.write("                        <li><a href=\"images/work.html\">WORK</a></li>                          \n");
      out.write("                   </ul>\n");
      out.write("                </li>  \n");
      out.write("                <li>\n");
      out.write("                      <a href=\"index.jsp\"><strong>KIDS</strong></a>\n");
      out.write("                    <ul>\n");
      out.write("                      <li><a href=\"images/girls.html\">GIRLS</a></li>\n");
      out.write("                      <li><a href=\"images/boys.html\">BOYS</a></li>\n");
      out.write("                   </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                     <a href=\"index.jsp\"><strong>MEN</strong> </a>\n");
      out.write("                   <ul>\n");
      out.write("                     <li><a href=\"images/comfortably.html\">COMFORTABLY COOL</a></li>\n");
      out.write("                     <li><a href=\"images/formally.html\">FORMALLY INFORMAL</a></li>\n");
      out.write("                   </ul>\n");
      out.write("            \n");
      out.write("                </li> \n");
      out.write("                <li>\n");
      out.write("                       <a href=\"toOrder\"><strong>WHERE TO BUY</strong></a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                      <a href=\"visit\"><strong>VISIT US</strong></a>\n");
      out.write("               </li>\n");
      out.write("         </ul>\n");
      out.write("   </div>       \n");
      out.write("               \n");
      out.write("       <div class=\"footer1\">           \n");
      out.write("            <form method=\"POST\" action=\"searchServlet\">\n");
      out.write("                <input type=\"text\"  name=\"keyword\" id=\"keyword\" placeholder=\"Search...\" required>\n");
      out.write("                <input type=\"Submit\" name=\"submit\" value=\"Search\">\n");
      out.write("            </form>\n");
      out.write("      </div>\n");
      out.write("        <ul> \n");
      out.write("                <li class=\"signup\"><a href=\"signupForm\"><span class=\"glyphicon glyphicon-user\"></span>Sign Up</a></li>\n");
      out.write("                <li class=\"login\"><a href=\"login\"><span class=\"glyphicon glyphicon-log-in\"></span>Login</a></li>\n");
      out.write("        </ul> \n");
      out.write("   </div>     \n");
      out.write(" </nav>\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("   <h2 class=\"flash\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${flash}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>  \n");
      out.write("   <p><strong>Enter information below</strong></p> \n");
      out.write("       <form  action=\"servlet/RegisterServlet\" method=\"POST\">\n");
      out.write("            <table cellspacing=\"5\" border=\"0\">\n");
      out.write("             <tr>\n");
      out.write("                     <td align=\"right\">First name:</td>\n");
      out.write("                     <td><input type=\"text\" name=\"firstName\"></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr> \n");
      out.write("                     <td align =\"right\">Last Name:</td>\n");
      out.write("                     <td><input type=\"text\" name=\"lastName\"></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                 <td align=\"right\">Email address:</td>\n");
      out.write("                  <td><input type=\"text\" name=\"emailAddress\"></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr> \n");
      out.write("              <tr>\n");
      out.write("                  <td align=\"right\">User Name</td>\n");
      out.write("                   <td><input type=\"text\" name=\"username\" required value=\"\" /></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                  <td align=\"right\">Password</td>\n");
      out.write("                   <td><input type=\"password\" name=\"password\" required value=\"\" /></td>\n");
      out.write("<!--                   <td align=\"right\">Confirm Password</td>\n");
      out.write("                   <td><input type=\"password\" name=\"password2\" required/></td>                   -->\n");
      out.write("              </tr>  \n");
      out.write("              <tr>\n");
      out.write("                        <td><input type=\"submit\" value=\"Submit\" /></td>\n");
      out.write("                        <td><input type=\"reset\" value=\"Reset\" /></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                   <td colspan=\"2\">Already registered!! <a href=\"index.jsp\">Login Here</a></td>\n");
      out.write("              </tr>\n");
      out.write("          </table>\n");
      out.write("                   \n");
      out.write("       </form>\n");
      out.write("    <div id=\"footer\">\n");
      out.write("    <div id=\"welcomeText\">\n");
      out.write("        <p>About Us</p>\n");
      out.write("        <p>Copyright 2015@LaBellaFashion.com</p>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
      out.write("  \n");
      out.write("</html>\n");
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
