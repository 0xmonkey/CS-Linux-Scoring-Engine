import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;



public class ResultHolder {
	// Results returned from backend
	private boolean ssh = false;
	private boolean ftp = false;
	private boolean dns = false;
	private boolean netcat = false;
	private boolean www = false;
	private boolean sql = false;
	private boolean sudo_pw = false;
	ArrayList<Map.Entry<String, Boolean>> users = new ArrayList<Map.Entry<String, Boolean>>();
	public ResultHolder() {
	}
	public ResultHolder(String input) {
		parse(input);
	}
	public void parse (String input) {
		//System.out.println("result: " + input); //TODO: Remove debug code
		String[] parts = input.split(":");
		String curPname = "";
		for(String in : parts) {
			// TODO: Use switch case?
			//System.out.println("Part: " + in); //TODO: Remove debug code
			if(curPname.equals("sshd")) {
				ssh = Boolean.parseBoolean(in);
			}
			else if(curPname.equals("vsftpd")) {
				ftp = Boolean.parseBoolean(in);
			}
			else if(curPname.equals("named")) {
				dns = Boolean.parseBoolean(in);
			}
			else if(curPname.equals("netcat")) {
				netcat = Boolean.parseBoolean(in);
			}
			else if(curPname.equals("apache2")) {
				www = Boolean.parseBoolean(in);
			}
			else if(curPname.equals("mysqld")) {
				sql = Boolean.parseBoolean(in);
			}
			else if(curPname.equals("SudoPass")) {
				sudo_pw = Boolean.parseBoolean(in);
			}
			else if(curPname.length() >= 9 && curPname.substring(0, 9).equals("UserExist")) {
				// check if the user exists in our list users 
				boolean recorded = false;
				for(Entry<String, Boolean> user: users) {
					// username matched
					if(user.getKey().equals(curPname.substring(9))) {
						user.setValue(Boolean.parseBoolean(in));
						recorded = true;
					}
					//System.out.println("Recorded: " + user.getKey() + ", " + user.getValue()); //TODO: Remove debug code
				}
				// no match
				if(!recorded) {
					users.add(new AbstractMap.SimpleEntry<String, Boolean>(curPname.substring(9), Boolean.parseBoolean(in)));
					//System.out.println(curPname.substring(0, 9) + " as: " + curPname.substring(9) + ", " + Boolean.parseBoolean(in)); //TODO: Remove debug code
				}
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
	public final boolean getStatusSQL() {
		return sql;
	}
	public final boolean getStatusSudoPW() {
		return sudo_pw;
	}
	public final ArrayList<Map.Entry<String, Boolean>> getStatusUsers() {
		return users;
	}
	public final boolean getStatusUser(String username) {
		for(Entry<String, Boolean> user: users) {
			// username matched
			if(user.getKey().equals(username)) {
				return user.getValue();
			}
		}
		// no match
		return false;
	}
}
