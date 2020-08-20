package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	
	public List<Skill> listAllSkillDAO () throws Exception {
		
		System.out.println("Create Skill dao");
	List<Skill> list = new ArrayList<Skill>();
//		long ID = Skill.getSkillid();
//		String NAMES=Skill.getSkillName();
		
//		ConnectionManager cm=new ConnectionManager();
//		
//        
//	String sql="Insert into Skill(ID,NAMES) VALUES(?,?)";
//	
//		PreparedStatement st=ConnectionManager.getConnection().prepareStatement(sql);
//		st.setLong(1, ID);
//		st.setString(2, NAMES);
//		
//		System.out.println("established");
//		
//		int x =st.executeUpdate();
//		System.out.println(x); we hav to use select and return those right yes aodd in array list and resturn ok i will do or i will do u do ok
		
		
		String Skills="select ID, NAMES from skills order by NAMES ASC";
		
	 Connection con=null;
		   try {
			con=ConnectionManager.getConnection();
//			 PreparedStatement prep=con.prepareStatement(Skills);
//			  prep.setLong(1, ID);
//			 prep.setString(2, Skill.getSkillName());
//			  ResultSet rs=prep.executeQuery();
			
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(Skills);
		while(resultSet.next()) {
			Long id = resultSet.getLong("ID");
			String names = resultSet.getString("NAMES");
			Skill skill = new Skill(id, names);
			list.add(skill);
		}
		   } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		   return list;
		   
	   }

	
}
