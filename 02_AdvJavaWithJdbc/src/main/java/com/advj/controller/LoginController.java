package com.advj.controller;

import java.io.IOException;
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
			
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			
			con.close();
		} catch (Exception e) {
			System.out.println("Error while execute query");
		}

	}

}