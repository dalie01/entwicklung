package iSeries;

import java.beans.PropertyVetoException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;

import com.ibm.as400.access.AS400;
import com.ibm.as400.access.AS400Bin2;
import com.ibm.as400.access.AS400Bin4;
import com.ibm.as400.access.AS400DataType;
import com.ibm.as400.access.AS400Message;
import com.ibm.as400.access.AS400PackedDecimal;
import com.ibm.as400.access.AS400Structure;
import com.ibm.as400.access.AS400Text;
import com.ibm.as400.access.AS400ZonedDecimal;
import com.ibm.as400.access.CommandCall;
import com.ibm.as400.access.ProgramCall;
import com.ibm.as400.access.ProgramParameter;
import com.ibm.as400.access.QSYSObjectPathName;
import com.ibm.as400.access.ServiceProgramCall;

public class AS400Call {

	public AS400Call() {
		// programCallStructMf();
		// programCallStruct();
		// programCall();
		// serviceModul1();
		// serviceModul2();
		serviceModul3();

	}

	// ------------------------------------------------------------------------
	// Methoden

	public static void main(String[] args) {
		AS400Call as400Call = new AS400Call();
	}// main

	private void programCall() {
		System.out.println("programmCall");

		AS400 system = new AS400("mars", "dalies", "passwort");

		ProgramCall program = new ProgramCall(system);

		try {
			// Initialize the name of the program to run.
			String programName = "/QSYS.LIB/DALIES.LIB/ZFH19.PGM";
			// Set up the 3 parameters.
			ProgramParameter[] parameterList = new ProgramParameter[3];
			// First parameter is to input a name.
			AS400Text nametext = new AS400Text(8);
			parameterList[0] = new ProgramParameter(nametext.toBytes("B2BSend"));
			// Second parameter is to get the answer, up to 50 bytes long.
			parameterList[1] = new ProgramParameter(50);
			// Third parameter is to input a quantity and return a value up to
			// 30 bytes long.
			byte[] quantity = new byte[4];
			quantity[0] = 0;
			quantity[1] = 0;
			quantity[2] = 1;
			quantity[3] = 44;
			parameterList[2] = new ProgramParameter(quantity, 4);

			// Set the program name and parameter list.
			program.setProgram(programName, parameterList);
			// Run the program.
			System.out.println("Program run");
			if (program.run() != true) {
				// Report failure.
				System.out.println("Program failed!");
				// Show the messages.
				AS400Message[] messagelist = program.getMessageList();
				for (int i = 0; i < messagelist.length; ++i) {
					// Show each message.
					System.out.println(messagelist[i]);
				}
			}
			// Else no error, get output data.
			else {
				AS400Text text = new AS400Text(50);
				System.out.println(text.toObject(parameterList[1]
						.getOutputData()));
				AS400Bin4 bin4 = new AS400Bin4();
				int i = bin4.toInt(parameterList[2].getOutputData());
				System.out.println("Result is: " + i);
			}
		} catch (Exception e) {
			System.out.println("Program " + program.getProgram()
					+ " issued an exception!");
			e.printStackTrace();
		}
		// Done with the server.
		system.disconnectAllServices();
	}

