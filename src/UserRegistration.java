
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the UserRecord database table.
 * 
 */
@Entity(name = "UserRecord")
public class UserRegistration implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column
	private int user_ID;

	@Column(name="user_name")
	private String userName;

	@Column(name="password")
	private String password;

	@Column(name="type_of_user")
	private String typeOfUser;

	public UserRegistration() {
	}

	public int getUser_ID() {
		return this.user_ID;
	}

	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTypeOfUser() {
		return this.typeOfUser;
	}

	public void setTypeOfUser(String typeOfUser) {
		this.typeOfUser = typeOfUser;
	}
	
	   // return number of columns in the table
	   public int getNumberOfColumns() {
		   return 4;
	   }
	   
	   // return the data in column i
	   public String getColumnData(int i) throws Exception {
		   if (i == 0)
			   return Integer.toString(getUser_ID());
		   else if (i == 1)
			   return getUserName();
		   else if (i == 2) 
			   return getPassword();
		   else if (i == 3)
			   return getTypeOfUser();
		   else
			   throw new Exception("Error: invalid column index in UserRecord table");    
	   }
	   
	   // return the name of column i
	   public String getColumnName(int i) throws Exception {
		   String colName = null;
		   if (i == 0) 
			   colName = "User_ID";
		   else if (i == 1)
			   colName = "user_name";
		   else if (i == 2)
			   colName = "password";
		   else if (i == 3)
			   colName = "type_of_user";
		   else 
			   throw new Exception("Access to invalid column number in UserRecord table");
		   
		   return colName;
	   }
	   
	   // set data column i to value
	   public void setColumnData(int i, Object value) throws Exception {
		   if (i == 0) 
			   user_ID = Integer.parseInt((String) value);
		   else if (i == 1) 
			   userName = (String) value;
		   else if (i == 2) 
			   password =  (String) value;
		   else if (i == 3)
			   typeOfUser = (String) value;
		   else
			   throw new Exception("Error: invalid column index in UserRecord table");    
	   }
	   
	  @Override
	  public String toString() {
	    return "CourseList [User ID =" + user_ID + ", "
	    	    + " First Name =" + userName + ","
	    	    + " Last Name =" + password + ","
	    	    + " Type Of User =" + typeOfUser + ","
	        + "]";
	  }
}