package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.frontend.editor.alloyeditor.web.internal.constants.AlloyEditorConstants;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.editor.configuration.EditorOptions;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.servlet.PortalWebResourceConstants;
import com.liferay.portal.kernel.servlet.PortalWebResourcesUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.taglib.aui.AUIUtil;
import java.util.Locale;
import java.util.Map;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

public final class alloyeditor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(7);
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/liferay-aui.tld");
    _jspx_dependants.add("/META-INF/liferay-editor.tld");
    _jspx_dependants.add("/META-INF/liferay-frontend.tld");
    _jspx_dependants.add("/META-INF/liferay-theme.tld");
    _jspx_dependants.add("/META-INF/liferay-util.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_liferay$1util_dynamic$1include_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_liferay$1theme_defineObjects_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_liferay$1util_buffer_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_icon_markupView_image_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_liferay$1frontend_defineObjects_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_script_use;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_liferay$1editor_resources_editorName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_liferay$1util_dynamic$1include_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_liferay$1theme_defineObjects_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_liferay$1util_buffer_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_aui_icon_markupView_image_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_liferay$1frontend_defineObjects_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_aui_script_use = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_liferay$1editor_resources_editorName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_liferay$1util_dynamic$1include_key_nobody.release();
    _jspx_tagPool_liferay$1theme_defineObjects_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_liferay$1util_buffer_var.release();
    _jspx_tagPool_aui_icon_markupView_image_cssClass_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_liferay$1frontend_defineObjects_nobody.release();
    _jspx_tagPool_aui_script_use.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_liferay$1editor_resources_editorName_nobody.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("\n");
      out.write("\n");
      //  liferay-frontend:defineObjects
      com.liferay.frontend.taglib.servlet.taglib.DefineObjectsTag _jspx_th_liferay$1frontend_defineObjects_0 = (com.liferay.frontend.taglib.servlet.taglib.DefineObjectsTag) _jspx_tagPool_liferay$1frontend_defineObjects_nobody.get(com.liferay.frontend.taglib.servlet.taglib.DefineObjectsTag.class);
      _jspx_th_liferay$1frontend_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1frontend_defineObjects_0.setParent(null);
      int _jspx_eval_liferay$1frontend_defineObjects_0 = _jspx_th_liferay$1frontend_defineObjects_0.doStartTag();
      if (_jspx_th_liferay$1frontend_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_liferay$1frontend_defineObjects_nobody.reuse(_jspx_th_liferay$1frontend_defineObjects_0);
        return;
      }
      _jspx_tagPool_liferay$1frontend_defineObjects_nobody.reuse(_jspx_th_liferay$1frontend_defineObjects_0);
      java.lang.String currentURL = null;
      javax.portlet.PortletURL currentURLObj = null;
      java.util.ResourceBundle resourceBundle = null;
      javax.portlet.WindowState windowState = null;
      currentURL = (java.lang.String) _jspx_page_context.findAttribute("currentURL");
      currentURLObj = (javax.portlet.PortletURL) _jspx_page_context.findAttribute("currentURLObj");
      resourceBundle = (java.util.ResourceBundle) _jspx_page_context.findAttribute("resourceBundle");
      windowState = (javax.portlet.WindowState) _jspx_page_context.findAttribute("windowState");
      out.write('\n');
      out.write('\n');
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

PortletRequest portletRequest = (PortletRequest)request.getAttribute(JavaConstants.JAVAX_PORTLET_REQUEST);

PortletResponse portletResponse = (PortletResponse)request.getAttribute(JavaConstants.JAVAX_PORTLET_RESPONSE);

String namespace = AUIUtil.getNamespace(portletRequest, portletResponse);

if (Validator.isNull(namespace)) {
	namespace = AUIUtil.getNamespace(request);
}

      out.write('\n');
      out.write('\n');

String portletId = portletDisplay.getId();

boolean autoCreate = GetterUtil.getBoolean((String)request.getAttribute(AlloyEditorConstants.ATTRIBUTE_NAMESPACE + ":autoCreate"));
String contents = GetterUtil.getString((String)request.getAttribute(AlloyEditorConstants.ATTRIBUTE_NAMESPACE + ":contents"));
String contentsLanguageId = (String)request.getAttribute(AlloyEditorConstants.ATTRIBUTE_NAMESPACE + ":contentsLanguageId");
String cssClass = GetterUtil.getString((String)request.getAttribute(AlloyEditorConstants.ATTRIBUTE_NAMESPACE + ":cssClass"));
Map<String, Object> data = (Map<String, Object>)request.getAttribute(AlloyEditorConstants.ATTRIBUTE_NAMESPACE + ":data");
String editorName = (String)request.getAttribute(AlloyEditorConstants.ATTRIBUTE_NAMESPACE + ":editorName");
String initMethod = (String)request.getAttribute(AlloyEditorConstants.ATTRIBUTE_NAMESPACE + ":initMethod");
String name = namespace + GetterUtil.getString((String)request.getAttribute(AlloyEditorConstants.ATTRIBUTE_NAMESPACE + ":name"));
String onBlurMethod = (String)request.getAttribute(AlloyEditorConstants.ATTRIBUTE_NAMESPACE + ":onBlurMethod");
String onChangeMethod = (String)request.getAttribute(AlloyEditorConstants.ATTRIBUTE_NAMESPACE + ":onChangeMethod");
String onFocusMethod = (String)request.getAttribute(AlloyEditorConstants.ATTRIBUTE_NAMESPACE + ":onFocusMethod");
String onInitMethod = (String)request.getAttribute(AlloyEditorConstants.ATTRIBUTE_NAMESPACE + ":onInitMethod");
String placeholder = GetterUtil.getString((String)request.getAttribute(AlloyEditorConstants.ATTRIBUTE_NAMESPACE + ":placeholder"));
String required = (String)request.getAttribute(AlloyEditorConstants.ATTRIBUTE_NAMESPACE + ":required");
boolean showSource = GetterUtil.getBoolean((String)request.getAttribute(AlloyEditorConstants.ATTRIBUTE_NAMESPACE + ":showSource"));
boolean skipEditorLoading = GetterUtil.getBoolean((String)request.getAttribute(AlloyEditorConstants.ATTRIBUTE_NAMESPACE + ":skipEditorLoading"));

JSONObject editorConfigJSONObject = null;

if (data != null) {
	editorConfigJSONObject = (JSONObject)data.get("editorConfig");
}

EditorOptions editorOptions = null;

if (data != null) {
	editorOptions = (EditorOptions)data.get("editorOptions");
}

Map<String, Object> editorOptionsDynamicAttributes = null;

if (editorOptions != null) {
	editorOptionsDynamicAttributes = editorOptions.getDynamicAttributes();
}

      out.write('\n');
      out.write('\n');
if (
 !skipEditorLoading ) {
      out.write('\n');
      out.write('	');
      //  liferay-editor:resources
      com.liferay.frontend.editor.taglib.servlet.taglib.ResourcesTag _jspx_th_liferay$1editor_resources_0 = (com.liferay.frontend.editor.taglib.servlet.taglib.ResourcesTag) _jspx_tagPool_liferay$1editor_resources_editorName_nobody.get(com.liferay.frontend.editor.taglib.servlet.taglib.ResourcesTag.class);
      _jspx_th_liferay$1editor_resources_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1editor_resources_0.setParent(null);
      _jspx_th_liferay$1editor_resources_0.setEditorName( editorName );
      int _jspx_eval_liferay$1editor_resources_0 = _jspx_th_liferay$1editor_resources_0.doStartTag();
      if (_jspx_th_liferay$1editor_resources_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_liferay$1editor_resources_editorName_nobody.reuse(_jspx_th_liferay$1editor_resources_0);
        return;
      }
      _jspx_tagPool_liferay$1editor_resources_editorName_nobody.reuse(_jspx_th_liferay$1editor_resources_0);
      out.write('\n');
}
      out.write("\n");
      out.write("\n");
      out.write("<script data-senna-track=\"temporary\" type=\"text/javascript\">\n");
      out.write("\tCKEDITOR.disableAutoInline = true;\n");
      out.write("\n");
      out.write("\tCKEDITOR.env.isCompatible = true;\n");
      out.write("</script>\n");
      out.write("\n");
      //  liferay-util:buffer
      com.liferay.taglib.util.BufferTag _jspx_th_liferay$1util_buffer_0 = (com.liferay.taglib.util.BufferTag) _jspx_tagPool_liferay$1util_buffer_var.get(com.liferay.taglib.util.BufferTag.class);
      _jspx_th_liferay$1util_buffer_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1util_buffer_0.setParent(null);
      _jspx_th_liferay$1util_buffer_0.setVar("alloyEditor");
      int _jspx_eval_liferay$1util_buffer_0 = _jspx_th_liferay$1util_buffer_0.doStartTag();
      if (_jspx_eval_liferay$1util_buffer_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_liferay$1util_buffer_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_liferay$1util_buffer_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_liferay$1util_buffer_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\t<div class=\"alloy-editor alloy-editor-placeholder ");
          out.print( HtmlUtil.escapeAttribute(cssClass) );
          out.write("\" contenteditable=\"false\" data-placeholder=\"");
          out.print( LanguageUtil.get(request, placeholder) );
          out.write("\" data-required=\"");
          out.print( required );
          out.write("\" id=\"");
          out.print( HtmlUtil.escapeAttribute(name) );
          out.write("\" name=\"");
          out.print( HtmlUtil.escapeAttribute(name) );
          out.write("\"></div>\n");
          out.write("\n");
          out.write("\t");
          if (_jspx_meth_aui_icon_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1util_buffer_0, _jspx_page_context))
            return;
          out.write('\n');
          int evalDoAfterBody = _jspx_th_liferay$1util_buffer_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_liferay$1util_buffer_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_liferay$1util_buffer_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_liferay$1util_buffer_var.reuse(_jspx_th_liferay$1util_buffer_0);
        return;
      }
      _jspx_tagPool_liferay$1util_buffer_var.reuse(_jspx_th_liferay$1util_buffer_0);
      java.lang.String alloyEditor = null;
      alloyEditor = (java.lang.String) _jspx_page_context.findAttribute("alloyEditor");
      out.write('\n');
      out.write('\n');
      //  liferay-util:buffer
      com.liferay.taglib.util.BufferTag _jspx_th_liferay$1util_buffer_1 = (com.liferay.taglib.util.BufferTag) _jspx_tagPool_liferay$1util_buffer_var.get(com.liferay.taglib.util.BufferTag.class);
      _jspx_th_liferay$1util_buffer_1.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1util_buffer_1.setParent(null);
      _jspx_th_liferay$1util_buffer_1.setVar("editor");
      int _jspx_eval_liferay$1util_buffer_1 = _jspx_th_liferay$1util_buffer_1.doStartTag();
      if (_jspx_eval_liferay$1util_buffer_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_liferay$1util_buffer_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_liferay$1util_buffer_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_liferay$1util_buffer_1.doInitBody();
        }
        do {
          out.write('\n');
          out.write('	');
          out.write("\n");
          out.write("\t\t");
if (
 showSource ) {
          out.write("\n");
          out.write("\t\t\t<div class=\"alloy-editor-wrapper\" id=\"");
          out.print( HtmlUtil.escapeAttribute(name) );
          out.write("Wrapper\">\n");
          out.write("\t\t\t\t<div class=\"wrapper\">\n");
          out.write("\t\t\t\t\t");
          out.print( alloyEditor );
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t<div id=\"");
          out.print( HtmlUtil.escapeAttribute(name) );
          out.write("Source\">\n");
          out.write("\t\t\t\t\t\t<div class=\"lfr-source-editor-code\"></div>\n");
          out.write("\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t\t<div class=\"alloy-editor-switch hide\">\n");
          out.write("\t\t\t\t<button class=\"btn btn-default btn-xs hide lfr-portal-tooltip\" data-title=\"");
          out.print( LanguageUtil.get(resourceBundle, "fullscreen") );
          out.write("\" id=\"");
          out.print( HtmlUtil.escapeAttribute(name) );
          out.write("Fullscreen\" type=\"button\">\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_aui_icon_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1util_buffer_1, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t</button>\n");
          out.write("\n");
          out.write("\t\t\t\t<button class=\"btn btn-default btn-xs hide lfr-portal-tooltip\" data-title=\"");
          out.print( LanguageUtil.get(resourceBundle, "dark-theme") );
          out.write("\" id=\"");
          out.print( HtmlUtil.escapeAttribute(name) );
          out.write("SwitchTheme\" type=\"button\">\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_aui_icon_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1util_buffer_1, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t</button>\n");
          out.write("\n");
          out.write("\t\t\t\t<button class=\"btn btn-default btn-xs editor-view lfr-portal-tooltip\" data-title=\"");
          out.print( LanguageUtil.get(resourceBundle, "code-view") );
          out.write("\" id=\"");
          out.print( HtmlUtil.escapeAttribute(name) );
          out.write("Switch\" type=\"button\">\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_aui_icon_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1util_buffer_1, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t</button>\n");
          out.write("\t\t\t</div>\n");
          out.write("\t\t");
          out.write("\n");
          out.write("\t\t");
}
else {
          out.write("\n");
          out.write("\t\t\t");
          out.print( alloyEditor );
          out.write("\n");
          out.write("\t\t");
          out.write('\n');
          out.write('	');
}
          out.write('\n');
          int evalDoAfterBody = _jspx_th_liferay$1util_buffer_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_liferay$1util_buffer_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_liferay$1util_buffer_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_liferay$1util_buffer_var.reuse(_jspx_th_liferay$1util_buffer_1);
        return;
      }
      _jspx_tagPool_liferay$1util_buffer_var.reuse(_jspx_th_liferay$1util_buffer_1);
      java.lang.String editor = null;
      editor = (java.lang.String) _jspx_page_context.findAttribute("editor");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"alloy-editor-container\" id=\"");
      out.print( HtmlUtil.escapeAttribute(name) );
      out.write("Container\">\n");
      out.write("\t");
