package com.training.servlet;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyTag extends SimpleTagSupport{
	public void doTag() throws IOException {
		JspWriter out=getJspContext().getOut();
		out.println("--DataObject--");
		out.println("My Custom tag");
	}

}
