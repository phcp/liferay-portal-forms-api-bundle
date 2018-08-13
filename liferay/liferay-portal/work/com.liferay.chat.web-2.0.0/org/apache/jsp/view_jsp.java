package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.chat.model.Status;
import com.liferay.chat.service.StatusLocalServiceUtil;
import com.liferay.chat.web.internal.util.BuddyFinderUtil;
import com.liferay.chat.web.internal.util.ChatExtensionsUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.model.ContactConstants;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Portlet;
import com.liferay.portal.kernel.model.UserConstants;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.PortletLocalServiceUtil;
import com.liferay.portal.kernel.servlet.BrowserSnifferUtil;
import com.liferay.portal.kernel.servlet.ServletContextPool;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(6);
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/liferay-aui.tld");
    _jspx_dependants.add("/META-INF/liferay-theme.tld");
    _jspx_dependants.add("/META-INF/liferay-ui.tld");
    _jspx_dependants.add("/META-INF/liferay-util.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_liferay$1ui_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_liferay$1theme_defineObjects_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_input_placeholder_name_label_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_liferay$1util_html$1top;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_liferay$1util_html$1bottom;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_input_value_useNamespace_type_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_liferay$1util_include_servletContext_page_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_liferay$1ui_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_liferay$1theme_defineObjects_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_aui_input_placeholder_name_label_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_liferay$1util_html$1top = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_liferay$1util_html$1bottom = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_aui_input_value_useNamespace_type_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_liferay$1util_include_servletContext_page_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_liferay$1ui_message_key_nobody.release();
    _jspx_tagPool_liferay$1theme_defineObjects_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_aui_input_placeholder_name_label_cssClass_nobody.release();
    _jspx_tagPool_liferay$1util_html$1top.release();
    _jspx_tagPool_liferay$1util_html$1bottom.release();
    _jspx_tagPool_aui_input_value_useNamespace_type_name_nobody.release();
    _jspx_tagPool_liferay$1util_include_servletContext_page_nobody.release();
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  liferay-theme:defineObjects
      com.liferay.taglib.theme.DefineObjectsTag _jspx_th_liferay$1theme_defineObjects_0 = (com.liferay.taglib.theme.DefineObjectsTag) _jspx_tagPool_liferay$1theme_defineObjects_nobody.get(com.liferay.taglib.theme.DefineObjectsTag.class);
      _jspx_th_liferay$1theme_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1theme_defineObjects_0.setParent(null);
      int _jspx_eval_liferay$1theme_defineObjects_0 = _jspx_th_liferay$1theme_defineObjects_0.doStartTag();
      if (_jspx_th_liferay$1theme_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_liferay$1theme_defineObjects_nobody.reuse(_jspx_th_liferay$1theme_defineObjects_0);
        return;
      }
      _jspx_tagPool_liferay$1theme_defineObjects_nobody.reuse(_jspx_th_liferay$1theme_defineObjects_0);
      com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay = null;
      com.liferay.portal.kernel.model.Company company = null;
      com.liferay.portal.kernel.model.Account account = null;
      com.liferay.portal.kernel.model.User user = null;
      com.liferay.portal.kernel.model.User realUser = null;
      com.liferay.portal.kernel.model.Contact contact = null;
      com.liferay.portal.kernel.model.Layout layout = null;
      java.util.List layouts = null;
      java.lang.Long plid = null;
      com.liferay.portal.kernel.model.LayoutTypePortlet layoutTypePortlet = null;
      java.lang.Long scopeGroupId = null;
      com.liferay.portal.kernel.security.permission.PermissionChecker permissionChecker = null;
      java.util.Locale locale = null;
      java.util.TimeZone timeZone = null;
      com.liferay.portal.kernel.model.Theme theme = null;
      com.liferay.portal.kernel.model.ColorScheme colorScheme = null;
      com.liferay.portal.kernel.theme.PortletDisplay portletDisplay = null;
      java.lang.Long portletGroupId = null;
      themeDisplay = (com.liferay.portal.kernel.theme.ThemeDisplay) _jspx_page_context.findAttribute("themeDisplay");
      company = (com.liferay.portal.kernel.model.Company) _jspx_page_context.findAttribute("company");
      account = (com.liferay.portal.kernel.model.Account) _jspx_page_context.findAttribute("account");
      user = (com.liferay.portal.kernel.model.User) _jspx_page_context.findAttribute("user");
      realUser = (com.liferay.portal.kernel.model.User) _jspx_page_context.findAttribute("realUser");
      contact = (com.liferay.portal.kernel.model.Contact) _jspx_page_context.findAttribute("contact");
      layout = (com.liferay.portal.kernel.model.Layout) _jspx_page_context.findAttribute("layout");
      layouts = (java.util.List) _jspx_page_context.findAttribute("layouts");
      plid = (java.lang.Long) _jspx_page_context.findAttribute("plid");
      layoutTypePortlet = (com.liferay.portal.kernel.model.LayoutTypePortlet) _jspx_page_context.findAttribute("layoutTypePortlet");
      scopeGroupId = (java.lang.Long) _jspx_page_context.findAttribute("scopeGroupId");
      permissionChecker = (com.liferay.portal.kernel.security.permission.PermissionChecker) _jspx_page_context.findAttribute("permissionChecker");
      locale = (java.util.Locale) _jspx_page_context.findAttribute("locale");
      timeZone = (java.util.TimeZone) _jspx_page_context.findAttribute("timeZone");
      theme = (com.liferay.portal.kernel.model.Theme) _jspx_page_context.findAttribute("theme");
      colorScheme = (com.liferay.portal.kernel.model.ColorScheme) _jspx_page_context.findAttribute("colorScheme");
      portletDisplay = (com.liferay.portal.kernel.theme.PortletDisplay) _jspx_page_context.findAttribute("portletDisplay");
      portletGroupId = (java.lang.Long) _jspx_page_context.findAttribute("portletGroupId");
      out.write('\n');
      out.write('\n');
if (
 themeDisplay.isSignedIn() && !(BrowserSnifferUtil.isIe(request) && (BrowserSnifferUtil.getMajorVersion(request) < 7)) && !BrowserSnifferUtil.isMobile(request) ) {
      out.write("\n");
      out.write("\n");
      out.write("\t");

	Portlet portlet = PortletLocalServiceUtil.getPortletById(company.getCompanyId(), portletDisplay.getId());
	
      out.write("\n");
      out.write("\n");
      out.write("\t");
      //  liferay-util:html-top
      com.liferay.taglib.util.HtmlTopTag _jspx_th_liferay$1util_html$1top_0 = (com.liferay.taglib.util.HtmlTopTag) _jspx_tagPool_liferay$1util_html$1top.get(com.liferay.taglib.util.HtmlTopTag.class);
      _jspx_th_liferay$1util_html$1top_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1util_html$1top_0.setParent(null);
      int _jspx_eval_liferay$1util_html$1top_0 = _jspx_th_liferay$1util_html$1top_0.doStartTag();
      if (_jspx_eval_liferay$1util_html$1top_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_liferay$1util_html$1top_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_liferay$1util_html$1top_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_liferay$1util_html$1top_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\t\t<link href=\"");
          out.print( PortalUtil.getStaticResourceURL(request, themeDisplay.getCDNHost() + PortalUtil.getPathContext(request) + "/css/main.css", portlet.getTimestamp()) );
          out.write("\" rel=\"stylesheet\" type=\"text/css\" />\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_liferay$1util_html$1top_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_liferay$1util_html$1top_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_liferay$1util_html$1top_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_liferay$1util_html$1top.reuse(_jspx_th_liferay$1util_html$1top_0);
        return;
      }
      _jspx_tagPool_liferay$1util_html$1top.reuse(_jspx_th_liferay$1util_html$1top_0);
      out.write("\n");
      out.write("\n");
      out.write("\t");
      //  liferay-util:html-bottom
      com.liferay.taglib.util.HtmlBottomTag _jspx_th_liferay$1util_html$1bottom_0 = (com.liferay.taglib.util.HtmlBottomTag) _jspx_tagPool_liferay$1util_html$1bottom.get(com.liferay.taglib.util.HtmlBottomTag.class);
      _jspx_th_liferay$1util_html$1bottom_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1util_html$1bottom_0.setParent(null);
      int _jspx_eval_liferay$1util_html$1bottom_0 = _jspx_th_liferay$1util_html$1bottom_0.doStartTag();
      if (_jspx_eval_liferay$1util_html$1bottom_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_liferay$1util_html$1bottom_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_liferay$1util_html$1bottom_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_liferay$1util_html$1bottom_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\t\t<script data-senna-track=\"temporary\" defer=\"defer\" src=\"");
          out.print( PortalUtil.getStaticResourceURL(request, themeDisplay.getCDNHost() + PortalUtil.getPathContext(request) + "/js/main.js", portlet.getTimestamp()) );
          out.write("\" type=\"text/javascript\"></script>\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_liferay$1util_html$1bottom_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_liferay$1util_html$1bottom_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_liferay$1util_html$1bottom_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_liferay$1util_html$1bottom.reuse(_jspx_th_liferay$1util_html$1bottom_0);
        return;
      }
      _jspx_tagPool_liferay$1util_html$1bottom.reuse(_jspx_th_liferay$1util_html$1bottom_0);
      out.write("\n");
      out.write("\n");
      out.write("\t");

	Status status = StatusLocalServiceUtil.getUserStatus(themeDisplay.getUserId());

	boolean online = status.getOnline();

	JSONObject activePanelIdsJSONObject = null;

	String openPanelId = StringPool.BLANK;

	if (Validator.isNotNull(status.getActivePanelIds())) {
		activePanelIdsJSONObject = JSONFactoryUtil.createJSONObject(status.getActivePanelIds());

		openPanelId = activePanelIdsJSONObject.getString("open");
	}

	String statusMessage = HtmlUtil.escape(status.getMessage());
	boolean playSound = status.getPlaySound();

	List<Object[]> buddies = BuddyFinderUtil.getBuddies(themeDisplay.getCompanyId(), themeDisplay.getUserId());

	int buddiesCount = buddies.size();
	
      out.write("\n");
      out.write("\n");
      out.write("\t<div class=\"portlet-chat\" id=\"chatBar\">\n");
      out.write("\t\t<div class=\"chat-bar\">\n");
      out.write("\t\t\t<div class=\"chat-sound\"></div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"chat-status\">\n");
      out.write("\t\t\t\t<div class=\"status-message\">\n");
      out.write("\t\t\t\t\t");
if (
 Validator.isNotNull(statusMessage) ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.print( LanguageUtil.format(request, "you-are-x", "<strong>" + statusMessage + "</strong>", false) );
      out.write("\n");
      out.write("\t\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"chat-tabs-container\">\n");
      out.write("\t\t\t\t<ul class=\"chat-tabs\">\n");
      out.write("\t\t\t\t\t<li class=\"buddy-list loading ");
      out.print( openPanelId.equals("buddylist") ? "selected" : "" );
      out.write("\">\n");
      out.write("\t\t\t\t\t\t<div class=\"chat-panel-trigger\" panelId=\"buddylist\" tabindex=\"0\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"trigger-name\">");
      out.print( LanguageUtil.format(request, "online-friends-x", "(" + buddiesCount + ")", false) );
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"chat-panel\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"chat-panel-window\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"chat-panel-button minimize\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"chat-panel-title\">\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.print( LanguageUtil.format(request, "online-friends-x", "(" + buddiesCount + ")", false) );
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_aui_input_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"chat-panel-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"lfr-component online-users\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

										for (Object[] buddy : buddies) {
											String firstName = (String)buddy[1];
											long groupId = (Long)buddy[2];
											String lastName = (String)buddy[3];
											boolean male = (Boolean)buddy[4];
											String middleName = (String)buddy[5];
											long portraitId = (Long)buddy[6];
											long userId = (Long)buddy[8];
											String userUuid = (String)buddy[9];

											Group group = GroupLocalServiceUtil.fetchGroup(groupId);
										
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li class=\"active user\" data-displayURL=\"");
      out.print( group.getDisplayURL(themeDisplay, false) );
      out.write("\" data-groupId=\"");
      out.print( groupId );
      out.write("\" data-userId=\"");
      out.print( userId );
      out.write("\" tabindex=\"0\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img alt=\"");
      out.print( HtmlUtil.escape(ContactConstants.getFullName(firstName, middleName, lastName)) );
      out.write("\" src=\"");
      out.print( UserConstants.getPortraitURL(themeDisplay.getPathImage(), male, portraitId, userUuid) );
      out.write("\" />\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"name\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print( HtmlUtil.escape(ContactConstants.getFullName(firstName, middleName, lastName)) );
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

										}
										
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div style=\"clear: both;\"></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"chat-settings ");
      out.print( openPanelId.equals("settings") ? "selected" : "" );
      out.write("\">\n");
      out.write("\t\t\t\t\t\t<div class=\"chat-panel-trigger\" panelId=\"settings\" tabindex=\"0\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"trigger-name\">");
      if (_jspx_meth_liferay$1ui_message_0(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"chat-panel\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"chat-panel-window\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"chat-panel-button minimize\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"chat-panel-title\">");
      if (_jspx_meth_liferay$1ui_message_1(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"clearfix lfr-component settings\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"statusMessage\">");
      out.print( LanguageUtil.format(request, "x-is", HtmlUtil.escape(user.getFullName()), false) );
      out.write("</label>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input id=\"statusMessage\" type=\"text\" value=\"");
      out.print( statusMessage );
      out.write("\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"onlineStatus\"><input ");
      out.print( online ? "checked=\"checked\"" : "" );
      out.write(" id=\"onlineStatus\" type=\"checkbox\" /> ");
      if (_jspx_meth_liferay$1ui_message_2(_jspx_page_context))
        return;
      out.write("</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"playSound\"><input ");
      out.print( playSound ? "checked=\"checked\"" : "" );
      out.write(" id=\"playSound\" type=\"checkbox\" /> ");
      if (_jspx_meth_liferay$1ui_message_3(_jspx_page_context))
        return;
      out.write(" </label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"show-notifications-setting\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"showNotifications\"><input disabled=\"disabled\" id=\"showNotifications\" type=\"checkbox\" /> ");
      if (_jspx_meth_liferay$1ui_message_4(_jspx_page_context))
        return;
      out.write(" </label>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"ctrl-holder\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input id=\"saveSettings\" type=\"submit\" value=\"");
      if (_jspx_meth_liferay$1ui_message_5(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<input id=\"activePanelIds\" type=\"hidden\" value=\"");
      out.print( HtmlUtil.escapeAttribute(status.getActivePanelIds()) );
      out.write("\" />\n");
      out.write("\t\t<input id=\"chatPortletId\" type=\"hidden\" value=\"");
      out.print( portletDisplay.getId() );
      out.write("\" />\n");
      out.write("\n");
      out.write("\t\t<div class=\"chat-extensions hide\">\n");
      out.write("\n");
      out.write("\t\t\t");

			Map<String, String> extensions = ChatExtensionsUtil.getExtensions();

			Set<String> servletContextNames = extensions.keySet();

			for (String servletContextName : servletContextNames) {
				String extensionPath = extensions.get(servletContextName);
				ServletContext extensionServletContext = ServletContextPool.get(servletContextName);
			
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");
      //  liferay-util:include
      com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_0 = (com.liferay.taglib.util.IncludeTag) _jspx_tagPool_liferay$1util_include_servletContext_page_nobody.get(com.liferay.taglib.util.IncludeTag.class);
      _jspx_th_liferay$1util_include_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1util_include_0.setParent(null);
      _jspx_th_liferay$1util_include_0.setPage( extensionPath );
      _jspx_th_liferay$1util_include_0.setServletContext( extensionServletContext );
      int _jspx_eval_liferay$1util_include_0 = _jspx_th_liferay$1util_include_0.doStartTag();
      if (_jspx_th_liferay$1util_include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_liferay$1util_include_servletContext_page_nobody.reuse(_jspx_th_liferay$1util_include_0);
        return;
      }
      _jspx_tagPool_liferay$1util_include_servletContext_page_nobody.reuse(_jspx_th_liferay$1util_include_0);
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");

			}
			
      out.write("\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t");
      //  aui:input
      com.liferay.taglib.aui.InputTag _jspx_th_aui_input_1 = (com.liferay.taglib.aui.InputTag) _jspx_tagPool_aui_input_value_useNamespace_type_name_nobody.get(com.liferay.taglib.aui.InputTag.class);
      _jspx_th_aui_input_1.setPageContext(_jspx_page_context);
      _jspx_th_aui_input_1.setParent(null);
      _jspx_th_aui_input_1.setName("currentChatServerTime");
      _jspx_th_aui_input_1.setType("hidden");
      _jspx_th_aui_input_1.setUseNamespace( false );
      _jspx_th_aui_input_1.setValue( System.currentTimeMillis() );
      int _jspx_eval_aui_input_1 = _jspx_th_aui_input_1.doStartTag();
      if (_jspx_th_aui_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_aui_input_value_useNamespace_type_name_nobody.reuse(_jspx_th_aui_input_1);
        return;
      }
      _jspx_tagPool_aui_input_value_useNamespace_type_name_nobody.reuse(_jspx_th_aui_input_1);
      out.write('\n');
}
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

  private boolean _jspx_meth_aui_input_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:input
    com.liferay.taglib.aui.InputTag _jspx_th_aui_input_0 = (com.liferay.taglib.aui.InputTag) _jspx_tagPool_aui_input_placeholder_name_label_cssClass_nobody.get(com.liferay.taglib.aui.InputTag.class);
    _jspx_th_aui_input_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_input_0.setParent(null);
    _jspx_th_aui_input_0.setCssClass("search-buddies");
    _jspx_th_aui_input_0.setLabel("");
    _jspx_th_aui_input_0.setName("searchBuddies");
    _jspx_th_aui_input_0.setPlaceholder("search");
    int _jspx_eval_aui_input_0 = _jspx_th_aui_input_0.doStartTag();
    if (_jspx_th_aui_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_aui_input_placeholder_name_label_cssClass_nobody.reuse(_jspx_th_aui_input_0);
      return true;
    }
    _jspx_tagPool_aui_input_placeholder_name_label_cssClass_nobody.reuse(_jspx_th_aui_input_0);
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (com.liferay.taglib.ui.MessageTag) _jspx_tagPool_liferay$1ui_message_key_nobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent(null);
    _jspx_th_liferay$1ui_message_0.setKey("settings");
    int _jspx_eval_liferay$1ui_message_0 = _jspx_th_liferay$1ui_message_0.doStartTag();
    if (_jspx_th_liferay$1ui_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_0);
      return true;
    }
    _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_0);
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (com.liferay.taglib.ui.MessageTag) _jspx_tagPool_liferay$1ui_message_key_nobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent(null);
    _jspx_th_liferay$1ui_message_1.setKey("settings");
    int _jspx_eval_liferay$1ui_message_1 = _jspx_th_liferay$1ui_message_1.doStartTag();
    if (_jspx_th_liferay$1ui_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_1);
      return true;
    }
    _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_1);
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (com.liferay.taglib.ui.MessageTag) _jspx_tagPool_liferay$1ui_message_key_nobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_2.setParent(null);
    _jspx_th_liferay$1ui_message_2.setKey("show-me-as-online");
    int _jspx_eval_liferay$1ui_message_2 = _jspx_th_liferay$1ui_message_2.doStartTag();
    if (_jspx_th_liferay$1ui_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_2);
      return true;
    }
    _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_2);
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_3 = (com.liferay.taglib.ui.MessageTag) _jspx_tagPool_liferay$1ui_message_key_nobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay$1ui_message_3.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_3.setParent(null);
    _jspx_th_liferay$1ui_message_3.setKey("play-a-sound-when-i-receive-a-new-message-in-a-hidden-window");
    int _jspx_eval_liferay$1ui_message_3 = _jspx_th_liferay$1ui_message_3.doStartTag();
    if (_jspx_th_liferay$1ui_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_3);
      return true;
    }
    _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_3);
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_4 = (com.liferay.taglib.ui.MessageTag) _jspx_tagPool_liferay$1ui_message_key_nobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay$1ui_message_4.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_4.setParent(null);
    _jspx_th_liferay$1ui_message_4.setKey("enable-desktop-notifications-for-new-messages");
    int _jspx_eval_liferay$1ui_message_4 = _jspx_th_liferay$1ui_message_4.doStartTag();
    if (_jspx_th_liferay$1ui_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_4);
      return true;
    }
    _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_4);
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_5 = (com.liferay.taglib.ui.MessageTag) _jspx_tagPool_liferay$1ui_message_key_nobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay$1ui_message_5.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_5.setParent(null);
    _jspx_th_liferay$1ui_message_5.setKey("save");
    int _jspx_eval_liferay$1ui_message_5 = _jspx_th_liferay$1ui_message_5.doStartTag();
    if (_jspx_th_liferay$1ui_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_5);
      return true;
    }
    _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_5);
    return false;
  }
}
