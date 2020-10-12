package FactoryPattern;

class PdfExporter implements FileExporter {

	@Override
	public String export(String content) {
		// TODO Auto-generated method stub
		return "PDF ->"+content;
	}

}
