/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
 * Generated at: 2021-06-24 01:29:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class secession_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>내정보</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("#content-main {\r\n");
      out.write("	height: 830px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container\" id=\"content-main\">\r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<div class=\"row my-5\">\r\n");
      out.write("			");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sideMenu.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<div class=\"col-sm-offset-2 col-sm-8\">\r\n");
      out.write("				<h3>회원 탈퇴</h3>\r\n");
      out.write("				<div class=\"bg-white rounded shadow-sm container p-3\">\r\n");
      out.write("					<form method=\"POST\" action=\"secession\" onsubmit=\"return secessionValidate();\" \r\n");
      out.write("						class=\"form-horizontal\" role=\"form\">\r\n");
      out.write("						<!-- 아이디 -->\r\n");
      out.write("						<div class=\"row mb-3 form-row\">\r\n");
      out.write("							<div class=\"col-md-3\">\r\n");
      out.write("								<h6>아이디</h6>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"col-md-6\">\r\n");
      out.write("								<h5 id=\"id\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginMember.memberId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h5>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<!-- 비밀번호 -->\r\n");
      out.write("						<div class=\"row mb-3 form-row\">\r\n");
      out.write("							<div class=\"col-md-3\">\r\n");
      out.write("								<h6>비밀번호</h6>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"col-md-6\">\r\n");
      out.write("								<input type=\"password\" class=\"form-control\" id=\"currentPwd\"\r\n");
      out.write("									name=\"currentPwd\">\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<hr>\r\n");
      out.write("						<div class=\"panel panel-default\">\r\n");
      out.write("\r\n");
      out.write("							<div class=\"panel-body\">\r\n");
      out.write("								<div class=\"form-group pull-left\">\r\n");
      out.write("									<label class=\"control-label\"> 회원 탈퇴 약관 </label>\r\n");
      out.write("									<div class=\"col-xs-12\">\r\n");
      out.write("										<textarea class=\"form-control\" readonly rows=\"10\" cols=\"100\">\r\n");
      out.write("제1조\r\n");
      out.write("이 약관은 샘플 약관입니다.\r\n");
      out.write("\r\n");
      out.write("① 약관 내용 1\r\n");
      out.write("\r\n");
      out.write("② 약관 내용 2\r\n");
      out.write("\r\n");
      out.write("③ 약관 내용 3\r\n");
      out.write("\r\n");
      out.write("④ 약관 내용 4\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("제2조\r\n");
      out.write("이 약관은 샘플 약관입니다.\r\n");
      out.write("\r\n");
      out.write("① 약관 내용 1\r\n");
      out.write("\r\n");
      out.write("② 약관 내용 2\r\n");
      out.write("\r\n");
      out.write("③ 약관 내용 3\r\n");
      out.write("\r\n");
      out.write("④ 약관 내용 4\r\n");
      out.write("</textarea>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"checkbox pull-right\">\r\n");
      out.write("										<div class=\"custom-checkbox\">\r\n");
      out.write("											<div class=\"form-check\">\r\n");
      out.write("												<input type=\"checkbox\" name=\"agree\" id=\"agree\"\r\n");
      out.write("													class=\"form-check-input custom-control-input\"> <br>\r\n");
      out.write("												<label class=\"form-check-label custom-control-label\"\r\n");
      out.write("													for=\"agree\">위 약관에 동의합니다.</label>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<hr class=\"mb-4\">\r\n");
      out.write("						<button class=\"btn btn-primary btn-lg btn-block\" id=\"btn\"\r\n");
      out.write("							type=\"submit\">탈퇴</button>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("		// 약관 동의가 체크 되었을 때에만 탈퇴 진행\r\n");
      out.write("		function secessionValidate(){\r\n");
      out.write("			// script, filter, wrapper, servlet, service, dao, sql\r\n");
      out.write("			// 응답화면 제어\r\n");
      out.write("			\r\n");
      out.write("			// 방법 1) 체크된 체크박스를 선택하는 :checked 선택자 사용 방법\r\n");
      out.write("			// $(\"#agree:checked\") -> 아이디가 agree인 요소 중 check된 요소만을 선택\r\n");
      out.write("			// 체크된 요소가 있으면 length == 1, 없으면 0\r\n");
      out.write("			if( $(\"#agree:checked\").length == 0){\r\n");
      out.write("				swal({\"icon\" : \"info\", \"title\" : \"약관 동의를 체크해주세요.\"})\r\n");
      out.write("				return false;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			// 방법 2) jQuery 의 .prop(\"checked\") 메소드를 이용\r\n");
      out.write("			// $(\"#agree\").prop(\"checked\") \r\n");
      out.write("			// -> 아이디가 agree인 요소에 체크가 되어있으면 true, 아니면 false\r\n");
      out.write("			if( !$(\"#agree\").prop(\"checked\") ){\r\n");
      out.write("				swal({\"icon\" : \"info\", \"title\" : \"약관 동의를 체크해주세요.\"})\r\n");
      out.write("				return false;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("		}\r\n");
      out.write("	</script>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
