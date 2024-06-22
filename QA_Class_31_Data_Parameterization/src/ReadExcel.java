
public class ReadExcel {

	public static void main(String[] args) {
		
		Xls_Reader xls= new Xls_Reader("S:\\JANBASK\\QA- 10th May 2024\\QA_Class_31_Data_Parameterization\\src\\TestSuite\\TESTSUITE.xlsx");
		
		int rowsCount=xls.getRowCount("GMAIL");
		System.out.println(rowsCount);
		
		
		for(int i=1;i<=rowsCount;i++) {
		
		String v1=xls.getCellData("GMAIL", "TCID", i);
		String v2=xls.getCellData("GMAIL", "TESTCASE", i);
		String v3=xls.getCellData("GMAIL", "STATUS", i);
		
		System.out.println(v1+" | "+v2+" |"+v3);
		}

	}

}
