package com.mudra.DataBuilder.Services;

import com.mudra.DataBuilder.Utils.RandomInteger;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExcelReadService {

    @Autowired
    private final RandomInteger randomInteger;

    public static List<String> givenNames = new ArrayList<>();
    public static List<String> middleNames = new ArrayList<>();
    public static List<String> surNames = new ArrayList<>();
    public static List<String> prefix = new ArrayList<>();
    public static List<String> employeeType = new ArrayList<>();
    public static List<String> SalaryAdminPlan = new ArrayList<>();
    public static List<String> Grade = new ArrayList<>();
    public static List<String> PositionTitle = new ArrayList<>();
    public static List<String> JobFamilyCode = new ArrayList<>();
    public static List<String> JobFamily = new ArrayList<>();
    public static List<String> JobCodeDescription = new ArrayList<>();
    public static List<String> EmployeeClassification = new ArrayList<>();
    public static List<String> PersonType = new ArrayList<>();
    public static List<String> SecurityClearance = new ArrayList<>();
    public static List<String> Nationality = new ArrayList<>();
    public static List<String> LocationCode = new ArrayList<>();
    public static List<String>  LocationDescription = new ArrayList<>();
    public static List<String>  AddressLine1 = new ArrayList<>();
    public static List<String>  AddressLine2 = new ArrayList<>();
    public static List<String>  AddressLine3 = new ArrayList<>();
    public static List<String>  City = new ArrayList<>();
    public static List<String>  PostalCode = new ArrayList<>();
    public static List<String>  County = new ArrayList<>();
    public static List<String>  Region = new ArrayList<>();
    public static List<String>  Country = new ArrayList<>();
    public static List<String>  BusinessUnit = new ArrayList<>();
    public static List<String>  Department = new ArrayList<>();



    public ExcelReadService(RandomInteger randomInteger) {
        this.randomInteger = randomInteger;
    }


    public void generateAttributeListFromExcel() {

        FileInputStream file;
        try {
            file = new FileInputStream("D:\\projects\\DataBuilder\\src\\main\\resources\\Data.xlsx");
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        //Create Workbook instance holding reference to .xlsx file
        XSSFWorkbook workbook;
        try {
            workbook = new XSSFWorkbook(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //Get first/desired sheet from the workbook
        XSSFSheet sheet = workbook.getSheetAt(0);

        for (Row row : sheet) {
            for (Cell cell : row) {
                if (cell.getColumnIndex() == 1) {
                    if (cell.getStringCellValue().length() > 0) {
                        givenNames.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 2) {
                    if (cell.getStringCellValue().length() > 0) {
                        middleNames.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 3) {
                    if (cell.getStringCellValue().length() > 0) {
                        surNames.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 4) {
                    if (cell.getStringCellValue().length() > 0) {
                        prefix.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 11) {
                    if (cell.getStringCellValue().length() > 0) {
                        employeeType.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 12) {
                    if (cell.getStringCellValue().length() > 0) {
                        SalaryAdminPlan.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 13) {
                    if (cell.getStringCellValue().length() > 0) {
                        Grade.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 15) {
                    if (cell.getStringCellValue().length() > 0) {
                        PositionTitle.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 16) {
                    if (cell.getStringCellValue().length() > 0) {
                        JobFamilyCode.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 17) {
                    if (cell.getStringCellValue().length() > 0) {
                        JobFamily.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 19) {
                    if (cell.getStringCellValue().length() > 0) {
                        JobCodeDescription.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 20) {
                    if (cell.getStringCellValue().length() > 0) {
                        EmployeeClassification.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 21) {
                    if (cell.getStringCellValue().length() > 0) {
                        PersonType.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 26) {
                    if (cell.getStringCellValue().length() > 0) {
                        SecurityClearance.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 31) {
                    if (cell.getStringCellValue().length() > 0) {
                        Nationality.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 34) {
                    if (cell.getStringCellValue().length() > 0) {
                        LocationCode.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 35) {
                    if (cell.getStringCellValue().length() > 0) {
                        LocationDescription.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 36) {
                    if (cell.getStringCellValue().length() > 0) {
                        AddressLine1.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 37) {
                    if (cell.getStringCellValue().length() > 0) {
                        AddressLine2.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 38) {
                    if (cell.getStringCellValue().length() > 0) {
                        AddressLine3.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 39) {
                    if (cell.getStringCellValue().length() > 0) {
                        City.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 40) {
                    if (cell.getStringCellValue().length() > 0) {
                        PostalCode.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 41) {
                    if (cell.getStringCellValue().length() > 0) {
                        County.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 42) {
                    if (cell.getStringCellValue().length() > 0) {
                        Region.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 43) {
                    if (cell.getStringCellValue().length() > 0) {
                        Country.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 44) {
                    if (cell.getStringCellValue().length() > 0) {
                        BusinessUnit.add(cell.getStringCellValue());
                    }
                }
                if (cell.getColumnIndex() == 46) {
                    if (cell.getStringCellValue().length() > 0) {
                        Department.add(cell.getStringCellValue());
                    }
                }

            }


        }
        // Closing the workbook
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getFirstName() {
        return givenNames.get(randomInteger.getRandomIntBetween(2,givenNames.size()-1));
    }

    public String getMiddleName() {
        return middleNames.get(randomInteger.getRandomIntBetween(2,middleNames.size()-1));
    }

    public String getSurname(){
        return surNames.get(randomInteger.getRandomIntBetween(2,surNames.size()-1));
    }

    public String getPrefix() {
        return prefix.get(randomInteger.getRandomIntBetween(2,prefix.size()-1));
    }
//    public String getEmployeeType() {
//        return employeeType.get(randomInteger.getRandomIntBetween(2,employeeType.size()-1));
//    }
    public String getSalaryAdminPlan() {
        return SalaryAdminPlan.get(randomInteger.getRandomIntBetween(2,SalaryAdminPlan.size()-1));
    }
    public String getGrade() {
        return Grade.get(randomInteger.getRandomIntBetween(2,Grade.size()-1));
    }

    public String getPositionTitle() {
        return PositionTitle.get(randomInteger.getRandomIntBetween(2,PositionTitle.size()-1));
    }

    public String getJobFamilyCode() {
        return JobFamilyCode.get(randomInteger.getRandomIntBetween(2,JobFamilyCode.size()-1));
    }
    public String getJobFamily() {
        return JobFamily.get(randomInteger.getRandomIntBetween(2,JobFamily.size()-1));
    }
    public String getJobCodeDescription() {
        return JobCodeDescription.get(randomInteger.getRandomIntBetween(2,JobCodeDescription.size()-1));
    }
    public String getEmployeeClassification() {
        return EmployeeClassification.get(randomInteger.getRandomIntBetween(2,EmployeeClassification.size()-1));
    }
    public String getPersonType() {
        return PersonType.get(randomInteger.getRandomIntBetween(2,PersonType.size()-1));
    }

    public String getSecurityClearance() {
        return SecurityClearance.get(randomInteger.getRandomIntBetween(2,SecurityClearance.size()-1));
    }
    public String getNationality() {
        return Nationality.get(randomInteger.getRandomIntBetween(2,Nationality.size()-1));
    }
    public String getLocationCode(){
        return LocationCode.get(randomInteger.getRandomIntBetween(2,LocationCode.size()-1));
    }
    public String getLocationDescription(){
        return LocationDescription.get(randomInteger.getRandomIntBetween(2,LocationDescription.size()-1));
    }
    public String getAddressLine1(){
        return AddressLine1.get(randomInteger.getRandomIntBetween(2,AddressLine1.size()-1));
    }
    public String getAddressLine2(){
        return AddressLine2.get(randomInteger.getRandomIntBetween(2,AddressLine2.size()-1));
    }
    public String getAddressLine3(){
        return AddressLine3.get(randomInteger.getRandomIntBetween(2,AddressLine3.size()-1));
    }
    public String getCity(){
        return City.get(randomInteger.getRandomIntBetween(2,City.size()-1));
    }
    public String getPostCode(){
        return PostalCode.get(randomInteger.getRandomIntBetween(2,PostalCode.size()-1));
    }
    public String getCounty(){
        return County.get(randomInteger.getRandomIntBetween(2,County.size()-1));
    }
    public String getRegion(){
        return Region.get(randomInteger.getRandomIntBetween(2,Region.size()-1));
    }
    public String getCountry(){
        return Country.get(randomInteger.getRandomIntBetween(2,Country.size()-1));
    }
    public String getBusinessUnit(){
        return BusinessUnit.get(randomInteger.getRandomIntBetween(2,BusinessUnit.size()-1));
    }
    public String getDepartment(){
        return Department.get(randomInteger.getRandomIntBetween(2,Department.size()-1));
    }

}