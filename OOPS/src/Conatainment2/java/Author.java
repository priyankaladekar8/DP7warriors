package Conatainment2.java;

public class Author {


		
		private int authorid;
		private String aname;
		
		public Author() {
		
		}

		public Author(int authorid, String aname) {
			this.authorid = authorid;
			this.aname = aname;
		}

		public int getAuthorid() {
			return authorid;
		}

		public void setAuthorid(int authorid) {
			this.authorid = authorid;
		}

		public String getAname() {
			return aname;
		}

		public void setAname(String aname) {
			this.aname = aname;
		}
		
		public String toString()
		{
			return "  Author:"+authorid+" "+aname;
		}

	}


