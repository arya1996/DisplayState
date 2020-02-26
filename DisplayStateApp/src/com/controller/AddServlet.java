package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.State;
import com.dao.StateDao;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String stateName = request.getParameter("statename");

		// creating object for State
		State Statebean = new State();

		Statebean.setStateName(stateName);

		// creating object for StateDao
		StateDao objDao = new StateDao();
		try {
			objDao.insertState(Statebean);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("inserted");
		// return list:
				List<State> listState = objDao.selectAllUsers();
				System.out.println(listState.toString());
				request.setAttribute("stateList", listState);

				RequestDispatcher dispatcher = request.getRequestDispatcher("List.jsp");
				dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
