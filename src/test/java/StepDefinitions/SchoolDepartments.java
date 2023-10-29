package StepDefinitions;

import Pages.DialogPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class SchoolDepartments {
    DialogPage dp = new DialogPage();

    @And("User Add New School Departments with ApachePoi")
    public void userAddNewSchoolDepartmentsWithApachePoi(DataTable dataTable) throws IOException {
        String path = "src/test/java/ApachePOI/SchoolDepartment.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheet("schoolDepartments");

        String data = String.valueOf(sheet.getRow(0).getCell(0));
        String data2 = String.valueOf(sheet.getRow(0).getCell(1));
        dp.mySendKeys(dp.nameInput, data);
        dp.mySendKeys(dp.codeInput, data2);
        dp.myClick(dp.activeButtonOn);
        dp.myClick(dp.sectionButton);
        dp.myClick(dp.activeButtonOn);
        String data3 = String.valueOf(sheet.getRow(1).getCell(0));
        String data4 = String.valueOf(sheet.getRow(1).getCell(1));
        dp.mySendKeys(dp.nameInput, data3);
        dp.mySendKeys(dp.shortNameInput, data4);
        dp.myClick(dp.addInSchoolDepartmentButton);
        dp.myClick(dp.departmentParametersButton);
        String data5 = String.valueOf(sheet.getRow(2).getCell(0));
        String data6= String.valueOf(sheet.getRow(2).getCell(1));
        dp.mySendKeys(dp.keyInput, data5);
        dp.mySendKeys(dp.valueInput, data6);
        dp.myClick(dp.addInSchoolDepartmentButton);
        dp.myClick(dp.saveButton);



    }


}

