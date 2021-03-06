package my;

import java.util.Date;

import af.sql.c3p0.AfSimpleDB;
import my.db.Picture;

public class TestDB
{

	public static void main(String[] args)
	{
		Picture row = new Picture();
		
		row.setName("test");
		row.setRealName("美丽风景.jpg");
		row.setSize(120340L);
		row.setStorePath("data/19230934.jpg");
		row.setTag("风景");
		row.setTimeCreated(new Date());
		row.setTimeModified(new Date());
		
		try
		{
			AfSimpleDB.insert( row );
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Exit.");
	}

}
