package com.psddev.cms.tool;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public abstract class PageServlet extends HttpServlet {

    protected abstract String getPermissionId();

    protected abstract void doService(ToolPageContext page) throws IOException, ServletException;

    @Override
    protected final void service(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {

        ToolPageContext page = new ToolPageContext(getServletContext(), request, response);

        if (page.requirePermission(getPermissionId())) {
            return;
        }

        response.setContentType("text/html");
        doService(page);
    }
}
