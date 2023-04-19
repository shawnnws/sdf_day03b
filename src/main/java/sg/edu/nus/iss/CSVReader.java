package sg.edu.nus.iss;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    
    public List<Employee> readCSV(String fileName) throws IOException, FileNotFoundException {
        BufferedReader br = null;
        String line = "";
        List<Employee> employees = new ArrayList<Employee>();

        br = new BufferedReader(new FileReader(fileName));

        //Skip FILE_HEADER row.
        line = br.readLine();
        
        //Read each line of csv record, format them into an employee object, and add employee object into list of employees.
        while ((line = br.readLine()) != null) {
            String[] lineData = line.split(CSVWriter.COMMA_DELIMITER);

            if (lineData.length > 0) {
                Employee emp = new Employee(lineData[0], lineData[1], lineData[2], lineData[3], lineData[4], Integer.parseInt(lineData[5]));
                employees.add(emp);
            }

        }

        //Close buffered reader.
        br.close();

        return employees;
    }
}
