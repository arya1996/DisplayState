package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.State;
import com.helper.ConnectionFactory;

public class StateDao {
	
	private static String INSERT = "insert into state (state) values(?)";
	private static String LIST_ALL = "select * from state";
	
	Connection con = null;
	PreparedStatement statement = null;
	ResultSet rs = null;

	public List<State> selectAllUsers() {

		List<State> stateList = new ArrayList<State>();

		try {
			con = ConnectionFactory.getConnection();
			statement = con.prepareStatement(LIST_ALL);

			rs = statement.executeQuery();

			while (rs.next()) {

				int no = rs.getInt("no");
				String stateName = rs.getString("state");

				stateList.add(new State(no,stateName));
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return stateList;
	}
	
	public String insertState(State state) {

		String stateName = state.getStateName();
		

		try {

			con = ConnectionFactory.getConnection();
		
			statement = con.prepareStatement(INSERT);
			statement.setString(1, stateName);
			
			int i = statement.executeUpdate();

			// just to ensure that data has been inserted to the database
			if (i != 0) {

				return "SUCCESS";
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		// on failure
		return "oops...Something went wrong there...!";
	}

}
