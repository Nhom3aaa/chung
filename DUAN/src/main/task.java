package main;

public class task {
private int id ;
 private String description ; 
 private String status ; 
 private String createdat ; 
 private String updatedat;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public String getCreatedat() {
	return createdat;
}
public void setCreatedat(String createdat) {
	this.createdat = createdat;
}
public String getUpdatedat() {
	return updatedat;
}
public void setUpdatedat(String updatedat) {
	this.updatedat = updatedat;
}
public task(int id, String description, String status, String createdat, String updatedat) {
	
	this.id = id;
	this.description = description;
	this.status = status;
	this.createdat = createdat;
	this.updatedat = updatedat;
}
public task() {
	
}
@Override
public String toString() {
	return "thuoctinh [id=" + id + ", description=" + description + ", status=" + status + ", createdat=" + createdat
			+ ", updatedat=" + updatedat + "]";
} 
 
}
