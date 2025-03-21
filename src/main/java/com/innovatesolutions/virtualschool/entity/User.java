package com.innovatesolutions.virtualschool.entity;
import com.innovatesolutions.virtualschool.enums.Gender;
import com.innovatesolutions.virtualschool.enums.UserRole;
import lombok.Data;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Data
@Document
public class User {
    @Id
    private String userid;
    private String userState;
    private UserRole userRole;
    private String nameWithInitials;
    private String fullName;
    private String phoneNo;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
    @Indexed(unique = true)
    private String email;
    private String nic;
    private Gender gender;
    private String address;
    @Setter
    private List<String> classIds;
    private String passWord;
    private String studentId;
    public User(){
    }

    public User(String userid,
                String userState,
                UserRole userRole,
                String nameWithInitials,
                String fullName,
                String phoneNo,
                LocalDate dateOfBirth,
                String email,
                String nic,
                Gender gender,
                String address,
                List<String> classIds,
                String passWord,
                String studentId) {
        this.userid= userid;
        this.userState=userState;
        this.userRole=userRole;
        this.nameWithInitials = nameWithInitials;
        this.fullName=fullName;
        this.phoneNo=phoneNo;
        this.dateOfBirth=dateOfBirth;
        this.email = email;
        this.nic=nic;
        this.gender = gender;
        this.address = address;
        this.classIds = classIds;
        this.passWord=passWord;
        this.studentId=studentId;
    }

}