	private void serviceModul1() {
		System.out.println("serviceModul1 ZFH20B");
		AS400 system = new AS400("mars", "dalies", "passwort");

		if (system.isConnected()) {
			System.out.println("connected");
		}

		ServiceProgramCall sPGMCall = new ServiceProgramCall(system);

		ProgramParameter[] parameterList = new ProgramParameter[1];

		AS400Bin4 bin4 = new AS400Bin4();
		byte[] parameter1 = bin4.toBytes(17);
		parameterList[0] = new ProgramParameter(parameter1);

		// ServiceProgramCall sPGMCall = new
		// ServiceProgramCall(system,"/QSYS.LIB/DALIES.LIB/ZFH20B.SRVPGM","ONEMORETHAN",ServiceProgramCall.RETURN_INTEGER,parameterList);

		try {
			sPGMCall.setProgram("/QSYS.LIB/DALIES.LIB/ZFH20B.SRVPGM",
					parameterList);
			sPGMCall.setProcedureName("ONEMORETHAN");
			// sPGMCall.setReturnValueFormat(ServiceProgramCall.RETURN_INTEGER);
		} catch (PropertyVetoException pve) {
			System.out.println("sm1_11:" + pve.toString());
		}

		try {
			if (sPGMCall.run() != true) {
				AS400Message[] messageList = sPGMCall.getMessageList();
				for (int i = 0; i < messageList.length; ++i) {
					System.out.println(messageList[i].getText());
				}
			} else {
				int i = bin4.toInt(sPGMCall.getReturnValue());
				System.out.println("Result 1 is: " + i);
			}

		} catch (Exception e) {
			System.out.println("sm1_12" + e.toString());
		}

		// ==========================================================================

		AS400Text text10 = new AS400Text(10);

		parameter1 = text10.toBytes("Dalies ");
		parameterList[0] = new ProgramParameter(parameter1);

		try {
			parameterList[0]
					.setParameterType(ProgramParameter.PASS_BY_REFERENCE);
			parameterList[0].setOutputDataLength(10);
			sPGMCall.setParameterList(parameterList);
			sPGMCall.setProcedureName("CALLTEXT");
		} catch (PropertyVetoException pve) {
			System.out.println("sm1_21:" + pve.toString());
		}

		try {
			if (sPGMCall.run() != true) {
				AS400Message[] messageList = sPGMCall.getMessageList();
				for (int i = 0; i < messageList.length; ++i) {
					System.out.println(messageList[i].getText());
				}
			} else {
				int i = bin4.toInt(sPGMCall.getReturnValue());
				System.out.println("Result 2 is: " + i);
				byte[] receiverVar = parameterList[0].getOutputData();
				System.out.println("Result 21 is: "
						+ text10.toObject(receiverVar));

			}

		} catch (Exception e) {
			System.out.println("sm1_22" + e.toString());
		}

		// ==========================================================================

		AS400Text text2 = new AS400Text(2);
		parameter1 = text2.toBytes("X1");
		parameterList[0] = new ProgramParameter(parameter1);

		try {
			parameterList[0]
					.setParameterType(ProgramParameter.PASS_BY_REFERENCE);
			sPGMCall.setParameterList(parameterList);
			sPGMCall.setProcedureName("RETURNTEXT");
			sPGMCall.setReturnValueFormat(ServiceProgramCall.NO_RETURN_VALUE);
		} catch (PropertyVetoException pve) {
			System.out.println("sm1_31:" + pve.toString());
		}

		try {
			if (sPGMCall.run() != true) {
				AS400Message[] messageList = sPGMCall.getMessageList();
				for (int i = 0; i < messageList.length; ++i) {
					System.out.println(messageList[i].getText());
				}
			} else {
				System.out.println("xx1");
				System.out.println("Result 3 is: "
						+ text10.toObject(sPGMCall.getReturnValue()));
			}

		} catch (Exception e) {
			System.out.println("sm1_32" + e.toString());
		}

		// ==========================================================================

		ByteArrayOutputStream out = new ByteArrayOutputStream();

		AS400Text parmIn = new AS400Text(10);
		AS400Text feld1 = new AS400Text(10);
		AS400PackedDecimal feld2 = new AS400PackedDecimal(9, 0);
		AS400PackedDecimal feld3 = new AS400PackedDecimal(19, 3);
		AS400ZonedDecimal feld4 = new AS400ZonedDecimal(10, 0);

		AS400DataType[] structDefine = { feld1, feld2, feld3, feld4 };
		AS400Structure struct = new AS400Structure(structDefine);

		for (int i = 0; i < 3; i++) {
			String f1 = new String("abc456789" + String.valueOf(i));
			BigDecimal f2 = new BigDecimal("-98765432" + String.valueOf(i));
			BigDecimal f3 = new BigDecimal("-9876543210123456.12"
					+ String.valueOf(i));
			BigDecimal f4 = new BigDecimal("-987654321" + String.valueOf(i));

			Object[] structData = { f1, f2, f3, f4 };

			byte[] bytes = struct.toBytes(structData);

			try {
				out.write(bytes);
			} catch (IOException ioe) {
				System.out.println("sm1_41:" + ioe.toString());
			}
		}

		System.out.println(struct.getByteLength() * 3);
		parameterList[0] = new ProgramParameter(out.toByteArray(), struct
				.getByteLength() * 3);

		try {
			parameterList[0]
					.setParameterType(ProgramParameter.PASS_BY_REFERENCE);
			sPGMCall.setParameterList(parameterList);
			sPGMCall.setProcedureName("CALLMFDS");
			sPGMCall.setReturnValueFormat(ServiceProgramCall.RETURN_INTEGER);
		} catch (PropertyVetoException pve) {
			System.out.println("sm1_42:" + pve.toString());
		}

		try {
			if (sPGMCall.run() != true) {
				AS400Message[] messageList = sPGMCall.getMessageList();
				for (int i = 0; i < messageList.length; ++i) {
					System.out.println(messageList[i].getText());
				}
			} else {
				int r = bin4.toInt(sPGMCall.getReturnValue());
				System.out.println("Result 4 is: " + r);
				for (int i = 0; i < 3; i++) {
					Object[] structData = (Object[]) struct.toObject(
							parameterList[0].getOutputData(), 35 * i);
					System.out.println("f1 " + String.valueOf(structData[0]));
					System.out.println("f2 " + String.valueOf(structData[1]));
					System.out.println("f3 " + String.valueOf(structData[2]));
					System.out.println("f4 " + String.valueOf(structData[3]));
				}
			}

		} catch (Exception e) {
			System.out.println("sm1_43" + e.toString());
		}
	}

