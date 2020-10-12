package FactoryPattern;
import FactoryPattern.*;
public class FileExporterFactory {
	
	private FileExporterFactory() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public static FileExporter getInstance(fileType fileExporter)
	{
		switch (fileExporter) {
		case PDFEXPORTER: {
			
			return new PdfExporter();
		}
		
case EXCELEXPORTER: {
			
			return new ExcelExporter();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + fileExporter);
		}
		
	}
    public enum fileType{PDFEXPORTER,EXCELEXPORTER};
}
