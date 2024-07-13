package com.spring.springNativeQuery.Entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
//@Data
//@Table(name="student_db")
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString

public class Student {
	
	@Id
	//@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
  //  @Column(name="ST_MARK")
	//@NotBlank(message = "Mark is mandatory")
    private int age;
    
  //  @Column(name="NAME")
	//@NotBlank(message = "Name is mandatory")
	private String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
    
    @OneToOne(cascade=CascadeType.ALL,targetEntity = Address.class)
    @JoinColumn(name="fk_add_id")
	public Address address;
	
}
