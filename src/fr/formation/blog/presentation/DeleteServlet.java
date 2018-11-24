package fr.formation.blog.presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.blog.metier.ArticleService;

public class DeleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Integer id = Integer.parseInt(req.getParameter("id"));
		ArticleService.getInstance().delete(id);
		resp.sendRedirect(this.getServletContext().getContextPath() + "/index.html");
	}

}
