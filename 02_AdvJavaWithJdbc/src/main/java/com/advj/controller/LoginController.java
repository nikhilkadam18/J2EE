package com.advj.controller;

import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.advj.utils.DBUtil;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// check connectivity using @webservlet
		System.out.println("Login controller called");

		// setp 1 : get data from jsp form
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		System.out.println(email);
		System.out.println(pass);

		// step 2 : process data

		// Write select query for check user is present or not
		try {
			Connection con = DBUtil.getMySQLConnection();
			PreparedStatement ps = con.prepareStatement("Select * FROM login where email = ? AND password = ? ;");
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			RequestDispatcher rd = null;

			// step 3 : navigate data
			if (rs.next()) {
				System.out.println("User found !");
				response.sendRedirect("dashboard.jsp");
			} else {
				System.out.println("User not found !");
				request.setAttribute("errormessage", "Invalid Email and Password");
				rd = request.getRequestDispatcher("index.jsp");
				rd.forward(request, response);
			}
			con.close();
		} catch (Exception e) {
			System.out.println("Error while execute query");
		}

	}

}