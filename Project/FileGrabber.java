package Project;

import java.io.*;
import java.util.Scanner;

public class FileGrabber
{
   // file paths
   private String zeroDollarSignMorning = "C:/Users/louie/Documents/DatePicker_files/Zero/Morning/Activities.txt";
   private String zeroDollarSignDay = "C:/Users/louie/Documents/DatePicker_files/Zero/Day/Activities.txt";
   private String zeroDollarSignNight = "C:/Users/louie/Documents/DatePicker_files/Zero/Night/Activities.txt";
   
   private String oneDollarSignMorning = "C:/Users/louie/Documents/DatePicker_files/One/Morning/Activities.txt";
   private String oneDollarSignDay = "C:/Users/louie/Documents/DatePicker_files/One/Day/Activities.txt";
   private String oneDollarSignNight = "C:/Users/louie/Documents/DatePicker_files/One/Night/Activities.txt";
   
   private String twoDollarSignMorning = "C:/Users/louie/Documents/DatePicker_files/Two/Morning/Activities.txt";
   private String twoDollarSignDay = "C:/Users/louie/Documents/DatePicker_files/Two/Day/Activities.txt";
   private String twoDollarSignNight = "C:/Users/louie/Documents/DatePicker_files/Two/Night/Activities.txt";
   
   private String threeDollarSignMorning = "C:/Users/louie/Documents/DatePicker_files/Three/Morning/Activities.txt";
   private String threeDollarSignDay = "C:/Users/louie/Documents/DatePicker_files/Three/Day/Activities.txt";
   private String threeDollarSignNight = "C:/Users/louie/Documents/DatePicker_files/Three/Night/Activities.txt";
   
   // checking if files can be accessed
   
   public String checkFiles()throws FileNotFoundException
   {
      String ArrayError = ("Error in making the array.");   
      File file0 = new File(zeroDollarSignMorning);
      File file1 = new File(zeroDollarSignDay);
      File file2 = new File(zeroDollarSignNight);
      
      File file3 = new File(oneDollarSignMorning);
      File file4 = new File(oneDollarSignDay);
      File file5 = new File(oneDollarSignNight);
      
      File file6 = new File(twoDollarSignMorning);
      File file7 = new File(twoDollarSignDay);
      File file8 = new File(twoDollarSignNight);
      
      File file9 = new File(threeDollarSignMorning);
      File file10 = new File(threeDollarSignDay);
      File file11 = new File(threeDollarSignNight);
      
      File[] fileNum = {file0, file1, file2, file3, file4, file5,
                         file6, file7, file8, file9, file10, file11};
      
      
      
      for (int i = 0 ; i < fileNum.length ; i++)
      {
         String errorMessage = ("File number " + i + " can't be accessed.");
         String noError = ("File number " + i + " is accessable.");

         if (!fileNum[i].exists())
            return errorMessage;
         else 
            return noError;
      }
      
      System.exit(0);
      
      return ArrayError;
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