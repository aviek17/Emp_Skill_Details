package com.tcg.emp.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "skills_details")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class SkillDetails {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "emp_details_id")
    private EmployeeDetails employeeDetails;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "skill_type_id")
    private SkillType skillType;

    private String skillName;
    private Integer skillInYears;
    private String lastUsedIn;
    private boolean isTrainingCertificateAvailable;
    private String certificateName;
}
