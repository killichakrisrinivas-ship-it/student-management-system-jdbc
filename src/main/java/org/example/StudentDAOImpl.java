package org.example;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO{


private final Connection con;




    public StudentDAOImpl()  throws Exception{
        this.con = DBConnection.getConnection();
    }

    @Override
    public void addStudent(Student student) throws SQLException{


        String sql = "INSERT INTO Student(name,age,branch,email) VALUES(?,?,?,?)";

        try(PreparedStatement ps =  con.prepareStatement(sql)){

            ps.setString(1,student.getName());
            ps.setInt(2,student.getAge());
            ps.setString(3,student.getBranch());
            ps.setString(4,student.getEmail());
            int rows = ps.executeUpdate();

        }



    }

    @Override
    public List<Student> getAllStudents()  throws SQLException{
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM Student ";
        try(PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()){

            while(rs.next()){
                int sid = rs.getInt("sid");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String branch = rs.getString("branch");
                String email = rs.getString("email");
                Student student = new Student(
                        sid,age,name,branch,email
                );
                list.add(student);


            }
        }

        return list;
    }

    @Override
    public void updateStudent(Student student) throws SQLException {
    String sql ="UPDATE  Student SET name = ? , age = ? , branch = ? , email = ? where sid = ?";
   try( PreparedStatement ps = con.prepareStatement(sql)){
       ps.setString(1,student.getName());
       ps.setInt(2,student.getAge());
       ps.setString(3,student.getBranch());
       ps.setString(4,student.getEmail());
       ps.setInt(5,student.getId());
       int rows =  ps.executeUpdate();

   }

    }

    @Override
    public void deleteStudent(int sid) throws SQLException {
        String sql = "DELETE FROM Student where sid = ?";
        try (PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setInt(1, sid);
            int rows = ps.executeUpdate();

        }

    }
}
