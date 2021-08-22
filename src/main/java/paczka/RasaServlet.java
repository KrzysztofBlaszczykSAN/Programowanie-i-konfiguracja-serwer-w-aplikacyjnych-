package paczka;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import paczka.RasaTyp;

import java.io.IOException;
import java.util.List;


@WebServlet(
        name = "ListaRas",
        urlPatterns = "/Rasy"
)
public class RasaServlet extends HttpServlet 
	{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    	{

        String rasaTyp = req.getParameter("Type"); //pobranie wartości wybranej na stronie index.html

        RasaLista listTyp = new RasaLista();
        RasaTyp l = RasaTyp.valueOf(rasaTyp);

        List rasyZwierzat = listTyp.RasaList(l);

        req.setAttribute("rasy", rasyZwierzat);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp"); //przejście do strony z wynikiem
        view.forward(req, resp);

    	}
	}