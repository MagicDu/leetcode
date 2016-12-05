package cn.magicdu;

public class _434_Number_of_Segments_in_a_String {

	public int countSegments(String s) {
		String trimmed = s.trim();
		if (trimmed.length() == 0)
			return 0;
		else
			return trimmed.split("\\s+").length;
	}
}
