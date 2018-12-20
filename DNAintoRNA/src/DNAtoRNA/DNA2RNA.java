package DNAtoRNA;
import java.io.*;
import java.util.*;
public class DNA2RNA 
{
	private String dna;
	private String rna;

	public DNA2RNA(String dna, String rna)
	{
		this.dna=dna;
		this.rna=rna;
	}
	public static String dnaFileReader() throws IOException
	{
		File file=new File("data/rosalind_rna.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		dna=br.readLine();
		br.close();
		fr.close();
		return dna;
	}
	public String getDNA()
	{
		return dna;
	}
	public static String dnaTorna()
	{
		rna=dna.replaceAll("T", "U");
		return rna;
	}
	public String getRNA()
	{
		return rna;
	}
	public static void main(String[] args)
	{
		System.out.println(dnaTorna());
	}
}
