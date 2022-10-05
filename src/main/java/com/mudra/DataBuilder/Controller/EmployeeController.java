package com.mudra.DataBuilder.Controller;

import com.mudra.DataBuilder.Services.CsvExportService;
import com.mudra.DataBuilder.Services.ExcelReadService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class EmployeeController {

    private final CsvExportService csvExportService;
    private final ExcelReadService excelReadService;

    public EmployeeController(CsvExportService csvExportService, ExcelReadService excelReadService) {
        this.csvExportService = csvExportService;
        this.excelReadService = excelReadService;
    }


    @RequestMapping(path = "/employees")
    public void getAllEmployeesInCsv(HttpServletResponse servletResponse, @RequestParam(required = true,defaultValue = "10") int noOfRecords) throws IOException {
        servletResponse.setContentType("text/csv");
        servletResponse.addHeader("Content-Disposition","attachment; filename=\"employees.csv\"");
        csvExportService.writeEmployeesToCsv(servletResponse.getWriter(),noOfRecords);
    }

    @RequestMapping(path = "/hrpersons")
    public void getAllPersonsInCsv(HttpServletResponse servletResponse, @RequestParam(required = true,defaultValue = "10") int noOfRecords) throws IOException {
        excelReadService.generateAttributeListFromExcel();
        servletResponse.setContentType("text/csv");
        servletResponse.addHeader("Content-Disposition","attachment; filename=\"MyHR.csv\"");
        csvExportService.writePersonsToCsv(servletResponse.getWriter(),noOfRecords);
    }
    @RequestMapping(path = "/rfapersons")
    public void getAllPersonsInJson(HttpServletResponse servletResponse, @RequestParam(required = true,defaultValue = "10") int noOfRecords) throws IOException {
        servletResponse.setContentType("text/json");
        servletResponse.addHeader("Content-Disposition","attachment; filename=\"MyHR.json\"");
        csvExportService.writePersonsToCsv(servletResponse.getWriter(),noOfRecords);
    }
}
