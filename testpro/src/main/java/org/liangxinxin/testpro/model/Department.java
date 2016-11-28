package org.liangxinxin.testpro.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 2016-11-25
 * @author liangxinxin
 *
 */
// @Entity ：声明这个类是持久化类 
//@Table对应数据库表 department 对应数据库：testpro
@Entity
@Table(name = "department", catalog = "testpro")
public class Department {

	private Long id;
	
	private String deptName;
	
	private Set<Employ> employes;

	//@Id 主键Id
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	//映射表中dept_name这个字段 ，长度是500
	@Column(name="dept_name", length = 500)
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	//级联操作：cascade = CascadeType.ALL
	//延迟加载：fetch = FetchType.LAZY
	//映射：mappedBy = "dept"
	//一对多方式
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "dept")
	public Set<Employ> getEmployes() {
		return employes;
	}

	public void setEmployes(Set<Employ> employes) {
		this.employes = employes;
	}
	
	
	
}
 