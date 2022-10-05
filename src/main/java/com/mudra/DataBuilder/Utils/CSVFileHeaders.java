package com.mudra.DataBuilder.Utils;

import org.springframework.stereotype.Component;

@Component
public class CSVFileHeaders {

    public String empHeader(int i) {
        String[] employeeHeader = new String[60];
        employeeHeader[0] = "Id";
        employeeHeader[1] = "FirstName";
        employeeHeader[2] = "LastName";
        employeeHeader[3] = "email";
        employeeHeader[4] =  "Department";
        return employeeHeader[i];
    }

    public String myhrHeader(int i) {
        String[] myhrHeader = new String[60];
        myhrHeader[0] = "Person Number";
        myhrHeader[1] = "First Name";
        myhrHeader[2] = "Middle Name";
        myhrHeader[3] = "Surname";
        myhrHeader[4] =  "Prefix";
        myhrHeader[5] = "Full Name";
        myhrHeader[6] = "Preferred Name";
        myhrHeader[7] = "National Insurance Number";
        myhrHeader[8] = "PUID Number";
        myhrHeader[9] = "PUID Name";
        myhrHeader[10] = "Date of Birth";
        myhrHeader[11] = "Work Email Address";
        myhrHeader[12] = "Employee/Non-Employee";
        myhrHeader[13] = "Salary Admin Plan";
        myhrHeader[14] = "Grade";
        myhrHeader[15] = "Position Number";
        myhrHeader[16] = "Position Title";
        myhrHeader[17] = "Job Family Code";
        myhrHeader[18] = "Job Family";
        myhrHeader[19] = "Job Code";
        myhrHeader[20] = "Job Code Description";
        myhrHeader[21] = "Person Type";
        myhrHeader[22] = "Work Email Address";
        myhrHeader[23] = "Work Phone Number";
        myhrHeader[24] = "Work Mobile Number";
        myhrHeader[25] = "Home Mobile Number";
        myhrHeader[26] = "Security Clearance";
        myhrHeader[27] = "Security Clearance Issue Date";
        myhrHeader[28] = "Security Clearance End Date";
        myhrHeader[29] = "Security Clearance Renewal Date";
        myhrHeader[30] = "Certificate Number";
        myhrHeader[31] = "Nationality";
        myhrHeader[32] = "Reports to Manager";
        myhrHeader[33] = "Reports to PDM FDO";
        myhrHeader[34] = "Location Code";
        myhrHeader[35] = "Location Description";
        myhrHeader[36] = "Address Line1";
        myhrHeader[37] = "Address Line2";
        myhrHeader[38] = "Address Line3";
        myhrHeader[39] = "City";
        myhrHeader[40] = "Postal Code";
        myhrHeader[41] = "County";
        myhrHeader[42] = "Region";
        myhrHeader[43] = "Country";
        myhrHeader[44] = "Business Unit";
        myhrHeader[45] = "Department Id";
        myhrHeader[46] = "Department";
        myhrHeader[47] = "UIN";
        myhrHeader[48] = "Seniority Date";
        myhrHeader[49] = "Hire Date";
        myhrHeader[50] = "Rehire Date";
        myhrHeader[51] = "Termination Date";
        myhrHeader[52] = "Employee Status";
        myhrHeader[53] = "Contractor Organisation";
        myhrHeader[54] = "Project End Date";
        myhrHeader[55] = "Leaving Action";
        myhrHeader[56] = "Leaving Reason";
        myhrHeader[57] = "Action";
        myhrHeader[58] = "Reason";
        myhrHeader[59] = "Previous Termination Date";
        return myhrHeader[i];
    }

    public String rfaHeader(int i) {
            String[] rfaHeader = new String[70];
            rfaHeader[0] = "personWID";
            rfaHeader[1] = "workforceID";
            rfaHeader[2] = "givenName";
            rfaHeader[3] = "middleName";
            rfaHeader[4] = "surname";
            rfaHeader[5] = "fullName";
            rfaHeader[6] = "ukDefActingPaidRank";
            rfaHeader[7] = "idamActualEndDate";
            rfaHeader[8] = "ukDefBirthNationality";
            rfaHeader[9] = "ukDefDOB";
            rfaHeader[10] = "employeeStatus";
            rfaHeader[11] = "employeeType";
            rfaHeader[12] = "idamPlannedEndDate";
            rfaHeader[13] = "ukDefExternalEmail";
            rfaHeader[14] = "jobCode";
            rfaHeader[15] = "title";
            rfaHeader[16] = "idamLatestRehireDate";
            rfaHeader[17] = "mobile";
            rfaHeader[18] = "ukDefNationality";
            rfaHeader[19] = "telephoneNumber";
            rfaHeader[20] = "preferredName";
            rfaHeader[21] = "email";
            rfaHeader[22] = "ukDefPUIDName";
            rfaHeader[23] = "ukDefPUID";
            rfaHeader[24] = "ukDefSeniority";
            rfaHeader[25] = "ukDefRegtCorps";
            rfaHeader[26] = "personalTitle";
            rfaHeader[27] = "otherPhoneNumber";
            rfaHeader[28] = "ukDefSecClearLevel";
            rfaHeader[29] = "ukDefSecClearHeldBy";
            rfaHeader[30] = "ukDefSecClearRefNo";
            rfaHeader[31] = "ukDefSecClearEndDate";
            rfaHeader[32] = "ukDefSecClearFromDate";
            rfaHeader[33] = "ukDefSecClearReviewDate";
            rfaHeader[34] = "ukDefSecClearAssertedBy";
            rfaHeader[35] = "ukDefSecClearVerifiedBy";
            rfaHeader[36] = "ukDefSecClearVerifiedDate";
            rfaHeader[37] = "idamStartDate";
            rfaHeader[38] = "ukDefSubstantiveRank";
            rfaHeader[39] = "idamHRTerminationDate";
            rfaHeader[40] = "idamUserType";
            rfaHeader[41] = "ukDefTopLevelBudget";
            rfaHeader[42] = "organisation";
            rfaHeader[43] = "ukDefOrgName";
            rfaHeader[44] = "ukDefUIN";
            rfaHeader[45] = "ukDefService";
            rfaHeader[46] = "ukDefPositionNumber";
            rfaHeader[47] = "idamJobCode";
            rfaHeader[48] = "idamJobCodeDesc";
            rfaHeader[49] = "ukDefJobSpecification";
            rfaHeader[50] = "ukDefTradeSpecialisation";
            rfaHeader[51] = "managerWorkforceID";
            rfaHeader[52] = "company";
            rfaHeader[53] = "ukDefAffiliation";
            rfaHeader[54] = "physicalDeliveryOfficeName";
            rfaHeader[55] = "ukDefLocationCode";
            rfaHeader[56] = "ukDefAddressline1";
            rfaHeader[57] = "ukDefAddressline2";
            rfaHeader[58] = "ukDefAddressline3";
            rfaHeader[59] = "ukDefAddressline4";
            rfaHeader[60] = "postOfficeBox";
            rfaHeader[61] = "city";
            rfaHeader[62] = "state";
            rfaHeader[63] = "postalCode";
            rfaHeader[64] = "country";
            rfaHeader[65] = "ukDefRegion";
            rfaHeader[66] = "idamNationalID";
            rfaHeader[67] = "existingIdamRfaIdentity";
            return rfaHeader[i];
        }

}
