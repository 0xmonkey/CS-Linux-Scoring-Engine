

public class ResultHolder {
	// Results returned from backend
	private boolean ssh = false;
	private boolean ftp = false;
	private boolean dns = false;
	private boolean netcat = false;
	private boolean www = false;
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
			// TODO: Use switch case?
			//System.out.println("Part: " + input);
			if(curPname.equals("sshd")) {
				ssh = Boolean.parseBoolean(in);
			}
			else if(curPname.equals("vsftpd")) {
				ftp = Boolean.parseBoolean(in);
			}
			else if(curPname.equals("bind9")) {
				dns = Boolean.parseBoolean(in);
			}
			else if(curPname.equals("netcat")) {
				netcat = Boolean.parseBoolean(in);
			}
			else if(curPname.equals("netcat")) {
				netcat = Boolean.parseBoolean(in);
			}
			else if(curPname.equals("apached")) {
				www = Boolean.parseBoolean(in);
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
	public final boolean getStatusDNS() {
		return dns;
	}
	public final boolean getStatusNetcat() {
		return netcat;
	}
	public final boolean getStatusWWW() {
		return www;
	}
}
