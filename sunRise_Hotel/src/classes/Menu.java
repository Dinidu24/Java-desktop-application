package classes;

import java.sql.*;
import classes.DbConnector;
public class Menu {
	private String menuId;
	private String itemName;
	private String category;
	private String price;
	private String description;
	private String status;
	private String calories;
	private String dateAdded;
	private Connection con;
	
	public Menu() {
		// TODO Auto-generated constructor stub
		con = new DbConnector().getConnection();
	}

	


	public Menu(String menuId, String itemName, String category, String price, String description, String status,
			String calories, String dateAdded) {
		super();
		this.menuId = menuId;
		this.itemName = itemName;
		this.category = category;
		this.price = price;
		this.description = description;
		this.status = status;
		this.calories = calories;
		this.dateAdded = dateAdded;
		con = new DbConnector().getConnection();
	}




	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	
	
	public String getItemName() {
		return itemName;
	}




	public void setItemName(String itemName) {
		this.itemName = itemName;
	}




	public String getCategory() {
		return category;
	}




	public void setCategory(String category) {
		this.category = category;
	}




	public String getPrice() {
		return price;
	}




	public void setPrice(String price) {
		this.price = price;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	public String getCalories() {
		return calories;
	}




	public void setCalories(String calories) {
		this.calories = calories;
	}




	public String getDateAdded() {
		return dateAdded;
	}




	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}




	public String getMenuId() {
		return menuId;
	}




	public void addMenu() {
		try {
			String query="INSERT INTO menu VALUES(?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, menuId);
			pstmt.setString(2, itemName);
			pstmt.setString(3, category);
			pstmt.setString(4, price);
			pstmt.setString(5, description);
			pstmt.setString(6, status);
			pstmt.setString(7, calories);
			pstmt.setString(8, dateAdded);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
    public void updateMenu() {
    	try {
			String query="UPDATE menu SET itemName=?,category=?,price=?,description=?, status=?, calories=?,dateAdded=? WHERE menuId=?";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, itemName);
			pstmt.setString(2, category);
			pstmt.setString(3, price);
			pstmt.setString(4, description);
			pstmt.setString(5, status);
			pstmt.setString(6, calories);
			pstmt.setString(7, dateAdded);
			pstmt.setString(8, menuId);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
    public void deleteMenu() {
    	try {
			String query="DELETE FROM menu WHERE menuId=?";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, menuId);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
    }
	
}
