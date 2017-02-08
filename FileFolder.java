import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;


public class FileFolder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="C:/pooja/Phone/";
		File folder = new File("C:/pooja/Phone/");
		File[] listOfFiles = folder.listFiles();
		Path file = new File(s).toPath();
      HashMap m=new HashMap();

		int mn=new File(s).listFiles().length;
		 
				System.out.println(mn);
		for(int i=0;i<mn;i++)
		{
			String filename=listOfFiles[i].getName();
			//System.out.println(filename);
			if(Files.isRegularFile(file))
			{
			m.put(listOfFiles[i].getName(),"file");
				
			}
			else if (Files.isDirectory(file))
			{
				m.put(listOfFiles[i].getName(),"folder");
				
			}
			
			for(Object Key:m.keySet())
			{
				System.out.println(Key+" : "+m.get(Key.toString()));
			}

		}

		// TODO Auto-generated method stub

	}

}