	private void serviceModul2() {
		System.out.println("serviceModul2");
		AS400 as400 = new AS400("mars", "dalies", "passwort");

		QSYSObjectPathName sprogramName = new QSYSObjectPathName("DALIES","ZFH20B", "SRVPGM");

		ServiceProgramCall spgm = new ServiceProgramCall(as400);

		try {
			ProgramParameter[] parmlist = new ProgramParameter[1];

			AS400Text text10 = new AS400Text(10);

			// AS400Text text10 = new AS400Text(10,as400.getCcsid(),as400);

			byte[] text = text10.toBytes("Antje");
			parmlist[0] = new ProgramParameter();
			parmlist[0].setInputData(text);
			parmlist[0].setParameterType(ProgramParameter.PASS_BY_REFERENCE);

			spgm.setProgram(sprogramName.getPath(), parmlist);
			spgm.setProcedureName("CALLTEXT");
			if (spgm.run() != true) {
				AS400Message[] msgList = spgm.getMessageList();
				System.out
						.println("The program did not run.  AS/400 messages:");
				for (int i = 0; i < msgList.length; i++) {
					System.out.println(msgList[i].getText());
				}
			} else {
				AS400Bin4 bin4 = new AS400Bin4();
				AS400Bin2 bin2 = new AS400Bin2();
				byte[] as400Data = spgm.getReturnValue();
				int result = bin4.toInt(as400Data, 0);
				// short result = bin2.toShort(as400Data, 0);
				System.out
						.println("Service Program Call Result is : " + result);
			}

		} catch (Exception e) {
			System.out.println("Service Program call failed");
			System.out.println(e);
		}
	}

