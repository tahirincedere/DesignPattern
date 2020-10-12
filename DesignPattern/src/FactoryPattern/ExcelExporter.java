package FactoryPattern;

class ExcelExporter implements FileExporter {
	
	@Override
	public String export(String content) {
		// TODO Auto-generated method stub
		return "EXCEL-> "+content;
	}

}
