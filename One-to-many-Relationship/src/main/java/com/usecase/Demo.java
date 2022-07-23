package com.usecase;

import javax.persistence.EntityManager;

import com.Entities.Comments;
import com.Entities.Post;
import com.Utilities.EMUtil;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em=EMUtil.provideConnection();
		
		Post post=new Post();
		post.setTitle("prem");
		post.setDescription("Went to pune");
		
		Comments c1=new Comments(1, "wow");
		//c1.setText("kdk");
		Comments c2=new Comments(2,"Nice");
		//c2.setText("Nice");
		Comments c3=new Comments(3,"kdk");
		//c3.setText("Superb");
		
		
		post.getComments().add(c1);
		post.getComments().add(c2);
		post.getComments().add(c3);
		
		
		em.getTransaction().begin();
		em.persist(post);
		em.getTransaction().commit();
		em.close();
		System.out.println("Done");
	}

}
