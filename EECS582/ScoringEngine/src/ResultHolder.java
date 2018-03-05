

public class ResultHolder {
	// Results returned from backend
	private boolean ssh = false;
	public ResultHolder() {
		ssh = false;
	}
	public ResultHolder(String input) {
		String[] parts = input.split(":");
		String curPname = "";
		for(String in : parts) {
			if(curPname.equals("sshd")) {
				ssh = Boolean.parseBoolean(in);
			}
			curPname = in;
		}
	}
	public final boolean getStatusSSH() {
		return ssh;
	}
}
