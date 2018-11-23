package com.calculatrice.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculatrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Calculatrice() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int operantUn;
		int operantDeux;
		String operateur = request.getParameter("operateur");
		int calcul;
		
		if(request.getParameter("operantUn") == "")
		{
			operantUn = 0;
		}
		else {
			operantUn = Integer.parseInt(request.getParameter("operantUn"));
		}
        
		if(request.getParameter("operantDeux") == "")
		{
			operantDeux = 0;
		}
		else {
			operantDeux = Integer.parseInt(request.getParameter("operantDeux"));
		}
        if (operateur.equals("+")) {
        	calcul = operantUn+operantDeux;
        }
        else if (operateur.equals("-")) {
        	calcul = operantUn-operantDeux;
        }
        else if (operateur.equals("x")) {
        	calcul = operantUn*operantDeux;
        }
        else{
        	calcul = operantUn/operantDeux;
        }
        
		String resultat = "Resultat : " + operantUn + " " + operateur + " " + operantDeux + " = " + calcul;
		request.setAttribute("resultat", resultat);
        
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
	}

}
