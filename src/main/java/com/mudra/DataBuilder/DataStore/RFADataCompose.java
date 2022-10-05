package com.mudra.DataBuilder.DataStore;

import com.mudra.DataBuilder.Entity.Persons;
import com.mudra.DataBuilder.Services.ExcelReadService;
import com.mudra.DataBuilder.Utils.*;
import com.mudra.DataBuilder.repo.PersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RFADataCompose {
        @Autowired
    private final ExcelReadService excelReadService;
    @Autowired
    private final GenerateDates generateDates;

    @Autowired
    private final GenerateStrings generateStrings;
    @Autowired
    private final RandomInteger randomInteger;
    @Autowired
    private final PersonsRepository personsRepository;

    @Autowired
    private final GetConstants getConstants;

    @Autowired
    private final GeneratePersonNumber personNumber;

    @Autowired
    private final GeneratePhoneNumbers generatePhoneNumbers;

    public RFADataCompose( ExcelReadService excelReadService, GenerateDates generateDates, GenerateStrings generateStrings, RandomInteger randomInteger, PersonsRepository personsRepository, GetConstants getConstants, GeneratePersonNumber personNumber, GeneratePhoneNumbers generatePhoneNumbers) {
        this.excelReadService = excelReadService;
        this.generateDates = generateDates;
        this.generateStrings = generateStrings;
        this.randomInteger = randomInteger;
        this.personsRepository = personsRepository;
        this.getConstants = getConstants;
        this.personNumber = personNumber;
        this.generatePhoneNumbers = generatePhoneNumbers;
    }

    public void generatePersonRecords(int records) {

        List<Persons> personsList = new ArrayList<>();

        int i = 0;

        do {
            Persons person = new Persons();
            person.setPersonNumber(personNumber.generatePersonNumber()); //personWID
            person.setEmployeeID(generateStrings.generateEmployeeId().toUpperCase()); //workforceID

            String givenName = excelReadService.getFirstName();
            String middleName = excelReadService.getMiddleName();
            String lastName = excelReadService.getSurname();
            if (i%9==0){
                person.setFullName(givenName + " "+ middleName+" " +lastName);
            } else {
                middleName = "";
                person.setFullName(givenName + " "+ lastName); //fullName
            }
            person.setGivenName(givenName); //givenName
            person.setMiddleNames(middleName); //middleName
            person.setSurname(lastName); //surname
            //ukDefActingPaidRank
             //idamActualEndDate
             //ukDefBirthNationality
            person.setDateOfBirth(generateDates.getARandomDOB().toString()); //ukDefDoB
            person.setEmployeeStatus(getConstants.unSpecifiedValue); //employeeStatus
            person.setEmployeeType(null); //employeeType
            person.setProjectEndDate("9999-12-31"); //idamPlannedEndDate
            //ukDefExternalEmail
            person.setJobCode("0");//jobCode
            //title
            //idamLatestRehireDate
            person.setWorkMobileNumber(generatePhoneNumbers.getMobile());//mobile
            person.setNationality(getConstants.unSpecifiedValue); //ukDefNationality
            person.setWorkPhoneNumber(null); //telephoneNumber
            person.setPreferredName(null); //preferredName
            person.setWorkEmailAddress(null); //email
            person.setPuidName(null); //ukDefPUIDName
            person.setPuidNumber(null); //ukDefPUID
            //ukDefSeniority
            //ukDefRegtCorps
            //personalTitle
            person.setHomeMobile(generatePhoneNumbers.getMobile()); //otherPhoneNumber
            person.setSecurityClearance(null); //ukDefSecClearLevel
//ukDefSecClearHeldBy
            person.setSecurityCertificateNumber(null); //ukDefSecClearRefNo
            person.setSecurityClearanceEndDate(null); //ukDefSecClearEndDate
            person.setSecurityClearanceIssueDate(null); //ukDefSecClearFromDate
            person.setSecurityClearanceRenewalDate(null); //ukDefSecClearReviewDate
//ukDefSecClearAssertedBy
//ukDefSecClearVerifiedBy
//ukDefSecClearVerifiedDate

            person.setHireDate(generateDates.getARandomJoiningDate().toString()); //idamStartDate
//ukDefSubstantiveRank
            person.setTerminationDate(null); //idamHRTerminationDate
            person.setPersonType(null);//idamUserType
//ukDefTopLevelBudget
            person.setDepartmentID(null); //organisation
            person.setDepartment(getConstants.unSpecifiedValue); //ukDefOrgName
            person.setUIN(null);//ukDefUIN
//ukDefService
            person.setPositionNumber(String.valueOf(randomInteger.getRandomIntBetween(1000,999999)));//ukDefPositionNumber

            person.setJobFamilyCode(null);//idamJobCode
            person.setJobFamily(null);//idamJobCodeDesc
            person.setJobCodeDescription(null);//ukDefJobSpecification

//ukDefTradeSpecialisation
            person.setReportsToManager(null); //managerWorkforceID
            person.setContractorOrganisation(null); //company
//ukDefAffiliation
            person.setLocationDescription(excelReadService.getLocationDescription());//physicalDeliveryOfficeName
            person.setLocationCode(null); //ukDefLocationCode
            person.setAddressLine1(null); //ukDefAddressline1
            person.setAddressLine2(null); //ukDefAddressline2
            person.setAddressLine3(null); //ukDefAddressline3


//ukDefAddressline4
//postOfficeBox
            person.setCity(getConstants.unSpecifiedValue); //city
            person.setCounty(getConstants.unSpecifiedValue); //state
            person.setPostalCode(getConstants.unSpecifiedValue);//postalCode
            person.setCountry(getConstants.unSpecifiedValue); //country
            person.setRegion(getConstants.unSpecifiedValue); //ukDefRegion
            person.setNationalInsurance(null); //idamNationalID
            //existingIdamRfaIdentity


            person.setPersonalTitle(excelReadService.getPrefix());
            person.setSalaryAdminPlan(excelReadService.getSalaryAdminPlan());
            person.setGrade(excelReadService.getGrade());
            person.setPositionTitle(excelReadService.getPositionTitle());
            person.setEmployeeClassification(excelReadService.getEmployeeClassification());

            person.setBusinessUnit(excelReadService.getBusinessUnit());
            person.setLeavingAction("");
            person.setLeavingReason("");
            person.setAction("");
            person.setReason("");
            person.setTerminationDate("");

            personsList.add(i, person);
            i++;
        } while (i<records);
        System.out.println("the size of employee list is" + personsList.size());
        personsRepository.saveAll(personsList);

    }
}
