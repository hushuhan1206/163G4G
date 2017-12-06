package com.qhit.action;

import java.util.Locale;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class LanguageAction extends ActionSupport {

	private String lang;
	private Locale locale;

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if (lang != null && lang.equals("en")) {
			locale = Locale.ENGLISH;
		}
		if (lang != null && lang.equals("zh")) {
			locale = Locale.CHINESE;

		}
		ServletActionContext.getRequest().getSession().setAttribute("WW_TRANS_I18N_LOCALE", locale);		

		return super.execute();
	}

}
