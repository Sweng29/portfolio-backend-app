package com.microdevx.io.model;

import com.microdevx.io.model.constants.DegreeType;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "education_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EducationDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String instituteName;
    private String courseSpecialization;
    @Enumerated(EnumType.STRING)
    private DegreeType degreeType;
    private LocalDate startDate;
    private LocalDate completionDate;
    private Boolean currentlyEnrolled;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

}
