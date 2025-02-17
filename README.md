# 🚀 Hibernate One-to-Many Relationship Example

This repository contains a **Hibernate One-to-Many Relationship** implementation using Java and JPA annotations. The project demonstrates how to map a **one-to-many relationship** in Hibernate using different approaches.

## ✨ Features
- 🔗 One-to-Many mapping with `@OneToMany` and `@JoinColumn`
- 🔄 Bidirectional One-to-Many mapping with `mappedBy`
- 🛠 Uses **Hibernate ORM** with **MySQL/Jakarta Persistence API**
- 📌 Uses **Lombok** for reducing boilerplate code
- 📚 Simple and clear examples for easy understanding

## 🛠 Technologies Used
- ☕ **Java 11+**
- 🏗 **Hibernate ORM**
- 📦 **Jakarta Persistence API (JPA)**
- 🗄 **MySQL**
- ✍️ **Lombok**
- 💻 **IntelliJ IDEA / VS Code**

## 📖 Concept Explanation
### 🔍 **What is a One-to-Many Relationship?**
A **One-to-Many** relationship in Hibernate is a database association where a record in one table is associated with multiple records in another table. This is commonly used when an entity has multiple related entities.

### 📌 **Types of One-to-Many Mappings in Hibernate**
1. 🔗 **Unidirectional Mapping:** A single entity maintains the relationship.
2. 🔄 **Bidirectional Mapping:** Both entities maintain a reference to each other.

### 🤔 **Why Use One-to-Many Mapping?**
- ✅ Ensures **data consistency** by structuring related data efficiently.
- 📊 Helps **normalize** the database structure.
- ⚡ Improves **query performance** by reducing redundancy.

### 📌 **Example Use Case**
Consider a **Department** that has multiple **Employees**. Instead of storing all employee details in the Department table, we store them separately in the Employee table and establish a **one-to-many** relationship.

## 🏃‍♂️ How to Run
1. 📥 **Clone the repository**
   ```sh
   git clone https://github.com/Matheesha-Abiman/hibernate-one-to-many-example.git
   cd hibernate-one-to-many-example
   ```
2. ⚙️ **Configure Database** (In `hibernate.cfg.xml`)
3. 🚀 **Build and Run**
   ```sh
   javac -cp ".:lib/*" com/example/MainApplication.java
   java -cp ".:lib/*" com.example.MainApplication
   ```

## 📝 Example Code
### 🏗 **1. Entity Classes**
#### 🏢 **Department.java**
```java
@Entity
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Employee> employees;
}
```

#### 👨‍💼 **Employee.java**
```java
@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
```

## 🤝 Contributing
Feel free to fork this repository and submit pull requests with improvements! 🎯
