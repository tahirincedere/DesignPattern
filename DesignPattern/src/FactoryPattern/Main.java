package FactoryPattern;

import FactoryPattern.FileExporterFactory.fileType;

public class Main {

	public static void main(String[] args) {
		
	  FileExporter fileExporter=FileExporterFactory.getInstance(fileType.EXCELEXPORTER);
	  System.out.println(fileExporter.export("TAHÝR ÝNCEDERE"));
	}
}
