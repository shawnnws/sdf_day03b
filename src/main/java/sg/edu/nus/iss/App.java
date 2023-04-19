package sg.edu.nus.iss;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class App 
{
    public static void main( String[] args ) throws IOException
    {

        //Taking arguments to create new directory and file.
        if (args.length > 0) {
            String dirPath = args[0];
            String fileName = args[1];
            String dirPathFileName = dirPath + File.separator + fileName;

            //Creating new directory.
            File newDirectory = new File(dirPath);
            if (newDirectory.exists()) {
                System.out.println("Directory already exists.");
            }
            else {
                newDirectory.mkdir();
            }
            
            //Creting new file.
            File myFile = new File(dirPathFileName);
            if (myFile.exists()) {
                System.out.println("File already exists.");
            }
            else {
                myFile.createNewFile();
            }

            //Create new CSVWriter object, execute generateEmployee function, and write to file.
            CSVWriter csvWriter = new CSVWriter();
            List<Employee> empList = csvWriter.generateEmployees();
            csvWriter.writeToCSV(empList, dirPathFileName);

            //Create new CSVReader object, execute readCSV function, and print out file information.
            CSVReader csvReader = new CSVReader();
            List<Employee> retrievedList = csvReader.readCSV(dirPathFileName);
            System.out.println(retrievedList.toString());
        }
    }
}
