package Project;

import javafx.scene.control.RadioButton;

public class DatePickerFilePicker {
    RadioButton price1Button, price2Button, price3Button, price4Button,
            morningButton, dayButton, nightButton,
            northCountyButton, eastCountyButton, centralCountyButton, southCountyButton;

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

    public void fileFilter(){
        if(price1Button.isSelected() && morningButton.isSelected()){

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
}
