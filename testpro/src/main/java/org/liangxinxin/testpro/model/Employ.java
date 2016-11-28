package org.liangxinxin.testpro.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="employ")
public class Employ {
	
	
	private Long id;
	
	private String userName;
	
	private String IdCard;
	
	private String phone;
	
	private Department dept;
	
	private int age ;
	
	private Date employTime;
	 
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	@Column(name="user_name")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name="id_card")
	public String getIdCard() {
		return IdCard;
	}

	public void setIdCard(String idCard) {
		IdCard = idCard;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@ManyToOne
	@JoinColumn(name="dept_id")
	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
	 @Transient 
	 //可选，表示该属性并非一个到数据库表的字段的映射，ORM框架将忽略该属性，如果一个属性并非数据库表的字段映射，就务必将其标示为@Transient，否则ORM 框架默认其注解为 @Basic
	 public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	 //name - 可选，表示数据库表中该字段的名称，默认情形属性名称一致
	// nullable - 可选，表示该字段是否允许为 null，默认为 true
	// unique - 可选，表示该字段是否是唯一标识，默认为 false
	// length - 可选，表示该字段的大小，仅对 String 类型的字段有效，默认值255.
	// insertable - 可选，表示在ORM框架执行插入操作时，该字段是否应出现INSETRT.   语句中，默认为 true
	// updateable - 可选，表示在ORM 框架执行更新操作时，该字段是否应该出现在,UPDATE 语句中，默认为 true. 对于一经创建就不可以更改的字段，该           属性非常有用，如对于 birthday字段。
	//columnDefinition - 可选，表示该字段在数据库中的实际类型。通常ORM 框架可以根     据属性类型自动判断数据库中字段的类型，但是对于Date 类型仍无法确定数据       库中字段类型究竟是 DATE,TIME 还是TIMESTAMP. 此外 ,String 的默认映射类型为 VARCHAR, 如果要将 String 类型映射到特定数据库的 BLOB或 TEXT 字段类型，该属性非常有用。
	@Column(name="BIRTH",nullable=false,columnDefinition="DATE")
	public Date getEmployTime() {
		return employTime;
	}

	public void setEmployTime(Date employTime) {
		this.employTime = employTime;
	}
	
	
	

}
