package jpa.tuto;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name="USER")
public class User implements java.io.Serializable{

	private int id;
	private String name;
	private String forename;
	private Date added;
	
	@Id
	@Column(name="ID")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="FIRTS_NAME")
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	@Column(name="LAST_NAME")
	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}
	
	@Temporal(TemporalType.DATE)
	public Date getAdded() {
		return added;
	}
	public void setAdded(Date added) {
		this.added = added;
	}
}
