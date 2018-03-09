

public class ResultHolder {
	// Results returned from backend
	private boolean ssh = false;
	private boolean ftp = false;
	public ResultHolder() {
	}
	public ResultHolder(String input) {
		parse(input);
	}
	public void parse (String input) {
		//System.out.println("result: " + input);
		String[] parts = input.split(":");
		String curPname = "";
		for(String in : parts) {
			//System.out.println("Part: " + input);
			if(curPname.equals("sshd")) {
				ssh = Boolean.parseBoolean(in);
			}
			if(curPname.equals("vsftpd")) {
				ftp = Boolean.parseBoolean(in);
			}
			curPname = in;
		}
	}
	public final boolean getStatusSSH() {
		return ssh;
	}
	public final boolean getStatusFTP() {
		return ftp;
	}
}
