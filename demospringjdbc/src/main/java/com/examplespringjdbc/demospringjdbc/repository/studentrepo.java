package com.examplespringjdbc.demospringjdbc.repository;

import com.examplespringjdbc.demospringjdbc.model.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties;
import org.springframework.boot.autoconfigure.quartz.QuartzProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class studentrepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(student s1)
    {
        String sql="insert into student (rollno, name, marks)  values (?,?,?)";
        int rows = jdbc.update(sql,s1.getRollno(),s1.getName(),s1.getMarks());
        System.out.println(rows+"effected");

    }

    public List<student> findall()
    {
        String sql="select * from student";

        RowMapper<student> mapper=new RowMapper<student>() {
            @Override
            public student mapRow(ResultSet rs, int rowNum) throws SQLException {
                student s= new student();
                s.setRollno(rs.getInt("rollno"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));
                return s;
            }

        };
        return jdbc.query(sql,mapper);
    }
}
