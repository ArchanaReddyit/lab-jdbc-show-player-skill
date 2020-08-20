
package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import dao.SkillDAO;
import model.Skill;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//			//int x;
//			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//			//x=Integer.parseInt(br.readLine());
//			
//			//objects  which progression
//			
//			SkillDAO skilldao=new SkillDAO();
//
//			System.out.println("Enter your ID");
//			Long id=Long.parseLong(br.readLine());
//			System.out.println("Enter Names");
//			String name=br.readLine();
//				
//				Skill.getSkillid();
//				Skill.getSkillName();
//
//				Skill Skill = new Skill(id, name); 
		SkillDAO skilldao=new SkillDAO();
				List<Skill> list = skilldao.listAllSkillDAO();
				
				System.out.println(list);
				
			
			}
	}


