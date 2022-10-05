package com.mudra.DataBuilder.Entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Data
@Entity
@Table(name="Persons")
public class Persons {

    @Id
    @GenericGenerator(name="person_Number", strategy = "com.mudra.DataBuilder.Utils.GeneratePersonNumber")
    @GeneratedValue(generator = "person_Number")
    @Column(name="person_Number")
    private Long personNumber;

    @Column(name="employeeID")
    private String employeeID;
    @Column(name="givenName")
    private String givenName;
    @Column(name="middleNames")
    private String middleNames;
    @Column(name="surname")
    private String surname;
    @Column(name="personalTitle")
    private String personalTitle;
    @Column(name="fullName")
    private String fullName;
    @Column(name="preferredName")
    private String preferredName;
    @Column(name="dateOfBirth")
    private String dateOfBirth;
    @Column(name="nationalInsurance")
    private String nationalInsurance;
    @Column(name="PUIDNumber")
    private Long puidNumber;
    @Column(name="PUIDName")
    private String puidName;
    @Column(name="birthNationality")
    private String birthNationality;
    @Column(name="nationality")
    private String nationality;
    @Column(name="personType")
    private String personType;
    @Column(name="employeeType")
    private String employeeType;
    @Column(name="employeeStatus")
    private String employeeStatus;
    @Column(name="seniorityDate")
    private String seniorityDate;
    @Column(name="hireDate")
    private String hireDate;
    @Column(name="terminationDate")
    private String terminationDate;
    @Column(name="rehireDate")
    private String rehireDate;
    @Column(name="projectEndDate")
    private String projectEndDate;
    @Column(name="workEmailAddress")
    private String workEmailAddress;
    @Column(name="userLoginId")
    private String userLoginId;
    @Column(name="userLoginName")
    private String userLoginName;

    @Column(name="workPhoneNumber")
    private String workPhoneNumber;
    @Column(name="workMobileNumber")
    private String workMobileNumber;
    @Column(name="homeMobile")
    private String homeMobile;

    @Column(name="salaryAdminPlan")
    private String salaryAdminPlan;
    @Column(name="grade")
    private String grade;
    @Column(name="positionNumber")
    private String positionNumber;
    @Column(name="positionTitle")
    private String positionTitle;
    @Column(name="jobFamilyCode")
    private String jobFamilyCode;
    @Column(name="jobFamily")
    private String jobFamily;
    @Column(name="jobCode")
    private String jobCode;
    @Column(name="jobCodeDescription")
    private String jobCodeDescription;
    @Column(name="employeeClassification")
    private String employeeClassification;
    @Column(name="businessUnit")
    private String businessUnit;
    @Column(name="departmentID")
    private String departmentID;
    @Column(name="department")
    private String department;
    @Column(name="UIN")
    private String UIN;
    @Column(name="contractorOrganisation")
    private String contractorOrganisation;

    @Column(name="securityClearance")
    private String securityClearance;
    @Column(name="securityClearanceIssueDate")
    private String securityClearanceIssueDate;
    @Column(name="securityClearanceEndDate")
    private String securityClearanceEndDate;
    @Column(name="securityClearanceRenewalDate")
    private String securityClearanceRenewalDate;
    @Column(name="securityCertificateNumber")
    private String securityCertificateNumber;

    @Column(name="locationCode")
    private String locationCode;
    @Column(name="locationDescription")
    private String locationDescription;
    @Column(name="addressLine1")
    private String addressLine1;
    @Column(name="addressLine2")
    private String addressLine2;
    @Column(name="addressLine3")
    private String addressLine3;
    @Column(name="addressLine4")
    private String addressLine4;
    @Column(name="city")
    private String city;
    @Column(name="postalCode")
    private String postalCode;
    @Column(name="county")
    private String county;
    @Column(name="region")
    private String region;
    @Column(name="country")
    private String country;

    @Column(name="reportsToManager")
    private String reportsToManager;
    @Column(name="reportsToPDMFDO")
    private String reportsToPDMFDO;
    @Column(name="leavingAction")
    private String leavingAction;
    @Column(name="leavingReason")
    private String leavingReason;
    @Column(name="action")
    private String action;
    @Column(name="reason")
    private String reason;
    @Column(name="previousTerminationDate")
    private String previousTerminationDate;

}
