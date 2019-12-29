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

    private String zeroDollarSignMorning = "Project/resources/Dollar_Sign_Files/Zero/Morning/Activities.txt";
    private String zeroDollarSignDay = "Project/resources/Dollar_Sign_Files/Zero/Day/Activities.txt";
    private String zeroDollarSignNight = "Project/resources/Dollar_Sign_Files/Zero/Night/Activities.txt";

    private String oneDollarSignMorning = "Project/resources/Dollar_Sign_Files/One/Morning/Activities.txt";
    private String oneDollarSignDay = "Project/resources/Dollar_Sign_Files/One/Day/Activities.txt";
    private String oneDollarSignNight = "Project/resources/Dollar_Sign_Files/One/Night/Activities.txt";

    private String twoDollarSignMorning = "Project/resources/Dollar_Sign_Files/Two/Morning/Activities.txt";
    private String twoDollarSignDay = "Project/resources/Dollar_Sign_Files/Two/Day/Activities.txt";
    private String twoDollarSignNight = "Project/resources/Dollar_Sign_Files/Two/Night/Activities.txt";

    private String threeDollarSignMorning = "Project/resources/Dollar_Sign_Files/Three/Morning/Activities.txt";
    private String threeDollarSignDay = "Project/resources/Dollar_Sign_Files/Three/Day/Activities.txt";
    private String threeDollarSignNight = "Project/resources/Dollar_Sign_Files/Three/Night/Activities.txt";

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

    public void fileFilter() throws FileNotFoundException {
        if(price1Button.isSelected() && morningButton.isSelected()){
            getZeroFilesMorning(keyword);
        }

        else if(price1Button.isSelected() && dayButton.isSelected()){

        }

        else if(price1Button.isSelected() && nightButton.isSelected()){

        }

        else if(price2Button.isSelected() && morningButton.isSelected()){

        }

        else if(price2Button.isSelected() && dayButton.isSelected()){

        }

        else if(price2Button.isSelected() && nightButton.isSelected()){

        }

        else if(price3Button.isSelected() && morningButton.isSelected()){

        }

        else if(price3Button.isSelected() && dayButton.isSelected()){

        }

        else if(price3Button.isSelected() && nightButton.isSelected()){

        }

        else if(price4Button.isSelected() && morningButton.isSelected()){

        }

        else if(price4Button.isSelected() && dayButton.isSelected()){

        }

        else if(price4Button.isSelected() && nightButton.isSelected()){

        }
    }

    // Zerofiles**********************************************************************************************
    public void getZeroFilesMorning(String keyWord)throws FileNotFoundException
    {
        // open file
        File zeroFile = new File(zeroDollarSignMorning);
        Scanner inputFile = new Scanner(zeroFile);

        // read file
        while (inputFile.hasNext())
        {
            // need to filter for key word.
            String lines = inputFile.nextLine();
            if(lines.contains(keyWord))
                System.out.println(lines);
        }
        // close the file.
        inputFile.close();
    }

    public void getZeroFilesDay(String keyWord)throws FileNotFoundException
    {
        // open file
        File zeroFile = new File(zeroDollarSignDay);
        Scanner inputFile = new Scanner(zeroFile);

        // read file
        while (inputFile.hasNext())
        {
            // need to filter for key word.
            String lines = inputFile.nextLine();
            if(lines.contains(keyWord))
                System.out.println(lines);
        }
        // close the file.
        inputFile.close();
    }

    public void getZeroFilesNight(String keyWord)throws FileNotFoundException
    {
        // open file
        File zeroFile = new File(zeroDollarSignNight);
        Scanner inputFile = new Scanner(zeroFile);

        // read file
        while (inputFile.hasNext())
        {
            // need to filter for key word.
            String lines = inputFile.nextLine();
            if(lines.contains(keyWord))
                System.out.println(lines);
        }
        // close the file.
        inputFile.close();
    }

    // Onefiles**********************************************************************************************
    public void getOneFilesMorning(String keyWord)throws FileNotFoundException
    {
        // open file
        File oneFile = new File(oneDollarSignMorning);
        Scanner inputFile = new Scanner(oneFile);

        // read file
        while (inputFile.hasNext())
        {
            // need to filter for key word.
            String lines = inputFile.nextLine();
            if(lines.contains(keyWord))
                System.out.println(lines);
        }
        // close the file.
        inputFile.close();
    }

    public void getOneFilesDay(String keyWord)throws FileNotFoundException
    {
        // open file
        File oneFile = new File(oneDollarSignDay);
        Scanner inputFile = new Scanner(oneFile);

        // read file
        while (inputFile.hasNext())
        {
            // need to filter for key word.
            String lines = inputFile.nextLine();
            if(lines.contains(keyWord))
                System.out.println(lines);
        }
        // close the file.
        inputFile.close();
    }

    public void getOneFilesNight(String keyWord)throws FileNotFoundException
    {
        // open file
        File oneFile = new File(oneDollarSignNight);
        Scanner inputFile = new Scanner(oneFile);

        // read file
        while (inputFile.hasNext())
        {
            // need to filter for key word.
            String lines = inputFile.nextLine();
            if(lines.contains(keyWord))
                System.out.println(lines);
        }
        // close the file.
        inputFile.close();
    }

    // Twofiles**********************************************************************************************
    public void getTwoFilesMorning(String keyWord)throws FileNotFoundException
    {
        // open file
        File twoFile = new File(twoDollarSignMorning);
        Scanner inputFile = new Scanner(twoFile);

        // read file
        while (inputFile.hasNext())
        {
            // need to filter for key word.
            String lines = inputFile.nextLine();
            if(lines.contains(keyWord))
                System.out.println(lines);
        }
        // close the file.
        inputFile.close();
    }

    public void getTwoFilesDay(String keyWord)throws FileNotFoundException
    {
        // open file
        File twoFile = new File(twoDollarSignDay);
        Scanner inputFile = new Scanner(twoFile);

        // read file
        while (inputFile.hasNext())
        {
            // need to filter for key word.
            String lines = inputFile.nextLine();
            if(lines.contains(keyWord))
                System.out.println(lines);
        }
        // close the file.
        inputFile.close();
    }

    public void getTwoFilesNight(String keyWord)throws FileNotFoundException
    {
        // open file
        File twoFile = new File(twoDollarSignNight);
        Scanner inputFile = new Scanner(twoFile);

        // read file
        while (inputFile.hasNext())
        {
            // need to filter for key word.
            String lines = inputFile.nextLine();
            if(lines.contains(keyWord))
                System.out.println(lines);
        }
        // close the file.
        inputFile.close();
    }

    // Threefiles**********************************************************************************************
    public void getThreeFilesMorning(String keyWord)throws FileNotFoundException
    {
        // open file
        File threeFile = new File(threeDollarSignMorning);
        Scanner inputFile = new Scanner(threeFile);

        // read file
        while (inputFile.hasNext())
        {
            // need to filter for key word.
            String lines = inputFile.nextLine();
            if(lines.contains(keyWord))
                System.out.println(lines);
        }
        // close the file.
        inputFile.close();
    }

    public void getThreeFilesDay(String keyWord)throws FileNotFoundException
    {
        // open file
        File threeFile = new File(threeDollarSignDay);
        Scanner inputFile = new Scanner(threeFile);

        // read file
        while (inputFile.hasNext())
        {
            // need to filter for key word.
            String lines = inputFile.nextLine();
            if(lines.contains(keyWord))
                System.out.println(lines);
        }
        // close the file.
        inputFile.close();
    }

    public void getThreeFilesNight(String keyWord)throws FileNotFoundException
    {
        // open file
        File threeFile = new File(threeDollarSignNight);
        Scanner inputFile = new Scanner(threeFile);

        // read file
        while (inputFile.hasNext())
        {
            // need to filter for key word.
            String lines = inputFile.nextLine();
            if(lines.contains(keyWord))
                System.out.println(lines);
        }
        // close the file.
        inputFile.close();
    }
}
