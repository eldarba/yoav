package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import b.Calculator;
import b.CalculatorException;

public class CalculatorServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private Calculator calc = new Calculator();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("hello from servlet");
		PrintWriter out = res.getWriter();
		out.println("Hello from Servlet<br>");

		try {
			int a = Integer.parseInt(req.getParameter("a"));
			int b = Integer.parseInt(req.getParameter("b"));
			int m = calc.div(a, b);
			out.println(a + " / " + b + " = " + m);
		} catch (CalculatorException e) {
			out.println("error: " + e.getMessage());
		} catch (NumberFormatException e) {
			out.println("illegal parameters error: " + e.getMessage());
		} catch (Exception e) {
			out.println("some other error: " + e.getMessage());
		}

	}

}
