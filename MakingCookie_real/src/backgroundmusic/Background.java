package backgroundmusic;

public class Background {
	
	   private String title; // 제목
	   private String path; // 실제 노래 경로

	   
	   public void Music(String title, String path) {
	      
	      this.title = title;
	    
	      this.path = path;
	   }
	   
	   public String getPath() {
	      return path;
	   }
	   public void setPath(String path) {
	      this.path = path;
	   }
	   
	   public String getTitle() {
	      return title;
	   }
	   public void setTitle(String title) {
	      this.title = title;
	   }
	  
	   
	   
	   
	}
