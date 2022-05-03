/**
 * 
 */
package fis.cex.StringTest;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Inderdeep Sondhi : e3025143
 *
 */
public class FileReader2 {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		Path yourFile = Paths.get("eWire202204110717.dat");
		List<String> allLines = Files.readAllLines(yourFile);
		System.out.println(allLines.get(0));
		System.out.println(allLines.get(1));
		System.out.println(allLines.get(2));
		System.out.println(allLines.get(3));

		Map<String, String> eWireFieldsMap = new HashMap<String, String>();

		String[] line1Fields = allLines.get(0).split("~");
		String[] line2Fields = allLines.get(1).split("~");
		String[] line3Fields = allLines.get(2).split("~");
		String[] line4Fields = allLines.get(3).split("~");

		eWireFieldsMap.put("transactionNumber1", line1Fields[0]);
		eWireFieldsMap.put("transactionNumber2", line2Fields[0]);
		eWireFieldsMap.put("transactionNumber3", line3Fields[0]);
		eWireFieldsMap.put("transactionNumber4", line4Fields[0]);
		eWireFieldsMap.put("paymentDate1", line1Fields[7].substring(0, 10));
		eWireFieldsMap.put("paymentType1", line1Fields[1]);
		eWireFieldsMap.put("paymentType2", line2Fields[1]);
		eWireFieldsMap.put("paymentType3", line3Fields[1]);
		eWireFieldsMap.put("paymentType4", line4Fields[1]);
		eWireFieldsMap.put("currencyCode1", line1Fields[10]);
		eWireFieldsMap.put("currencyCode2", line2Fields[10]);
		eWireFieldsMap.put("currencyCode3", line3Fields[10]);
		eWireFieldsMap.put("currencyCode4", line4Fields[10]);
		eWireFieldsMap.put("amount1", line1Fields[11]);
		eWireFieldsMap.put("amount2", line2Fields[11]);
		eWireFieldsMap.put("amount3", line3Fields[11]);
		eWireFieldsMap.put("amount4", line4Fields[11]);
		eWireFieldsMap.put("beneficiaryReference1", line1Fields[21]);
		eWireFieldsMap.put("beneficiaryReference2", line2Fields[21]);
		eWireFieldsMap.put("beneficiaryReference3", line3Fields[21]);
		eWireFieldsMap.put("beneficiaryReference4", line4Fields[21]);
		eWireFieldsMap.put("senderReference1", line1Fields[22]);
		eWireFieldsMap.put("senderReference2", line2Fields[22]);
		eWireFieldsMap.put("senderReference3", line3Fields[22]);
		eWireFieldsMap.put("senderReference4", line4Fields[22]);
		eWireFieldsMap.put("sendingBankID1", line1Fields[24]);
		eWireFieldsMap.put("sendingBankID2", line2Fields[24]);
		eWireFieldsMap.put("sendingBankID3", line3Fields[24]);
		eWireFieldsMap.put("sendingBankID4", line4Fields[24]);
		eWireFieldsMap.put("sendingBankName1", line1Fields[25]);
		eWireFieldsMap.put("sendingBankName2", line2Fields[25]);
		eWireFieldsMap.put("sendingBankName3", line3Fields[25]);
		eWireFieldsMap.put("sendingBankName4", line4Fields[25]);
		eWireFieldsMap.put("sendingBankAddress2Line1", line1Fields[27]);
		eWireFieldsMap.put("sendingBankAddress2Line2", line2Fields[27]);
		eWireFieldsMap.put("sendingBankName2Line3", line3Fields[27]);
		eWireFieldsMap.put("sendingBankName2Line4", line4Fields[27]);
		eWireFieldsMap.put("recevingBankID1", line1Fields[33]);
		eWireFieldsMap.put("recevingBankID2", line2Fields[33]);
		eWireFieldsMap.put("recevingBankID3", line3Fields[33]);
		eWireFieldsMap.put("recevingBankID4", line4Fields[33]);
		eWireFieldsMap.put("recevingBankName1", line1Fields[34]);
		eWireFieldsMap.put("recevingBankName2", line2Fields[34]);
		eWireFieldsMap.put("recevingBankName3", line3Fields[34]);
		eWireFieldsMap.put("recevingBankName4", line4Fields[34]);
		eWireFieldsMap.put("recevingBankAddress2Line1", line1Fields[36]);
		eWireFieldsMap.put("recevingBankAddress2Line2", line2Fields[36]);
		eWireFieldsMap.put("recevingBankAddress2Line3", line3Fields[36]);
		eWireFieldsMap.put("recevingBankAddress2Line4", line4Fields[36]);
		eWireFieldsMap.put("recevingBankAddress3Line1", line1Fields[37]);
		eWireFieldsMap.put("recevingBankAddress3Line2", line2Fields[37]);
		eWireFieldsMap.put("recevingBankAddress3Line3", line3Fields[37]);
		eWireFieldsMap.put("recevingBankAddress3Line4", line4Fields[37]);
		eWireFieldsMap.put("originatorIDLine1", line1Fields[42]);
		eWireFieldsMap.put("originatorIDLine2", line2Fields[42]);
		eWireFieldsMap.put("originatorIDLine3", line3Fields[42]);
		eWireFieldsMap.put("originatorIDLine4", line4Fields[42]);
		eWireFieldsMap.put("nameLine1", line1Fields[43]);
		eWireFieldsMap.put("nameLine2", line2Fields[43]);
		eWireFieldsMap.put("nameLine3", line3Fields[43]);
		eWireFieldsMap.put("nameLine4", line4Fields[43]);
		eWireFieldsMap.put("address1Line1", line1Fields[44]);
		eWireFieldsMap.put("address1Line2", line2Fields[44]);
		eWireFieldsMap.put("address1Line3", line3Fields[44]);
		eWireFieldsMap.put("address1Line4", line4Fields[44]);
		eWireFieldsMap.put("address2Line1", line1Fields[45]);
		eWireFieldsMap.put("address2Line2", line2Fields[45]);
		eWireFieldsMap.put("address2Line3", line3Fields[45]);
		eWireFieldsMap.put("address2Line4", line4Fields[45]);

		eWireFieldsMap.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		});

	}
}
