public class Test
{
	public static void main(String[] args) {
		String studyModeQuery ="SELECT (CASE ?"
		        +" WHEN 'F' THEN 'full_time'"
		        +"WHEN 'P' THEN 'part_time'"
		        +"ELSE NULL"
		        +"END) FROM DUAL";
		System.out.println(studyModeQuery.substring(0, 2));
	}

}