if (
 autoCreate ) {
      out.write("\n");
      out.write("\t\t");
      out.print( editor );
      out.write('\n');
      out.write('	');
}
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");

String modules = "liferay-alloy-editor";

String uploadURL = StringPool.BLANK;

if (editorOptions != null) {
	uploadURL = editorOptions.getUploadURL();

	if (Validator.isNotNull(data) && Validator.isNotNull(uploadURL)) {
		modules += ",liferay-editor-image-uploader";
	}
}

if (showSource) {
	modules += ",liferay-alloy-editor-source";
}

name = HtmlUtil.escapeJS(name);

      out.write('\n');
      out.write('\n');
      //  aui:script
      com.liferay.taglib.aui.ScriptTag _jspx_th_aui_script_0 = (com.liferay.taglib.aui.ScriptTag) _jspx_tagPool_aui_script_use.get(com.liferay.taglib.aui.ScriptTag.class);
      _jspx_th_aui_script_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_script_0.setParent(null);
      _jspx_th_aui_script_0.setUse( modules );
      int _jspx_eval_aui_script_0 = _jspx_th_aui_script_0.doStartTag();
      if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_aui_script_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_aui_script_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\n");
          out.write("\t");

	Locale contentsLocale = LocaleUtil.fromLanguageId(contentsLanguageId);

	contentsLanguageId = LocaleUtil.toLanguageId(contentsLocale);
	
          out.write("\n");
          out.write("\n");
          out.write("\tvar alloyEditor;\n");
          out.write("\n");
          out.write("\tvar getInitialContent = function() {\n");
          out.write("\t\tvar data;\n");
          out.write("\n");
          out.write("\t\tif (window['");
          out.print( HtmlUtil.escapeJS(namespace + initMethod) );
          out.write("']) {\n");
          out.write("\t\t\tdata = ");
          out.print( HtmlUtil.escapeJS(namespace + initMethod) );
          out.write("();\n");
          out.write("\t\t}\n");
          out.write("\t\telse {\n");
          out.write("\t\t\tdata = '");
          out.print( contents != null ? HtmlUtil.escapeJS(contents) : StringPool.BLANK );
          out.write("';\n");
          out.write("\t\t}\n");
          out.write("\n");
          out.write("\t\treturn data;\n");
          out.write("\t};\n");
          out.write("\n");
          out.write("\tvar createInstance = function() {\n");
          out.write("\t\tdocument.getElementById('");
          out.print( name );
          out.write("').setAttribute('contenteditable', true);\n");
          out.write("\n");
          out.write("\t\tvar editorConfig = ");
          out.print( Validator.isNotNull(editorConfigJSONObject) );
          out.write(" ? ");
          out.print( editorConfigJSONObject );
          out.write(" : {};\n");
          out.write("\n");
          out.write("\t\tif (editorConfig.extraPlugins) {\n");
          out.write("\t\t\teditorConfig.extraPlugins = A.Array.filter(\n");
          out.write("\t\t\t\teditorConfig.extraPlugins.split(','),\n");
          out.write("\t\t\t\tfunction(item) {\n");
          out.write("\t\t\t\t\treturn item !== 'ae_embed';\n");
          out.write("\t\t\t\t}\n");
          out.write("\t\t\t).join(',');\n");
          out.write("\t\t}\n");
          out.write("\n");
          out.write("\t\teditorConfig.removePlugins = editorConfig.removePlugins ? editorConfig.removePlugins + ',ae_embed' : 'ae_embed';\n");
          out.write("\n");
          out.write("\t\teditorConfig = A.merge(\n");
          out.write("\t\t\t{\n");
          out.write("\t\t\t\ttitle: '");
          out.print( LanguageUtil.get(resourceBundle, "rich-text-editor") );
          out.write("'\n");
          out.write("\t\t\t},\n");
          out.write("\t\t\teditorConfig\n");
          out.write("\t\t);\n");
          out.write("\n");
          out.write("\t\tvar plugins = [];\n");
          out.write("\n");
          out.write("\t\t");
