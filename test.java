package CHG;

public class test {
	public static void main(String chgString) {
		try {

			String[] arrString = chgString.split(",");
			String txtString = arrString[0];
			String findString = arrString[1];
			String find_wordString = new String();
			String find_charString = new String();
			StringBuffer findword = new StringBuffer();

			if (findString.length() == 1) {
				find_charString = findString;
			} else {
			}
			int count_char = 0;
			int count_word = 0;
			char txt[] = txtString.toCharArray();
			StringBuffer midBuffer = new StringBuffer();
			for (int i = 0; i < txtString.length(); i++) {
				midBuffer.append(txt[i]);
				for (int j = 0; j < txtString.length() / 7; j++) {
					if (i == (2 * j - 1) * 7 - 1) {
						midBuffer.append("，");
					}
					if (i == (2 * j) * 7 - 1) {
						midBuffer.append("。");
						midBuffer.append("\n");
					}
				}
			}
			System.out.println(midBuffer);
			if (findString.length() > 1) {
				find_wordString = findString;
				for (int l = 0; l < txt.length - find_wordString.length(); l++) {
					StringBuffer txtBuffer = new StringBuffer();
					for (int m = l; m < l + find_wordString.length(); m++) {
						txtBuffer.append(txt[m]);

					}
					if (find_wordString.equals(txtBuffer.toString())) {
						count_word++;
					} else {

					}
				}
				System.out.println("“" + find_wordString + "”" + "词出现的个数为：" + count_word);
			} else {
				for (int k = 0; k < txtString.length(); k++) {
					if (findString.charAt(0) == txt[k]) {
						find_charString = findString;
						count_char++;
					}
				}
				System.out.println("“" + find_charString + "”" + "字出现的个数为：" + count_char);
			}

		} catch (Exception e) {
			System.out.println("错误原因" + e);
			// TODO: handle exception
		}

	}
}
