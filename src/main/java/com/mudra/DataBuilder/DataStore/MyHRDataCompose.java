package com.mudra.DataBuilder.DataStore;

import com.mudra.DataBuilder.Entity.Employee;
import com.mudra.DataBuilder.Entity.Persons;
import com.mudra.DataBuilder.Services.ExcelReadService;
import com.mudra.DataBuilder.Utils.*;
import com.mudra.DataBuilder.repo.EmployeeRepository;
import com.mudra.DataBuilder.repo.PersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class MyHRDataCompose {

    @Autowired
    private final DataFromFile dataFromFile;

    @Autowired
    private final ExcelReadService excelReadService;
    @Autowired
    private final GenerateDates generateDates;

    @Autowired
    private final GenerateStrings generateStrings;
    @Autowired
    private final RandomInteger randomInteger;
    @Autowired
    private final EmployeeRepository employeeRepository;
    @Autowired
    private final PersonsRepository personsRepository;

    @Autowired
    private final GetConstants getEmployeeType;

    @Autowired
    private final GeneratePhoneNumbers generatePhoneNumbers;

    public MyHRDataCompose(DataFromFile dataFromFile, ExcelReadService excelReadService, GenerateDates generateDates, GenerateStrings generateStrings, RandomInteger randomInteger, EmployeeRepository employeeRepository, PersonsRepository personsRepository, GetConstants getEmployeeType, GeneratePhoneNumbers generatePhoneNumbers) {
        this.dataFromFile = dataFromFile;
        this.excelReadService = excelReadService;
        this.generateDates = generateDates;
        this.generateStrings = generateStrings;
        this.randomInteger = randomInteger;
        this.employeeRepository = employeeRepository;
        this.personsRepository = personsRepository;
        this.getEmployeeType = getEmployeeType;
        this.generatePhoneNumbers = generatePhoneNumbers;
    }

//    public void insertEmployees() {
//        Employee e1 = new Employee("James","Bond","jb@email.com","Sales");
//        Employee e2 = new Employee("John","Jones","jj@email.com","HR");
//        List<Employee> employees = Arrays.asList(e1,e2);
//        employeeRepository.saveAll(employees);
//    }


    public void insertEmployeesDynamically(int records) throws IOException {

        List<Employee> employeeList = new ArrayList<>();

        int i = 0;

        do {
            Employee emp = new Employee();
            emp.setFirstName(dataFromFile.getFirstNames());
            emp.setLastName(dataFromFile.getLastNames());
            emp.setEmail(dataFromFile.getFirstNames()+"."+ dataFromFile.getLastNames()+"@mod.gov.uk");
            emp.setDepartment("Sales");

            employeeList.add(i, emp);
            i++;
        } while (i<records);
        System.out.println("the size of employee list is" + employeeList.size());
        employeeRepository.saveAll(employeeList);

    }

    public void generatePersonRecords(int records) {

        List<Persons> personsList = new ArrayList<>();

        int i = 0;

        do {
            Persons person = new Persons();
            String givenName = excelReadService.getFirstName();
            String lastName = excelReadService.getSurname();
            String middleName = excelReadService.getMiddleName();
            if (i%9==0){
                person.setFullName(givenName + " "+ middleName+" " +lastName);
            } else {
                middleName = "";
                person.setFullName(givenName + " "+ lastName);
            }
            person.setEmployeeID(generateStrings.generateEmployeeId().toUpperCase());
            person.setGivenName(givenName);
            person.setMiddleNames(middleName);
            person.setSurname(lastName);
            person.setPersonalTitle(excelReadService.getPrefix());
            person.setPreferredName(givenName);
            person.setNationalInsurance(generateStrings.getNINO());
            person.setPuidNumber(randomInteger.getRandomLongIntBetween(100000000,999999999));
            person.setPuidName(lastName.toLowerCase()+givenName.toLowerCase().charAt(0)+randomInteger.getRandomIntBetween(100,999));
            person.setDateOfBirth(generateDates.getARandomDOB().toString());
            if (i%9==0){
                person.setEmployeeType(getEmployeeType.getMyHREmpType(1));
            } else {
                person.setEmployeeType(getEmployeeType.getMyHREmpType(0));
            }
            person.setSalaryAdminPlan(excelReadService.getSalaryAdminPlan());
            person.setGrade(excelReadService.getGrade());
            person.setPositionNumber(String.valueOf(randomInteger.getRandomIntBetween(1000,999999)));
            person.setPositionTitle(excelReadService.getPositionTitle());
            person.setJobFamilyCode(excelReadService.getJobFamilyCode());
            person.setJobFamily(excelReadService.getJobFamily());
            person.setJobCode(String.valueOf(randomInteger.getRandomIntBetween(1001,5000)));
            person.setJobCodeDescription(excelReadService.getJobCodeDescription());
            person.setEmployeeClassification(excelReadService.getEmployeeClassification());
            person.setPersonType(excelReadService.getPersonType());
            person.setWorkEmailAddress(givenName+"."+lastName+"@mod.gov.uk");
            person.setWorkPhoneNumber(generatePhoneNumbers.getWorkPhone());
            person.setWorkMobileNumber(generatePhoneNumbers.getMobile());
            person.setHomeMobile(generatePhoneNumbers.getMobile());
            person.setSecurityClearance(excelReadService.getSecurityClearance());
            LocalDate scIssueDate = generateDates.generateADate(2015,2020);
            LocalDate scEndDate = scIssueDate.plusYears(7);
            LocalDate scRenewalDate = scEndDate.minusDays(1);
            person.setSecurityClearanceIssueDate(scIssueDate.toString());
            person.setSecurityClearanceEndDate(scEndDate.toString());
            person.setSecurityClearanceRenewalDate(scRenewalDate.toString());
            person.setSecurityCertificateNumber("1-613880809");
            person.setNationality(excelReadService.getNationality());
            person.setReportsToManager("");
            person.setReportsToPDMFDO("");
            person.setLocationCode(excelReadService.getLocationCode());
            person.setLocationDescription(excelReadService.getLocationDescription());
            person.setAddressLine1(excelReadService.getAddressLine1());
            person.setAddressLine2(excelReadService.getAddressLine2());
            person.setAddressLine3(excelReadService.getAddressLine3());
            person.setCity(excelReadService.getCity());
            person.setPostalCode(excelReadService.getPostCode());
            person.setCounty(excelReadService.getCounty());
            person.setRegion(excelReadService.getRegion());
            person.setCountry(excelReadService.getCountry());
            person.setBusinessUnit(excelReadService.getBusinessUnit());
            person.setDepartmentID("");
            person.setDepartment(excelReadService.getDepartment());
            person.setUIN(generateStrings.getUIN());
            String hireDate = generateDates.getARandomJoiningDate().toString();
            if(i%3==0) {
                person.setSeniorityDate(hireDate);
            }
            else {
                person.setSeniorityDate("");
            }
            person.setHireDate(hireDate);
            person.setTerminationDate("");
            person.setEmployeeStatus("A");
            person.setContractorOrganisation("");
            person.setProjectEndDate("");
            person.setLeavingAction("");
            person.setLeavingReason("");
            person.setAction("");
            person.setReason("");
            person.setPreviousTerminationDate("");

            personsList.add(i, person);
            i++;
        } while (i<records);
        System.out.println("the size of employee list is" + personsList.size());
       personsRepository.saveAll(personsList);

    }
}