if (
 Validator.isNotNull(data) && Validator.isNotNull(uploadURL) ) {
          out.write("\n");
          out.write("\t\t\tplugins.push(\n");
          out.write("\t\t\t\t{\n");
          out.write("\t\t\t\t\tcfg: {\n");
          out.write("\t\t\t\t\t\tuploadItemReturnType: '");
          out.print( editorOptions.getUploadItemReturnType() );
          out.write("',\n");
          out.write("\t\t\t\t\t\tuploadUrl: '");
          out.print( uploadURL );
          out.write("'\n");
          out.write("\t\t\t\t\t},\n");
          out.write("\t\t\t\t\tfn: A.Plugin.LiferayEditorImageUploader\n");
          out.write("\t\t\t\t}\n");
          out.write("\t\t\t);\n");
          out.write("\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t");
if (
 showSource ) {
          out.write("\n");
          out.write("\t\t\tplugins.push(A.Plugin.LiferayAlloyEditorSource);\n");
          out.write("\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\talloyEditor = new A.LiferayAlloyEditor(\n");
          out.write("\t\t\t{\n");
          out.write("\t\t\t\tcontents: '");
          out.print( HtmlUtil.escapeJS(contents) );
          out.write("',\n");
          out.write("\t\t\t\teditorConfig: editorConfig,\n");
          out.write("\t\t\t\tnamespace: '");
          out.print( name );
          out.write("',\n");
          out.write("\n");
          out.write("\t\t\t\t");
if (
 Validator.isNotNull(onBlurMethod) ) {
          out.write("\n");
          out.write("\t\t\t\t\tonBlurMethod: '");
          out.print( HtmlUtil.escapeJS(namespace + onBlurMethod) );
          out.write("',\n");
          out.write("\t\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t");
if (
 Validator.isNotNull(onChangeMethod) ) {
          out.write("\n");
          out.write("\t\t\t\t\tonChangeMethod: '");
          out.print( HtmlUtil.escapeJS(namespace + onChangeMethod) );
          out.write("',\n");
          out.write("\t\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t");
if (
 Validator.isNotNull(onFocusMethod) ) {
          out.write("\n");
          out.write("\t\t\t\t\tonFocusMethod: '");
          out.print( HtmlUtil.escapeJS(namespace + onFocusMethod) );
          out.write("',\n");
          out.write("\t\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t");
if (
 Validator.isNotNull(onInitMethod) ) {
          out.write("\n");
          out.write("\t\t\t\t\tonInitMethod: '");
          out.print( HtmlUtil.escapeJS(namespace + onInitMethod) );
          out.write("',\n");
          out.write("\t\t\t\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\tplugins: plugins,\n");
          out.write("\t\t\t\ttextMode: ");
          out.print( (editorOptions != null) ? editorOptions.isTextMode() : Boolean.FALSE.toString() );
          out.write(",\n");
          out.write("\n");
          out.write("\t\t\t\t");

				boolean useCustomDataProcessor = (editorOptionsDynamicAttributes != null) && GetterUtil.getBoolean(editorOptionsDynamicAttributes.get("useCustomDataProcessor"));
				
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\tuseCustomDataProcessor: ");
          out.print( useCustomDataProcessor );
          out.write("\n");
          out.write("\t\t\t}\n");
          out.write("\t\t).render();\n");
          out.write("\n");
          out.write("\t\t");
          //  liferay-util:dynamic-include
          com.liferay.taglib.util.DynamicIncludeTag _jspx_th_liferay$1util_dynamic$1include_0 = (com.liferay.taglib.util.DynamicIncludeTag) _jspx_tagPool_liferay$1util_dynamic$1include_key_nobody.get(com.liferay.taglib.util.DynamicIncludeTag.class);
          _jspx_th_liferay$1util_dynamic$1include_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1util_dynamic$1include_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
          _jspx_th_liferay$1util_dynamic$1include_0.setKey( "com.liferay.frontend.editor.alloyeditor.web#" + editorName + "#onEditorCreate" );
          int _jspx_eval_liferay$1util_dynamic$1include_0 = _jspx_th_liferay$1util_dynamic$1include_0.doStartTag();
          if (_jspx_th_liferay$1util_dynamic$1include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_liferay$1util_dynamic$1include_key_nobody.reuse(_jspx_th_liferay$1util_dynamic$1include_0);
            return;
          }
          _jspx_tagPool_liferay$1util_dynamic$1include_key_nobody.reuse(_jspx_th_liferay$1util_dynamic$1include_0);
          out.write("\n");
          out.write("\t};\n");
          out.write("\n");
          out.write("\twindow['");
          out.print( name );
          out.write("'] = {\n");
          out.write("\t\tcreate: function() {\n");
          out.write("\t\t\tif (!alloyEditor) {\n");
          out.write("\t\t\t\tvar editorNode = A.Node.create('");
          out.print( HtmlUtil.escapeJS(editor) );
          out.write("');\n");
          out.write("\n");
          out.write("\t\t\t\tvar editorContainer = A.one('#");
          out.print( name );
          out.write("Container');\n");
          out.write("\n");
          out.write("\t\t\t\teditorContainer.appendChild(editorNode);\n");
          out.write("\n");
          out.write("\t\t\t\twindow['");
          out.print( name );
          out.write("'].initEditor();\n");
          out.write("\t\t\t}\n");
          out.write("\t\t},\n");
          out.write("\n");
          out.write("\t\tdestroy: function() {\n");
          out.write("\t\t\twindow['");
          out.print( name );
          out.write("'].dispose();\n");
          out.write("\n");
          out.write("\t\t\twindow['");
          out.print( name );
          out.write("'] = null;\n");
          out.write("\t\t},\n");
          out.write("\n");
          out.write("\t\tdispose: function() {\n");
          out.write("\t\t\tif (alloyEditor) {\n");
          out.write("\t\t\t\talloyEditor.destroy();\n");
          out.write("\n");
          out.write("\t\t\t\talloyEditor = null;\n");
          out.write("\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\tvar editorNode = document.getElementById('");
          out.print( name );
          out.write("');\n");
          out.write("\n");
          out.write("\t\t\tif (editorNode) {\n");
          out.write("\t\t\t\teditorNode.parentNode.removeChild(editorNode);\n");
          out.write("\t\t\t}\n");
          out.write("\t\t},\n");
          out.write("\n");
          out.write("\t\tfocus: function() {\n");
          out.write("\t\t\tif (alloyEditor) {\n");
          out.write("\t\t\t\talloyEditor.focus();\n");
          out.write("\t\t\t}\n");
          out.write("\t\t},\n");
          out.write("\n");
          out.write("\t\tgetHTML: function() {\n");
          out.write("\t\t\tvar data = '';\n");
          out.write("\n");
          out.write("\t\t\tif (alloyEditor && alloyEditor.instanceReady) {\n");
          out.write("\t\t\t\tdata = alloyEditor.getHTML();\n");
          out.write("\t\t\t}\n");
          out.write("\t\t\telse {\n");
          out.write("\t\t\t\tdata = getInitialContent();\n");
          out.write("\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\treturn data;\n");
          out.write("\t\t},\n");
          out.write("\n");
          out.write("\t\tgetNativeEditor: function() {\n");
          out.write("\t\t\tvar nativeEditor;\n");
          out.write("\n");
          out.write("\t\t\tif (alloyEditor) {\n");
          out.write("\t\t\t\tnativeEditor = alloyEditor.getEditor();\n");
          out.write("\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\treturn nativeEditor;\n");
          out.write("\t\t},\n");
          out.write("\n");
          out.write("\t\tgetText: function() {\n");
          out.write("\t\t\tvar data = '';\n");
          out.write("\n");
          out.write("\t\t\tif (alloyEditor && alloyEditor.instanceReady) {\n");
          out.write("\t\t\t\tdata = alloyEditor.getText();\n");
          out.write("\t\t\t}\n");
          out.write("\t\t\telse {\n");
          out.write("\t\t\t\tdata = getInitialContent();\n");
          out.write("\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\treturn data;\n");
          out.write("\t\t},\n");
          out.write("\n");
          out.write("\t\tinitEditor: function() {\n");
          out.write("\t\t\tcreateInstance();\n");
          out.write("\t\t},\n");
          out.write("\n");
          out.write("\t\tinstanceReady: false,\n");
          out.write("\n");
          out.write("\t\tsetHTML: function(value) {\n");
          out.write("\t\t\tif (alloyEditor) {\n");
          out.write("\t\t\t\talloyEditor.setHTML(value);\n");
          out.write("\t\t\t}\n");
          out.write("\t\t}\n");
          out.write("\t};\n");
          out.write("\n");
          out.write("\tLiferay.fire(\n");
          out.write("\t\t'editorAPIReady',\n");
          out.write("\t\t{\n");
          out.write("\t\t\teditor: window['");
          out.print( name );
          out.write("'],\n");
          out.write("\t\t\teditorName: '");
          out.print( name );
          out.write("'\n");
          out.write("\t\t}\n");
          out.write("\t);\n");
          out.write("\n");
          out.write("\t");
if (
 autoCreate ) {
          out.write("\n");
          out.write("\t\twindow['");
          out.print( name );
          out.write("'].initEditor();\n");
          out.write("\t");
}
          out.write("\n");
          out.write("\n");
          out.write("\tvar destroyInstance = function(event) {\n");
          out.write("\t\tif (event.portletId === '");
          out.print( portletId );
          out.write("') {\n");
          out.write("\t\t\ttry {\n");
          out.write("\t\t\t\twindow['");
          out.print( name );
          out.write("'].destroy();\n");
          out.write("\t\t\t}\n");
          out.write("\t\t\tcatch (e) {\n");
          out.write("\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\tLiferay.detach('destroyPortlet', destroyInstance);\n");
          out.write("\t\t}\n");
          out.write("\t};\n");
          out.write("\n");
          out.write("\tLiferay.on('destroyPortlet', destroyInstance);\n");
          int evalDoAfterBody = _jspx_th_aui_script_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_aui_script_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_aui_script_use.reuse(_jspx_th_aui_script_0);
        return;
      }
      _jspx_tagPool_aui_script_use.reuse(_jspx_th_aui_script_0);
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

  private boolean _jspx_meth_aui_icon_0(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1util_buffer_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:icon
    com.liferay.taglib.aui.IconTag _jspx_th_aui_icon_0 = (com.liferay.taglib.aui.IconTag) _jspx_tagPool_aui_icon_markupView_image_cssClass_nobody.get(com.liferay.taglib.aui.IconTag.class);
    _jspx_th_aui_icon_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_icon_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1util_buffer_0);
    _jspx_th_aui_icon_0.setCssClass("alloy-editor-icon");
    _jspx_th_aui_icon_0.setImage("text-editor");
    _jspx_th_aui_icon_0.setMarkupView("lexicon");
    int _jspx_eval_aui_icon_0 = _jspx_th_aui_icon_0.doStartTag();
    if (_jspx_th_aui_icon_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_aui_icon_markupView_image_cssClass_nobody.reuse(_jspx_th_aui_icon_0);
      return true;
    }
    _jspx_tagPool_aui_icon_markupView_image_cssClass_nobody.reuse(_jspx_th_aui_icon_0);
    return false;
  }

  private boolean _jspx_meth_aui_icon_1(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1util_buffer_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:icon
    com.liferay.taglib.aui.IconTag _jspx_th_aui_icon_1 = (com.liferay.taglib.aui.IconTag) _jspx_tagPool_aui_icon_markupView_image_cssClass_nobody.get(com.liferay.taglib.aui.IconTag.class);
    _jspx_th_aui_icon_1.setPageContext(_jspx_page_context);
    _jspx_th_aui_icon_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1util_buffer_1);
    _jspx_th_aui_icon_1.setCssClass("icon-monospaced");
    _jspx_th_aui_icon_1.setImage("expand");
    _jspx_th_aui_icon_1.setMarkupView("lexicon");
    int _jspx_eval_aui_icon_1 = _jspx_th_aui_icon_1.doStartTag();
    if (_jspx_th_aui_icon_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_aui_icon_markupView_image_cssClass_nobody.reuse(_jspx_th_aui_icon_1);
      return true;
    }
    _jspx_tagPool_aui_icon_markupView_image_cssClass_nobody.reuse(_jspx_th_aui_icon_1);
    return false;
  }

  private boolean _jspx_meth_aui_icon_2(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1util_buffer_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:icon
    com.liferay.taglib.aui.IconTag _jspx_th_aui_icon_2 = (com.liferay.taglib.aui.IconTag) _jspx_tagPool_aui_icon_markupView_image_cssClass_nobody.get(com.liferay.taglib.aui.IconTag.class);
    _jspx_th_aui_icon_2.setPageContext(_jspx_page_context);
    _jspx_th_aui_icon_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1util_buffer_1);
    _jspx_th_aui_icon_2.setCssClass("icon-monospaced");
    _jspx_th_aui_icon_2.setImage("moon");
    _jspx_th_aui_icon_2.setMarkupView("lexicon");
    int _jspx_eval_aui_icon_2 = _jspx_th_aui_icon_2.doStartTag();
    if (_jspx_th_aui_icon_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_aui_icon_markupView_image_cssClass_nobody.reuse(_jspx_th_aui_icon_2);
      return true;
    }
    _jspx_tagPool_aui_icon_markupView_image_cssClass_nobody.reuse(_jspx_th_aui_icon_2);
    return false;
  }

  private boolean _jspx_meth_aui_icon_3(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1util_buffer_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:icon
    com.liferay.taglib.aui.IconTag _jspx_th_aui_icon_3 = (com.liferay.taglib.aui.IconTag) _jspx_tagPool_aui_icon_markupView_image_cssClass_nobody.get(com.liferay.taglib.aui.IconTag.class);
    _jspx_th_aui_icon_3.setPageContext(_jspx_page_context);
    _jspx_th_aui_icon_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1util_buffer_1);
    _jspx_th_aui_icon_3.setCssClass("icon-monospaced");
    _jspx_th_aui_icon_3.setImage("code");
    _jspx_th_aui_icon_3.setMarkupView("lexicon");
    int _jspx_eval_aui_icon_3 = _jspx_th_aui_icon_3.doStartTag();
    if (_jspx_th_aui_icon_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_aui_icon_markupView_image_cssClass_nobody.reuse(_jspx_th_aui_icon_3);
      return true;
    }
    _jspx_tagPool_aui_icon_markupView_image_cssClass_nobody.reuse(_jspx_th_aui_icon_3);
    return false;
  }
}
