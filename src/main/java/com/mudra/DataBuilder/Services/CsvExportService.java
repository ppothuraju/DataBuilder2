package com.mudra.DataBuilder.Services;

import com.mudra.DataBuilder.DataStore.MyHRDataCompose;
import com.mudra.DataBuilder.Entity.Employee;
import com.mudra.DataBuilder.Entity.Persons;
import com.mudra.DataBuilder.Utils.CSVFileHeaders;
import com.mudra.DataBuilder.repo.EmployeeRepository;
import com.mudra.DataBuilder.repo.PersonsRepository;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

@Service
public class CsvExportService {

    private static final Logger log = getLogger(CsvExportService.class);

    private final EmployeeRepository employeeRepository;
    private final PersonsRepository personsRepository;

    private final MyHRDataCompose myHRDataCompose;

    private final CSVFileHeaders csvFileHeaders;

    public CsvExportService(EmployeeRepository employeeRepository, PersonsRepository personsRepository, MyHRDataCompose myHRDataCompose, CSVFileHeaders csvFileHeaders) {
        this.employeeRepository = employeeRepository;
        this.personsRepository = personsRepository;
        this.myHRDataCompose = myHRDataCompose;
        this.csvFileHeaders = csvFileHeaders;
    }

    public void writeEmployeesToCsv(Writer writer, int recordCount) throws IOException {

       // myHRDataCompose.insertEmployees();
        myHRDataCompose.insertEmployeesDynamically(recordCount);

        List<Employee> employees = employeeRepository.findAll();
        try (CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withDelimiter('|'))) {
            //csvPrinter.printRecord("Id","FirstName","LastName","email","Department");


            csvPrinter.printRecord(
                    csvFileHeaders.empHeader(0),
                    csvFileHeaders.empHeader(1),
                    csvFileHeaders.empHeader(2),
                    csvFileHeaders.empHeader(3),
                    csvFileHeaders.empHeader(4)
            );
            for (Employee employee : employees) {
                csvPrinter.printRecord(
                        employee.getId(),
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getEmail(),
                        employee.getDepartment());
            }
        } catch (IOException e) {
            log.error("Error While writing CSV ", e);
        }
    }

    public void writePersonsToCsv(Writer writer, int recordCount) {

        // myHRDataCompose.insertEmployees();
        myHRDataCompose.generatePersonRecords(recordCount);

        List<Persons> persons = personsRepository.findAll();
        try (CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withDelimiter('|'))) {
            //csvPrinter.printRecord("Id","FirstName","LastName","email","Department");

            csvPrinter.printRecord(
                    csvFileHeaders.myhrHeader(0),
                    csvFileHeaders.myhrHeader(1),
                    csvFileHeaders.myhrHeader(2),
                    csvFileHeaders.myhrHeader(3),
                    csvFileHeaders.myhrHeader(4),
                    csvFileHeaders.myhrHeader(5),
                    csvFileHeaders.myhrHeader(6),
                    csvFileHeaders.myhrHeader(7),
                    csvFileHeaders.myhrHeader(8),
                    csvFileHeaders.myhrHeader(9),
                    csvFileHeaders.myhrHeader(10),
                    csvFileHeaders.myhrHeader(11),
                    csvFileHeaders.myhrHeader(12),
                    csvFileHeaders.myhrHeader(13),
                    csvFileHeaders.myhrHeader(14),
                    csvFileHeaders.myhrHeader(15),
                    csvFileHeaders.myhrHeader(16),
                    csvFileHeaders.myhrHeader(17),
                    csvFileHeaders.myhrHeader(18),
                    csvFileHeaders.myhrHeader(19),
                    csvFileHeaders.myhrHeader(20),
                    csvFileHeaders.myhrHeader(21),
                    csvFileHeaders.myhrHeader(22),
                    csvFileHeaders.myhrHeader(23),
                    csvFileHeaders.myhrHeader(24),
                    csvFileHeaders.myhrHeader(25),
                    csvFileHeaders.myhrHeader(26),
                    csvFileHeaders.myhrHeader(27),
                    csvFileHeaders.myhrHeader(28),
                    csvFileHeaders.myhrHeader(29),
                    csvFileHeaders.myhrHeader(30),
                    csvFileHeaders.myhrHeader(31),
                    csvFileHeaders.myhrHeader(32),
                    csvFileHeaders.myhrHeader(33),
                    csvFileHeaders.myhrHeader(34),
                    csvFileHeaders.myhrHeader(35),
                    csvFileHeaders.myhrHeader(36),
                    csvFileHeaders.myhrHeader(37),
                    csvFileHeaders.myhrHeader(38),
                    csvFileHeaders.myhrHeader(39),
                    csvFileHeaders.myhrHeader(40),
                    csvFileHeaders.myhrHeader(41),
                    csvFileHeaders.myhrHeader(42),
                    csvFileHeaders.myhrHeader(43),
                    csvFileHeaders.myhrHeader(44),
                    csvFileHeaders.myhrHeader(45),
                    csvFileHeaders.myhrHeader(46),
                    csvFileHeaders.myhrHeader(47),
                    csvFileHeaders.myhrHeader(48),
                    csvFileHeaders.myhrHeader(49),
                    csvFileHeaders.myhrHeader(50),
                    csvFileHeaders.myhrHeader(51),
                    csvFileHeaders.myhrHeader(52),
                    csvFileHeaders.myhrHeader(53),
                    csvFileHeaders.myhrHeader(54),
                    csvFileHeaders.myhrHeader(55),
                    csvFileHeaders.myhrHeader(56),
                    csvFileHeaders.myhrHeader(57),
                    csvFileHeaders.myhrHeader(58),
                    csvFileHeaders.myhrHeader(59)
            );
            for (Persons person : persons) {
                csvPrinter.printRecord(
                    person.getEmployeeID(),
                    person.getGivenName(),
                    person.getMiddleNames(),
                    person.getSurname(),
                    person.getPersonalTitle(),
                    person.getFullName(),
                    person.getPreferredName(),
                    person.getNationalInsurance(),
                    person.getPuidNumber(),
                    person.getPuidName(),
                    person.getDateOfBirth(),
                    person.getWorkEmailAddress(),
                    person.getEmployeeType(),
                    person.getSalaryAdminPlan(),
                    person.getGrade(),
                    person.getPositionNumber(),
                    person.getPositionTitle(),
                    person.getJobFamilyCode(),
                    person.getJobFamily(),
                    person.getJobCode(),
                    person.getJobCodeDescription(),
                    person.getPersonType(),
                    person.getWorkEmailAddress(),
                    person.getWorkPhoneNumber(),
                    person.getWorkMobileNumber(),
                    person.getHomeMobile(),
                    person.getSecurityClearance(),
                    person.getSecurityClearanceIssueDate(),
                    person.getSecurityClearanceEndDate(),
                    person.getSecurityClearanceRenewalDate(),
                    person.getSecurityCertificateNumber(),
                    person.getNationality(),
                    person.getReportsToManager(),
                    person.getReportsToPDMFDO(),
                    person.getLocationCode(),
                    person.getLocationDescription(),
                    person.getAddressLine1(),
                    person.getAddressLine2(),
                    person.getAddressLine3(),
                    person.getCity(),
                    person.getPostalCode(),
                    person.getCounty(),
                    person.getRegion(),
                    person.getCountry(),
                    person.getBusinessUnit(),
                    person.getDepartmentID(),
                    person.getDepartment(),
                    person.getUIN(),
                    person.getSeniorityDate(),
                    person.getHireDate(),
                    person.getRehireDate(),
                    person.getTerminationDate(),
                    person.getEmployeeStatus(),
                    person.getContractorOrganisation(),
                    person.getProjectEndDate(),
                    person.getLeavingAction(),
                    person.getLeavingReason(),
                    person.getAction(),
                    person.getReason(),
                    person.getPreviousTerminationDate()
                );
            }
        } catch (IOException e) {
            log.error("Error While writing CSV ", e);
        }
    }
}