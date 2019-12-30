package Project;

import javafx.scene.control.RadioButton;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DatePickerFilePicker {
    RadioButton price1Button, price2Button, price3Button, price4Button,
            morningButton, dayButton, nightButton,
            northCountyButton, eastCountyButton, centralCountyButton, southCountyButton;

    String keyword;

    public DatePickerFilePicker(RadioButton p1, RadioButton p2, RadioButton p3,
                                RadioButton p4, RadioButton mB, RadioButton dB,
                                RadioButton nB, RadioButton nCB, RadioButton eCB,
                                RadioButton cCB, RadioButton sCB){

            price1Button = p1;
            price2Button = p2;
            price3Button = p3;
            price4Button = p4;
            morningButton = mB;
            dayButton = dB;
            nightButton = nB;
            northCountyButton = nCB;
            eastCountyButton = eCB;
            centralCountyButton = cCB;
            southCountyButton = sCB;
    }

    public String keywordFilter(){
        if(northCountyButton.isSelected())
            keyword = "North County";

        else if(eastCountyButton.isSelected())
            keyword = "East County";

        else if(centralCountyButton.isSelected())
            keyword = "Central County";

        else if(southCountyButton.isSelected())
            keyword = "South County";

        return keyword;
    }

    public String fileFilter() throws FileNotFoundException {
        String results = "error";
        if(price1Button.isSelected() && morningButton.isSelected()){
            results = getZeroFilesMorning(keywordFilter());
        }

        else if(price1Button.isSelected() && dayButton.isSelected()){
            results = getZeroFilesDay(keywordFilter());
        }

        else if(price1Button.isSelected() && nightButton.isSelected()){
            results = getZeroFilesNight(keywordFilter());
        }

        else if(price2Button.isSelected() && morningButton.isSelected()){
            results = getOneFilesMorning(keywordFilter());
        }

        else if(price2Button.isSelected() && dayButton.isSelected()){
            results = getOneFilesDay(keywordFilter());
        }

        else if(price2Button.isSelected() && nightButton.isSelected()){
            results = getOneFilesNight(keywordFilter());
        }

        else if(price3Button.isSelected() && morningButton.isSelected()){
            results = getTwoFilesMorning(keywordFilter());
        }

        else if(price3Button.isSelected() && dayButton.isSelected()){
            results = getTwoFilesDay(keywordFilter());
        }

        else if(price3Button.isSelected() && nightButton.isSelected()){
            results = getTwoFilesNight(keywordFilter());
        }

        else if(price4Button.isSelected() && morningButton.isSelected()){
            results = getThreeFilesMorning(keywordFilter());
        }

        else if(price4Button.isSelected() && dayButton.isSelected()){
            results = getThreeFilesDay(keywordFilter());
        }

        else if(price4Button.isSelected() && nightButton.isSelected()){
            results = getThreeFilesNight(keywordFilter());
        }
        return results;
    }

    // Zerofiles**********************************************************************************************
    public String getZeroFilesMorning(String keyWord)throws FileNotFoundException
    {
        String results = "No Results";
        // open file
        String zeroDollarSignMorning = "Project/resources/Dollar_Sign_Files/Zero/Morning/Activities.txt";
        File zeroFile = new File(zeroDollarSignMorning);
        Scanner inputFile = new Scanner(zeroFile);

        // read file
        while (inputFile.hasNext())
        {
            // need to filter for key word.
            String lines = inputFile.nextLine();
            if(lines.contains(keyWord))
                results = lines;
        }
        // close the file.
        inputFile.close();

        return results;
    }

    public String getZeroFilesDay(String keyWord)throws FileNotFoundException
    {
        String results = "No Results";

        // open file
        String zeroDollarSignDay = "Project/resources/Dollar_Sign_Files/Zero/Day/Activities.txt";
        File zeroFile = new File(zeroDollarSignDay);
        Scanner inputFile = new Scanner(zeroFile);

        // read file
        while (inputFile.hasNext())
        {
            // need to filter for key word.
            String lines = inputFile.nextLine();
            if(lines.contains(keyWord))
               results = lines;
        }
        // close the file.
        inputFile.close();

        return results;
    }

    public String getZeroFilesNight(String keyWord)throws FileNotFoundException
    {
        String results = "No Results";

        // open file
        String zeroDollarSignNight = "Project/resources/Dollar_Sign_Files/Zero/Night/Activities.txt";
        File zeroFile = new File(zeroDollarSignNight);
        Scanner inputFile = new Scanner(zeroFile);

        // read file
        while (inputFile.hasNext())
        {
            // need to filter for key word.
            String lines = inputFile.nextLine();
            if(lines.contains(keyWord))
                results = lines;
        }
        // close the file.
        inputFile.close();

        return results;
    }

    // Onefiles**********************************************************************************************
    public String getOneFilesMorning(String keyWord)throws FileNotFoundException
    {
        String results = "No Results";

        // open file
        String oneDollarSignMorning = "Project/resources/Dollar_Sign_Files/One/Morning/Activities.txt";
        File oneFile = new File(oneDollarSignMorning);
        Scanner inputFile = new Scanner(oneFile);

        // read file
        while (inputFile.hasNext())
        {
            // need to filter for key word.
            String lines = inputFile.nextLine();
            if(lines.contains(keyWord))
                results = lines;
        }
        // close the file.
        inputFile.close();

        return results;
    }

    public String getOneFilesDay(String keyWord)throws FileNotFoundException
    {
        String results = "No Results";

        // open file
        String oneDollarSignDay = "Project/resources/Dollar_Sign_Files/One/Day/Activities.txt";
        File oneFile = new File(oneDollarSignDay);
        Scanner inputFile = new Scanner(oneFile);

        // read file
        while (inputFile.hasNext())
        {
            // need to filter for key word.
            String lines = inputFile.nextLine();
            if(lines.contains(keyWord))
                results = lines;
        }
        // close the file.
        inputFile.close();

        return results;
    }

    public String getOneFilesNight(String keyWord)throws FileNotFoundException
    {
        String results = "No Results";

        // open file
        String oneDollarSignNight = "Project/resources/Dollar_Sign_Files/One/Night/Activities.txt";
        File oneFile = new File(oneDollarSignNight);
        Scanner inputFile = new Scanner(oneFile);

        // read file
        while (inputFile.hasNext())
        {
            // need to filter for key word.
            String lines = inputFile.nextLine();
            if(lines.contains(keyWord))
                results = lines;
        }
        // close the file.
        inputFile.close();

        return results;
    }

    // Twofiles**********************************************************************************************
    public String getTwoFilesMorning(String keyWord)throws FileNotFoundException
    {
        String results = "No Results";

        // open file
        String twoDollarSignMorning = "Project/resources/Dollar_Sign_Files/Two/Morning/Activities.txt";
        File twoFile = new File(twoDollarSignMorning);
        Scanner inputFile = new Scanner(twoFile);

        // read file
        while (inputFile.hasNext())
        {
            // need to filter for key word.
            String lines = inputFile.nextLine();
            if(lines.contains(keyWord))
                results = lines;
        }
        // close the file.
        inputFile.close();

        return results;
    }

    public String getTwoFilesDay(String keyWord)throws FileNotFoundException
    {
        String results = "No Results";

        // open file
        String twoDollarSignDay = "Project/resources/Dollar_Sign_Files/Two/Day/Activities.txt";
        File twoFile = new File(twoDollarSignDay);
        Scanner inputFile = new Scanner(twoFile);

        // read file
        while (inputFile.hasNext())
        {
            // need to filter for key word.
            String lines = inputFile.nextLine();
            if(lines.contains(keyWord))
                results = lines;
        }
        // close the file.
        inputFile.close();

        return results;
    }

    public String getTwoFilesNight(String keyWord)throws FileNotFoundException
    {
        String results = "No Results";

        // open file
        String twoDollarSignNight = "Project/resources/Dollar_Sign_Files/Two/Night/Activities.txt";
        File twoFile = new File(twoDollarSignNight);
        Scanner inputFile = new Scanner(twoFile);

        // read file
        while (inputFile.hasNext())
        {
            // need to filter for key word.
            String lines = inputFile.nextLine();
            if(lines.contains(keyWord))
                results = lines;
        }
        // close the file.
        inputFile.close();

        return results;
    }

    // Threefiles**********************************************************************************************
    public String getThreeFilesMorning(String keyWord)throws FileNotFoundException
    {
        String results = "No Results";

        // open file
        String threeDollarSignMorning = "Project/resources/Dollar_Sign_Files/Three/Morning/Activities.txt";
        File threeFile = new File(threeDollarSignMorning);
        Scanner inputFile = new Scanner(threeFile);

        // read file
        while (inputFile.hasNext())
        {
            // need to filter for key word.
            String lines = inputFile.nextLine();
            if(lines.contains(keyWord))
                results = lines;
        }
        // close the file.
        inputFile.close();

        return results;
    }

    public String getThreeFilesDay(String keyWord)throws FileNotFoundException
    {
        String results = "No Results";

        // open file
        String threeDollarSignDay = "Project/resources/Dollar_Sign_Files/Three/Day/Activities.txt";
        File threeFile = new File(threeDollarSignDay);
        Scanner inputFile = new Scanner(threeFile);

        // read file
        while (inputFile.hasNext())
        {
            // need to filter for key word.
            String lines = inputFile.nextLine();
            if(lines.contains(keyWord))
                results = lines;
        }
        // close the file.
        inputFile.close();

        return results;
    }

    public String getThreeFilesNight(String keyWord)throws FileNotFoundException
    {
        String results = "No Results";

        // open file
        String threeDollarSignNight = "Project/resources/Dollar_Sign_Files/Three/Night/Activities.txt";
        File threeFile = new File(threeDollarSignNight);
        Scanner inputFile = new Scanner(threeFile);

        // read file
        while (inputFile.hasNext())
        {
            // need to filter for key word.
            String lines = inputFile.nextLine();
            if(lines.contains(keyWord))
                results = lines;
        }
        // close the file.
        inputFile.close();

        return results;
    }
}