	private void serviceModul3() {
		System.out.println("serviceModul3 SRVP01");

		AS400 system = new AS400("mars", "dalies", "password");

		CommandCall cmd = new CommandCall(system);
		try {
			if (cmd.run("ADDLIBLE INET") != true) {
				System.out.println("ADDLIBLE INET failed.");
			}
			if (cmd.run("ADDLIBLE AMFLIB7") != true) {
				System.out.println("ADDLIBLE AMFLIB7 failed.");
			}
			AS400Message[] messagelist = cmd.getMessageList();
			for (int i = 0; i < messagelist.length; ++i) {
				System.out.println(messagelist[i]);
			}
		} catch (Exception e) {
			System.out.println("sm3_0 " + e.toString());
		}

		ServiceProgramCall sPGMCall = new ServiceProgramCall(system);

		ProgramParameter[] parameterList = new ProgramParameter[1];

		ByteArrayOutputStream out = new ByteArrayOutputStream();

		AS400ZonedDecimal aenb = new AS400ZonedDecimal(2, 0);
		AS400Text dccd = new AS400Text(1);
		AS400Text cvnb = new AS400Text(7);
		AS400PackedDecimal fcnb = new AS400PackedDecimal(7, 0);
		AS400PackedDecimal drnb = new AS400PackedDecimal(5, 0);
		AS400PackedDecimal aasz = new AS400PackedDecimal(5, 0);
		AS400Text aitx = new AS400Text(15);
		AS400PackedDecimal bidt = new AS400PackedDecimal(7, 0);
		AS400PackedDecimal bjdt = new AS400PackedDecimal(7, 0);
		AS400PackedDecimal dzva = new AS400PackedDecimal(10, 3);
		AS400PackedDecimal aqqt = new AS400PackedDecimal(10, 3);
		AS400Text itds = new AS400Text(30);

		// 0 1 2 3 4 5 6 7 8
		AS400DataType[] structRDefine = { dccd, cvnb, fcnb, drnb, aasz, bidt,
				bjdt, dzva, aqqt };
		AS400Structure structR = new AS400Structure(structRDefine);

		AS400DataType[] structCDefine = { aenb, aitx };
		AS400Structure structC = new AS400Structure(structCDefine);

		Object[] structCall = { new BigDecimal("01"), new String("B0001"), };

		byte[] bytes = structC.toBytes(structCall);

		try {
			out.write(bytes);
		} catch (IOException ioe) {
			System.out.println("sm3_1:" + ioe.toString());
		}

		int structLength = structR.getByteLength();
		parameterList[0] = new ProgramParameter(out.toByteArray(),
				structLength * 100);

		try {
			sPGMCall.setProgram("/QSYS.LIB/INET.LIB/SRVP01.SRVPGM",
					parameterList);
			parameterList[0]
					.setParameterType(ProgramParameter.PASS_BY_REFERENCE);
			sPGMCall.setParameterList(parameterList);
			sPGMCall.setProcedureName("AUFTRBESTAND");
			sPGMCall.setReturnValueFormat(ServiceProgramCall.RETURN_INTEGER);
		} catch (PropertyVetoException pve) {
			System.out.println("sm3_2:" + pve.toString());
		}

		try {
			if (sPGMCall.run() != true) {
				AS400Message[] messageList = sPGMCall.getMessageList();
				for (int i = 0; i < messageList.length; ++i) {
					System.out.println(messageList[i].getText());
				}
			} else {
				AS400Bin4 bin4 = new AS400Bin4();
				int r = bin4.toInt(sPGMCall.getReturnValue());
				System.out.println("Result m3 is: " + r);
				for (int i = 0; i < r; i++) {
					Object[] structReturn = (Object[]) structR.toObject(
							parameterList[0].getOutputData(), structLength * i);
					System.out.println(structReturn[1] + " "
							+ String.valueOf(structReturn[2]) + " "
							+ String.valueOf(structReturn[6]) + " "
							+ String.valueOf(structReturn[7]) + " "
							+ String.valueOf(structReturn[8]));
				}
			}
		} catch (Exception e) {
			System.out.println("sm3_3 " + e.toString());
		}
	}

