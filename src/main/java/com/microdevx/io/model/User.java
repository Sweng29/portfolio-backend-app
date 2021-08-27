package com.microdevx.io.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String profileTitle;
    private String profileImageUrl;
    private String aboutMe;
    private String email;
    private String password;
    private String personalMobileNumber;
    private String businessMobileNumber;
    private String personalPhoneNumber;
    private String businessPhoneNumber;
    private String linkedInProfileUrl;
    private String githubProfileUrl;
    private String homeAddress;
    private String postalAddress;

    @OneToMany(mappedBy="user")
    private List<UserSkill> userSkillList;
    @OneToMany(mappedBy="user")
    private List<EducationDetail> educationDetailList;
    @OneToMany(mappedBy="user")
    private List<Project> projectList;
    @OneToMany(mappedBy="user")
    private List<Certification> certificationList;
    @OneToMany(mappedBy="user")
    private List<UserLanguage> userLanguageList;

}
