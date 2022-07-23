package com.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comments {
		@Id
		//@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		private String text;
		
		public Comments() {
			// TODO Auto-generated constructor stub
		}

		
		public Comments(long id, String text) {
			super();
			this.id = id;
			this.text = text;
		}

		
		@Override
		public String toString() {
			return "Comments [id=" + id + ", text=" + text + "]";
		}


		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}
		
}