	private void programCallStruct() {
		System.out.println("programmCallStruct");

		AS400 system = new AS400("mars", "dalies", "passwort");

		ProgramCall program = new ProgramCall(system);

		try {
			String programName = "/QSYS.LIB/DALIES.LIB/ZFH22C.PGM";
			ProgramParameter[] parameterList = new ProgramParameter[2];
			AS400Text parmIn = new AS400Text(10);
			AS400Text feld1 = new AS400Text(10);
			AS400PackedDecimal feld2 = new AS400PackedDecimal(9, 0);

			AS400PackedDecimal feld3 = new AS400PackedDecimal(19, 3);
			AS400ZonedDecimal feld4 = new AS400ZonedDecimal(10, 0);

			AS400DataType[] structDefine = { feld1, feld2, feld3, feld4 };
			AS400Structure struct = new AS400Structure(structDefine);

			String f1 = new String("abc4567890");
			BigDecimal f2 = new BigDecimal("-987654321");
			BigDecimal f3 = new BigDecimal("-9876543210123456.123");
			BigDecimal f4 = new BigDecimal("-9876543210");

			Object[] structData = { f1, f2, f3, f4 };

			System.out.println(String.valueOf(struct.getByteLength()));
			parameterList[0] = new ProgramParameter(parmIn.toBytes("jStruct"));
			parameterList[1] = new ProgramParameter(struct.toBytes(structData),
					struct.getByteLength());
			program.setProgram(programName, parameterList);
			System.out.println("Program run");
			if (program.run() != true) {
				System.out.println("Program failed!");
				AS400Message[] messagelist = program.getMessageList();
				for (int i = 0; i < messagelist.length; ++i) {
					System.out.println(messagelist[i]);
				}
			} else {
				struct.toObject(parameterList[1].getOutputData());
				System.out.println(String.valueOf(feld2.getByteLength()));
				System.out.println(feld1.getEncoding());
				System.out.println(feld1.getDefaultValue().toString());
				System.out.println(struct.getMembers(0));
				System.out.println(feld1);

				structData = (Object[]) struct.toObject(parameterList[1]
						.getOutputData());

				System.out.println("f1 "
						+ feld1.toObject(parameterList[1].getOutputData()));
				System.out.println("f1 " + String.valueOf(structData[0]));
				System.out.println("f2 "
						+ String.valueOf(feld2.toObject(parameterList[1]
								.getOutputData(), 10)));
				System.out.println("f2 " + String.valueOf(structData[1]));
				System.out.println("f3 "
						+ String.valueOf(feld3.toObject(parameterList[1]
								.getOutputData(), 15)));
				System.out.println("f3 " + String.valueOf(structData[2]));
				System.out.println("f4 "
						+ String.valueOf(feld4.toObject(parameterList[1]
								.getOutputData(), 25)));
				System.out.println("f4 " + String.valueOf(structData[3]));
			}
		} catch (Exception e) {
			System.out.println("Program " + program.getProgram()
					+ " issued an exception!");
			e.printStackTrace();
		}
		// Done with the server.
		system.disconnectAllServices();
	}

	private void programCallStructMf() {
		System.out.println("programmCallStructMf");

		AS400 system = new AS400("mars", "dalies", "passwort");

		ProgramCall program = new ProgramCall(system);

		try {
			String programName = "/QSYS.LIB/DALIES.LIB/ZFH23C.PGM";

			ProgramParameter[] parameterList = new ProgramParameter[1];

			ByteArrayOutputStream out = new ByteArrayOutputStream();

			AS400Text parmIn = new AS400Text(10);
			AS400Text feld1 = new AS400Text(10);
			AS400PackedDecimal feld2 = new AS400PackedDecimal(9, 0);
			AS400PackedDecimal feld3 = new AS400PackedDecimal(19, 3);
			AS400ZonedDecimal feld4 = new AS400ZonedDecimal(10, 0);

			AS400DataType[] structDefine = { feld1, feld2, feld3, feld4 };
			AS400Structure struct = new AS400Structure(structDefine);

			for (int i = 0; i < 3; i++) {
				String f1 = new String("abc456789" + String.valueOf(i));
				BigDecimal f2 = new BigDecimal("-98765432" + String.valueOf(i));
				BigDecimal f3 = new BigDecimal("-9876543210123456.12"
						+ String.valueOf(i));
				BigDecimal f4 = new BigDecimal("-987654321" + String.valueOf(i));

				Object[] structData = { f1, f2, f3, f4 };

				byte[] bytes = struct.toBytes(structData);

				out.write(bytes);
			}

			System.out.println(struct.getByteLength() * 3);
			parameterList[0] = new ProgramParameter(out.toByteArray(), struct
					.getByteLength() * 3);
			program.setProgram(programName, parameterList);
			System.out.println("Program run");
			if (program.run() != true) {
				System.out.println("Program failed!");
				AS400Message[] messagelist = program.getMessageList();
				for (int i = 0; i < messagelist.length; ++i) {
					System.out.println(messagelist[i]);
				}
			} else {
				for (int i = 0; i < 3; i++) {
					Object[] structData = (Object[]) struct.toObject(
							parameterList[0].getOutputData(), 35 * i);
					System.out.println("f1 " + String.valueOf(structData[0]));
					System.out.println("f2 " + String.valueOf(structData[1]));
					System.out.println("f3 " + String.valueOf(structData[2]));
					System.out.println("f4 " + String.valueOf(structData[3]));
				}
			}
		} catch (Exception e) {
			System.out.println("Program " + program.getProgram()
					+ " issued an exception!");
			e.printStackTrace();
		}
		// Done with the server.
		system.disconnectAllServices();
	}

}// class AS400Call
