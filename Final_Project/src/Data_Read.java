

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.opencsv.CSVReader;

public class Data_Read
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("input the eventid");
		Scanner sc=new Scanner(System.in);
		int event_id=sc.nextInt();
		String csvFilename = "f://window/window1.csv";
		CSVReader csvReader = new CSVReader(new FileReader(csvFilename));
		String[] row = null;
		boolean flag=false;
		int i=0;
		while((row = csvReader.readNext()) != null) 
		{
			if(i==0)
			{
				System.out.println("========================");
				System.out.println(row[0]
				          +  row[1]
				          +" " + row[2]
				        	+"  "+row[3]
				        	+"   "+row[4]
				        			);
				i++;
				
			}
			else
			{	
			int index=Integer.parseInt(row[3]);
			
			if(index==event_id)
			{
				flag=true;
				System.out.println("========================");
			System.out.println("Label:"+row[0]
			          + "\nDate&time:  " + row[1]
			          + " \nSourse:  " + row[2]
			        	+"\nEvent_Id:"+index
			        	+" \nTask_Category:"+row[4]
			        			);
			}
			}
			
			
		}
		if(flag==false)
			System.out.println("Event_id not Found!");
		csvReader.close();
		
	}

}
